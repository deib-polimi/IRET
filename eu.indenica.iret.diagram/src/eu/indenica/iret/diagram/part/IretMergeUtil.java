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
package eu.indenica.iret.diagram.part;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.Action;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.Attribute;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.Goal;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.LinkNode;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.Parameter;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.Reference;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.State;
import eu.indenica.iret.Variability;
import eu.indenica.iret.diagram.providers.IretElementTypes;

public class IretMergeUtil {
	public static void createConnection(IretDiagramEditor ide, EObject source, EObject target, IElementType connectionType){
		CreateConnectionViewAndElementRequest connRequest = (CreateConnectionViewAndElementRequest)CreateViewRequestFactory.getCreateConnectionRequest(connectionType, IretDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		ShapeNodeEditPart sourceEP = getNodeEditPart(ide, source);
		ShapeNodeEditPart targetEP = getNodeEditPart(ide, target);
		connRequest.setSourceEditPart(sourceEP);
		connRequest.setTargetEditPart(targetEP);
		Command connCommand = CreateConnectionViewAndElementRequest.getCreateCommand(connRequest, sourceEP, targetEP);
		ide.getDiagramEditDomain().getDiagramCommandStack().execute(connCommand);
	}
	
	public static EObject createElement(IretDiagramEditor ide, IElementType elementType, Point location){
		EObject newObject = null;
		CreateViewRequest createRequest = CreateViewRequestFactory.getCreateShapeRequest(elementType,IretDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		createRequest.setLocation(location);
		Command createCommand = ide.getDiagramEditPart().getCommand(createRequest);
		
		if(createCommand!=null){
			ide.getDiagramEditDomain().getDiagramCommandStack().execute(createCommand);
			for(Object o : DiagramCommandStack.getReturnValues(createCommand)){
				if(o instanceof CreateElementRequestAdapter){
					final IreneElement bg = (IreneElement) ((CreateElementRequestAdapter) o).resolve();
					newObject=bg;
				}
			}
		}
		return newObject;
	}

	public static void removeElement(IretDiagramEditor ide, final EObject object){
		ShapeNodeEditPart editpart = getNodeEditPart(ide, object);
		ide.getEditingDomain().getCommandStack().execute(RemoveCommand.create(ide.getEditingDomain(), editpart.getModel()));
		ide.getEditingDomain().getCommandStack().execute(org.eclipse.emf.edit.command.DeleteCommand.create(ide.getEditingDomain(), object));

	}


	public static void removeConnectionFromDiagram(IretDiagramEditor ide, final EObject from, final EObject to){
		ConnectionNodeEditPart editpart = getConnectionEditPart(ide, from, to);
		if(editpart!=null){
//			ide.getEditingDomain().getCommandStack().execute(RemoveCommand.create(ide.getEditingDomain(), editpart.getModel()));

			final View v1 = editpart.getNotationView();
			ide.getEditingDomain().getCommandStack().execute(new RecordingCommand(ide.getEditingDomain()) {
				
				@Override
				protected void doExecute() {
					((ConnectorImpl)v1).setVisible(false);
					
				}
			});
			ide.getEditingDomain().getCommandStack().execute(org.eclipse.emf.edit.command.DeleteCommand.create(ide.getEditingDomain(), editpart.getModel()));
		}
//		else{
//			System.out.println("null");
//		}

		//TODO: Si può togliere?
		for(CanonicalEditPolicy ep : CanonicalConnectionEditPolicy.getRegisteredEditPolicies(from)){
			ep.refresh();
		}
			
	}

	public static ShapeNodeEditPart getNodeEditPart(IretDiagramEditor ide, EObject object){
		for(Object o: ide.getDiagramGraphicalViewer().getEditPartRegistry().values()){
			if(o instanceof ShapeNodeEditPart){
				ShapeNodeEditPart ep = (ShapeNodeEditPart)o;
				if(ep.resolveSemanticElement().equals(object))
					return ep;
			}
		}
		return null;
	}
	
	public static ConnectionNodeEditPart getConnectionEditPart(IretDiagramEditor ide, EObject from, EObject to){
		for(Object o: ide.getDiagramGraphicalViewer().getEditPartRegistry().values()){
			if(o instanceof ConnectionNodeEditPart){
				ConnectionNodeEditPart ep = (ConnectionNodeEditPart)o;
				ShapeNodeEditPart source = (ShapeNodeEditPart)ep.getSource();
				ShapeNodeEditPart target = (ShapeNodeEditPart)ep.getTarget();
				if(source.resolveSemanticElement().equals(from))
					if(target.resolveSemanticElement().equals(to))
						return ep;
			}
		}
		return null;
	}
	
	public static EObject createElement(IretDiagramEditor ide, final EObject oldObject, Point location){
		final EObject newObject = createElement(ide, IretElementTypes.getElementType(oldObject.eClass()), location);
		ide.getEditingDomain().getCommandStack().execute(new RecordingCommand(ide.getEditingDomain()) {
			@Override
			protected void doExecute() {
				if(oldObject instanceof IreneElement){}
				if(oldObject instanceof Parameter){}
				if(oldObject instanceof Agent){}
				if(oldObject instanceof eu.indenica.iret.Object){
					eu.indenica.iret.Object oo = (eu.indenica.iret.Object)oldObject;
					eu.indenica.iret.Object no = (eu.indenica.iret.Object)newObject;
					no.setName(oo.getName());
					no.setId(oo.getId());
				}
				if(oldObject instanceof Entity){
					Entity oo = (Entity)oldObject;
					Entity no = (Entity)newObject;
					no.setIsInState(oo.getIsInState());
				}
				if(oldObject instanceof Goal){
					Goal oo = (Goal)oldObject;
					Goal no = (Goal)newObject;
					no.setDescription(oo.getDescription());
					no.setPriority(oo.getPriority());
					no.setId(oo.getId());
					no.setName(oo.getName());
				}					
				if(oldObject instanceof BehaviouralGoal){
					BehaviouralGoal oo = (BehaviouralGoal)oldObject;
					BehaviouralGoal no = (BehaviouralGoal)newObject;
					no.setSatisfaction(oo.getSatisfaction());
				} 
				if(oldObject instanceof AdaptationGoal){
					AdaptationGoal oo = (AdaptationGoal)oldObject;
					AdaptationGoal no = (AdaptationGoal)newObject;
					no.setMaxActivations(oo.getMaxActivations());
				} 
				if(oldObject instanceof Action){
					Action oo = (Action)oldObject;
					Action no = (Action)newObject;
					no.setActionType(oo.getActionType());
				} 
				if(oldObject instanceof Operation){
					Operation oo = (Operation)oldObject;
					Operation no = (Operation)newObject;
					no.setDescription(oo.getDescription());
					no.setMinExecTImes(oo.getMinExecTImes());
					no.setMaxExecTimes(oo.getMaxExecTimes());
					no.setName(oo.getName());
					no.setId(oo.getId());
				}
				if(oldObject instanceof LinkNode){}
				if(oldObject instanceof RefinementLink){
					RefinementLink oo = (RefinementLink)oldObject;
					RefinementLink no = (RefinementLink)newObject;
					no.setId(oo.getId());
				}
				if(oldObject instanceof ANDRefinementLink){}
				if(oldObject instanceof ORRefinementLink){}
				if(oldObject instanceof ContributionLink){
					ContributionLink oo = (ContributionLink)oldObject;
					ContributionLink no = (ContributionLink)newObject;
					no.setId(oo.getId());
					no.setWeight(oo.getWeight());
				}
				if(oldObject instanceof Reference){
					Reference oo = (Reference)oldObject;
					Reference no = (Reference)newObject;
					no.setName(oo.getName());
					no.setMultiplicity(oo.getMultiplicity());
				}
				if(oldObject instanceof FormalDefinition){
					FormalDefinition oo = (FormalDefinition)oldObject;
					FormalDefinition no = (FormalDefinition)newObject;
					no.setDefinition(oo.getDefinition());
				}
				if(oldObject instanceof Attribute){
					Attribute oo = (Attribute)oldObject;
					Attribute no = (Attribute)newObject;
					no.setName(oo.getName());
				}
				if(oldObject instanceof PrimitiveAttribute){
					PrimitiveAttribute oo = (PrimitiveAttribute)oldObject;
					PrimitiveAttribute no = (PrimitiveAttribute)newObject;
					no.setType(oo.getType());
				}
				if(oldObject instanceof Variability){
					Variability oo = (Variability)oldObject;
					Variability no = (Variability)newObject;
					no.setDescription(oo.getDescription());
				}
				if(oldObject instanceof State){
					State oo = (State)oldObject;
					State no = (State)newObject;
					no.setName(oo.getName());
				}
				if(oldObject instanceof Event){
					Event oo = (Event)oldObject;
					Event no = (Event)newObject;
					no.setName(oo.getName());
					no.setId(oo.getId());
				}
				
			}
		});
		return newObject;
	}

}
