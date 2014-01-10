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
import java.util.List;

//import eu.indenica.iret.diagram.perspective.extensionpoints.ITabs;

public class IRETMergeViewConfiguration {//implements ITabs {
	private List<String> 	firstView = new ArrayList<String>(), 
							secondView = new ArrayList<String>(), 
							mergeView = new ArrayList<String>();
							
	private String firstModel, secondModel;
	
	public IRETMergeViewConfiguration() {
		super();
	}

	public String getFirstModel() {
		return firstModel;
	}

	public void setFirstModel(String firstModel) {
		this.firstModel = firstModel;
	}

	public String getSecondModel() {
		return secondModel;
	}

	public void setSecondModel(String secondModel) {
		this.secondModel = secondModel;
	}

	public List<String> getFirstView() {
		return firstView;
	}

	public void addElementToFirstView(String element) {
		firstView.add(element);
	}

	public List<String> getSecondView() {
		return secondView;
	}

	public void addElementToSecondView(String element) {
		this.secondView.add(element);
	}

	public List<String> getMergeView() {
		return mergeView;
	}

	public void addElementToMergeView(String element) {
		this.mergeView.add(element);
	}
}
