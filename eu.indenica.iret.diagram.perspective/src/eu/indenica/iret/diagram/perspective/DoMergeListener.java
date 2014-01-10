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
package eu.indenica.iret.diagram.perspective;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.Object;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.diagram.part.IretDiagramEditor;
import eu.indenica.iret.diagram.part.IretMergeUtil;
import eu.indenica.iret.diagram.providers.IretElementTypes;
import eu.indenica.iret.diagram.similarity.FindElements;
import eu.indenica.iret.diagram.similarity.IRETMergeSimilarities;
import eu.indenica.iret.diagram.wizard.beans.IRETMergeViewConfiguration;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;


public class DoMergeListener implements SelectionListener{
	IRETMergeViewConfiguration imvc;
	IRETMergeSimilarities ims;
	List<IreneElement> NodesTBD=new ArrayList<IreneElement>();
	Map<IreneElement, String> lofG1 = new HashMap<IreneElement, String>();
	Map<IreneElement, String> lofG2 = new HashMap<IreneElement, String>();
	private  Map<IreneElementPair, Button> SimilarityPanelStruct = new HashMap<IreneElementPair, Button>();
	private  Map<IreneElement, IreneElement> MergeModelMap = new HashMap<IreneElement, IreneElement>();
	Button btn;

	public DoMergeListener () {

	}

	public void SetDoMergeListener (IRETMergeViewConfiguration _imvc, IRETMergeSimilarities _ims, Map<IreneElementPair, Button> similarityPanelStruct2, Button _btn) {
		imvc=_imvc;
		ims=_ims;
		SimilarityPanelStruct=similarityPanelStruct2;
		btn=_btn;
	}

	IreneModel tm;
	@Override
	public void widgetSelected(SelectionEvent e) {

		btn.setVisible(false);

		final IreneModel m1=ims.getModel_1();
		final IreneModel m2=ims.getModel_2();

		FindElements clofG1=new FindElements(m1);
		FindElements clofG2=new FindElements(m2);

		lofG1=clofG1.getNodes();
		lofG2=clofG2.getNodes();

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart)page.getActiveEditor();

		IretDiagramEditor idge = null;
		IEditorPart edtr = page.getActiveEditor();
		if(edtr instanceof IretDiagramEditor){
			idge = (IretDiagramEditor)edtr;


			Point p=new Point();
			p.x=0;
			p.y=0;

			MergeModelMap=ims.getMergeModelMap(); 
			/* 
			 * Diagrams has been created in SimilarityEvaluator. Uncomment this function to duplicate diagrams			
			 */
			//			MergeModelMap=CreateModels.DoDuplicate(m1, m2);

			//-----------------------------------------------------------------------------------> MERGING LOGIC
			NodesTBD.clear();
			for(IreneElementPair pair : SimilarityPanelStruct.keySet()){

				if(SimilarityPanelStruct.get(pair).getSelection()==true)
				{	
					final IreneElement n1 = MergeModelMap.get(pair.getFirstModelNode());
					final IreneElement n2 = MergeModelMap.get(pair.getSecondModelNode());
					final IreneModel im = ((GoalDiagram)idge.getDiagramEditPart().resolveSemanticElement()).getIsViewOf();

					NodesTBD.add(n2);


					if(n1 instanceof BehaviouralGoal)
					{	
						final RefinementLink firstRl=((BehaviouralGoal)n1).getRefinedBy();
						final RefinementLink secondRl=((BehaviouralGoal)n2).getRefinedBy();

						for(RefinementLink rlp : ((BehaviouralGoal)n2).getRefines())
						{
							IretMergeUtil.removeConnectionFromDiagram(idge, rlp, n2);
							IretMergeUtil.createConnection(idge, rlp, n1, IretElementTypes.RefinementLinkRefiningGoals_4003);						
						}

						//attach OPERATIONS
						for(Operation op : ((BehaviouralGoal)n2).getOperationalizedBy())
						{
							IretMergeUtil.removeConnectionFromDiagram(idge, n2, op);
							IretMergeUtil.createConnection(idge, n1, op, IretElementTypes.BehaviouralGoalOperationalizedBy_4001);						
						}

						//--------------------------------------------------------------------------------------------------

						//attach CONTRIBUTIONS
						final List<ContributionLink> childContributions=new ArrayList<ContributionLink>();

						for(final ContributionLink cl : ((BehaviouralGoal)n2).getContributedBy())
						{
							childContributions.add(cl);
						}

						for(int x=0;x<childContributions.size();x++){
							final ContributionLink cl1=childContributions.get(x);
							IretMergeUtil.removeConnectionFromDiagram(idge, n2, childContributions.get(x));
							idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
								@Override
								protected void doExecute() {
									cl1.setDestinationGoal(null);
								}
							});

							IretMergeUtil.createConnection(idge, n1, childContributions.get(x), IretElementTypes.BehaviouralGoalContributedBy_4006);							
						}


						//attach CONTRIBUTIONS (fathers)	
						for(IreneElement hNodo : MergeModelMap.keySet())
						{
							final IreneElement el_on_mergemodel2;
							el_on_mergemodel2=MergeModelMap.get(hNodo);

							if(el_on_mergemodel2 instanceof ContributionLink)
							{	

								if(((ContributionLink) el_on_mergemodel2).getContributor()!=null && ((ContributionLink) el_on_mergemodel2).getContributor().equals(n2)) {
									idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
										@Override
										protected void doExecute() {
											((ContributionLink) el_on_mergemodel2).setContributor(null);
										}
									});	

									IretMergeUtil.removeConnectionFromDiagram(idge, ((ContributionLink) el_on_mergemodel2), n2);
									IretMergeUtil.createConnection(idge, ((ContributionLink) el_on_mergemodel2), n1, IretElementTypes.ContributionLinkContributor_4005);	

								}
							}

						}						
						//--------------------------------------------------------------------------------------------------					



