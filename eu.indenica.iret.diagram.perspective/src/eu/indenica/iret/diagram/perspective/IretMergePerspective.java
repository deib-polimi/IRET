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
package eu.indenica.iret.diagram.perspective;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.internal.EditorSashContainer;
import org.eclipse.ui.internal.EditorStack;
import org.eclipse.ui.internal.ILayoutContainer;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.PageLayout;
import org.eclipse.ui.internal.PartPane;
import org.eclipse.ui.internal.PartSashContainer;
import org.eclipse.ui.internal.PartSite;
import org.eclipse.ui.internal.PartStack;
import org.eclipse.ui.internal.WorkbenchPage;

import eu.indenica.iret.diagram.wizard.beans.IRETMergeViewConfiguration;

public class IretMergePerspective implements IPerspectiveFactory {

	private IPageLayout factory;

	public IretMergePerspective() {
		super();
		System.out.println("Invoking the IretMergePerspective constructor");
	}

	public void createInitialLayout(IPageLayout factory) {
		Object o = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getData("eu.indenica.iret.diagram.perspective.merge.views");
		if(o==null){
			System.out.println("No input parameters");
		}
		else if(o instanceof IRETMergeViewConfiguration){
			IRETMergeViewConfiguration imvc = (IRETMergeViewConfiguration)o;
			System.out.println("First view:");
			for(String s : imvc.getFirstView())
				System.out.println(s);
			System.out.println("Second view:");
			for(String s : imvc.getSecondView())
				System.out.println(s);
			System.out.println("Merge view:");
			for(String s : imvc.getMergeView())
				System.out.println(s);
		}
			
		this.factory = factory;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		IFolderLayout projectExplorer =
			factory.createFolder(
				"projectExplorer", 
				IPageLayout.LEFT,
				0.25f,
				factory.getEditorArea());
		projectExplorer.addView(IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout margeFolder =
				factory.createFolder(
					"outline", 
					IPageLayout.BOTTOM,
					0.50f,
					"projectExplorer");
		margeFolder.addView("eu.indenica.iret.diagram.perspective.MergeView");
		margeFolder.addView(IPageLayout.ID_OUTLINE);
		
		splitEditorArea();
	}

	/**
	 * Split the editor area if there is at least two editors in it.
	 */
	private void splitEditorArea() {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IWorkbenchPart part = workbenchPage.getActivePart();
		PartPane partPane = ((PartSite) part.getSite()).getPane();
		LayoutPart layoutPart = partPane.getPart();

		IEditorReference[] editorReferences = workbenchPage.getEditorReferences();
//		IEditorReference activeEditor = workbenchPage.getActiveEditor().
		for(IEditorReference er : editorReferences){
			if(er.getTitleToolTip().equals("multiview-iret/modello1.iret_diagram")){
				workbenchPage.showEditor(er);
				PartPane currentEditorPartPane = ((PartSite) workbenchPage.getActiveEditor().getSite()).getPane();
				currentEditorPartPane = ((PartSite)workbenchPage.getActiveEditor().getSite()).getPane();

				EditorSashContainer editorSashContainer = null;
				ILayoutContainer rootLayoutContainer = layoutPart.getContainer();
				if (rootLayoutContainer instanceof LayoutPart) {
					ILayoutContainer editorSashLayoutContainer = ((LayoutPart) rootLayoutContainer).getContainer();
					if (editorSashLayoutContainer instanceof EditorSashContainer) {
						editorSashContainer = ((EditorSashContainer) editorSashLayoutContainer);
					}
				}

				/*
				 * Create a new part stack (i.e. a workbook) to home the
				 * currentEditorPartPane which hold the active editor
				 */
				PartStack newPart = createStack(editorSashContainer);
				editorSashContainer.stack(currentEditorPartPane, newPart);
				if (rootLayoutContainer instanceof LayoutPart) {
					ILayoutContainer cont = ((LayoutPart) rootLayoutContainer).getContainer();
					LayoutPart reference = ((PartSashContainer) cont).findBottomRight();
					if (cont instanceof PartSashContainer) {
						// "Split" the editor area by adding the new part
//						((PartSashContainer) cont).add(newPart);
						((PartSashContainer) cont).add(newPart, PageLayout.BOTTOM, 0.5f, reference);
					}
				}
			}
		}
		// Do it only if we have more that one editor
//		if (editorReferences.length > 2) {
//			// Get PartPane that correspond to the active editor
//			PartPane currentEditorPartPane = ((PartSite) workbenchPage.getActiveEditor().getSite()).getPane();
//			
//			for(IEditorPart ep : workbenchPage.getDirtyEditors()){
//				System.out.println(((PartSite)ep.getSite()).getPane().getPartReference().getTitleToolTip());
//				if(((PartSite)ep.getSite()).getPane().getPartReference().getTitleToolTip().equals("multiview-iret/aaaa.iret_diagram"))
//					currentEditorPartPane = ((PartSite)ep.getSite()).getPane();
//			}
//			
//			EditorSashContainer editorSashContainer = null;
//			ILayoutContainer rootLayoutContainer = layoutPart.getContainer();
//			if (rootLayoutContainer instanceof LayoutPart) {
//				ILayoutContainer editorSashLayoutContainer = ((LayoutPart) rootLayoutContainer).getContainer();
//				if (editorSashLayoutContainer instanceof EditorSashContainer) {
//					editorSashContainer = ((EditorSashContainer) editorSashLayoutContainer);
//				}
//			}
			
			/*
	private void splitEditorArea() {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IWorkbenchPart part = workbenchPage.getActivePart();
		PartPane partPane = ((PartSite) part.getSite()).getPane();
		LayoutPart layoutPart = partPane.getPart();

		IEditorReference[] editorReferences = workbenchPage.getEditorReferences();
		for(IEditorReference er : editorReferences){
			System.out.println(er.getName()); //nome file
			System.out.println(er.getTitle()); //nome file
			System.out.println(er.getPartName()); //nome file
			System.out.println(er.getTitleToolTip()); //percorso completo
		}
		// Do it only if we have more that one editor
		if (editorReferences.length > 2) {
			// Get PartPane that correspond to the active editor
			PartPane currentEditorPartPane = ((PartSite) workbenchPage.getActiveEditor().getSite()).getPane();
			for(IEditorPart ep : workbenchPage.getDirtyEditors()){
				System.out.println(((PartSite)ep.getSite()).getPane().getPartReference().getTitleToolTip());
				if(((PartSite)ep.getSite()).getPane().getPartReference().getTitleToolTip().equals("multiview-iret/aaaa.iret_diagram"))
					currentEditorPartPane = ((PartSite)ep.getSite()).getPane();
			}
			
			EditorSashContainer editorSashContainer = null;
			ILayoutContainer rootLayoutContainer = layoutPart.getContainer();
			if (rootLayoutContainer instanceof LayoutPart) {
				ILayoutContainer editorSashLayoutContainer = ((LayoutPart) rootLayoutContainer).getContainer();
				if (editorSashLayoutContainer instanceof EditorSashContainer) {
					editorSashContainer = ((EditorSashContainer) editorSashLayoutContainer);
				}
			}
			 * */
	}
	 
	/**
	 * A method to create a part stack container (a new workbook)
	 * 
	 * @param editorSashContainer the <code>EditorSashContainer</code> to set for the returned <code>PartStack</code>
	 * @return a new part stack container
	 */
	private PartStack createStack(EditorSashContainer editorSashContainer) {
		WorkbenchPage workbenchPage = (WorkbenchPage) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		EditorStack newWorkbook = EditorStack.newEditorWorkbook(editorSashContainer, workbenchPage);
		return newWorkbook;
	}
	
	private void addActionSets() {
		factory.addActionSet("org.eclipse.debug.ui.launchActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.debug.ui.debugActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.debug.ui.profileActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.jdt.debug.ui.JDTDebugActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.jdt.junit.JUnitActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.team.ui.actionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.team.cvs.ui.CVSActionSet"); //NON-NLS-1
		factory.addActionSet("org.eclipse.ant.ui.actionSet.presentation"); //NON-NLS-1
		factory.addActionSet(JavaUI.ID_ACTION_SET);
		factory.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
		factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); //NON-NLS-1
	}

