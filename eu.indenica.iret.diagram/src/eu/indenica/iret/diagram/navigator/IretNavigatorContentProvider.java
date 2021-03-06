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
package eu.indenica.iret.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalHelpEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentControlsEditPart;
import eu.indenica.iret.diagram.edit.parts.AgentOperatEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalContributedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalOperationalizedByEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalRefinedByEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkContributorEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityIsInputOfEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.ObjectIsMonitoredByEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationHasEventEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationOutEditPart;
import eu.indenica.iret.diagram.edit.parts.RefinementLinkRefiningGoalsEditPart;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;
import eu.indenica.iret.diagram.part.Messages;

/**
 * @generated
 */
public class IretNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public IretNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<IretNavigatorItem> result = new ArrayList<IretNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof IretNavigatorGroup) {
			IretNavigatorGroup group = (IretNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof IretNavigatorItem) {
			IretNavigatorItem navigatorItem = (IretNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (IretVisualIDRegistry.getVisualID(view)) {

		case ContributionLinkEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ContributionLink_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ContributionLink_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkContributorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalContributedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case BehaviouralGoalEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoal_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoal_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalOperationalizedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalRefinedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkContributorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalContributedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AdaptationGoalHelpEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ORRefinementLinkEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ORRefinementLink_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ORRefinementLink_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalRefinedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AgentOperatEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AgentOperat_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AgentOperat_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EntityIsInputOfEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_EntityIsInputOf_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_EntityIsInputOf_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralGoalRefinedByEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalRefinedBy_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalRefinedBy_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ANDRefinementLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ORRefinementLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HumanAgentEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_HumanAgent_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_HumanAgent_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(AgentOperatEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OperationHasEventEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_OperationHasEvent_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_OperationHasEvent_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralGoalOperationalizedByEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalOperationalizedBy_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalOperationalizedBy_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectIsMonitoredByEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ObjectIsMonitoredBy_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ObjectIsMonitoredBy_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralGoalContributedByEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalContributedBy_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralGoalContributedBy_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AutomatedAgentEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AutomatedAgent_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AutomatedAgent_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(AgentOperatEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ANDRefinementLinkEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ANDRefinementLink_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ANDRefinementLink_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalRefinedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AdaptationGoalEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AdaptationGoal_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AdaptationGoalHelpEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AgentControlsEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AgentControls_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AgentControls_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalDiagramEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			IretNavigatorGroup links = new IretNavigatorGroup(
					Messages.NavigatorGroupName_GoalDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(HumanAgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AutomatedAgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ANDRefinementLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ORRefinementLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AdaptationGoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalOperationalizedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(AgentOperatEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(RefinementLinkRefiningGoalsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalRefinedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkContributorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalContributedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AdaptationGoalHelpEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationHasEventEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(EntityIsInputOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationOutEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case OperationOutEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_OperationOut_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_OperationOut_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AdaptationGoalHelpEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AdaptationGoalHelp_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_AdaptationGoalHelp_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AdaptationGoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RefinementLinkRefiningGoalsEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_RefinementLinkRefiningGoals_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_RefinementLinkRefiningGoals_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ANDRefinementLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ORRefinementLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ANDRefinementLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ORRefinementLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalOperationalizedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry.getType(AgentOperatEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationHasEventEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(EntityIsInputOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationOutEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntityEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(EntityIsInputOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationOutEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Node sv = (Node) view;
			IretNavigatorGroup incominglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Event_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup outgoinglinks = new IretNavigatorGroup(
					Messages.NavigatorGroupName_Event_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(OperationHasEventEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ObjectIsMonitoredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(AgentControlsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ContributionLinkContributorEditPart.VISUAL_ID: {
			LinkedList<IretAbstractNavigatorItem> result = new LinkedList<IretAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			IretNavigatorGroup target = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ContributionLinkContributor_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IretNavigatorGroup source = new IretNavigatorGroup(
					Messages.NavigatorGroupName_ContributionLinkContributor_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(BehaviouralGoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					IretVisualIDRegistry
							.getType(ContributionLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GoalDiagramEditPart.MODEL_ID.equals(IretVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<IretNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<IretNavigatorItem> result = new ArrayList<IretNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new IretNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IretNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof IretAbstractNavigatorItem) {
			IretAbstractNavigatorItem abstractNavigatorItem = (IretAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