						//attach ADAPTIONAL GOALS (fathers)
						EList<BehaviouralGoal> fgoals;
						IreneElement el_on_mergemodel;

						for(IreneElement hNodo : MergeModelMap.keySet())
						{
							el_on_mergemodel=MergeModelMap.get(hNodo);

							if(el_on_mergemodel instanceof AdaptationGoal)
							{		
								fgoals=((AdaptationGoal) el_on_mergemodel).getHelp();
								for(int x=0;x<fgoals.size();x++) {				
									if(fgoals.get(x).equals(n2)) {		
										IretMergeUtil.removeConnectionFromDiagram(idge, el_on_mergemodel, n2);
										IretMergeUtil.createConnection(idge, el_on_mergemodel, n1, IretElementTypes.AdaptationGoalHelp_4007);	
									}	
								}	
							}
						}						

						if(secondRl!=null)
						{
							if(firstRl!=null) //n1 e n2 hanno figli
							{
								//Crea un nuovo OR RL
								final RefinementLink newRL=(RefinementLink)IretMergeUtil.createElement(idge, IretElementTypes.ORRefinementLink_2006, p);

								//Imposta N1 come padre del nuovo OR e toglie i nodi N1 e N2 come padri dei rispettivi RL
								idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
									@Override
									protected void doExecute() {
										//	newRL.setRefinedGoal((BehaviouralGoal)n1);	

										//firstRl.setRefinedGoal(null);
										//secondRl.setRefinedGoal(null);

										if(im.getContains().contains(n1)==false)
											im.getContains().add(n1);
									}
								});

								IretMergeUtil.removeConnectionFromDiagram(idge, n1, firstRl);
								IretMergeUtil.removeConnectionFromDiagram(idge, n2, secondRl);

								//Crea connessioni tra nuovo OR RL ed esistenti RL
								IretMergeUtil.createConnection(idge, newRL, firstRl, IretElementTypes.RefinementLinkRefiningGoals_4003);
								IretMergeUtil.createConnection(idge, newRL, secondRl, IretElementTypes.RefinementLinkRefiningGoals_4003);

