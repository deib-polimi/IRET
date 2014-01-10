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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.indenica.iret;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.RefinementLink#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.RefinementLink#getRefiningGoals <em>Refining Goals</em>}</li>
 *   <li>{@link eu.indenica.iret.RefinementLink#getRefinedGoal <em>Refined Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getRefinementLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RefinementLoop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RefinementLoop='not target->includes(myFather)'"
 * @generated
 */
public interface RefinementLink extends LinkNode, TreeElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eu.indenica.iret.IretPackage#getRefinementLink_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.RefinementLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Refining Goals</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.TreeElement}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.TreeElement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refining Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Goals</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getRefinementLink_RefiningGoals()
	 * @see eu.indenica.iret.TreeElement#getRefines
	 * @model opposite="refines" required="true"
	 * @generated
	 */
	EList<TreeElement> getRefiningGoals();

	/**
	 * Returns the value of the '<em><b>Refined Goal</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.BehaviouralGoal#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Goal</em>' containment reference.
	 * @see #setRefinedGoal(BehaviouralGoal)
	 * @see eu.indenica.iret.IretPackage#getRefinementLink_RefinedGoal()
	 * @see eu.indenica.iret.BehaviouralGoal#getRefinedBy
	 * @model opposite="refinedBy" containment="true"
	 * @generated
	 */
	BehaviouralGoal getRefinedGoal();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.RefinementLink#getRefinedGoal <em>Refined Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Goal</em>' containment reference.
	 * @see #getRefinedGoal()
	 * @generated
	 */
	void setRefinedGoal(BehaviouralGoal value);

} // RefinementLink
