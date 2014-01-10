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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;

/**
 * @generated
 */
public class IretDiagramContentInitializer {

	/**
	 * @generated
	 */
	private Map myDomain2NotationMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	public void initDiagramContent(Diagram diagram) {
		if (!GoalDiagramEditPart.MODEL_ID.equals(diagram.getType())) {
			IretDiagramEditorPlugin.getInstance().logError(
					"Incorrect diagram passed as a parameter: "
							+ diagram.getType());
			return;
		}
		if (false == diagram.getElement() instanceof GoalDiagram) {
			IretDiagramEditorPlugin.getInstance().logError(
					"Incorrect diagram element specified: "
							+ diagram.getElement() + " instead of GoalDiagram");
			return;
		}
		createGoalDiagram_1000Children(diagram);
		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createGoalDiagram_1000Children(View view) {
		Collection childNodeDescriptors = IretDiagramUpdater
				.getGoalDiagram_1000SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (IretNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createBehaviouralGoal_2001Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getBehaviouralGoal_2001OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createHumanAgent_2002Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getHumanAgent_2002OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createAutomatedAgent_2003Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getAutomatedAgent_2003OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createOperation_2004Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getOperation_2004OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createANDRefinementLink_2005Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getANDRefinementLink_2005OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createORRefinementLink_2006Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getORRefinementLink_2006OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createEntity_2007Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getEntity_2007OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createEvent_2008Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getEvent_2008OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createContributionLink_2009Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getContributionLink_2009OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createAdaptationGoal_2010Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(IretDiagramUpdater
				.getAdaptationGoal_2010OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createNode(View parentView, IretNodeDescriptor nodeDescriptor) {
		final String nodeType = IretVisualIDRegistry.getType(nodeDescriptor
				.getVisualID());
		Node node = ViewService.createNode(parentView,
				nodeDescriptor.getModelElement(), nodeType,
				IretDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		switch (nodeDescriptor.getVisualID()) {
		case BehaviouralGoalEditPart.VISUAL_ID:
			createBehaviouralGoal_2001Children(node);
			return;
		case HumanAgentEditPart.VISUAL_ID:
			createHumanAgent_2002Children(node);
			return;
		case AutomatedAgentEditPart.VISUAL_ID:
			createAutomatedAgent_2003Children(node);
			return;
		case OperationEditPart.VISUAL_ID:
			createOperation_2004Children(node);
			return;
		case ANDRefinementLinkEditPart.VISUAL_ID:
			createANDRefinementLink_2005Children(node);
			return;
		case ORRefinementLinkEditPart.VISUAL_ID:
			createORRefinementLink_2006Children(node);
			return;
		case EntityEditPart.VISUAL_ID:
			createEntity_2007Children(node);
			return;
		case EventEditPart.VISUAL_ID:
			createEvent_2008Children(node);
			return;
		case ContributionLinkEditPart.VISUAL_ID:
			createContributionLink_2009Children(node);
			return;
		case AdaptationGoalEditPart.VISUAL_ID:
			createAdaptationGoal_2010Children(node);
			return;
		}
	}

	/**
	 * @generated
	 */
	private void createLinks(Diagram diagram) {
		for (boolean continueLinkCreation = true; continueLinkCreation;) {
			continueLinkCreation = false;
			Collection additionalDescriptors = new LinkedList();
			for (Iterator it = myLinkDescriptors.iterator(); it.hasNext();) {
				IretLinkDescriptor nextLinkDescriptor = (IretLinkDescriptor) it
						.next();
				if (!myDomain2NotationMap.containsKey(nextLinkDescriptor
						.getSource())
						|| !myDomain2NotationMap.containsKey(nextLinkDescriptor
								.getDestination())) {
					continue;
				}
				final String linkType = IretVisualIDRegistry
						.getType(nextLinkDescriptor.getVisualID());
				Edge edge = ViewService.getInstance().createEdge(
						nextLinkDescriptor.getSemanticAdapter(), diagram,
						linkType, ViewUtil.APPEND, true,
						IretDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (edge != null) {
					edge.setSource((View) myDomain2NotationMap
							.get(nextLinkDescriptor.getSource()));
					edge.setTarget((View) myDomain2NotationMap
							.get(nextLinkDescriptor.getDestination()));
					it.remove();
					if (nextLinkDescriptor.getModelElement() != null) {
						myDomain2NotationMap.put(
								nextLinkDescriptor.getModelElement(), edge);
					}
					continueLinkCreation = true;
					switch (nextLinkDescriptor.getVisualID()) {
					}
				}
			}
			myLinkDescriptors.addAll(additionalDescriptors);
		}
	}

}
