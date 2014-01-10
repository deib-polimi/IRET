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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link eu.indenica.iret.Action#getActionParameter <em>Action Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Parameter {
	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.indenica.iret.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see eu.indenica.iret.ActionType
	 * @see #setActionType(ActionType)
	 * @see eu.indenica.iret.IretPackage#getAction_ActionType()
	 * @model required="true"
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Action#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see eu.indenica.iret.ActionType
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Action Parameter</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Parameter</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAction_ActionParameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getActionParameter();

} // Action
