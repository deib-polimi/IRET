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
package eu.indenica.iret.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import eu.indenica.iret.diagram.edit.commands.AdaptationGoalHelpCreateCommand;
import eu.indenica.iret.diagram.edit.commands.AdaptationGoalHelpReorientCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalContributedByCreateCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalContributedByReorientCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalOperationalizedByCreateCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalOperationalizedByReorientCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalRefinedByCreateCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalRefinedByReorientCommand;
import eu.indenica.iret.diagram.edit.commands.ContributionLinkContributorCreateCommand;
import eu.indenica.iret.diagram.edit.commands.ContributionLinkContributorReorientCommand;
import eu.indenica.iret.diagram.edit.commands.RefinementLinkRefiningGoalsCreateCommand;
import eu.indenica.iret.diagram.edit.commands.RefinementLinkRefiningGoalsReorientCommand;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalHelpEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalContributedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalOperationalizedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalRefinedByEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkContributorEditPart;
import eu.indenica.iret.diagram.edit.parts.RefinementLinkRefiningGoalsEditPart;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class BehaviouralGoalItemSemanticEditPolicy extends
		IretBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BehaviouralGoalItemSemanticEditPolicy() {
		super(IretElementTypes.BehaviouralGoal_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (IretVisualIDRegistry.getVisualID(incomingLink) == RefinementLinkRefiningGoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(incomingLink) == ContributionLinkContributorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(incomingLink) == AdaptationGoalHelpEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (IretVisualIDRegistry.getVisualID(outgoingLink) == BehaviouralGoalOperationalizedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(outgoingLink) == BehaviouralGoalRefinedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(outgoingLink) == BehaviouralGoalContributedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IretElementTypes.BehaviouralGoalOperationalizedBy_4001 == req
				.getElementType()) {
			return getGEFWrapper(new BehaviouralGoalOperationalizedByCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.RefinementLinkRefiningGoals_4003 == req
				.getElementType()) {
			return null;
		}
		if (IretElementTypes.BehaviouralGoalRefinedBy_4019 == req
				.getElementType()) {
			return getGEFWrapper(new BehaviouralGoalRefinedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.ContributionLinkContributor_4005 == req
				.getElementType()) {
			return null;
		}
		if (IretElementTypes.BehaviouralGoalContributedBy_4006 == req
				.getElementType()) {
			return getGEFWrapper(new BehaviouralGoalContributedByCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.AdaptationGoalHelp_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IretElementTypes.BehaviouralGoalOperationalizedBy_4001 == req
				.getElementType()) {
			return null;
		}
		if (IretElementTypes.RefinementLinkRefiningGoals_4003 == req
				.getElementType()) {
			return getGEFWrapper(new RefinementLinkRefiningGoalsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.BehaviouralGoalRefinedBy_4019 == req
				.getElementType()) {
			return null;
		}
		if (IretElementTypes.ContributionLinkContributor_4005 == req
				.getElementType()) {
			return getGEFWrapper(new ContributionLinkContributorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.BehaviouralGoalContributedBy_4006 == req
				.getElementType()) {
			return null;
		}
		if (IretElementTypes.AdaptationGoalHelp_4007 == req.getElementType()) {
			return getGEFWrapper(new AdaptationGoalHelpCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralGoalOperationalizedByReorientCommand(
					req));
		case RefinementLinkRefiningGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementLinkRefiningGoalsReorientCommand(
					req));
		case BehaviouralGoalRefinedByEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralGoalRefinedByReorientCommand(
					req));
		case ContributionLinkContributorEditPart.VISUAL_ID:
			return getGEFWrapper(new ContributionLinkContributorReorientCommand(
					req));
		case BehaviouralGoalContributedByEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralGoalContributedByReorientCommand(
					req));
		case AdaptationGoalHelpEditPart.VISUAL_ID:
			return getGEFWrapper(new AdaptationGoalHelpReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
