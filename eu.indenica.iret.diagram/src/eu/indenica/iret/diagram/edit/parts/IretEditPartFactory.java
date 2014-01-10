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
package eu.indenica.iret.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import eu.indenica.iret.diagram.part.IretVisualIDRegistry;

/**
 * @generated
 */
public class IretEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (IretVisualIDRegistry.getVisualID(view)) {

			case GoalDiagramEditPart.VISUAL_ID:
				return new GoalDiagramEditPart(view);

			case BehaviouralGoalEditPart.VISUAL_ID:
				return new BehaviouralGoalEditPart(view);

			case BehaviouralGoalNameEditPart.VISUAL_ID:
				return new BehaviouralGoalNameEditPart(view);

			case HumanAgentEditPart.VISUAL_ID:
				return new HumanAgentEditPart(view);

			case HumanAgentNameEditPart.VISUAL_ID:
				return new HumanAgentNameEditPart(view);

			case AutomatedAgentEditPart.VISUAL_ID:
				return new AutomatedAgentEditPart(view);

			case AutomatedAgentNameEditPart.VISUAL_ID:
				return new AutomatedAgentNameEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case ANDRefinementLinkEditPart.VISUAL_ID:
				return new ANDRefinementLinkEditPart(view);

			case ORRefinementLinkEditPart.VISUAL_ID:
				return new ORRefinementLinkEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventNameEditPart.VISUAL_ID:
				return new EventNameEditPart(view);

			case ContributionLinkEditPart.VISUAL_ID:
				return new ContributionLinkEditPart(view);

			case ContributionLinkWeightEditPart.VISUAL_ID:
				return new ContributionLinkWeightEditPart(view);

			case AdaptationGoalEditPart.VISUAL_ID:
				return new AdaptationGoalEditPart(view);

			case AdaptationGoalNameEditPart.VISUAL_ID:
				return new AdaptationGoalNameEditPart(view);

			case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID:
				return new BehaviouralGoalOperationalizedByEditPart(view);

			case AgentOperatEditPart.VISUAL_ID:
				return new AgentOperatEditPart(view);

			case RefinementLinkRefiningGoalsEditPart.VISUAL_ID:
				return new RefinementLinkRefiningGoalsEditPart(view);

			case BehaviouralGoalRefinedByEditPart.VISUAL_ID:
				return new BehaviouralGoalRefinedByEditPart(view);

			case ContributionLinkContributorEditPart.VISUAL_ID:
				return new ContributionLinkContributorEditPart(view);

			case BehaviouralGoalContributedByEditPart.VISUAL_ID:
				return new BehaviouralGoalContributedByEditPart(view);

			case AdaptationGoalHelpEditPart.VISUAL_ID:
				return new AdaptationGoalHelpEditPart(view);

			case OperationHasEventEditPart.VISUAL_ID:
				return new OperationHasEventEditPart(view);

			case ObjectIsMonitoredByEditPart.VISUAL_ID:
				return new ObjectIsMonitoredByEditPart(view);

			case AgentControlsEditPart.VISUAL_ID:
				return new AgentControlsEditPart(view);

			case EntityIsInputOfEditPart.VISUAL_ID:
				return new EntityIsInputOfEditPart(view);

			case OperationOutEditPart.VISUAL_ID:
				return new OperationOutEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}
}