								//Crea connessione tra nuovo OR RL ed elemento padre N1						
								IretMergeUtil.createConnection(idge, n1, newRL, IretElementTypes.BehaviouralGoalRefinedBy_4019);

							}
							else //n1 non ha figli
							{
								idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
									@Override
									protected void doExecute() {
										secondRl.setRefinedGoal(null);
									}
								});
								IretMergeUtil.createConnection(idge, n1, secondRl, IretElementTypes.BehaviouralGoalRefinedBy_4019);

							}



						} //end if(n1 instanceof BehaviouralGoal)

						//						idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
						//							@Override
						//							protected void doExecute() {
						//								// TODO Auto-generated method stub
						//								for(RefinementLink rl : ((BehaviouralGoal)n2).getRefines())
						//								{
						//									//										rl.getRefiningGoals().add((BehaviouralGoal)n1);
						//								}
						//							}
						//
						//						});

						//						IretMergeUtil.removeElement(idge, n2);


					} 
					//___________________________________________________________________________________end if(n1 instanceof BehaviouralGoal)

					if(n1 instanceof AdaptationGoal)
					{
						//attach BEHAVIOURALGOALS
						for(BehaviouralGoal ent : ((AdaptationGoal) n2).getHelp()) {
							IretMergeUtil.createConnection(idge, n1, ent, IretElementTypes.AdaptationGoalHelp_4007);
							IretMergeUtil.removeConnectionFromDiagram(idge, n2, ent);
						}

					}


					if(n1 instanceof Operation)
					{
						EList<Operation> operat;
						IreneElement el_on_mergemodel;

						//attach AGENTS
						for(IreneElement hNodo : MergeModelMap.keySet())
						{
							el_on_mergemodel=MergeModelMap.get(hNodo);

							if(el_on_mergemodel instanceof HumanAgent | el_on_mergemodel instanceof AutomatedAgent)
							{		
								operat=((Agent) el_on_mergemodel).getOperat();
								for(int x=0;x<operat.size();x++) {				
									if(operat.get(x).equals(n2)) {									
										IretMergeUtil.createConnection(idge, el_on_mergemodel, n1, IretElementTypes.AgentOperat_4002);	
										IretMergeUtil.removeConnectionFromDiagram(idge, el_on_mergemodel, n2);
									}	
								}	
							}
						}

						//attach ENTITIES
						for(Entity ent : ((Operation) n2).getOut()) {
							IretMergeUtil.createConnection(idge, n1, ent, IretElementTypes.OperationOut_4012);
						}

						//attach EVENTS
						for(Event evt : ((Operation) n2).getHasEvent()) {
							IretMergeUtil.createConnection(idge, n1, evt, IretElementTypes.OperationHasEvent_4008);
						}

						//attach ENTITIES (fathers)
						for(Entity ent : ((Operation) n2).getIn()) {
							IretMergeUtil.createConnection(idge, ent, n1, IretElementTypes.EntityIsInputOf_4014);
						}

					}


					if(n1 instanceof Agent)
					{
						//attach OPERATIONS
						EList<Operation> operat=((Agent) n2).getOperat();
						for(int x=0;x<operat.size();x++) {
							if(operat.get(x)!=null) {
								IretMergeUtil.createConnection(idge, n1, operat.get(x), IretElementTypes.AgentOperat_4002);
							}	
						}

						//attach CONTROLS
						EList<Object> child_controls=((Agent) n2).getControls();
						for(int x=0;x<child_controls.size();x++) {
							if(child_controls.get(x)!=null) {
								IretMergeUtil.createConnection(idge, n1, child_controls.get(x), IretElementTypes.AgentControls_4010);
							}
						}

						//attach MONITORS (fathers)
						EList<Object> father_controls=((Agent) n2).getMonitors();
						for(int x=0;x<father_controls.size();x++) {
							if(father_controls.get(x)!=null) {
								IretMergeUtil.createConnection(idge, father_controls.get(x), n1, IretElementTypes.ObjectIsMonitoredBy_4015);
							}
						}

					}

					if(n1 instanceof Entity)
					{
						//attach OPERATIONS
						for(Operation ent : ((Entity) n2).getIsInputOf()) {
							IretMergeUtil.createConnection(idge, n1, ent, IretElementTypes.EntityIsInputOf_4014);
						}

						//attach AGENTS
						for(Agent ent : ((Entity) n2).getIsMonitoredBy()) {
							IretMergeUtil.createConnection(idge, n1, ent, IretElementTypes.ObjectIsMonitoredBy_4015);
						}

						//attach OPERATIONS (fathers)
						for(Operation ent : ((Entity) n2).getIsOutputOf()) {
							IretMergeUtil.createConnection(idge, ent, n1, IretElementTypes.OperationOut_4012);
						}	

						//attach AGENTS (fathers)
						for(Agent ent : ((Entity) n2).getIsControlledBy()) {
							IretMergeUtil.createConnection(idge, ent, n1, IretElementTypes.AgentControls_4010);
						}						

					}

					if(n1 instanceof Event)
					{						
						//attach AGENTS
						for(Agent ent : ((Event) n2).getIsMonitoredBy()) {
							IretMergeUtil.createConnection(idge, n1, ent, IretElementTypes.ObjectIsMonitoredBy_4015);
						}

						//attach OPERATIONS (fathers)
						IreneElement el_on_m2;
						EList<Event> evt;

						for(IreneElement hNodo : MergeModelMap.keySet())
						{
							el_on_m2=MergeModelMap.get(hNodo);

							if(el_on_m2 instanceof Operation)
							{		
								evt=((Operation) el_on_m2).getHasEvent();
								for(int x=0;x<evt.size();x++) {				
									if(evt.get(x).equals(n2)) {
										IretMergeUtil.createConnection(idge, el_on_m2, n1, IretElementTypes.OperationHasEvent_4008);	
									}	
								}	
							}
						}

						//attach AGENTS (fathers)
						for(Agent ent : ((Event) n2).getIsControlledBy()) {
							IretMergeUtil.createConnection(idge, ent, n1, IretElementTypes.AgentControls_4010);
						}

					}


					//IretMergeUtil.removeElement(idge, n2);

				}//end SimilarityPanelStruct.get(pair).getSelection()==true	
			}//end of for

			for(int x=0;x<NodesTBD.size();x++){
				try{
					IretMergeUtil.removeElement(idge, NodesTBD.get(x));
				}
				catch(Exception e1)
				{
					continue;
				}
			}

		}

		//arrange shapes
		ArrangeRequest request = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		final EditPart rootEP = idge.getDiagramGraphicalViewer().getRootEditPart().getContents();
		org.eclipse.gef.commands.Command command = rootEP.getCommand(request);
		Animation.markBegin();
		command.execute();
		Animation.run(500);


		//RESET SHAPE BACKGROUND COLOR
		DoChangeShapeColorListener.ResetAll();

	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
