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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
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

import eu.indenica.iret.diagram.edit.commands.AgentOperatCreateCommand;
import eu.indenica.iret.diagram.edit.commands.AgentOperatReorientCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalOperationalizedByCreateCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalOperationalizedByReorientCommand;
import eu.indenica.iret.diagram.edit.commands.EntityIsInputOfCreateCommand;
import eu.indenica.iret.diagram.edit.commands.EntityIsInputOfReorientCommand;
import eu.indenica.iret.diagram.edit.commands.OperationHasEventCreateCommand;
import eu.indenica.iret.diagram.edit.commands.OperationHasEventReorientCommand;
import eu.indenica.iret.diagram.edit.commands.OperationOutCreateCommand;
import eu.indenica.iret.diagram.edit.commands.OperationOutReorientCommand;
import eu.indenica.iret.diagram.edit.parts.AgentOperatEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalOperationalizedByEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityIsInputOfEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationHasEventEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationOutEditPart;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class OperationItemSemanticEditPolicy extends
		IretBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationItemSemanticEditPolicy() {
		super(IretElementTypes.Operation_2004);
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
			if (IretVisualIDRegistry.getVisualID(incomingLink) == BehaviouralGoalOperationalizedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(incomingLink) == AgentOperatEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(incomingLink) == EntityIsInputOfEditPart.VISUAL_ID) {
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
			if (IretVisualIDRegistry.getVisualID(outgoingLink) == OperationHasEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IretVisualIDRegistry.getVisualID(outgoingLink) == OperationOutEditPart.VISUAL_ID) {
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
			return null;
		}
		if (IretElementTypes.AgentOperat_4002 == req.getElementType()) {
			return null;
		}
		if (IretElementTypes.OperationHasEvent_4008 == req.getElementType()) {
			return getGEFWrapper(new OperationHasEventCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.EntityIsInputOf_4014 == req.getElementType()) {
			return null;
		}
		if (IretElementTypes.OperationOut_4012 == req.getElementType()) {
			return getGEFWrapper(new OperationOutCreateCommand(req,
					req.getSource(), req.getTarget()));
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
			return getGEFWrapper(new BehaviouralGoalOperationalizedByCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.AgentOperat_4002 == req.getElementType()) {
			return getGEFWrapper(new AgentOperatCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.OperationHasEvent_4008 == req.getElementType()) {
			return null;
		}
		if (IretElementTypes.EntityIsInputOf_4014 == req.getElementType()) {
			return getGEFWrapper(new EntityIsInputOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IretElementTypes.OperationOut_4012 == req.getElementType()) {
			return null;
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
		case AgentOperatEditPart.VISUAL_ID:
			return getGEFWrapper(new AgentOperatReorientCommand(req));
		case OperationHasEventEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationHasEventReorientCommand(req));
		case EntityIsInputOfEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityIsInputOfReorientCommand(req));
		case OperationOutEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationOutReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
