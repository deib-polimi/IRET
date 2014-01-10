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

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import eu.indenica.iret.diagram.providers.IretElementTypes;

/**
 * @generated
 */
public class IretPaletteFactory {
	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createBehaviouralGoal1CreationTool());
		paletteContainer.add(createAdaptationGoal2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createANDRefinement4CreationTool());
		paletteContainer.add(createORRefinement5CreationTool());
		paletteContainer.add(createContribution6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAutomatedAgent8CreationTool());
		paletteContainer.add(createHumanAgent9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOperation11CreationTool());
		paletteContainer.add(createEntity12CreationTool());
		paletteContainer.add(createEvent13CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links2Group_title);
		paletteContainer.setId("createLinks2Group"); //$NON-NLS-1$
		paletteContainer.add(createAgentOperat1CreationTool());
		paletteContainer.add(createOperationalizedBy2CreationTool());
		paletteContainer.add(createRefinementParentGoalLink3CreationTool());
		paletteContainer.add(createRefinementChildGoalLink4CreationTool());
		paletteContainer.add(createContributionChildGoalLink5CreationTool());
		paletteContainer.add(createContributionParentGoalLink6CreationTool());
		paletteContainer.add(createSupports7CreationTool());
		paletteContainer.add(createHasEvent8CreationTool());
		paletteContainer.add(createObjectMonitoredAgent9CreationTool());
		paletteContainer.add(createAgentControlsObject10CreationTool());
		paletteContainer.add(createEntityInputOperation11CreationTool());
		paletteContainer.add(createOperationOutputEntity12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBehaviouralGoal1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BehaviouralGoal1CreationTool_title,
				Messages.BehaviouralGoal1CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.BehaviouralGoal_2001));
		entry.setId("createBehaviouralGoal1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.BehaviouralGoal_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdaptationGoal2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AdaptationGoal2CreationTool_title,
				Messages.AdaptationGoal2CreationTool_desc,
				Collections.singletonList(IretElementTypes.AdaptationGoal_2010));
		entry.setId("createAdaptationGoal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.AdaptationGoal_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createANDRefinement4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ANDRefinement4CreationTool_title, null,
				Collections
						.singletonList(IretElementTypes.ANDRefinementLink_2005));
		entry.setId("createANDRefinement4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.ANDRefinementLink_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORRefinement5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ORRefinement5CreationTool_title, null,
				Collections
						.singletonList(IretElementTypes.ORRefinementLink_2006));
		entry.setId("createORRefinement5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.ORRefinementLink_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContribution6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Contribution6CreationTool_title, null,
				Collections
						.singletonList(IretElementTypes.ContributionLink_2009));
		entry.setId("createContribution6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.ContributionLink_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAutomatedAgent8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AutomatedAgent8CreationTool_title,
				Messages.AutomatedAgent8CreationTool_desc,
				Collections.singletonList(IretElementTypes.AutomatedAgent_2003));
		entry.setId("createAutomatedAgent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.AutomatedAgent_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHumanAgent9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HumanAgent9CreationTool_title,
				Messages.HumanAgent9CreationTool_desc,
				Collections.singletonList(IretElementTypes.HumanAgent_2002));
		entry.setId("createHumanAgent9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.HumanAgent_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation11CreationTool_title,
				Messages.Operation11CreationTool_desc,
				Collections.singletonList(IretElementTypes.Operation_2004));
		entry.setId("createOperation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.Operation_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity12CreationTool_title, null,
				Collections.singletonList(IretElementTypes.Entity_2007));
		entry.setId("createEntity12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.Entity_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvent13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Event13CreationTool_title, null,
				Collections.singletonList(IretElementTypes.Event_2008));
		entry.setId("createEvent13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretElementTypes
				.getImageDescriptor(IretElementTypes.Event_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgentOperat1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AgentOperat1CreationTool_title,
				Messages.AgentOperat1CreationTool_desc,
				Collections.singletonList(IretElementTypes.AgentOperat_4002));
		entry.setId("createAgentOperat1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkAgentOperation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperationalizedBy2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OperationalizedBy2CreationTool_title,
				Messages.OperationalizedBy2CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.BehaviouralGoalOperationalizedBy_4001));
		entry.setId("createOperationalizedBy2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkOperationalizedBy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefinementParentGoalLink3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RefinementParentGoalLink3CreationTool_title,
				null,
				Collections
						.singletonList(IretElementTypes.BehaviouralGoalRefinedBy_4019));
		entry.setId("createRefinementParentGoalLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkRefinementParent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefinementChildGoalLink4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RefinementChildGoalLink4CreationTool_title,
				null,
				Collections
						.singletonList(IretElementTypes.RefinementLinkRefiningGoals_4003));
		entry.setId("createRefinementChildGoalLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkRefinementChild.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContributionChildGoalLink5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContributionChildGoalLink5CreationTool_title,
				Messages.ContributionChildGoalLink5CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.ContributionLinkContributor_4005));
		entry.setId("createContributionChildGoalLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkContributionParent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContributionParentGoalLink6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContributionParentGoalLink6CreationTool_title,
				Messages.ContributionParentGoalLink6CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.BehaviouralGoalContributedBy_4006));
		entry.setId("createContributionParentGoalLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkContributionChild.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSupports7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Supports7CreationTool_title,
				Messages.Supports7CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.AdaptationGoalHelp_4007));
		entry.setId("createSupports7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkSupports.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasEvent8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HasEvent8CreationTool_title,
				Messages.HasEvent8CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.OperationHasEvent_4008));
		entry.setId("createHasEvent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkHasEvent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectMonitoredAgent9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ObjectMonitoredAgent9CreationTool_title,
				Messages.ObjectMonitoredAgent9CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.ObjectIsMonitoredBy_4015));
		entry.setId("createObjectMonitoredAgent9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkAgentMonitorsObject.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgentControlsObject10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AgentControlsObject10CreationTool_title,
				Messages.AgentControlsObject10CreationTool_desc,
				Collections.singletonList(IretElementTypes.AgentControls_4010));
		entry.setId("createAgentControlsObject10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/LinkAgentControlsObject.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityInputOperation11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntityInputOperation11CreationTool_title,
				Messages.EntityInputOperation11CreationTool_desc,
				Collections
						.singletonList(IretElementTypes.EntityIsInputOf_4014));
		entry.setId("createEntityInputOperation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/OperationInputEntity.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperationOutputEntity12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OperationOutputEntity12CreationTool_title,
				Messages.OperationOutputEntity12CreationTool_desc,
				Collections.singletonList(IretElementTypes.OperationOut_4012));
		entry.setId("createOperationOutputEntity12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IretDiagramEditorPlugin
				.findImageDescriptor("/eu.indenica.iret.edit/icons/full/obj16/OperationOutputEntity.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated not
	 */
	private static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated not
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(null, title, null);
			this.setDescription(description);

			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
