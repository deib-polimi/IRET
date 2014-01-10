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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasRLink <em>Has RLink</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasBehaviouralGoal <em>Has Behavioural Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasAdaptationGoal <em>Has Adaptation Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasOper <em>Has Oper</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasEntity <em>Has Entity</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasAgent <em>Has Agent</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getHasCLink <em>Has CLink</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getLabel <em>Label</em>}</li>
 *   <li>{@link eu.indenica.iret.GoalDiagram#getIsViewOf <em>Is View Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getGoalDiagram()
 * @model
 * @generated
 */
public interface GoalDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has RLink</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.RefinementLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has RLink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has RLink</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasRLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefinementLink> getHasRLink();

	/**
	 * Returns the value of the '<em><b>Has Behavioural Goal</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.BehaviouralGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Behavioural Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Behavioural Goal</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasBehaviouralGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviouralGoal> getHasBehaviouralGoal();

	/**
	 * Returns the value of the '<em><b>Has Adaptation Goal</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.AdaptationGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Adaptation Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Adaptation Goal</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasAdaptationGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationGoal> getHasAdaptationGoal();

	/**
	 * Returns the value of the '<em><b>Has Event</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getHasEvent();

	/**
	 * Returns the value of the '<em><b>Has Oper</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Oper</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Oper</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasOper()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getHasOper();

	/**
	 * Returns the value of the '<em><b>Has Entity</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entity</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasEntity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getHasEntity();

	/**
	 * Returns the value of the '<em><b>Has Agent</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Agent</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasAgent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getHasAgent();

	/**
	 * Returns the value of the '<em><b>Has Action</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getHasAction();

	/**
	 * Returns the value of the '<em><b>Has CLink</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.ContributionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CLink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CLink</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_HasCLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContributionLink> getHasCLink();

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_Readonly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.GoalDiagram#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.GoalDiagram#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Is View Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.IreneModel#getHasView <em>Has View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is View Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is View Of</em>' container reference.
	 * @see #setIsViewOf(IreneModel)
	 * @see eu.indenica.iret.IretPackage#getGoalDiagram_IsViewOf()
	 * @see eu.indenica.iret.IreneModel#getHasView
	 * @model opposite="hasView" transient="false"
	 * @generated
	 */
	IreneModel getIsViewOf();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.GoalDiagram#getIsViewOf <em>Is View Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is View Of</em>' container reference.
	 * @see #getIsViewOf()
	 * @generated
	 */
	void setIsViewOf(IreneModel value);

} // GoalDiagram
