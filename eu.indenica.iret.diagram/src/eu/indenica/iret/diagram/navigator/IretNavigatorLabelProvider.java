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
package eu.indenica.iret.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalHelpEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentControlsEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentOperatEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalContributedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalOperationalizedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalRefinedByEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkContributorEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkWeightEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityIsInputOfEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityNameEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.EventNameEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.ObjectIsMonitoredByEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationHasEventEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationNameEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationOutEditPart;
import eu.indenica.iret.diagram.edit.parts.RefinementLinkRefiningGoalsEditPart;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.providers.IretElementTypes;
import eu.indenica.iret.diagram.providers.IretParserProvider;

/**
 * @generated
 */
public class IretNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		IretDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		IretDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof IretNavigatorItem
				&& !isOwnView(((IretNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof IretNavigatorGroup) {
			IretNavigatorGroup group = (IretNavigatorGroup) element;
			return IretDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof IretNavigatorItem) {
			IretNavigatorItem navigatorItem = (IretNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case ContributionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?ContributionLink", IretElementTypes.ContributionLink_2009); //$NON-NLS-1$
		case BehaviouralGoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?BehaviouralGoal", IretElementTypes.BehaviouralGoal_2001); //$NON-NLS-1$
		case ORRefinementLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?ORRefinementLink", IretElementTypes.ORRefinementLink_2006); //$NON-NLS-1$
		case AgentOperatEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Agent?operat", IretElementTypes.AgentOperat_4002); //$NON-NLS-1$
		case EntityIsInputOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Entity?isInputOf", IretElementTypes.EntityIsInputOf_4014); //$NON-NLS-1$
		case BehaviouralGoalRefinedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?BehaviouralGoal?refinedBy", IretElementTypes.BehaviouralGoalRefinedBy_4019); //$NON-NLS-1$
		case HumanAgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?HumanAgent", IretElementTypes.HumanAgent_2002); //$NON-NLS-1$
		case OperationHasEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Operation?hasEvent", IretElementTypes.OperationHasEvent_4008); //$NON-NLS-1$
		case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?BehaviouralGoal?operationalizedBy", IretElementTypes.BehaviouralGoalOperationalizedBy_4001); //$NON-NLS-1$
		case ObjectIsMonitoredByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Object?isMonitoredBy", IretElementTypes.ObjectIsMonitoredBy_4015); //$NON-NLS-1$
		case BehaviouralGoalContributedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?BehaviouralGoal?contributedBy", IretElementTypes.BehaviouralGoalContributedBy_4006); //$NON-NLS-1$
		case AutomatedAgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?AutomatedAgent", IretElementTypes.AutomatedAgent_2003); //$NON-NLS-1$
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?ANDRefinementLink", IretElementTypes.ANDRefinementLink_2005); //$NON-NLS-1$
		case AdaptationGoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?AdaptationGoal", IretElementTypes.AdaptationGoal_2010); //$NON-NLS-1$
		case AgentControlsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Agent?controls", IretElementTypes.AgentControls_4010); //$NON-NLS-1$
		case GoalDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://indenica.dei.polimi.it/iret#?GoalDiagram", IretElementTypes.GoalDiagram_1000); //$NON-NLS-1$
		case OperationOutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?Operation?out", IretElementTypes.OperationOut_4012); //$NON-NLS-1$
		case AdaptationGoalHelpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?AdaptationGoal?help", IretElementTypes.AdaptationGoalHelp_4007); //$NON-NLS-1$
		case RefinementLinkRefiningGoalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?RefinementLink?refiningGoals", IretElementTypes.RefinementLinkRefiningGoals_4003); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?Operation", IretElementTypes.Operation_2004); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?Entity", IretElementTypes.Entity_2007); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://indenica.dei.polimi.it/iret#?Event", IretElementTypes.Event_2008); //$NON-NLS-1$
		case ContributionLinkContributorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://indenica.dei.polimi.it/iret#?ContributionLink?contributor", IretElementTypes.ContributionLinkContributor_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = IretDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& IretElementTypes.isKnownElementType(elementType)) {
			image = IretElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof IretNavigatorGroup) {
			IretNavigatorGroup group = (IretNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof IretNavigatorItem) {
			IretNavigatorItem navigatorItem = (IretNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (IretVisualIDRegistry.getVisualID(view)) {
		case ContributionLinkEditPart.VISUAL_ID:
			return getContributionLink_2009Text(view);
		case BehaviouralGoalEditPart.VISUAL_ID:
			return getBehaviouralGoal_2001Text(view);
		case ORRefinementLinkEditPart.VISUAL_ID:
			return getORRefinementLink_2006Text(view);
		case AgentOperatEditPart.VISUAL_ID:
			return getAgentOperat_4002Text(view);
		case EntityIsInputOfEditPart.VISUAL_ID:
			return getEntityIsInputOf_4014Text(view);
		case BehaviouralGoalRefinedByEditPart.VISUAL_ID:
			return getBehaviouralGoalRefinedBy_4019Text(view);
		case HumanAgentEditPart.VISUAL_ID:
			return getHumanAgent_2002Text(view);
		case OperationHasEventEditPart.VISUAL_ID:
			return getOperationHasEvent_4008Text(view);
		case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID:
			return getBehaviouralGoalOperationalizedBy_4001Text(view);
		case ObjectIsMonitoredByEditPart.VISUAL_ID:
			return getObjectIsMonitoredBy_4015Text(view);
		case BehaviouralGoalContributedByEditPart.VISUAL_ID:
			return getBehaviouralGoalContributedBy_4006Text(view);
		case AutomatedAgentEditPart.VISUAL_ID:
			return getAutomatedAgent_2003Text(view);
		case ANDRefinementLinkEditPart.VISUAL_ID:
			return getANDRefinementLink_2005Text(view);
		case AdaptationGoalEditPart.VISUAL_ID:
			return getAdaptationGoal_2010Text(view);
		case AgentControlsEditPart.VISUAL_ID:
			return getAgentControls_4010Text(view);
		case GoalDiagramEditPart.VISUAL_ID:
			return getGoalDiagram_1000Text(view);
		case OperationOutEditPart.VISUAL_ID:
			return getOperationOut_4012Text(view);
		case AdaptationGoalHelpEditPart.VISUAL_ID:
			return getAdaptationGoalHelp_4007Text(view);
		case RefinementLinkRefiningGoalsEditPart.VISUAL_ID:
			return getRefinementLinkRefiningGoals_4003Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2004Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2008Text(view);
		case ContributionLinkContributorEditPart.VISUAL_ID:
			return getContributionLinkContributor_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getORRefinementLink_2006Text(View view) {
		ORRefinementLink domainModelElement = (ORRefinementLink) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2004Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.Operation_2004,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBehaviouralGoalContributedBy_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAutomatedAgent_2003Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.AutomatedAgent_2003,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry
						.getType(AutomatedAgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRefinementLinkRefiningGoals_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHumanAgent_2002Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.HumanAgent_2002,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry.getType(HumanAgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityIsInputOf_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBehaviouralGoal_2001Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.BehaviouralGoal_2001,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry
						.getType(BehaviouralGoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContributionLink_2009Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.ContributionLink_2009,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry
						.getType(ContributionLinkWeightEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalDiagram_1000Text(View view) {
		GoalDiagram domainModelElement = (GoalDiagram) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReadonly());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgentControls_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectIsMonitoredBy_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_2008Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.Event_2008,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry.getType(EventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdaptationGoalHelp_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBehaviouralGoalOperationalizedBy_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationOut_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBehaviouralGoalRefinedBy_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationHasEvent_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContributionLinkContributor_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAdaptationGoal_2010Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.AdaptationGoal_2010,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry
						.getType(AdaptationGoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2007Text(View view) {
		IParser parser = IretParserProvider.getParser(
				IretElementTypes.Entity_2007,
				view.getElement() != null ? view.getElement() : view,
				IretVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getANDRefinementLink_2005Text(View view) {
		ANDRefinementLink domainModelElement = (ANDRefinementLink) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			IretDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgentOperat_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GoalDiagramEditPart.MODEL_ID.equals(IretVisualIDRegistry
				.getModelID(view));
	}

}