	private void addPerspectiveShortcuts() {
		factory.addPerspectiveShortcut("org.eclipse.team.ui.TeamSynchronizingPerspective"); //NON-NLS-1
		factory.addPerspectiveShortcut("org.eclipse.team.cvs.ui.cvsPerspective"); //NON-NLS-1
		factory.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); //NON-NLS-1
	}

	private void addNewWizardShortcuts() {
		factory.addNewWizardShortcut("org.eclipse.team.cvs.ui.newProjectCheckout");//NON-NLS-1
		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//NON-NLS-1
	}

	private void addViewShortcuts() {
		factory.addShowViewShortcut("org.eclipse.ant.ui.views.AntView"); //NON-NLS-1
		factory.addShowViewShortcut("org.eclipse.team.ccvs.ui.AnnotateView"); //NON-NLS-1
		factory.addShowViewShortcut("org.eclipse.pde.ui.DependenciesView"); //NON-NLS-1
		factory.addShowViewShortcut("org.eclipse.jdt.junit.ResultView"); //NON-NLS-1
		factory.addShowViewShortcut("org.eclipse.team.ui.GenericHistoryView"); //NON-NLS-1
		factory.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		factory.addShowViewShortcut(JavaUI.ID_PACKAGES);
		factory.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		factory.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	}

}

