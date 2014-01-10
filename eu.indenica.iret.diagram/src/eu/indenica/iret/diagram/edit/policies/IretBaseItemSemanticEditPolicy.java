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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.TreeElement;
import eu.indenica.iret.diagram.edit.helpers.IretBaseEditHelper;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class IretBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected IretBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						IretVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = IretElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated not
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			//TODO: patch for the Null EditingDomain issue
			if (req.getEditingDomain() == null)
				((CreateElementRequest) req)
						.setEditingDomain(getEditingDomain());
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = IretDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			IretDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralGoalOperationalizedBy_4001(
				BehaviouralGoal source, Operation target) {
			if (source != null) {
				if (source.getOperationalizedBy().contains(target)) {
					return false;
				}
			}

			return canExistBehaviouralGoalOperationalizedBy_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAgentOperat_4002(Agent source, Operation target) {
			if (source != null) {
				if (source.getOperat().contains(target)) {
					return false;
				}
			}

			return canExistAgentOperat_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRefinementLinkRefiningGoals_4003(
				RefinementLink source, TreeElement target) {
			if (source != null) {
				if (source.getRefiningGoals().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getRefines().contains(target))) {
				return false;
			}

			return canExistRefinementLinkRefiningGoals_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralGoalRefinedBy_4019(
				BehaviouralGoal source, RefinementLink target) {
			if (source != null) {
				if (source.getRefinedBy() != null) {
					return false;
				}
			}
			if (target != null && (target.getRefinedGoal() != null)) {
				return false;
			}

			return canExistBehaviouralGoalRefinedBy_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContributionLinkContributor_4005(
				ContributionLink source, BehaviouralGoal target) {
			if (source != null) {
				if (source.getContributor() != null) {
					return false;
				}
			}
			if (target != null && (target.getContributesOn().contains(target))) {
				return false;
			}

			return canExistContributionLinkContributor_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralGoalContributedBy_4006(
				BehaviouralGoal source, ContributionLink target) {
			if (source != null) {
				if (source.getContributedBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getDestinationGoal() != null)) {
				return false;
			}

			return canExistBehaviouralGoalContributedBy_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAdaptationGoalHelp_4007(AdaptationGoal source,
				BehaviouralGoal target) {
			if (source != null) {
				if (source.getHelp().contains(target)) {
					return false;
				}
			}

			return canExistAdaptationGoalHelp_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationHasEvent_4008(Operation source,
				Event target) {
			if (source != null) {
				if (source.getHasEvent().contains(target)) {
					return false;
				}
			}

			return canExistOperationHasEvent_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectIsMonitoredBy_4015(
				eu.indenica.iret.Object source, Agent target) {
			if (source != null) {
				if (source.getIsMonitoredBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getMonitors().contains(target))) {
				return false;
			}

			return canExistObjectIsMonitoredBy_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAgentControls_4010(Agent source,
				eu.indenica.iret.Object target) {
			if (source != null) {
				if (source.getControls().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIsControlledBy().contains(target))) {
				return false;
			}

			return canExistAgentControls_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntityIsInputOf_4014(Entity source,
				Operation target) {
			if (source != null) {
				if (source.getIsInputOf().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIn().contains(target))) {
				return false;
			}

			return canExistEntityIsInputOf_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationOut_4012(Operation source,
				Entity target) {
			if (source != null) {
				if (source.getOut().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIsOutputOf().contains(target))) {
				return false;
			}

			return canExistOperationOut_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistBehaviouralGoalOperationalizedBy_4001(
				BehaviouralGoal source, Operation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAgentOperat_4002(Agent source, Operation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRefinementLinkRefiningGoals_4003(
				RefinementLink source, TreeElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBehaviouralGoalRefinedBy_4019(
				BehaviouralGoal source, RefinementLink target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistContributionLinkContributor_4005(
				ContributionLink source, BehaviouralGoal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBehaviouralGoalContributedBy_4006(
				BehaviouralGoal source, ContributionLink target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAdaptationGoalHelp_4007(AdaptationGoal source,
				BehaviouralGoal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationHasEvent_4008(Operation source,
				Event target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectIsMonitoredBy_4015(
				eu.indenica.iret.Object source, Agent target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAgentControls_4010(Agent source,
				eu.indenica.iret.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEntityIsInputOf_4014(Entity source,
				Operation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationOut_4012(Operation source, Entity target) {
			return true;
		}
	}

}
