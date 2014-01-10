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
import eu.indenica.iret.RefinementLink;

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
 * This is the item provider adapter for a {@link eu.indenica.iret.RefinementLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinementLinkItemProvider
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
	public RefinementLinkItemProvider(AdapterFactory adapterFactory) {
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

			addRefinesPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addRefiningGoalsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeElement_refines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeElement_refines_feature", "_UI_TreeElement_type"),
				 IretPackage.Literals.TREE_ELEMENT__REFINES,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_RefinementLink_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefinementLink_id_feature", "_UI_RefinementLink_type"),
				 IretPackage.Literals.REFINEMENT_LINK__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refining Goals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefiningGoalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefinementLink_refiningGoals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefinementLink_refiningGoals_feature", "_UI_RefinementLink_type"),
				 IretPackage.Literals.REFINEMENT_LINK__REFINING_GOALS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(IretPackage.Literals.REFINEMENT_LINK__REFINED_GOAL);
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
	 * This returns RefinementLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RefinementLink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RefinementLink refinementLink = (RefinementLink)object;
		return getString("_UI_RefinementLink_type") + " " + refinementLink.getId();
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

		switch (notification.getFeatureID(RefinementLink.class)) {
			case IretPackage.REFINEMENT_LINK__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
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
				(IretPackage.Literals.REFINEMENT_LINK__REFINED_GOAL,
				 IretFactory.eINSTANCE.createBehaviouralGoal()));
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
			childFeature == IretPackage.Literals.IRENE_ELEMENT__DERIVED_FROM ||
			childFeature == IretPackage.Literals.REFINEMENT_LINK__REFINED_GOAL;

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
