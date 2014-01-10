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
package eu.indenica.iret.diagram.similarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import eu.indenica.iret.Goal;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.diagram.similarity.FindElements;
import eu.indenica.iret.diagram.wizard.beans.CreateModels;



public class SimilarityEvaluator {
	private List<IPropertyChangeListener> myListeners;
	static IreneModel m1;
	static IreneModel m2;
	private Map<IreneElement, IreneElement> MergeModelMap;

	private static SimilarityEvaluator instance=null;

	public SimilarityEvaluator(IreneModel _m1, IreneModel _m2) {
		myListeners=new ArrayList<IPropertyChangeListener>();
		m1=_m1;
		m2=_m2;
	}

	public void setModels(IreneModel _m1, IreneModel _m2)
	{
		this.m1=_m1;
		this.m2=_m2;		
	}

	public void setMergeModelMap() {
		System.out.println(m1==null);
		System.out.println(m2==null);
		MergeModelMap=CreateModels.DoDuplicate(m1,m2);
	}

	public static SimilarityEvaluator getInstance() {
		if(instance==null)
			instance=new SimilarityEvaluator(m1,m2);
		return instance;
	}

	public void addPropertyChangeListener (IPropertyChangeListener listener) {
		if(!myListeners.contains(listener))
			myListeners.add(listener);
	}

	public void removePropertyChangeListener (IPropertyChangeListener listener) {
		myListeners.remove(listener);
	}

	public String computeSimilarities(int confideceIndex) {
		IRETMergeSimilarities ims =new IRETMergeSimilarities();

		ConfidenceLogic getCI=new ConfidenceLogic();

		Map<IreneElement, String> lm1 =new HashMap<IreneElement, String>();
		Map<IreneElement, String> lm2 =new HashMap<IreneElement, String>();

		String n1, n2, op, pp;
		int p1;
		int p2;

		op=" = ";

		FindElements clm1=new FindElements(m1);
		FindElements clm2=new FindElements(m2);

		ims.addModel1(m1);
		ims.addModel2(m2);
		ims.setMergeModelMap(MergeModelMap);


		lm1=clm1.getNodes();
		lm2=clm2.getNodes();	
		p1=p2=0;


		for(IreneElement hNodo1 : lm1.keySet()) {
			n1=lm1.get(hNodo1);
			if(hNodo1 instanceof Goal)
				p1=((Goal) hNodo1).getPriority();



			for(IreneElement hNodo2 : lm2.keySet()) {
				n2=lm2.get(hNodo2);
				if (hNodo1.getClass().equals(hNodo2.getClass()) && n1!="" && n2!="") {
					if(hNodo1 instanceof Goal)
						p1=((Goal) hNodo1).getPriority();


					//Checking PRIORITY property
					if (p1==p2 && p1>0) 
						pp=FPriority('=');
					else if (p1 ==0 && p2==0) 
						pp=FPriority('0');					
					else if (p1 > p2) 
						pp=FPriority('L');
					else if (p1 < p2) 
						pp=FPriority('R');
					else
						pp="";

//Comparison algorithm based on "Java WordNet Similarity" (cfr. ConfidenceLogic, IndexBroker, SimilarityAssessor)
					int ConfidenceIndex=getCI.getConfidenceIndex(n1,n2);
					
					//if words are not in WordNet dictionary applies our algorithm 
					if (ConfidenceIndex==0 | ConfidenceIndex>100) {
						ConfidenceIndex=getCI.getConfidenceIndexITA(n1,n2);
					}

// Simple Similarity algorithm no WordNet
//	int ConfidenceIndex=getCI.getConfidenceIndexITA(n1,n2);
 
					

					ims.addTupla(hNodo1,op,hNodo2,pp,ConfidenceIndex);

				}

			}

		}





		for(IPropertyChangeListener ipc : myListeners)
			ipc.propertyChange(new PropertyChangeEvent(this, "NewSimilarity", null, ims));

		return "SIM EV fatto";
	}

	String FPriority (char side)
	{
		switch (side){
		case '=': return(", SAME PRIORITY      ");
		case 'L': return(", LEFT NODE PRIORITY ");
		case 'R': return(", RIGHT NODE PRIORITY");
		default:return("                     ");
		}

	}	



}
