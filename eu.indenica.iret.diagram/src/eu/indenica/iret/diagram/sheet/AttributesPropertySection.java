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
package eu.indenica.iret.diagram.sheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractNotationPropertiesSection;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import eu.indenica.iret.Attribute;
import eu.indenica.iret.AttributeType;
import eu.indenica.iret.Entity;
import eu.indenica.iret.EntityAttribute;
import eu.indenica.iret.Event;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.IretFactory;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;

/**
 * @generated not
 */
public class AttributesPropertySection extends
		AbstractNotationPropertiesSection//AbstractModelerPropertySection //AdvancedPropertySection , AbstractPropertySection
		implements IPropertySourceProvider {

	private Composite container;
	private Composite existingAttributes;

	private Text txtName;
	private Combo cmbType;

	//	private Logger logger = Logger.getLogger(AttributesPropertySection.class.toString());

	public void createControls(final Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		container = getWidgetFactory().createComposite(composite);
		container.setLayout(new ColumnLayout());

		generateNewAttributeForm(container);

		existingAttributes = getWidgetFactory().createComposite(container);
		existingAttributes.setLayout(new GridLayout(2, false));

	}

	@Override
	public void refresh() {
		super.refresh();

		if (!isDisposed()) {
			executeAsReadAction(new Runnable() {
				@Override
				public void run() {
					IGraphicalEditPart graphicalEditPart = getSingleInput();
					if (graphicalEditPart instanceof EntityEditPart
							|| graphicalEditPart instanceof EventEditPart) {
						List<Attribute> attributes;
						String actualEntity = null;
						if (graphicalEditPart instanceof EntityEditPart) {
							Entity entity = (Entity) ((EntityEditPart) graphicalEditPart)
									.resolveSemanticElement();
							attributes = entity.getAttributes();
							actualEntity = entity.getName();
						} else {
							Event event = (Event) ((EventEditPart) graphicalEditPart)
									.resolveSemanticElement();
							attributes = event.getAttributes();
						}

						existingAttributes.dispose();
						existingAttributes = getWidgetFactory()
								.createComposite(container);
						existingAttributes.setLayout(new GridLayout(2, false));

						//refresh the attribute list:
						for (final Attribute att : attributes) {
							Label lblName = new Label(existingAttributes,
									SWT.NONE);
							if (att instanceof PrimitiveAttribute) {
								lblName.setText(att.getName() + " : "
										+ ((PrimitiveAttribute) att).getType());
							} else {
								lblName.setText(att.getName()
										+ " : "
										+ ((EntityAttribute) att).getType()
												.getName());
							}
							Button btnRemove = new Button(existingAttributes,
									SWT.PUSH);
							btnRemove.setText("Del");
							btnRemove.setLayoutData(new GridData(SWT.RIGHT,
									SWT.CENTER, false, false, 1, 1));
							btnRemove
									.addSelectionListener(new SelectionAdapter() {
										@Override
										public void widgetSelected(
												SelectionEvent e) {
											EditingDomain ed = ((DiagramEditor) PlatformUI
													.getWorkbench()
													.getActiveWorkbenchWindow()
													.getActivePage()
													.getActiveEditor())
													.getEditingDomain();
											TransactionalEditingDomain ted = (TransactionalEditingDomain) ed;
											ed.getCommandStack().execute(
													new RecordingCommand(ted) {
														@Override
														protected void doExecute() {
															EcoreUtil
																	.remove(att);
															AttributesPropertySection.this
																	.refresh();
														}
													});
										}
									});
						}

						//refresh the combo options:						
						txtName.setText("");

						cmbType.removeAll();

						for (AttributeType at : AttributeType.values())
							cmbType.add(at.getName());

						EditingDomain ed = ((DiagramEditor) PlatformUI
								.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor())
								.getEditingDomain();
						ResourceSet rs = ed.getResourceSet();
						Iterator<?> i = rs.getAllContents();
						while (i.hasNext()) {
							Object o = i.next();
							if (o instanceof Entity) {
								Entity e = (Entity) o;
								if (actualEntity == null
										|| !e.getName().equals(actualEntity))
									cmbType.add(e.getName());
							}
						}
						cmbType.select(0);
						existingAttributes.layout(true);
						container.redraw();
						container.layout(true);
						composite.getParent().pack();
						composite.getParent().redraw();
						composite.getParent().layout(true);
					}

				}
			});
		}
	}

	protected Composite generateNewAttributeForm(Composite composite) {
		Group cntAttribute = new Group(composite, SWT.NONE);
		cntAttribute.setText("Add new attribute");
		cntAttribute.setLayout(new GridLayout(2, false));

		//Name:
		Label lblName = new Label(cntAttribute, SWT.NONE);
		lblName.setText("Name:");

		txtName = new Text(cntAttribute, SWT.BORDER);

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		txtName.setLayoutData(gridData);

		//Type:
		Label lblType = new Label(cntAttribute, SWT.NONE);
		lblType.setText("Type:");

		cmbType = new Combo(cntAttribute, SWT.NONE);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		cmbType.setLayoutData(gridData);

		new Label(cntAttribute, SWT.NONE);
		Button btnAddArg = new Button(cntAttribute, SWT.CENTER);
		btnAddArg.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		btnAddArg.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EditingDomain ed = ((DiagramEditor) PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.getActiveEditor()).getEditingDomain();
				TransactionalEditingDomain ted = (TransactionalEditingDomain) ed;
				ed.getCommandStack().execute(new RecordingCommand(ted) {
					@Override
					protected void doExecute() {
						Attribute att = null;
						String selected = cmbType.getItem(cmbType
								.getSelectionIndex());
						if (AttributeType.getByName(selected) != null) {
							att = IretFactory.eINSTANCE
									.createPrimitiveAttribute();
							att.setName(txtName.getText());
							((PrimitiveAttribute) att).setType(AttributeType
									.getByName(selected));
						} else {
							att = IretFactory.eINSTANCE.createEntityAttribute();
							att.setName(txtName.getText());
							EditingDomain ed = ((DiagramEditor) PlatformUI
									.getWorkbench().getActiveWorkbenchWindow()
									.getActivePage().getActiveEditor())
									.getEditingDomain();
							ResourceSet rs = ed.getResourceSet();
							Iterator<?> i = rs.getAllContents();
							while (i.hasNext()) {
								Object o = i.next();
								if (o instanceof Entity) {
									Entity e = (Entity) o;
									if (e.getName().equals(selected))
										((EntityAttribute) att).setType(e);
								}
							}
						}
						IGraphicalEditPart graphicalEditPart = getSingleInput();
						if (graphicalEditPart instanceof EntityEditPart) {
							Entity entity = (Entity) ((EntityEditPart) graphicalEditPart)
									.resolveSemanticElement();
							entity.getAttributes().add(att);
						} else if (graphicalEditPart instanceof EventEditPart) {
							Event event = (Event) ((EventEditPart) graphicalEditPart)
									.resolveSemanticElement();
							event.getAttributes().add(att);
						}

						AttributesPropertySection.this.refresh();
					}
				});
			}
		});
		btnAddArg.setText("Add");

		return cntAttribute;
	}

	/**
	 * @generated not
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	protected Object transformSelection(Object selected) {
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(
				structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain())
					.getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}
		return null;
	}

}
