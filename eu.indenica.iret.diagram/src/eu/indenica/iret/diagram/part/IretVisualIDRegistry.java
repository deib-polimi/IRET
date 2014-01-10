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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkWeightEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityNameEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.EventNameEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class IretVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "eu.indenica.iret.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GoalDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return GoalDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return eu.indenica.iret.diagram.part.IretVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				IretDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (IretPackage.eINSTANCE.getGoalDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((GoalDiagram) domainElement)) {
			return GoalDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = eu.indenica.iret.diagram.part.IretVisualIDRegistry
				.getModelID(containerView);
		if (!GoalDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"Iret".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GoalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GoalDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GoalDiagramEditPart.VISUAL_ID:
			if (IretPackage.eINSTANCE.getBehaviouralGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return BehaviouralGoalEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getHumanAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return HumanAgentEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getAutomatedAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return AutomatedAgentEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getANDRefinementLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ANDRefinementLinkEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getORRefinementLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ORRefinementLinkEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getContributionLink().isSuperTypeOf(
					domainElement.eClass())) {
				return ContributionLinkEditPart.VISUAL_ID;
			}
			if (IretPackage.eINSTANCE.getAdaptationGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return AdaptationGoalEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = eu.indenica.iret.diagram.part.IretVisualIDRegistry
				.getModelID(containerView);
		if (!GoalDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"Iret".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GoalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GoalDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GoalDiagramEditPart.VISUAL_ID:
			if (BehaviouralGoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HumanAgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AutomatedAgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ANDRefinementLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ORRefinementLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContributionLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdaptationGoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BehaviouralGoalEditPart.VISUAL_ID:
			if (BehaviouralGoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HumanAgentEditPart.VISUAL_ID:
			if (HumanAgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AutomatedAgentEditPart.VISUAL_ID:
			if (AutomatedAgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContributionLinkEditPart.VISUAL_ID:
			if (ContributionLinkWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdaptationGoalEditPart.VISUAL_ID:
			if (AdaptationGoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(GoalDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GoalDiagramEditPart.VISUAL_ID:
			return false;
		case BehaviouralGoalEditPart.VISUAL_ID:
		case HumanAgentEditPart.VISUAL_ID:
		case AutomatedAgentEditPart.VISUAL_ID:
		case OperationEditPart.VISUAL_ID:
		case ANDRefinementLinkEditPart.VISUAL_ID:
		case ORRefinementLinkEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case EventEditPart.VISUAL_ID:
		case ContributionLinkEditPart.VISUAL_ID:
		case AdaptationGoalEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return eu.indenica.iret.diagram.part.IretVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
