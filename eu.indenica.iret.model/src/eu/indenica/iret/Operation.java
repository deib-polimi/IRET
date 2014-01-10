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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getDomPre <em>Dom Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getDomPost <em>Dom Post</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getReqPre <em>Req Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getReqPost <em>Req Post</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getTrigPre <em>Trig Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getIn <em>In</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getOut <em>Out</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getMinExecTImes <em>Min Exec TImes</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getMaxExecTimes <em>Max Exec Times</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.Operation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends IreneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.indenica.iret.IretPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Dom Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom Pre</em>' containment reference.
	 * @see #setDomPre(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getOperation_DomPre()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getDomPre();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getDomPre <em>Dom Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dom Pre</em>' containment reference.
	 * @see #getDomPre()
	 * @generated
	 */
	void setDomPre(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Dom Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom Post</em>' containment reference.
	 * @see #setDomPost(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getOperation_DomPost()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getDomPost();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getDomPost <em>Dom Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dom Post</em>' containment reference.
	 * @see #getDomPost()
	 * @generated
	 */
	void setDomPost(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Req Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Pre</em>' containment reference.
	 * @see #setReqPre(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getOperation_ReqPre()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getReqPre();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getReqPre <em>Req Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Pre</em>' containment reference.
	 * @see #getReqPre()
	 * @generated
	 */
	void setReqPre(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Req Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Post</em>' containment reference.
	 * @see #setReqPost(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getOperation_ReqPost()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getReqPost();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getReqPost <em>Req Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Post</em>' containment reference.
	 * @see #getReqPost()
	 * @generated
	 */
	void setReqPost(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>Trig Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trig Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trig Pre</em>' containment reference.
	 * @see #setTrigPre(FormalDefinition)
	 * @see eu.indenica.iret.IretPackage#getOperation_TrigPre()
	 * @model containment="true"
	 * @generated
	 */
	FormalDefinition getTrigPre();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getTrigPre <em>Trig Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trig Pre</em>' containment reference.
	 * @see #getTrigPre()
	 * @generated
	 */
	void setTrigPre(FormalDefinition value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Entity}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Entity#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getOperation_In()
	 * @see eu.indenica.iret.Entity#getIsInputOf
	 * @model opposite="isInputOf"
	 * @generated
	 */
	EList<Entity> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Entity}.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.Entity#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getOperation_Out()
	 * @see eu.indenica.iret.Entity#getIsOutputOf
	 * @model opposite="isOutputOf"
	 * @generated
	 */
	EList<Entity> getOut();

	/**
	 * Returns the value of the '<em><b>Has Event</b></em>' reference list.
	 * The list contents are of type {@link eu.indenica.iret.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event</em>' reference list.
	 * @see eu.indenica.iret.IretPackage#getOperation_HasEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getHasEvent();

	/**
	 * Returns the value of the '<em><b>Min Exec TImes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exec TImes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exec TImes</em>' attribute.
	 * @see #setMinExecTImes(int)
	 * @see eu.indenica.iret.IretPackage#getOperation_MinExecTImes()
	 * @model required="true"
	 * @generated
	 */
	int getMinExecTImes();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getMinExecTImes <em>Min Exec TImes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exec TImes</em>' attribute.
	 * @see #getMinExecTImes()
	 * @generated
	 */
	void setMinExecTImes(int value);

	/**
	 * Returns the value of the '<em><b>Max Exec Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exec Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exec Times</em>' attribute.
	 * @see #setMaxExecTimes(int)
	 * @see eu.indenica.iret.IretPackage#getOperation_MaxExecTimes()
	 * @model required="true"
	 * @generated
	 */
	int getMaxExecTimes();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getMaxExecTimes <em>Max Exec Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exec Times</em>' attribute.
	 * @see #getMaxExecTimes()
	 * @generated
	 */
	void setMaxExecTimes(int value);

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
	 * @see eu.indenica.iret.IretPackage#getOperation_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getId <em>Id</em>}' attribute.
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
	 * @see eu.indenica.iret.IretPackage#getOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operation
