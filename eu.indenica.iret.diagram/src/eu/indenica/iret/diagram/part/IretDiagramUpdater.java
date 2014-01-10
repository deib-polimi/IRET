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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Object;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.TreeElement;
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
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class IretDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<IretNodeDescriptor> getSemanticChildren(View view) {
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case GoalDiagramEditPart.VISUAL_ID:
			return getGoalDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretNodeDescriptor> getGoalDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GoalDiagram modelElement = (GoalDiagram) view.getElement();
		LinkedList<IretNodeDescriptor> result = new LinkedList<IretNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasBehaviouralGoal().iterator(); it
				.hasNext();) {
			BehaviouralGoal childElement = (BehaviouralGoal) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BehaviouralGoalEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasAgent().iterator(); it
				.hasNext();) {
			Agent childElement = (Agent) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HumanAgentEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AutomatedAgentEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasOper().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasRLink().iterator(); it
				.hasNext();) {
			RefinementLink childElement = (RefinementLink) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ANDRefinementLinkEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ORRefinementLinkEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasEntity().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasEvent().iterator(); it
				.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasCLink().iterator(); it
				.hasNext();) {
			ContributionLink childElement = (ContributionLink) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContributionLinkEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasAdaptationGoal().iterator(); it
				.hasNext();) {
			AdaptationGoal childElement = (AdaptationGoal) it.next();
			int visualID = IretVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AdaptationGoalEditPart.VISUAL_ID) {
				result.add(new IretNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getContainedLinks(View view) {
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case GoalDiagramEditPart.VISUAL_ID:
			return getGoalDiagram_1000ContainedLinks(view);
		case BehaviouralGoalEditPart.VISUAL_ID:
			return getBehaviouralGoal_2001ContainedLinks(view);
		case HumanAgentEditPart.VISUAL_ID:
			return getHumanAgent_2002ContainedLinks(view);
		case AutomatedAgentEditPart.VISUAL_ID:
			return getAutomatedAgent_2003ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2004ContainedLinks(view);
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return getANDRefinementLink_2005ContainedLinks(view);
		case ORRefinementLinkEditPart.VISUAL_ID:
			return getORRefinementLink_2006ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2008ContainedLinks(view);
		case ContributionLinkEditPart.VISUAL_ID:
			return getContributionLink_2009ContainedLinks(view);
		case AdaptationGoalEditPart.VISUAL_ID:
			return getAdaptationGoal_2010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getIncomingLinks(View view) {
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case BehaviouralGoalEditPart.VISUAL_ID:
			return getBehaviouralGoal_2001IncomingLinks(view);
		case HumanAgentEditPart.VISUAL_ID:
			return getHumanAgent_2002IncomingLinks(view);
		case AutomatedAgentEditPart.VISUAL_ID:
			return getAutomatedAgent_2003IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2004IncomingLinks(view);
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return getANDRefinementLink_2005IncomingLinks(view);
		case ORRefinementLinkEditPart.VISUAL_ID:
			return getORRefinementLink_2006IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2008IncomingLinks(view);
		case ContributionLinkEditPart.VISUAL_ID:
			return getContributionLink_2009IncomingLinks(view);
		case AdaptationGoalEditPart.VISUAL_ID:
			return getAdaptationGoal_2010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getOutgoingLinks(View view) {
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case BehaviouralGoalEditPart.VISUAL_ID:
			return getBehaviouralGoal_2001OutgoingLinks(view);
		case HumanAgentEditPart.VISUAL_ID:
			return getHumanAgent_2002OutgoingLinks(view);
		case AutomatedAgentEditPart.VISUAL_ID:
			return getAutomatedAgent_2003OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2004OutgoingLinks(view);
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return getANDRefinementLink_2005OutgoingLinks(view);
		case ORRefinementLinkEditPart.VISUAL_ID:
			return getORRefinementLink_2006OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2008OutgoingLinks(view);
		case ContributionLinkEditPart.VISUAL_ID:
			return getContributionLink_2009OutgoingLinks(view);
		case AdaptationGoalEditPart.VISUAL_ID:
			return getAdaptationGoal_2010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getGoalDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getBehaviouralGoal_2001ContainedLinks(
			View view) {
		BehaviouralGoal modelElement = (BehaviouralGoal) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_OperationalizedBy_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_ContributedBy_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getHumanAgent_2002ContainedLinks(
			View view) {
		HumanAgent modelElement = (HumanAgent) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Operat_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Controls_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAutomatedAgent_2003ContainedLinks(
			View view) {
		AutomatedAgent modelElement = (AutomatedAgent) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Operat_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Controls_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getOperation_2004ContainedLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_HasEvent_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Out_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getANDRefinementLink_2005ContainedLinks(
			View view) {
		ANDRefinementLink modelElement = (ANDRefinementLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getORRefinementLink_2006ContainedLinks(
			View view) {
		ORRefinementLink modelElement = (ORRefinementLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEntity_2007ContainedLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_IsInputOf_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEvent_2008ContainedLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getContributionLink_2009ContainedLinks(
			View view) {
		ContributionLink modelElement = (ContributionLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContributionLink_Contributor_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAdaptationGoal_2010ContainedLinks(
			View view) {
		AdaptationGoal modelElement = (AdaptationGoal) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AdaptationGoal_Help_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getBehaviouralGoal_2001IncomingLinks(
			View view) {
		BehaviouralGoal modelElement = (BehaviouralGoal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContributionLink_Contributor_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AdaptationGoal_Help_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getHumanAgent_2002IncomingLinks(
			View view) {
		HumanAgent modelElement = (HumanAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_Controls_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAutomatedAgent_2003IncomingLinks(
			View view) {
		AutomatedAgent modelElement = (AutomatedAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_Controls_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getOperation_2004IncomingLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralGoal_OperationalizedBy_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_Operat_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_IsInputOf_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getANDRefinementLink_2005IncomingLinks(
			View view) {
		ANDRefinementLink modelElement = (ANDRefinementLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getORRefinementLink_2006IncomingLinks(
			View view) {
		ORRefinementLink modelElement = (ORRefinementLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEntity_2007IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_Controls_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Out_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEvent_2008IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_HasEvent_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_Controls_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getContributionLink_2009IncomingLinks(
			View view) {
		ContributionLink modelElement = (ContributionLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralGoal_ContributedBy_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAdaptationGoal_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getBehaviouralGoal_2001OutgoingLinks(
			View view) {
		BehaviouralGoal modelElement = (BehaviouralGoal) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_OperationalizedBy_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralGoal_ContributedBy_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getHumanAgent_2002OutgoingLinks(
			View view) {
		HumanAgent modelElement = (HumanAgent) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Operat_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Controls_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAutomatedAgent_2003OutgoingLinks(
			View view) {
		AutomatedAgent modelElement = (AutomatedAgent) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Operat_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Agent_Controls_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getOperation_2004OutgoingLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_HasEvent_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Out_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getANDRefinementLink_2005OutgoingLinks(
			View view) {
		ANDRefinementLink modelElement = (ANDRefinementLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getORRefinementLink_2006OutgoingLinks(
			View view) {
		ORRefinementLink modelElement = (ORRefinementLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEntity_2007OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_IsInputOf_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getEvent_2008OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getContributionLink_2009OutgoingLinks(
			View view) {
		ContributionLink modelElement = (ContributionLink) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContributionLink_Contributor_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IretLinkDescriptor> getAdaptationGoal_2010OutgoingLinks(
			View view) {
		AdaptationGoal modelElement = (AdaptationGoal) view.getElement();
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AdaptationGoal_Help_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralGoal_OperationalizedBy_4001(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getBehaviouralGoal_OperationalizedBy()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.BehaviouralGoalOperationalizedBy_4001,
						BehaviouralGoalOperationalizedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Agent_Operat_4002(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getAgent_Operat()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.AgentOperat_4002,
						AgentOperatEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(
			TreeElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getRefinementLink_RefiningGoals()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.RefinementLinkRefiningGoals_4003,
						RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(
			RefinementLink target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getBehaviouralGoal_RefinedBy()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.BehaviouralGoalRefinedBy_4019,
						BehaviouralGoalRefinedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_ContributionLink_Contributor_4005(
			BehaviouralGoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getContributionLink_Contributor()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.ContributionLinkContributor_4005,
						ContributionLinkContributorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralGoal_ContributedBy_4006(
			ContributionLink target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getBehaviouralGoal_ContributedBy()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.BehaviouralGoalContributedBy_4006,
						BehaviouralGoalContributedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_AdaptationGoal_Help_4007(
			BehaviouralGoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getAdaptationGoal_Help()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.AdaptationGoalHelp_4007,
						AdaptationGoalHelpEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Operation_HasEvent_4008(
			Event target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getOperation_HasEvent()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.OperationHasEvent_4008,
						OperationHasEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(
			Agent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getObject_IsMonitoredBy()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.ObjectIsMonitoredBy_4015,
						ObjectIsMonitoredByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Agent_Controls_4010(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getAgent_Controls()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.AgentControls_4010,
						AgentControlsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_IsInputOf_4014(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getEntity_IsInputOf()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.EntityIsInputOf_4014,
						EntityIsInputOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getIncomingFeatureModelFacetLinks_Operation_Out_4012(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IretPackage.eINSTANCE
					.getOperation_Out()) {
				result.add(new IretLinkDescriptor(setting.getEObject(), target,
						IretElementTypes.OperationOut_4012,
						OperationOutEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralGoal_OperationalizedBy_4001(
			BehaviouralGoal source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getOperationalizedBy()
				.iterator(); destinations.hasNext();) {
			Operation destination = (Operation) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.BehaviouralGoalOperationalizedBy_4001,
					BehaviouralGoalOperationalizedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Agent_Operat_4002(
			Agent source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getOperat().iterator(); destinations
				.hasNext();) {
			Operation destination = (Operation) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.AgentOperat_4002,
					AgentOperatEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_RefinementLink_RefiningGoals_4003(
			RefinementLink source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getRefiningGoals().iterator(); destinations
				.hasNext();) {
			TreeElement destination = (TreeElement) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.RefinementLinkRefiningGoals_4003,
					RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralGoal_RefinedBy_4019(
			BehaviouralGoal source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		RefinementLink destination = source.getRefinedBy();
		if (destination == null) {
			return result;
		}
		result.add(new IretLinkDescriptor(source, destination,
				IretElementTypes.BehaviouralGoalRefinedBy_4019,
				BehaviouralGoalRefinedByEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContributionLink_Contributor_4005(
			ContributionLink source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		BehaviouralGoal destination = source.getContributor();
		if (destination == null) {
			return result;
		}
		result.add(new IretLinkDescriptor(source, destination,
				IretElementTypes.ContributionLinkContributor_4005,
				ContributionLinkContributorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralGoal_ContributedBy_4006(
			BehaviouralGoal source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getContributedBy().iterator(); destinations
				.hasNext();) {
			ContributionLink destination = (ContributionLink) destinations
					.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.BehaviouralGoalContributedBy_4006,
					BehaviouralGoalContributedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_AdaptationGoal_Help_4007(
			AdaptationGoal source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getHelp().iterator(); destinations
				.hasNext();) {
			BehaviouralGoal destination = (BehaviouralGoal) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.AdaptationGoalHelp_4007,
					AdaptationGoalHelpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Operation_HasEvent_4008(
			Operation source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasEvent().iterator(); destinations
				.hasNext();) {
			Event destination = (Event) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.OperationHasEvent_4008,
					OperationHasEventEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_IsMonitoredBy_4015(
			Object source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getIsMonitoredBy().iterator(); destinations
				.hasNext();) {
			Agent destination = (Agent) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.ObjectIsMonitoredBy_4015,
					ObjectIsMonitoredByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Agent_Controls_4010(
			Agent source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getControls().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.AgentControls_4010,
					AgentControlsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_IsInputOf_4014(
			Entity source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getIsInputOf().iterator(); destinations
				.hasNext();) {
			Operation destination = (Operation) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.EntityIsInputOf_4014,
					EntityIsInputOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IretLinkDescriptor> getOutgoingFeatureModelFacetLinks_Operation_Out_4012(
			Operation source) {
		LinkedList<IretLinkDescriptor> result = new LinkedList<IretLinkDescriptor>();
		for (Iterator<?> destinations = source.getOut().iterator(); destinations
				.hasNext();) {
			Entity destination = (Entity) destinations.next();
			result.add(new IretLinkDescriptor(source, destination,
					IretElementTypes.OperationOut_4012,
					OperationOutEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<IretNodeDescriptor> getSemanticChildren(View view) {
			return IretDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IretLinkDescriptor> getContainedLinks(View view) {
			return IretDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IretLinkDescriptor> getIncomingLinks(View view) {
			return IretDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IretLinkDescriptor> getOutgoingLinks(View view) {
			return IretDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
