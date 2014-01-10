/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL � Politecnico di Milano
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


import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.IretFactory;
import eu.indenica.iret.IretPackage;

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
 * This is the item provider adapter for a {@link eu.indenica.iret.GoalDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalDiagramItemProvider
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
	public GoalDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addReadonlyPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Readonly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadonlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GoalDiagram_readonly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GoalDiagram_readonly_feature", "_UI_GoalDiagram_type"),
				 IretPackage.Literals.GOAL_DIAGRAM__READONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GoalDiagram_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GoalDiagram_label_feature", "_UI_GoalDiagram_type"),
				 IretPackage.Literals.GOAL_DIAGRAM__LABEL,
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
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_RLINK);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_EVENT);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_OPER);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_ENTITY);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_AGENT);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_ACTION);
			childrenFeatures.add(IretPackage.Literals.GOAL_DIAGRAM__HAS_CLINK);
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
	 * This returns GoalDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GoalDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		GoalDiagram goalDiagram = (GoalDiagram)object;
		return getString("_UI_GoalDiagram_type") + " " + goalDiagram.isReadonly();
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

		switch (notification.getFeatureID(GoalDiagram.class)) {
			case IretPackage.GOAL_DIAGRAM__READONLY:
			case IretPackage.GOAL_DIAGRAM__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
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
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_RLINK,
				 IretFactory.eINSTANCE.createRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_RLINK,
				 IretFactory.eINSTANCE.createANDRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_RLINK,
				 IretFactory.eINSTANCE.createORRefinementLink()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL,
				 IretFactory.eINSTANCE.createBehaviouralGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL,
				 IretFactory.eINSTANCE.createAdaptationGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_EVENT,
				 IretFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_OPER,
				 IretFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_ENTITY,
				 IretFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_AGENT,
				 IretFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_AGENT,
				 IretFactory.eINSTANCE.createHumanAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_AGENT,
				 IretFactory.eINSTANCE.createAutomatedAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_ACTION,
				 IretFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(IretPackage.Literals.GOAL_DIAGRAM__HAS_CLINK,
				 IretFactory.eINSTANCE.createContributionLink()));
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
