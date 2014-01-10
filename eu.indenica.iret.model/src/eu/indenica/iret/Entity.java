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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.indenica.iret.Entity#getReferences <em>References</em>}</li>
 *   <li>{@link eu.indenica.iret.Entity#getAdmittedStates <em>Admitted States</em>}</li>
 *   <li>{@link eu.indenica.iret.Entity#getIsInState <em>Is In State</em>}</li>
 *   <li>{@link eu.indenica.iret.Entity#getIsInputOf <em>Is Input Of</em>}</li>
 *   <li>{@link eu.indenica.iret.Entity#getIsOutputOf <em>Is Output Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends eu.indenica.iret.Object {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getEntity_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Admitted States</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admitted States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admitted States</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getEntity_AdmittedStates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getAdmittedStates();

	/**
	 * Returns the value of the '<em><b>Is In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is In State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In State</em>' attribute.
	 * @see #setIsInState(String)
	 * @see eu.indenica.iret.IretPackage#getEntity_IsInState()
	 * @model required="true"
	 * @generated
	 */
	String getIsInState();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Entity#getIsInState <em>Is In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In State</em>' attribute.
	 * @see #getIsInState()
	 * @generated
	 */
	void setIsInState(String value);

	/**
	 * Returns the value of the '<em><b>Is Input Of</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Operation}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Operation#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input Of</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getEntity_IsInputOf()
	 * @see eu.indenica.iret.Operation#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<Operation> getIsInputOf();

	/**
	 * Returns the value of the '<em><b>Is Output Of</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Operation}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Operation#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Output Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output Of</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getEntity_IsOutputOf()
	 * @see eu.indenica.iret.Operation#getOut
	 * @model opposite="out"
	 * @generated
	 */
	EList<Operation> getIsOutputOf();

} // Entity
