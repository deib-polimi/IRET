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
 * A representation of the model object '<em><b>Behavioural Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getContributesOn <em>Contributes On</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getOperationalizedBy <em>Operationalized By</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getFormalDefinition <em>Formal Definition</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#isSoft <em>Soft</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getSatisfaction <em>Satisfaction</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#isRollback <em>Rollback</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getContributedBy <em>Contributed By</em>}</li>
 *   <li>{@link eu.indenica.iret.BehaviouralGoal#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IsLeafe SatisfactionRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL IsLeafe='if(leafe = true) then (ref = null) else (ref <> null) endif' SatisfactionRange='satisfactionLevel<=1 and satisfactionLevel>=0'"
 * @generated
 */
public interface BehaviouralGoal extends Goal, TreeElement {
	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' attribute.
	 * @see #setLeaf(boolean)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_Leaf()
	 * @model required="true"
	 * @generated
	 */
	boolean isLeaf();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#isLeaf <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' attribute.
	 * @see #isLeaf()
	 * @generated
	 */
	void setLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Contributes On</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.ContributionLink}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.ContributionLink#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes On</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_ContributesOn()
	 * @see eu.indenica.iret.ContributionLink#getContributor
	 * @model opposite="contributor"
	 * @generated
	 */
	EList<ContributionLink> getContributesOn();

	/**
	 * Returns the value of the '<em><b>Operationalized By</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationalized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationalized By</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_OperationalizedBy()
	 * @model
	 * @generated
	 */
	EList<Operation> getOperationalizedBy();

	/**
	 * Returns the value of the '<em><b>Formal Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Definition</em>' containment reference.
	 * @see #setFormalDefinition(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_FormalDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormalDefinition getFormalDefinition();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#getFormalDefinition <em>Formal Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Definition</em>' containment reference.
	 * @see #getFormalDefinition()
	 * @generated
	 */
	void setFormalDefinition(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Soft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft</em>' attribute.
	 * @see #setSoft(boolean)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_Soft()
	 * @model required="true"
	 * @generated
	 */
	boolean isSoft();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#isSoft <em>Soft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft</em>' attribute.
	 * @see #isSoft()
	 * @generated
	 */
	void setSoft(boolean value);

	/**
	 * Returns the value of the '<em><b>Satisfaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction</em>' attribute.
	 * @see #setSatisfaction(float)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_Satisfaction()
	 * @model required="true"
	 * @generated
	 */
	float getSatisfaction();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#getSatisfaction <em>Satisfaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction</em>' attribute.
	 * @see #getSatisfaction()
	 * @generated
	 */
	void setSatisfaction(float value);

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' attribute.
	 * @see #setRollback(boolean)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_Rollback()
	 * @model required="true"
	 * @generated
	 */
	boolean isRollback();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#isRollback <em>Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback</em>' attribute.
	 * @see #isRollback()
	 * @generated
	 */
	void setRollback(boolean value);

	/**
	 * Returns the value of the '<em><b>Contributed By</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.ContributionLink}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.ContributionLink#getDestinationGoal <em>Destination Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed By</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_ContributedBy()
	 * @see eu.indenica.iret.ContributionLink#getDestinationGoal
	 * @model opposite="destinationGoal"
	 * @generated
	 */
	EList<ContributionLink> getContributedBy();

	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.RefinementLink#getRefinedGoal <em>Refined Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined By</em>' container reference.
	 * @see #setRefinedBy(RefinementLink)
	 * @see eu.indenica.iret.IretPackage#getBehaviouralGoal_RefinedBy()
	 * @see eu.indenica.iret.RefinementLink#getRefinedGoal
	 * @model opposite="refinedGoal" transient="false"
	 * @generated
	 */
	RefinementLink getRefinedBy();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.BehaviouralGoal#getRefinedBy <em>Refined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined By</em>' container reference.
	 * @see #getRefinedBy()
	 * @generated
	 */
	void setRefinedBy(RefinementLink value);

} // BehaviouralGoal
