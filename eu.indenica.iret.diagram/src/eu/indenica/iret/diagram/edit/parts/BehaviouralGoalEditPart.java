/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL � Politecnico di Milano
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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import eu.indenica.iret.diagram.edit.policies.BehaviouralGoalItemSemanticEditPolicy;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class BehaviouralGoalEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public BehaviouralGoalEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BehaviouralGoalItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new BehaviouralGoalFigure();
	}

	/**
	 * @generated
	 */
	public BehaviouralGoalFigure getPrimaryShape() {
		return (BehaviouralGoalFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BehaviouralGoalNameEditPart) {
			((BehaviouralGoalNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureBehaviouralGoalNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BehaviouralGoalNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(IretVisualIDRegistry
				.getType(BehaviouralGoalNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(IretElementTypes.BehaviouralGoalOperationalizedBy_4001);
		types.add(IretElementTypes.BehaviouralGoalRefinedBy_4019);
		types.add(IretElementTypes.BehaviouralGoalContributedBy_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof OperationEditPart) {
			types.add(IretElementTypes.BehaviouralGoalOperationalizedBy_4001);
		}
		if (targetEditPart instanceof ANDRefinementLinkEditPart) {
			types.add(IretElementTypes.BehaviouralGoalRefinedBy_4019);
		}
		if (targetEditPart instanceof ORRefinementLinkEditPart) {
			types.add(IretElementTypes.BehaviouralGoalRefinedBy_4019);
		}
		if (targetEditPart instanceof ContributionLinkEditPart) {
			types.add(IretElementTypes.BehaviouralGoalContributedBy_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == IretElementTypes.BehaviouralGoalOperationalizedBy_4001) {
			types.add(IretElementTypes.Operation_2004);
		} else if (relationshipType == IretElementTypes.BehaviouralGoalRefinedBy_4019) {
			types.add(IretElementTypes.ANDRefinementLink_2005);
			types.add(IretElementTypes.ORRefinementLink_2006);
		} else if (relationshipType == IretElementTypes.BehaviouralGoalContributedBy_4006) {
			types.add(IretElementTypes.ContributionLink_2009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(IretElementTypes.RefinementLinkRefiningGoals_4003);
		types.add(IretElementTypes.ContributionLinkContributor_4005);
		types.add(IretElementTypes.AdaptationGoalHelp_4007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == IretElementTypes.RefinementLinkRefiningGoals_4003) {
			types.add(IretElementTypes.ANDRefinementLink_2005);
			types.add(IretElementTypes.ORRefinementLink_2006);
		} else if (relationshipType == IretElementTypes.ContributionLinkContributor_4005) {
			types.add(IretElementTypes.ContributionLink_2009);
		} else if (relationshipType == IretElementTypes.AdaptationGoalHelp_4007) {
			types.add(IretElementTypes.AdaptationGoal_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class BehaviouralGoalFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBehaviouralGoalNameFigure;

		/**
		 * @generated not
		 */
		public BehaviouralGoalFigure() {

			//			FlowLayout layoutThis = new FlowLayout();
			//			layoutThis.setStretchMinorAxis(false);
			//			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);
			//
			//			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			//			layoutThis.setMajorSpacing(5);
			//			layoutThis.setMinorSpacing(5);
			//			layoutThis.setHorizontal(true);
			//
			//			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			this.setLineWidth(0);
			addNodeImage();
			createContents();
		}

		/**
		 * @generated not
		 */
		private void addNodeImage() {
			ImageFigure imgF = new ImageFigure();
			ImageDescriptor imgDesc = IretDiagramEditorPlugin
					.getBundledImageDescriptor("icons/big/behaviouralgoal.png");
			imgF.setImage(imgDesc.createImage());

			this.add(imgF);
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureBehaviouralGoalNameFigure = new WrappingLabel();

			fFigureBehaviouralGoalNameFigure.setText("<...>");

			fFigureBehaviouralGoalNameFigure
					.setFont(FFIGUREBEHAVIOURALGOALNAMEFIGURE_FONT);

			this.add(fFigureBehaviouralGoalNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBehaviouralGoalNameFigure() {
			return fFigureBehaviouralGoalNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREBEHAVIOURALGOALNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.NORMAL);

}
