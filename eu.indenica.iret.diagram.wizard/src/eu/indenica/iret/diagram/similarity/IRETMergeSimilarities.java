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
import java.util.List;
import java.util.Map;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.Action;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Attribute;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.Goal;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.LinkNode;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.Reference;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.State;
import eu.indenica.iret.Variability;
import eu.indenica.iret.diagram.wizard.beans.CreateModels;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;

public class IRETMergeSimilarities {
	private List<String> tupla = new ArrayList<String>();
	private List<Integer> ci = new ArrayList<Integer>();
	private List<IreneElementPair> nodes = new ArrayList<IreneElementPair>();
	private IreneModel m1;
	private IreneModel m2;
	private Map<IreneElement, IreneElement> MergeModelMap;
	
	public IRETMergeSimilarities() {
		super();
		
	}

	public void addTupla(IreneElement n1,String op, IreneElement n2, String pp, Integer ConfidenceIndex) {
	
		tupla.add(getNodeName(n1)+" "+op+" "+getNodeName(n2) + pp);
		nodes.add(new IreneElementPair(n1,n2));
		ci.add(ConfidenceIndex);
	}
	
	public void setMergeModelMap(Map<IreneElement, IreneElement> _MergeModelMap) {
	   MergeModelMap=_MergeModelMap;
	}
	
	public Map<IreneElement, IreneElement> getMergeModelMap() {
		return MergeModelMap;
	}

	public List<String> getTupla() {
		return tupla;
	}
	
	public List<IreneElementPair> getNodes() {
		return nodes;
	}
	
	public List<Integer> getConfidenceIndex() {
		return ci;
	}	

	//BASILIO IMPORTANTE: considerare non solo i goal, ma tutti gli oggetti...
	private String getNodeName(IreneElement oldObject) {

			if(oldObject instanceof eu.indenica.iret.Object){

				return ((eu.indenica.iret.Object) oldObject).getName();

			}

			if(oldObject instanceof Goal){

				return ((Goal) oldObject).getName();
			}					



			if(oldObject instanceof Operation){

				return ((Operation) oldObject).getName();
		
			}		
			
			if(oldObject instanceof Reference){
				return ((Reference) oldObject).getName();
			}

			if(oldObject instanceof Attribute){


				return ((Attribute) oldObject).getName();
			}


			if(oldObject instanceof State){

				return ((State) oldObject).getName();
			}	
			
			return null;
	}

	
	public void addModel1(IreneModel _m1){
		m1=_m1;
	}
	
	public void addModel2(IreneModel _m2){
		m2=_m2;
	}
	
	public IreneModel getModel_1(){
		return m1;
	}
	
	public IreneModel getModel_2(){
		return m2;
	}
	
}
