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
package eu.indenica.iret.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import eu.indenica.iret.IretPackage;
import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalHelpEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentControlsEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentOperatEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalContributedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalOperationalizedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalRefinedByEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkContributorEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityIsInputOfEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.ObjectIsMonitoredByEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationHasEventEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationOutEditPart;
import eu.indenica.iret.diagram.edit.parts.RefinementLinkRefiningGoalsEditPart;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;

/**
 * @generated
 */
public class IretElementTypes {

	/**
	 * @generated
	 */
	private IretElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType GoalDiagram_1000 = getElementType("eu.indenica.iret.diagram.GoalDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BehaviouralGoal_2001 = getElementType("eu.indenica.iret.diagram.BehaviouralGoal_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HumanAgent_2002 = getElementType("eu.indenica.iret.diagram.HumanAgent_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AutomatedAgent_2003 = getElementType("eu.indenica.iret.diagram.AutomatedAgent_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2004 = getElementType("eu.indenica.iret.diagram.Operation_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ANDRefinementLink_2005 = getElementType("eu.indenica.iret.diagram.ANDRefinementLink_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ORRefinementLink_2006 = getElementType("eu.indenica.iret.diagram.ORRefinementLink_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2007 = getElementType("eu.indenica.iret.diagram.Entity_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2008 = getElementType("eu.indenica.iret.diagram.Event_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContributionLink_2009 = getElementType("eu.indenica.iret.diagram.ContributionLink_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdaptationGoal_2010 = getElementType("eu.indenica.iret.diagram.AdaptationGoal_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BehaviouralGoalOperationalizedBy_4001 = getElementType("eu.indenica.iret.diagram.BehaviouralGoalOperationalizedBy_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AgentOperat_4002 = getElementType("eu.indenica.iret.diagram.AgentOperat_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefinementLinkRefiningGoals_4003 = getElementType("eu.indenica.iret.diagram.RefinementLinkRefiningGoals_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BehaviouralGoalRefinedBy_4019 = getElementType("eu.indenica.iret.diagram.BehaviouralGoalRefinedBy_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContributionLinkContributor_4005 = getElementType("eu.indenica.iret.diagram.ContributionLinkContributor_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BehaviouralGoalContributedBy_4006 = getElementType("eu.indenica.iret.diagram.BehaviouralGoalContributedBy_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AdaptationGoalHelp_4007 = getElementType("eu.indenica.iret.diagram.AdaptationGoalHelp_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OperationHasEvent_4008 = getElementType("eu.indenica.iret.diagram.OperationHasEvent_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ObjectIsMonitoredBy_4015 = getElementType("eu.indenica.iret.diagram.ObjectIsMonitoredBy_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AgentControls_4010 = getElementType("eu.indenica.iret.diagram.AgentControls_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntityIsInputOf_4014 = getElementType("eu.indenica.iret.diagram.EntityIsInputOf_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OperationOut_4012 = getElementType("eu.indenica.iret.diagram.OperationOut_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return IretDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(GoalDiagram_1000,
					IretPackage.eINSTANCE.getGoalDiagram());

			elements.put(BehaviouralGoal_2001,
					IretPackage.eINSTANCE.getBehaviouralGoal());

			elements.put(HumanAgent_2002, IretPackage.eINSTANCE.getHumanAgent());

			elements.put(AutomatedAgent_2003,
					IretPackage.eINSTANCE.getAutomatedAgent());

			elements.put(Operation_2004, IretPackage.eINSTANCE.getOperation());

			elements.put(ANDRefinementLink_2005,
					IretPackage.eINSTANCE.getANDRefinementLink());

			elements.put(ORRefinementLink_2006,
					IretPackage.eINSTANCE.getORRefinementLink());

			elements.put(Entity_2007, IretPackage.eINSTANCE.getEntity());

			elements.put(Event_2008, IretPackage.eINSTANCE.getEvent());

			elements.put(ContributionLink_2009,
					IretPackage.eINSTANCE.getContributionLink());

			elements.put(AdaptationGoal_2010,
					IretPackage.eINSTANCE.getAdaptationGoal());

			elements.put(BehaviouralGoalOperationalizedBy_4001,
					IretPackage.eINSTANCE
							.getBehaviouralGoal_OperationalizedBy());

			elements.put(AgentOperat_4002,
					IretPackage.eINSTANCE.getAgent_Operat());

			elements.put(RefinementLinkRefiningGoals_4003,
					IretPackage.eINSTANCE.getRefinementLink_RefiningGoals());

			elements.put(BehaviouralGoalRefinedBy_4019,
					IretPackage.eINSTANCE.getBehaviouralGoal_RefinedBy());

			elements.put(ContributionLinkContributor_4005,
					IretPackage.eINSTANCE.getContributionLink_Contributor());

			elements.put(BehaviouralGoalContributedBy_4006,
					IretPackage.eINSTANCE.getBehaviouralGoal_ContributedBy());

			elements.put(AdaptationGoalHelp_4007,
					IretPackage.eINSTANCE.getAdaptationGoal_Help());

			elements.put(OperationHasEvent_4008,
					IretPackage.eINSTANCE.getOperation_HasEvent());

			elements.put(ObjectIsMonitoredBy_4015,
					IretPackage.eINSTANCE.getObject_IsMonitoredBy());

			elements.put(AgentControls_4010,
					IretPackage.eINSTANCE.getAgent_Controls());

			elements.put(EntityIsInputOf_4014,
					IretPackage.eINSTANCE.getEntity_IsInputOf());

			elements.put(OperationOut_4012,
					IretPackage.eINSTANCE.getOperation_Out());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated not 
	 */
	public static IElementType getElementType(ENamedElement ene) {
		if (elements == null)
			getElement(new IAdaptable() {
				@Override
				public Object getAdapter(Class adapter) {
					return BehaviouralGoal_2001;
				}
			});
		for (IElementType et : elements.keySet())
			if (elements.get(et).equals(ene))
				return et;
		return null;
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(GoalDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(BehaviouralGoal_2001);
			KNOWN_ELEMENT_TYPES.add(HumanAgent_2002);
			KNOWN_ELEMENT_TYPES.add(AutomatedAgent_2003);
			KNOWN_ELEMENT_TYPES.add(Operation_2004);
			KNOWN_ELEMENT_TYPES.add(ANDRefinementLink_2005);
			KNOWN_ELEMENT_TYPES.add(ORRefinementLink_2006);
			KNOWN_ELEMENT_TYPES.add(Entity_2007);
			KNOWN_ELEMENT_TYPES.add(Event_2008);
			KNOWN_ELEMENT_TYPES.add(ContributionLink_2009);
			KNOWN_ELEMENT_TYPES.add(AdaptationGoal_2010);
			KNOWN_ELEMENT_TYPES.add(BehaviouralGoalOperationalizedBy_4001);
			KNOWN_ELEMENT_TYPES.add(AgentOperat_4002);
			KNOWN_ELEMENT_TYPES.add(RefinementLinkRefiningGoals_4003);
			KNOWN_ELEMENT_TYPES.add(BehaviouralGoalRefinedBy_4019);
			KNOWN_ELEMENT_TYPES.add(ContributionLinkContributor_4005);
			KNOWN_ELEMENT_TYPES.add(BehaviouralGoalContributedBy_4006);
			KNOWN_ELEMENT_TYPES.add(AdaptationGoalHelp_4007);
			KNOWN_ELEMENT_TYPES.add(OperationHasEvent_4008);
			KNOWN_ELEMENT_TYPES.add(ObjectIsMonitoredBy_4015);
			KNOWN_ELEMENT_TYPES.add(AgentControls_4010);
			KNOWN_ELEMENT_TYPES.add(EntityIsInputOf_4014);
			KNOWN_ELEMENT_TYPES.add(OperationOut_4012);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GoalDiagramEditPart.VISUAL_ID:
			return GoalDiagram_1000;
		case BehaviouralGoalEditPart.VISUAL_ID:
			return BehaviouralGoal_2001;
		case HumanAgentEditPart.VISUAL_ID:
			return HumanAgent_2002;
		case AutomatedAgentEditPart.VISUAL_ID:
			return AutomatedAgent_2003;
		case OperationEditPart.VISUAL_ID:
			return Operation_2004;
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return ANDRefinementLink_2005;
		case ORRefinementLinkEditPart.VISUAL_ID:
			return ORRefinementLink_2006;
		case EntityEditPart.VISUAL_ID:
			return Entity_2007;
		case EventEditPart.VISUAL_ID:
			return Event_2008;
		case ContributionLinkEditPart.VISUAL_ID:
			return ContributionLink_2009;
		case AdaptationGoalEditPart.VISUAL_ID:
			return AdaptationGoal_2010;
		case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID:
			return BehaviouralGoalOperationalizedBy_4001;
		case AgentOperatEditPart.VISUAL_ID:
			return AgentOperat_4002;
		case RefinementLinkRefiningGoalsEditPart.VISUAL_ID:
			return RefinementLinkRefiningGoals_4003;
		case BehaviouralGoalRefinedByEditPart.VISUAL_ID:
			return BehaviouralGoalRefinedBy_4019;
		case ContributionLinkContributorEditPart.VISUAL_ID:
			return ContributionLinkContributor_4005;
		case BehaviouralGoalContributedByEditPart.VISUAL_ID:
			return BehaviouralGoalContributedBy_4006;
		case AdaptationGoalHelpEditPart.VISUAL_ID:
			return AdaptationGoalHelp_4007;
		case OperationHasEventEditPart.VISUAL_ID:
			return OperationHasEvent_4008;
		case ObjectIsMonitoredByEditPart.VISUAL_ID:
			return ObjectIsMonitoredBy_4015;
		case AgentControlsEditPart.VISUAL_ID:
			return AgentControls_4010;
		case EntityIsInputOfEditPart.VISUAL_ID:
			return EntityIsInputOf_4014;
		case OperationOutEditPart.VISUAL_ID:
			return OperationOut_4012;
		}
		return null;
	}

}
