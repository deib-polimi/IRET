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
package eu.indenica.iret.diagram.clipboard;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.emf.clipboard.core.AbstractClipboardSupport;
import org.eclipse.gmf.runtime.emf.clipboard.core.PasteAction;

import eu.indenica.iret.IretPackage;

/**
 * @generated not
 */
public class IRETClipboardSupport extends AbstractClipboardSupport {
	private final Logger logger = Logger.getLogger(IRETClipboardSupport.class.toString());
	
	@Override
	protected EAttribute getNameAttribute(EClass eClass) {
		int id = eClass.getClassifierID();
//		logger.info("default: " + super.getNameAttribute(eClass));
		
		if(id==IretPackage.BEHAVIOURAL_GOAL || id==IretPackage.ADAPTATION_GOAL){
//			logger.info("GOAL: " + iretPackage.eINSTANCE.getGoal_Name());
			return IretPackage.eINSTANCE.getGoal_Name();
		}
		if(id==IretPackage.AND_REFINEMENT_LINK || id == IretPackage.OR_REFINEMENT_LINK)
			return IretPackage.eINSTANCE.getRefinementLink_Id();
		if(id==IretPackage.OPERATION)
			return IretPackage.eINSTANCE.getOperation_Name();
		if(id==IretPackage.AUTOMATED_AGENT || id==IretPackage.HUMAN_AGENT)
			return IretPackage.eINSTANCE.getObject_Name();
		
		logger.info("not identified: " + id + ", to be implemented");
		return super.getNameAttribute(eClass);
	}
	
	@Override
	public PasteAction getPasteCollisionAction(EClass eClass) {
		return super.getPasteCollisionAction(eClass);
	}
	
	@Override
	public boolean isCopyAlways(EObject context, EReference eReference,	Object value) {
		return super.isCopyAlways(context, eReference, value);
	}


}
