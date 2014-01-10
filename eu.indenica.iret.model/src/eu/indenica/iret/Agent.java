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
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Agent#getOperat <em>Operat</em>}</li>
 *   <li>{@link eu.indenica.iret.Agent#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link eu.indenica.iret.Agent#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getAgent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InglobeAllOut InglobeAllIn'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL InglobeAllOut='write->includesAll(operat.out)' InglobeAllIn='read->includesAll(operat._\'in\')'"
 * @generated
 */
public interface Agent extends eu.indenica.iret.Object {
	/**
	 * Returns the value of the '<em><b>Operat</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operat</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operat</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAgent_Operat()
	 * @model
	 * @generated
	 */
	EList<Operation> getOperat();

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Object}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Object#getIsMonitoredBy <em>Is Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAgent_Monitors()
	 * @see eu.indenica.iret.Object#getIsMonitoredBy
	 * @model opposite="isMonitoredBy"
	 * @generated
	 */
	EList<eu.indenica.iret.Object> getMonitors();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Object}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Object#getIsControlledBy <em>Is Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getAgent_Controls()
	 * @see eu.indenica.iret.Object#getIsControlledBy
	 * @model opposite="isControlledBy"
	 * @generated
	 */
	EList<eu.indenica.iret.Object> getControls();

} // Agent
