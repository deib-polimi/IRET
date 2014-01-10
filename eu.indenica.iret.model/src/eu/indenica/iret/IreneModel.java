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

import eu.indenica.iret.integration.easy.Variability;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irene Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.IreneModel#getContains <em>Contains</em>}</li>
 *   <li>{@link eu.indenica.iret.IreneModel#getHasView <em>Has View</em>}</li>
 *   <li>{@link eu.indenica.iret.IreneModel#getEasyVariability <em>Easy Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getIreneModel()
 * @model
 * @generated
 */
public interface IreneModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.IreneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getIreneModel_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<IreneElement> getContains();

	/**
	 * Returns the value of the '<em><b>Has View</b></em>' containment reference list.
	 * The list contents are of type {@link eu.indenica.iret.GoalDiagram}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.GoalDiagram#getIsViewOf <em>Is View Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View</em>' containment reference list.
	 * @see eu.indenica.iret.IretPackage#getIreneModel_HasView()
	 * @see eu.indenica.iret.GoalDiagram#getIsViewOf
	 * @model opposite="isViewOf" containment="true"
	 * @generated
	 */
	EList<GoalDiagram> getHasView();

	/**
	 * Returns the value of the '<em><b>Easy Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Easy Variability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Easy Variability</em>' containment reference.
	 * @see #setEasyVariability(Variability)
	 * @see eu.indenica.iret.IretPackage#getIreneModel_EasyVariability()
	 * @model containment="true"
	 * @generated
	 */
	Variability getEasyVariability();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.IreneModel#getEasyVariability <em>Easy Variability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Easy Variability</em>' containment reference.
	 * @see #getEasyVariability()
	 * @generated
	 */
	void setEasyVariability(Variability value);

} // IreneModel
