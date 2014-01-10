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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.indenica.iret.ContributionLink#getWeight <em>Weight</em>}</li>
 *   <li>{@link eu.indenica.iret.ContributionLink#getContributor <em>Contributor</em>}</li>
 *   <li>{@link eu.indenica.iret.ContributionLink#getDestinationGoal <em>Destination Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.ContributionLink#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.indenica.iret.IretPackage#getContributionLink()
 * @model
 * @generated
 */
public interface ContributionLink extends LinkNode {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see eu.indenica.iret.IretPackage#getContributionLink_Weight()
	 * @model
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.ContributionLink#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.BehaviouralGoal#getContributesOn <em>Contributes On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' reference.
	 * @see #setContributor(BehaviouralGoal)
	 * @see eu.indenica.iret.IretPackage#getContributionLink_Contributor()
	 * @see eu.indenica.iret.BehaviouralGoal#getContributesOn
	 * @model opposite="contributesOn" required="true"
	 * @generated
	 */
	BehaviouralGoal getContributor();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.ContributionLink#getContributor <em>Contributor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(BehaviouralGoal value);

	/**
	 * Returns the value of the '<em><b>Destination Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.indenica.iret.BehaviouralGoal#getContributedBy <em>Contributed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Goal</em>' reference.
	 * @see #setDestinationGoal(BehaviouralGoal)
	 * @see eu.indenica.iret.IretPackage#getContributionLink_DestinationGoal()
	 * @see eu.indenica.iret.BehaviouralGoal#getContributedBy
	 * @model opposite="contributedBy" required="true"
	 * @generated
	 */
	BehaviouralGoal getDestinationGoal();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.ContributionLink#getDestinationGoal <em>Destination Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Goal</em>' reference.
	 * @see #getDestinationGoal()
	 * @generated
	 */
	void setDestinationGoal(BehaviouralGoal value);

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
	 * @see eu.indenica.iret.IretPackage#getContributionLink_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eu.indenica.iret.ContributionLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // ContributionLink
