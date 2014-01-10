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
package eu.indenica.iret.diagram.wizard.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.ldap.Control;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Object;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.TreeElement;
import eu.indenica.iret.diagram.part.IretDiagramEditor;
import eu.indenica.iret.diagram.part.IretMergeUtil;
import eu.indenica.iret.diagram.providers.IretElementTypes;
import eu.indenica.iret.diagram.similarity.FindElements;

public class CreateModels {
	static IreneModel m1, m2;
	List<String> nodeNames = new ArrayList<String>();
	static Map<IreneElement, String> lofG1 = new HashMap<IreneElement, String>();
	static Map<IreneElement, String> lofG2 = new HashMap<IreneElement, String>();
	private static  Map<IreneElement, IreneElement> MergeModelMap = new HashMap<IreneElement, IreneElement>();

	public CreateModels() {

	}

	public static Map<IreneElement, IreneElement> DoDuplicate(IreneModel _m1, IreneModel _m2) {
		m1=_m1;
		m2=_m2;
		FindElements clofG1=new FindElements(m1);
		FindElements clofG2=new FindElements(m2);

		lofG1=clofG1.getNodes();
		lofG2=clofG2.getNodes();

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		page.getActiveEditor();

		MergeModelMap.clear();

		IretDiagramEditor idge = null;
		IEditorPart edtr = page.getActiveEditor();
		if(edtr instanceof IretDiagramEditor){
			idge = (IretDiagramEditor)edtr;


			Point p=new Point();
			p.x=0;
			p.y=0;


			for(IreneElement dupl_node1 : lofG1.keySet())
			{
				p.x+=50;
				MergeModelMap.put(dupl_node1, (IreneElement) IretMergeUtil.createElement(idge, dupl_node1, p));
			}

			for(IreneElement dupl_node2 : lofG2.keySet())
			{
				p.x+=50;
				MergeModelMap.put(dupl_node2, (IreneElement) IretMergeUtil.createElement(idge, dupl_node2, p));
			}

			for(IreneElement hNodo : MergeModelMap.keySet())
			{	
				//--------------------------------------------> CREATING RELATIONSHIPS	

				if(hNodo instanceof BehaviouralGoal)
				{
					IreneElement hPadre=((BehaviouralGoal) hNodo).getRefinedBy();
					if(hPadre!=null)
					{
						IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(hPadre), IretElementTypes.BehaviouralGoalRefinedBy_4019);
					}

					//attach OPERATIONS
					EList<Operation> child_operations=((BehaviouralGoal) hNodo).getOperationalizedBy();
					for(int x=0;x<child_operations.size();x++) {
						if(child_operations.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_operations.get(x)), IretElementTypes.BehaviouralGoalOperationalizedBy_4001);
						}
					}
					
					//attach CONTRIBUTIONS
					EList<ContributionLink> child_contributions=((BehaviouralGoal) hNodo).getContributedBy();
					for(int x=0;x<child_contributions.size();x++) {
						if(child_contributions.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_contributions.get(x)), IretElementTypes.BehaviouralGoalContributedBy_4006);
						}
					}
					
					
					//attach CONTRIBUTIONS (fathers)
					EList<ContributionLink> father_contributions=((BehaviouralGoal) hNodo).getContributesOn();
					for(int x=0;x<father_contributions.size();x++) {
						if(father_contributions.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(father_contributions.get(x)), MergeModelMap.get(hNodo), IretElementTypes.ContributionLinkContributor_4005);
						}
					}
				}	
				
				if(hNodo instanceof AdaptationGoal)
				{
					//attach BEHAVIOURAL GOALS
					EList<BehaviouralGoal> child_goals=((AdaptationGoal) hNodo).getHelp();
					for(int x=0;x<child_goals.size();x++) {
						if(child_goals.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_goals.get(x)), IretElementTypes.AdaptationGoalHelp_4007);
						}
					}					
				}

				if(hNodo instanceof ANDRefinementLink | hNodo instanceof ORRefinementLink) 
				{
					EList<TreeElement> hop=((RefinementLink) hNodo).getRefiningGoals();
					for(int x=0;x<hop.size();x++)
						if(hop.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(hop.get(x)), IretElementTypes.RefinementLinkRefiningGoals_4003);
						}
				}

				if(hNodo instanceof Operation)
				{
					//attach ENTITIES
					EList<Entity> child_entity=((Operation) hNodo).getOut();
					for(int x=0;x<child_entity.size();x++)
						if(child_entity.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_entity.get(x)), IretElementTypes.OperationOut_4012);
						}	
					
					//attach EVENTS
					EList<Event> child_events=((Operation) hNodo).getHasEvent();
					for(int x=0;x<child_events.size();x++)
						if(child_events.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_events.get(x)), IretElementTypes.OperationHasEvent_4008);
						}
				}

				if(hNodo instanceof HumanAgent | hNodo instanceof AutomatedAgent)
				{
					//attach OPERATIONS
					EList<Operation> operat=((Agent) hNodo).getOperat();
					for(int x=0;x<operat.size();x++) {
						if(operat.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(operat.get(x)), IretElementTypes.AgentOperat_4002);
						}
					}
					
					//attach CONTROLS
					EList<Object> child_controls=((Agent) hNodo).getControls();
					for(int x=0;x<child_controls.size();x++) {
						if(child_controls.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_controls.get(x)), IretElementTypes.AgentControls_4010);
						}
					}
				}
				
				if(hNodo instanceof Event)
				{
					//attach AGENTS
					EList<Agent> child_agents=((Event) hNodo).getIsMonitoredBy();
					for(int x=0;x<child_agents.size();x++) {
						if(child_agents.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_agents.get(x)), IretElementTypes.ObjectIsMonitoredBy_4015);
						}
					}					
				}
				
				if(hNodo instanceof Entity)
				{
					//attach OPERATIONS
					EList<Operation> child_op=((Entity) hNodo).getIsInputOf();
					for(int x=0;x<child_op.size();x++) {
						if(child_op.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_op.get(x)), IretElementTypes.EntityIsInputOf_4014);
						}
					}
					
					//attach AGENTS
					EList<Agent> child_controls=((Entity) hNodo).getIsMonitoredBy();
					for(int x=0;x<child_controls.size();x++) {
						if(child_controls.get(x)!=null) {
							IretMergeUtil.createConnection(idge, MergeModelMap.get(hNodo) , MergeModelMap.get(child_controls.get(x)), IretElementTypes.ObjectIsMonitoredBy_4015);
						}
					}
					
					
					
				}
				
			}
		}

		ArrangeRequest request = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		final EditPart rootEP = idge.getDiagramGraphicalViewer().getRootEditPart().getContents();
		org.eclipse.gef.commands.Command command = rootEP.getCommand(request);
		Animation.markBegin();
		command.execute();
		Animation.run(100);
		
		Animation.markBegin();
		command.execute();
		Animation.run(500);

		return MergeModelMap;

	}

}
