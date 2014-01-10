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

import eu.indenica.iret.diagram.edit.policies.HumanAgentItemSemanticEditPolicy;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class HumanAgentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public HumanAgentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HumanAgentItemSemanticEditPolicy());
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
		return primaryShape = new HumanAgentFigure();
	}

	/**
	 * @generated
	 */
	public HumanAgentFigure getPrimaryShape() {
		return (HumanAgentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HumanAgentNameEditPart) {
			((HumanAgentNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureHumanAgentNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HumanAgentNameEditPart) {
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
				.getType(HumanAgentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(IretElementTypes.AgentOperat_4002);
		types.add(IretElementTypes.ObjectIsMonitoredBy_4015);
		types.add(IretElementTypes.AgentControls_4010);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof OperationEditPart) {
			types.add(IretElementTypes.AgentOperat_4002);
		}
		if (targetEditPart instanceof eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart) {
			types.add(IretElementTypes.ObjectIsMonitoredBy_4015);
		}
		if (targetEditPart instanceof AutomatedAgentEditPart) {
			types.add(IretElementTypes.ObjectIsMonitoredBy_4015);
		}
		if (targetEditPart instanceof eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart) {
			types.add(IretElementTypes.AgentControls_4010);
		}
		if (targetEditPart instanceof AutomatedAgentEditPart) {
			types.add(IretElementTypes.AgentControls_4010);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(IretElementTypes.AgentControls_4010);
		}
		if (targetEditPart instanceof EventEditPart) {
			types.add(IretElementTypes.AgentControls_4010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == IretElementTypes.AgentOperat_4002) {
			types.add(IretElementTypes.Operation_2004);
		} else if (relationshipType == IretElementTypes.ObjectIsMonitoredBy_4015) {
			types.add(IretElementTypes.HumanAgent_2002);
			types.add(IretElementTypes.AutomatedAgent_2003);
		} else if (relationshipType == IretElementTypes.AgentControls_4010) {
			types.add(IretElementTypes.HumanAgent_2002);
			types.add(IretElementTypes.AutomatedAgent_2003);
			types.add(IretElementTypes.Entity_2007);
			types.add(IretElementTypes.Event_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IretElementTypes.ObjectIsMonitoredBy_4015);
		types.add(IretElementTypes.AgentControls_4010);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == IretElementTypes.ObjectIsMonitoredBy_4015) {
			types.add(IretElementTypes.HumanAgent_2002);
			types.add(IretElementTypes.AutomatedAgent_2003);
			types.add(IretElementTypes.Entity_2007);
			types.add(IretElementTypes.Event_2008);
		} else if (relationshipType == IretElementTypes.AgentControls_4010) {
			types.add(IretElementTypes.HumanAgent_2002);
			types.add(IretElementTypes.AutomatedAgent_2003);
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
	public class HumanAgentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHumanAgentNameFigure;

		/**
		 * @generated not
		 */
		public HumanAgentFigure() {

			//			FlowLayout layoutThis = new FlowLayout();
			//			layoutThis.setStretchMinorAxis(false);
			//			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);
			//
			//			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
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
			//			Image img = new Image(null,
			//					"/home/dani/workspace/eu.indenica.retool/images/human.png");
			//			ImageFigure imgF = new ImageFigure();
			//			imgF.setImage(img);
			ImageFigure imgF = new ImageFigure();
			ImageDescriptor imgDesc = IretDiagramEditorPlugin
					.getBundledImageDescriptor("icons/big/humanagent.png");
			imgF.setImage(imgDesc.createImage());

			this.add(imgF);
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHumanAgentNameFigure = new WrappingLabel();

			fFigureHumanAgentNameFigure.setText("<...>");

			fFigureHumanAgentNameFigure
					.setFont(FFIGUREHUMANAGENTNAMEFIGURE_FONT);

			this.add(fFigureHumanAgentNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHumanAgentNameFigure() {
			return fFigureHumanAgentNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREHUMANAGENTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.NORMAL);

}
