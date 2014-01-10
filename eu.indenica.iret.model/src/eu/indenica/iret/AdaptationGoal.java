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
 * A representation of the model object '<em><b>Adaptation Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.AdaptationGoal#getMaxActivations <em>Max Activations</em>}</li>
 *   <li>{@link eu.indenica.iret.AdaptationGoal#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link eu.indenica.iret.AdaptationGoal#getCondition <em>Condition</em>}</li>
 *   <li>{@link eu.indenica.iret.AdaptationGoal#getHelp <em>Help</em>}</li>
 *   <li>{@link eu.indenica.iret.AdaptationGoal#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getAdaptationGoal()
 * @model
 * @generated
 */
public interface AdaptationGoal extends Goal {
	/**
	 * Returns the value of the '<em><b>Max Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Activations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Activations</em>' attribute.
	 * @see #setMaxActivations(int)
	 * @see eu.indenica.iret.IretPackage#getAdaptationGoal_MaxActivations()
	 * @model
	 * @generated
	 */
	int getMaxActivations();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.AdaptationGoal#getMaxActivations <em>Max Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Activations</em>' attribute.
	 * @see #getMaxActivations()
	 * @generated
	 */
	void setMaxActivations(int value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getAdaptationGoal_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getTrigger();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.AdaptationGoal#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.FormalDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getAdaptationGoal_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalDefinition> getCondition();

	/**
	 * Returns the value of the '<em><b>Help</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.BehaviouralGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAdaptationGoal_Help()
	 * @model required="true"
	 * @generated
	 */
	EList<BehaviouralGoal> getHelp();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAdaptationGoal_Actions()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getActions();

} // AdaptationGoal
