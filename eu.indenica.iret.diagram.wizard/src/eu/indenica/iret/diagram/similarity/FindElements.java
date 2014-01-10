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
package eu.indenica.iret.diagram.similarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Button;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.Goal;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Object;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;
import eu.indenica.iret.impl.GoalDiagramImpl;

//--------------------------------------------------------------------------------------------  OK al posto di GETCONTAINS	
public class FindElements {
	IreneModel m;
	public FindElements(IreneModel s_model) {
		this.m=s_model;
	}
	
	//BASILIO IMPORTANTE: considerare non solo i goal, ma tutti gli oggetti...
	public List<Goal> getGoals(){
		List<Goal> lm =new ArrayList<Goal>();
		
		for(EObject el : m.eContents()) {
		
			if(el instanceof Goal) {
				lm.add((Goal) el);
			}
			
			if (el instanceof ANDRefinementLink | el instanceof ORRefinementLink ) {
				if(((RefinementLink) el).getRefinedGoal()!=null)
					lm.add((Goal) ((RefinementLink) el).getRefinedGoal());
			}

		}	
		return lm;
	}
	
	public List<IreneElement> getOperators(){
		List<IreneElement> lop =new ArrayList<IreneElement>();
		for(EObject el : m.eContents()) {
			
			if (el instanceof ANDRefinementLink | el instanceof ORRefinementLink | el instanceof ContributionLink) {
				lop.add((IreneElement) el);
			}
			
		}
		
		return lop;
	}
	
	public Map<IreneElement, String> getNodes(){
		Map<IreneElement, String> lnodes = new HashMap<IreneElement, String>();
		for(EObject el : m.eContents()) {
			if (el instanceof GoalDiagramImpl)
				continue;
			else if(el instanceof Entity) 
				lnodes.put((IreneElement) el,((Entity) el).getName());
			else if(el instanceof Operation) 
				lnodes.put((IreneElement) el,((Operation) el).getName());	
			else if(el instanceof HumanAgent)
				lnodes.put((IreneElement) el,((HumanAgent) el).getName());	
			else if(el instanceof AutomatedAgent) 
				lnodes.put((IreneElement) el,((AutomatedAgent) el).getName());	
			else if(el instanceof Goal)
				lnodes.put((IreneElement) el,((Goal) el).getName());
			else if(el instanceof ANDRefinementLink) 
				lnodes.put((IreneElement) el,"");	
			else if(el instanceof ORRefinementLink) 
				lnodes.put((IreneElement) el,"");	
			else if(el instanceof ContributionLink)
				lnodes.put((IreneElement) el,"");
			else if(el instanceof Event)
				lnodes.put((IreneElement) el,((Event) el).getName());

			if (el instanceof ANDRefinementLink | el instanceof ORRefinementLink ) {
				if(((RefinementLink) el).getRefinedGoal()!=null)
					lnodes.put((Goal) ((RefinementLink) el).getRefinedGoal(),((RefinementLink) el).getRefinedGoal().getName());
			}
		}
		
		return lnodes;
	}
	
}
