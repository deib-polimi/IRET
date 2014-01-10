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
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Event#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.indenica.iret.Event#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.indenica.iret.Event#getAddArguments <em>Add Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends eu.indenica.iret.Object {
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
	 * @see eu.indenica.iret.IretPackage#getEvent_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getEvent_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getParameters();

	/**
	 * Returns the value of the '<em><b>Add Arguments</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Arguments</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getEvent_AddArguments()
	 * @model
	 * @generated
	 */
	EList<Parameter> getAddArguments();

} // Event
