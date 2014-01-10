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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class IretModelSelectorPage extends WizardPage {

	/**
	 * @generated not
	 */
	private final String fileExtension;
	private Text txtIreneModel;
	private Text txtViewName;
	private IPath ireneModelPath;
	private Button btnReadOnly ;
	private Composite container;

	public IretModelSelectorPage(String pageName, IStructuredSelection selection, String fileExtension) {
		//		super(pageName, selection);
		super("page");
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 * 
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	public URI getModelURI() {
		return URI.createPlatformResourceURI(ireneModelPath.toString(),false);
	}

	public URI getViewURI() {
		IPath viewURI = ireneModelPath.removeLastSegments(1).append(txtViewName.getText()).addFileExtension("iret_diagram");
		return URI.createPlatformResourceURI(viewURI.toString(), false);
	}
	
	public boolean isViewReadOnly(){
		return btnReadOnly.getSelection();
	}
	
	public String getViewLabel(){
		return txtViewName.getText();
	}

	public String getModelLabel(){
		return txtIreneModel.getText();
	}

	/**
	 * @generated
	 */
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(3, false));

		Label lblIreneModel = new Label(container, SWT.NONE);
		lblIreneModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIreneModel.setText("IRENE Model");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		txtIreneModel = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtIreneModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnSelect = new Button(container, SWT.NONE);
		btnSelect.setText("Select...");

		Label lblView_1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_lblView_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1);
		gd_lblView_1.widthHint = 568;
		lblView_1.setLayoutData(gd_lblView_1);
		lblView_1.setText("View");

		Label lblView = new Label(container, SWT.NONE);
		lblView.setText("View");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		Label lblViewName = new Label(container, SWT.NONE);
		lblViewName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblViewName.setText("Name:");

		txtViewName = new Text(container, SWT.BORDER);
		txtViewName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		//FIXME
//		txtViewName.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				System.out.println("key released");
//				container.layout(true);
//				container.redraw();
//				container.getParent().pack();
//				container.getParent().redraw();
//				container.getParent().layout(true);
//				container.getParent().getParent().pack();
//				container.getParent().getParent().redraw();
//				container.getParent().getParent().layout(true);
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		btnReadOnly = new Button(container, SWT.CHECK);
		btnReadOnly.setText("Read only");
		new Label(container, SWT.NONE);
		final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(container.getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setTitle("IRENE model");
		dialog.setMessage("Select the IRENE model:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if(element instanceof IResource){
					if(((IResource) element).getFileExtension()==null || ((IResource) element).getFileExtension().equals("iret"))
						return true;
					return false;
				}
				return false;
			}
		});
		btnSelect.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				dialog.open();
				if(dialog.getFirstResult()!=null){
					Object o = dialog.getFirstResult();
					if(o instanceof IResource){
						IResource res = (IResource)o;
						ireneModelPath=res.getFullPath();
						txtIreneModel.setText(ireneModelPath.toString());
					}
				}
			}
		});

	}

	//FIXME
//	@Override
//	public boolean isPageComplete() {
//		System.out.println("isPageComplete");
//
//		if(getViewLabel() == null || getViewLabel().equals(""))
//			return false;
//		if(getModelLabel() == null || getModelLabel().equals(""))
//			return false;
//
//		return super.isPageComplete();
//	}
	
//	protected boolean validatePage() {
//		//		if (!super.validatePage()) {
//		//			return false;
//		//		}
//		//		String extension = getExtension();
//		//		if (extension != null
//		//				&& !getFilePath().toString().endsWith("." + extension)) {
//		//			setErrorMessage(NLS.bind(
//		//					Messages.IretCreationWizardPageExtensionError, extension));
//		//			return false;
//		//		}
//		return true;
//	}
}
