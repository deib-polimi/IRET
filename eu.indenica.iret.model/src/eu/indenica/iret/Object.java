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
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Object#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.Object#getName <em>Name</em>}</li>
 *   <li>{@link eu.indenica.iret.Object#getIsMonitoredBy <em>Is Monitored By</em>}</li>
 *   <li>{@link eu.indenica.iret.Object#getIsControlledBy <em>Is Controlled By</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getObject()
 * @model abstract="true"
 * @generated
 */
public interface Object extends Parameter {
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
	 * @see eu.indenica.iret.IretPackage#getObject_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Object#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.indenica.iret.IretPackage#getObject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Monitored By</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Agent}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Agent#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Monitored By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Monitored By</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getObject_IsMonitoredBy()
	 * @see eu.indenica.iret.Agent#getMonitors
	 * @model opposite="monitors"
	 * @generated
	 */
	EList<Agent> getIsMonitoredBy();

	/**
	 * Returns the value of the '<em><b>Is Controlled By</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Agent}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Agent#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Controlled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Controlled By</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getObject_IsControlledBy()
	 * @see eu.indenica.iret.Agent#getControls
	 * @model opposite="controls"
	 * @generated
	 */
	EList<Agent> getIsControlledBy();

} // Object
