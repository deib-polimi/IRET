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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.indenica.iret.provider;


import eu.indenica.iret.IretFactory;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.indenica.iret.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addInPropertyDescriptor(object);
			addOutPropertyDescriptor(object);
			addHasEventPropertyDescriptor(object);
			addMinExecTImesPropertyDescriptor(object);
			addMaxExecTimesPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_description_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_in_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_in_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__IN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_out_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__OUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_hasEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_hasEvent_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__HAS_EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Exec TImes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExecTImesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_minExecTImes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_minExecTImes_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__MIN_EXEC_TIMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Exec Times feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxExecTimesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_maxExecTimes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_maxExecTimes_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__MAX_EXEC_TIMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_id_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_name_feature", "_UI_Operation_type"),
				 IretPackage.Literals.OPERATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM);
			childrenFeatures.add(IretPackage.Literals.OPERATION__DOM_PRE);
			childrenFeatures.add(IretPackage.Literals.OPERATION__DOM_POST);
			childrenFeatures.add(IretPackage.Literals.OPERATION__REQ_PRE);
			childrenFeatures.add(IretPackage.Literals.OPERATION__REQ_POST);
			childrenFeatures.add(IretPackage.Literals.OPERATION__TRIG_PRE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Operation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Operation_type") :
			getString("_UI_Operation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operation.class)) {
			case IretPackage.OPERATION__DESCRIPTION:
			case IretPackage.OPERATION__MIN_EXEC_TIMES:
			case IretPackage.OPERATION__MAX_EXEC_TIMES:
			case IretPackage.OPERATION__ID:
			case IretPackage.OPERATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IretPackage.OPERATION__DERIVED_FROM:
			case IretPackage.OPERATION__DOM_PRE:
			case IretPackage.OPERATION__DOM_POST:
			case IretPackage.OPERATION__REQ_PRE:
			case IretPackage.OPERATION__REQ_POST:
			case IretPackage.OPERATION__TRIG_PRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createHumanAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createAutomatedAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createBehaviouralGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createAdaptationGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createANDRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createORRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM,
				 IretFactory.eINSTANCE.createContributionLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.OPERATION__DOM_PRE,
				 IretFactory.eINSTANCE.createFormalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.OPERATION__DOM_POST,
				 IretFactory.eINSTANCE.createFormalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.OPERATION__REQ_PRE,
				 IretFactory.eINSTANCE.createFormalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.OPERATION__REQ_POST,
				 IretFactory.eINSTANCE.createFormalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.OPERATION__TRIG_PRE,
				 IretFactory.eINSTANCE.createFormalDefinition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == IretPackage.Literals.OPERATION__DOM_PRE ||
			childFeature == IretPackage.Literals.OPERATION__DOM_POST ||
			childFeature == IretPackage.Literals.OPERATION__REQ_PRE ||
			childFeature == IretPackage.Literals.OPERATION__REQ_POST ||
			childFeature == IretPackage.Literals.OPERATION__TRIG_PRE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IretEditPlugin.INSTANCE;
	}

}
