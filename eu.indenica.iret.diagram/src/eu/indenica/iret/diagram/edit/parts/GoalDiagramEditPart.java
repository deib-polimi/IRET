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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.graph.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
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
import eu.indenica.iret.diagram.edit.commands.IretCreateShortcutDecorationsCommand;
import eu.indenica.iret.diagram.edit.commands.ORRefinementLinkCreateCommand;
import eu.indenica.iret.diagram.edit.commands.OperationCreateCommand;
import eu.indenica.iret.diagram.edit.policies.GoalDiagramCanonicalEditPolicy;
import eu.indenica.iret.diagram.edit.policies.GoalDiagramItemSemanticEditPolicy;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class GoalDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Iret"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public GoalDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated not
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GoalDiagramItemSemanticEditPolicy());

		final EObject container = resolveSemanticElement();

		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DiagramDragDropEditPolicy() {

					private Set<IreneElement> elements = null;

					public Command getDropObjectsCommand(
							DropObjectsRequest dropRequest) {
						elements = new HashSet<IreneElement>();
						ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();
						for (Iterator<?> it = dropRequest.getObjects()
								.iterator(); it.hasNext();) {
							Object nextObject = it.next();
							if (false == nextObject instanceof EObject) {
								continue;
							}
							if (nextObject instanceof IreneElement)
								elements.add((IreneElement) nextObject);
							viewDescriptors
									.add(new CreateViewRequest.ViewDescriptor(
											new EObjectAdapter(
													(EObject) nextObject),
											org.eclipse.gmf.runtime.notation.Node.class,
											null, getDiagramPreferencesHint()));
						}
						return createEditPartFromExistingObjectCommand(
								dropRequest, viewDescriptors);
					}

					private Command createEditPartFromExistingObjectCommand(
							DropObjectsRequest dropRequest,
							List<CreateViewRequest.ViewDescriptor> viewDescriptors) {
						Command command = createViewsAndArrangeCommand(
								dropRequest, viewDescriptors);

						for (IreneElement element : elements) {
							IElementType iet = IretElementTypes
									.getElementType(element.eClass());
							CreateElementRequest cer = new CreateElementRequest(
									getEditingDomain(), container, iet);

							if (command != null) {
								command = command.chain(getCreateCommand(cer,
										element));
							}
						}
						return command;
					}
				});
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated not
	 */
	protected Command getCreateCommand(CreateElementRequest req,
			IreneElement elem) {
		if (IretElementTypes.BehaviouralGoal_2001 == req.getElementType()) {
			return new ICommandProxy(new BehaviouralGoalCreateCommand(req,
					(BehaviouralGoal) elem));
		}
		if (IretElementTypes.HumanAgent_2002 == req.getElementType()) {
			return new ICommandProxy(new HumanAgentCreateCommand(req,
					(HumanAgent) elem));
		}
		if (IretElementTypes.AutomatedAgent_2003 == req.getElementType()) {
			return new ICommandProxy(new AutomatedAgentCreateCommand(req,
					(AutomatedAgent) elem));
		}
		if (IretElementTypes.Operation_2004 == req.getElementType()) {
			return new ICommandProxy(new OperationCreateCommand(req,
					(Operation) elem));
		}
		if (IretElementTypes.ANDRefinementLink_2005 == req.getElementType()) {
			return new ICommandProxy(new ANDRefinementLinkCreateCommand(req,
					(ANDRefinementLink) elem));
		}
		if (IretElementTypes.ORRefinementLink_2006 == req.getElementType()) {
			return new ICommandProxy(new ORRefinementLinkCreateCommand(req,
					(ORRefinementLink) elem));
		}
		if (IretElementTypes.Entity_2007 == req.getElementType()) {
			return new ICommandProxy(
					new EntityCreateCommand(req, (Entity) elem));
		}
		if (IretElementTypes.Event_2008 == req.getElementType()) {
			return new ICommandProxy(new EventCreateCommand(req, (Event) elem));
		}
		if (IretElementTypes.ContributionLink_2009 == req.getElementType()) {
			return new ICommandProxy(new ContributionLinkCreateCommand(req,
					(ContributionLink) elem));
		}
		if (IretElementTypes.AdaptationGoal_2010 == req.getElementType()) {
			return new ICommandProxy(new AdaptationGoalCreateCommand(req,
					(AdaptationGoal) elem));
		}
		throw new RuntimeException(
				"The element is not managed and its creation should be implemented");
	}

	/**
	 * @generated
	 */
	/*package-local*/static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

}
