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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;

import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretDiagramEditorUtil;
import eu.indenica.iret.diagram.part.Messages;


public class IretNewViewWizard extends Wizard implements INewWizard {
	private IretModelSelectorPage modelSelectorPage;
//	private IretViewCreationWizardPage viewCreationPage;
	
	private IWorkbench workbench;
	private IStructuredSelection selection;
	
	private Resource diagram;
	
	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public IretNewViewWizard() {
		super();
	}

	@Override
	public boolean canFinish() {
//		System.out.println("canFinish");
		if(!super.canFinish()) return false;
		
		return true;
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	@Override
	public void addPages() {
		super.addPages();
		modelSelectorPage = new IretModelSelectorPage("Select the Irene Model", getSelection(), "iret");
		addPage(modelSelectorPage);
//		viewCreationPage = new IretViewCreationWizardPage("Select the View name", getSelection(), "iret_diagram");
//		addPage(viewCreationPage);
		
	}

	@Override
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				if(modelSelectorPage.getViewLabel().equals("") || modelSelectorPage.getModelLabel().equals("")){
				}
				else{
					diagram = IretDiagramEditorUtil.createViewDiagram(
							modelSelectorPage.getViewURI(),
							modelSelectorPage.isViewReadOnly(),
							modelSelectorPage.getViewLabel(),
							modelSelectorPage.getModelURI(), monitor);
					if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
						try {
							IretDiagramEditorUtil.openDiagram(diagram);
						} catch (PartInitException e) {
							ErrorDialog.openError(getContainer().getShell(),
									Messages.IretCreationWizardOpenEditorError,
									null, e.getStatus());
						}
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
//			return true;
//		} catch (RuntimeException e) {
//			System.out.println("Missing information, returning false");
//			return false;
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
		return diagram != null;	
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
