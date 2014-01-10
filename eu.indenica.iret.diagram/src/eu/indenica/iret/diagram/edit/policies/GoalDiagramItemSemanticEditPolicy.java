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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.diagram.edit.commands.ANDRefinementLinkCreateCommand;
import eu.indenica.iret.diagram.edit.commands.AdaptationGoalCreateCommand;
import eu.indenica.iret.diagram.edit.commands.AutomatedAgentCreateCommand;
import eu.indenica.iret.diagram.edit.commands.BehaviouralGoalCreateCommand;
import eu.indenica.iret.diagram.edit.commands.ContributionLinkCreateCommand;
import eu.indenica.iret.diagram.edit.commands.EntityCreateCommand;
import eu.indenica.iret.diagram.edit.commands.EventCreateCommand;
import eu.indenica.iret.diagram.edit.commands.HumanAgentCreateCommand;
import eu.indenica.iret.diagram.edit.commands.ORRefinementLinkCreateCommand;
import eu.indenica.iret.diagram.edit.commands.OperationCreateCommand;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class GoalDiagramItemSemanticEditPolicy extends
		IretBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GoalDiagramItemSemanticEditPolicy() {
		super(IretElementTypes.GoalDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (IretElementTypes.BehaviouralGoal_2001 == req.getElementType()) {
			return getGEFWrapper(new BehaviouralGoalCreateCommand(req));
		}
		if (IretElementTypes.HumanAgent_2002 == req.getElementType()) {
			return getGEFWrapper(new HumanAgentCreateCommand(req));
		}
		if (IretElementTypes.AutomatedAgent_2003 == req.getElementType()) {
			return getGEFWrapper(new AutomatedAgentCreateCommand(req));
		}
		if (IretElementTypes.Operation_2004 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		if (IretElementTypes.ANDRefinementLink_2005 == req.getElementType()) {
			return getGEFWrapper(new ANDRefinementLinkCreateCommand(req));
		}
		if (IretElementTypes.ORRefinementLink_2006 == req.getElementType()) {
			return getGEFWrapper(new ORRefinementLinkCreateCommand(req));
		}
		if (IretElementTypes.Entity_2007 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (IretElementTypes.Event_2008 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (IretElementTypes.ContributionLink_2009 == req.getElementType()) {
			return getGEFWrapper(new ContributionLinkCreateCommand(req));
		}
		if (IretElementTypes.AdaptationGoal_2010 == req.getElementType()) {
			return getGEFWrapper(new AdaptationGoalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated not
	 */
	protected Command getCreateCommand(CreateElementRequest req,
			IreneElement elem) {
		if (IretElementTypes.BehaviouralGoal_2001 == req.getElementType()) {
			return getGEFWrapper(new BehaviouralGoalCreateCommand(req,
					(BehaviouralGoal) elem));
		}
		if (IretElementTypes.HumanAgent_2002 == req.getElementType()) {
			return getGEFWrapper(new HumanAgentCreateCommand(req,
					(HumanAgent) elem));
		}
		if (IretElementTypes.AutomatedAgent_2003 == req.getElementType()) {
			return getGEFWrapper(new AutomatedAgentCreateCommand(req,
					(AutomatedAgent) elem));
		}
		if (IretElementTypes.Operation_2004 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req,
					(Operation) elem));
		}
		if (IretElementTypes.ANDRefinementLink_2005 == req.getElementType()) {
			return getGEFWrapper(new ANDRefinementLinkCreateCommand(req,
					(ANDRefinementLink) elem));
		}
		if (IretElementTypes.ORRefinementLink_2006 == req.getElementType()) {
			return getGEFWrapper(new ORRefinementLinkCreateCommand(req,
					(ORRefinementLink) elem));
		}
		if (IretElementTypes.Entity_2007 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req, (Entity) elem));
		}
		if (IretElementTypes.Event_2008 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req, (Event) elem));
		}
		if (IretElementTypes.ContributionLink_2009 == req.getElementType()) {
			return getGEFWrapper(new ContributionLinkCreateCommand(req,
					(ContributionLink) elem));
		}
		if (IretElementTypes.AdaptationGoal_2010 == req.getElementType()) {
			return getGEFWrapper(new AdaptationGoalCreateCommand(req,
					(AdaptationGoal) elem));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
