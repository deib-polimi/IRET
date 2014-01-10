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
package eu.indenica.iret.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class IretCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected IretCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected IretCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.IretCreationWizardTitle);
		setDefaultPageImageDescriptor(IretDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewIretWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated not
	 */
	public void addPages() {
		diagramModelFilePage = new IretCreationWizardPage(
				"DiagramModelFile", getSelection(), "iret_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.IretCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.IretCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		//		domainModelFilePage = new IretCreationWizardPage(
		//				"DomainModelFile", getSelection(), "iret") { //$NON-NLS-1$ //$NON-NLS-2$
		//
		//			public void setVisible(boolean visible) {
		//				if (visible) {
		//					String fileName = diagramModelFilePage.getFileName();
		//					fileName = fileName.substring(0, fileName.length() - ".iret_diagram".length()); //$NON-NLS-1$
		//					setFileName(IretDiagramEditorUtil.getUniqueFileName(
		//							getContainerFullPath(), fileName, "iret")); //$NON-NLS-1$
		//				}
		//				super.setVisible(visible);
		//			}
		//		};
		//		domainModelFilePage
		//				.setTitle(Messages.IretCreationWizard_DomainModelFilePageTitle);
		//		domainModelFilePage
		//				.setDescription(Messages.IretCreationWizard_DomainModelFilePageDescription);
		//		addPage(domainModelFilePage);
	}

	/**
	 * @generated not
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				//				Logger.getLogger(IretCreationWizard.class.toString()).info(diagramModelFilePage.getURI().toString());
				URI domainFile = URI.createPlatformResourceURI(
						diagramModelFilePage
								.getURI()
								.toString()
								.substring(
										"platform:/resource/".length(),
										diagramModelFilePage.getURI()
												.toString().length()
												- ".iret_diagram".length())
								+ ".iret", false);
				//				Logger.getLogger(IretCreationWizard.class.toString()).info(domainFile.toString());

				diagram = IretDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						//						domainModelFilePage.getURI(), monitor);
						domainFile, monitor);
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
		return diagram != null;
	}
}
