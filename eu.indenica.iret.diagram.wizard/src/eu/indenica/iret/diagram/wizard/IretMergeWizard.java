/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL Ð Politecnico di Milano
 *  
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *  
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package eu.indenica.iret.diagram.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.service.runnable.ApplicationRunnable;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretDiagramEditorUtil;
import eu.indenica.iret.diagram.part.Messages;
import eu.indenica.iret.diagram.similarity.IRETMergeSimilarities;
import eu.indenica.iret.diagram.similarity.SimilarityEvaluator;
import eu.indenica.iret.diagram.wizard.beans.IRETMergeViewConfiguration;
import eu.indenica.iret.diagram.part.IretDiagramEditorUtil;

public class IretMergeWizard extends Wizard implements INewWizard {


	private static String SRC_FOLDER="";

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private IretMergeModelsSelectorPage modelMergeSelectorPage;
	private Resource mergeDiagram;


	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public IretMergeWizard() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

	}

	@Override
	public void addPages() {
		//pop-up for choosing the 2 models to compare
		modelMergeSelectorPage=new IretMergeModelsSelectorPage("Select the IRENE models", getSelection(), "iret");
		this.addPage(modelMergeSelectorPage);
	}

	@Override
	public boolean performFinish() {
		System.out.println("---------------------------");
		URI[] uris = modelMergeSelectorPage.getInputModelsURIs(); //gets and verify the 2 input models URIs

		if (uris.length==0)
			//BASILIO: warning about wrong selection of the 2 models to be compared?
			return false;

		IreneModel m1, m2;
		m1=eu.indenica.iret.diagram.part.IretDiagramEditorUtil.openIreneModel(uris[0]);
		m2=eu.indenica.iret.diagram.part.IretDiagramEditorUtil.openIreneModel(uris[1]);
		String mergeView=modelMergeSelectorPage.getViewLabel(); //gets the designated name of the Merge Result View

		//SRC_FOLDER File System Repository Root
		String [] bp=modelMergeSelectorPage.getModel_1_name().split("/");
		System.out.println(bp.length);
		SRC_FOLDER="";
		for(int l=0; l<bp.length-1; l++) {
			SRC_FOLDER+=bp[l]+"/";
		}


		try {
			IretDiagramEditorUtil.openDiagram(uris[0]);
		} catch (PartInitException e) {
			ErrorDialog.openError(getContainer().getShell(),
					Messages.IretCreationWizardOpenEditorError,
					null, e.getStatus());
		}
		try {
			IretDiagramEditorUtil.openDiagram(uris[1]);
		} catch (PartInitException e) {
			ErrorDialog.openError(getContainer().getShell(),
					Messages.IretCreationWizardOpenEditorError,
					null, e.getStatus());
		}

		CreateMergeDiagramFile();

		IRETMergeViewConfiguration imvc = new IRETMergeViewConfiguration();

		imvc.addElementToFirstView(modelMergeSelectorPage.getModel_1_name()+"_diagram");
		imvc.addElementToSecondView(modelMergeSelectorPage.getModel_2_name()+"_diagram");
		imvc.addElementToMergeView(SRC_FOLDER+mergeView+".iret_diagram");
		imvc.setFirstModel(modelMergeSelectorPage.getModel_1_name());
		imvc.setSecondModel(modelMergeSelectorPage.getModel_2_name());

		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().setData("eu.indenica.iret.diagram.perspective.merge.views", imvc);
		System.out.println("MVC added");

		//Getting the 2 models and performing comparison logic -> SimilarityEvaluator.java
		SimilarityEvaluator dse = SimilarityEvaluator.getInstance();
		dse.setModels(m1,m2);
		dse.setMergeModelMap();
/* 
 * 100 = default SEMANTIC COMFIDENCE value. Must be changed also into Scale control in MergeViewPart
 */
		dse.computeSimilarities(100); 
		return true;

	}

	public boolean CreateMergeDiagramFile () {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				mergeDiagram = IretDiagramEditorUtil.createDiagram(
						URI.createPlatformResourceURI(SRC_FOLDER+modelMergeSelectorPage.getViewLabel()+".iret_diagram",false),
						URI.createPlatformResourceURI(SRC_FOLDER+modelMergeSelectorPage.getViewLabel()+".iret",false), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && mergeDiagram != null) {
					try {
						IretDiagramEditorUtil.openDiagram(mergeDiagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.IretCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}

			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.IretCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				IretDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return mergeDiagram != null;	
	}

	/**
	 * @generated not
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated not
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}
	/**
	 * @generated not
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}
}

