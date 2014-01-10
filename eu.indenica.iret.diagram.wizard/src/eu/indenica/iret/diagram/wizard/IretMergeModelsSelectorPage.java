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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class IretMergeModelsSelectorPage extends WizardPage {

	/**
	 * @generated
	 */
	private final String fileExtension;
	private Text txtIreneModel1, txtIreneModel2;
	private Text txtViewName;
	private IPath ireneModelPath1, ireneModelPath2;
	private Button btnReadOnly;

	public IretMergeModelsSelectorPage(String pageName, IStructuredSelection selection, String fileExtension) {
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

	public URI[] getInputModelsURIs() {
		//BASILIO: more sophisticated comparison logic here?
		if((ireneModelPath1!=null && ireneModelPath2!=null) && (ireneModelPath1.toString().trim()!=ireneModelPath2.toString().trim()))  //checks if 2 different models have been selected
			return new URI[]{URI.createPlatformResourceURI(ireneModelPath1.toString(),false),URI.createPlatformResourceURI(ireneModelPath2.toString(),false)};
		else
			return new URI[]{};
	}
	
	public boolean isViewReadOnly(){
		return btnReadOnly.getSelection();
	}
	
	public String getViewLabel(){
		return txtViewName.getText();
	}
	
	public String getModel_1_name(){
		return txtIreneModel1.getText();
	}
	
	public String getModel_2_name(){
		return txtIreneModel2.getText();
	}
	
	public URI getModelURI_1() {
		return URI.createPlatformResourceURI(ireneModelPath1.toString(),false);
	}

	public URI getViewURI_1() {
		IPath viewURI = ireneModelPath1.removeLastSegments(1).append(txtViewName.getText()).addFileExtension("iret_diagram");
		return URI.createPlatformResourceURI(viewURI.toString(), false);
	}
	
	public URI getModelURI_2() {
		return URI.createPlatformResourceURI(ireneModelPath2.toString(),false);
	}


	/**
	 * @generated
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(3, false));

		Label lblIreneModel = new Label(container, SWT.NONE);
		lblIreneModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIreneModel.setText("INPUT MODELS");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
//		new Label(container, SWT.NONE);

		Label lbl1 = new Label(container, SWT.NONE);
		lbl1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl1.setText("Primary Model");	
		
		txtIreneModel1 = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtIreneModel1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		//txtIreneModel1.setText("/ModellIRET/modello1.iret");

		Button btnSelect1= new Button(container, SWT.NONE);
		btnSelect1.setText("Select...");
		
//browser per secondo modello
		Label lbl2 = new Label(container, SWT.NONE);
		lbl2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl2.setText("Secondary Model");		

		txtIreneModel2 = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtIreneModel2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,1));
		//txtIreneModel2.setText("/ModellIRET/modello2.iret");

		Button btnSelect2 = new Button(container, SWT.NONE);
		btnSelect2.setText("Select...");
		
//------
		Label lblView_1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_lblView_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1);
		gd_lblView_1.widthHint = 568;
		lblView_1.setLayoutData(gd_lblView_1);
//		lblView_1.setText("View");

		Label lblView = new Label(container, SWT.NONE);
		lblView.setText("OUTPUT MODEL");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

//		Label lblViewName = new Label(container, SWT.NONE);
//		lblViewName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lblViewName.setText("Name:");

		txtViewName = new Text(container, SWT.BORDER);
		txtViewName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
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
		btnSelect1.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				dialog.open();
				if(dialog.getFirstResult()!=null){
					Object o = dialog.getFirstResult();
					if(o instanceof IResource){
						IResource res = (IResource)o;
						ireneModelPath1=res.getFullPath();
						txtIreneModel1.setText(ireneModelPath1.toString());
					}
				}
			}
		});
		
		btnSelect2.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				dialog.open();
				if(dialog.getFirstResult()!=null){
					Object o = dialog.getFirstResult();
					if(o instanceof IResource){
						IResource res = (IResource)o;
						ireneModelPath2=res.getFullPath();
						txtIreneModel2.setText(ireneModelPath2.toString());
					}
				}
			}
		});

	}

	protected boolean validatePage() {
		//		if (!super.validatePage()) {
		//			return false;
		//		}
		//		String extension = getExtension();
		//		if (extension != null
		//				&& !getFilePath().toString().endsWith("." + extension)) {
		//			setErrorMessage(NLS.bind(
		//					Messages.IretCreationWizardPageExtensionError, extension));
		//			return false;
		//		}
		return true;
	}
}
