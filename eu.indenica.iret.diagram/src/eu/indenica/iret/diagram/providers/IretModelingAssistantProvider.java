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
package eu.indenica.iret.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import eu.indenica.iret.diagram.edit.parts.ANDRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityEditPart;
import eu.indenica.iret.diagram.edit.parts.EventEditPart;
import eu.indenica.iret.diagram.edit.parts.GoalDiagramEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentEditPart;
import eu.indenica.iret.diagram.edit.parts.ORRefinementLinkEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationEditPart;
import eu.indenica.iret.diagram.part.IretDiagramEditorPlugin;
import eu.indenica.iret.diagram.part.Messages;

/**
 * @generated
 */
public class IretModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof GoalDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
			types.add(IretElementTypes.BehaviouralGoal_2001);
			types.add(IretElementTypes.HumanAgent_2002);
			types.add(IretElementTypes.AutomatedAgent_2003);
			types.add(IretElementTypes.Operation_2004);
			types.add(IretElementTypes.ANDRefinementLink_2005);
			types.add(IretElementTypes.ORRefinementLink_2006);
			types.add(IretElementTypes.Entity_2007);
			types.add(IretElementTypes.Event_2008);
			types.add(IretElementTypes.ContributionLink_2009);
			types.add(IretElementTypes.AdaptationGoal_2010);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BehaviouralGoalEditPart) {
			return ((BehaviouralGoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof HumanAgentEditPart) {
			return ((HumanAgentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AutomatedAgentEditPart) {
			return ((AutomatedAgentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ANDRefinementLinkEditPart) {
			return ((ANDRefinementLinkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ORRefinementLinkEditPart) {
			return ((ORRefinementLinkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ContributionLinkEditPart) {
			return ((ContributionLinkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AdaptationGoalEditPart) {
			return ((AdaptationGoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof BehaviouralGoalEditPart) {
			return ((BehaviouralGoalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HumanAgentEditPart) {
			return ((HumanAgentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AutomatedAgentEditPart) {
			return ((AutomatedAgentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ANDRefinementLinkEditPart) {
			return ((ANDRefinementLinkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ORRefinementLinkEditPart) {
			return ((ORRefinementLinkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EventEditPart) {
			return ((EventEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ContributionLinkEditPart) {
			return ((ContributionLinkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BehaviouralGoalEditPart) {
			return ((BehaviouralGoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof HumanAgentEditPart) {
			return ((HumanAgentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AutomatedAgentEditPart) {
			return ((AutomatedAgentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ANDRefinementLinkEditPart) {
			return ((ANDRefinementLinkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ORRefinementLinkEditPart) {
			return ((ORRefinementLinkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ContributionLinkEditPart) {
			return ((ContributionLinkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AdaptationGoalEditPart) {
			return ((AdaptationGoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof BehaviouralGoalEditPart) {
			return ((BehaviouralGoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HumanAgentEditPart) {
			return ((HumanAgentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AutomatedAgentEditPart) {
			return ((AutomatedAgentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ANDRefinementLinkEditPart) {
			return ((ANDRefinementLinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ORRefinementLinkEditPart) {
			return ((ORRefinementLinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EventEditPart) {
			return ((EventEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ContributionLinkEditPart) {
			return ((ContributionLinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BehaviouralGoalEditPart) {
			return ((BehaviouralGoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof HumanAgentEditPart) {
			return ((HumanAgentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AutomatedAgentEditPart) {
			return ((AutomatedAgentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ANDRefinementLinkEditPart) {
			return ((ANDRefinementLinkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ORRefinementLinkEditPart) {
			return ((ORRefinementLinkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ContributionLinkEditPart) {
			return ((ContributionLinkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AdaptationGoalEditPart) {
			return ((AdaptationGoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				IretDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.IretModelingAssistantProviderMessage);
		dialog.setTitle(Messages.IretModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
