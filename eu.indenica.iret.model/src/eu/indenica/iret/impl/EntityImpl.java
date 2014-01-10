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
package eu.indenica.iret.impl;

import eu.indenica.iret.Attribute;
import eu.indenica.iret.Entity;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;
import eu.indenica.iret.Reference;
import eu.indenica.iret.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getReferences <em>References</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getAdmittedStates <em>Admitted States</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getIsInState <em>Is In State</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getIsInputOf <em>Is Input Of</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EntityImpl#getIsOutputOf <em>Is Output Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getAdmittedStates() <em>Admitted States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> admittedStates;

	/**
	 * The default value of the '{@link #getIsInState() <em>Is In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInState()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_IN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInState() <em>Is In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInState()
	 * @generated
	 * @ordered
	 */
	protected String isInState = IS_IN_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsInputOf() <em>Is Input Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInputOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> isInputOf;

	/**
	 * The cached value of the '{@link #getIsOutputOf() <em>Is Output Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOutputOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> isOutputOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, IretPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, IretPackage.ENTITY__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getAdmittedStates() {
		if (admittedStates == null) {
			admittedStates = new EObjectContainmentEList<State>(State.class, this, IretPackage.ENTITY__ADMITTED_STATES);
		}
		return admittedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsInState() {
		return isInState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInState(String newIsInState) {
		String oldIsInState = isInState;
		isInState = newIsInState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ENTITY__IS_IN_STATE, oldIsInState, isInState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getIsInputOf() {
		if (isInputOf == null) {
			isInputOf = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(Operation.class, this, IretPackage.ENTITY__IS_INPUT_OF, IretPackage.OPERATION__IN);
		}
		return isInputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getIsOutputOf() {
		if (isOutputOf == null) {
			isOutputOf = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(Operation.class, this, IretPackage.ENTITY__IS_OUTPUT_OF, IretPackage.OPERATION__OUT);
		}
		return isOutputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.ENTITY__IS_INPUT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsInputOf()).basicAdd(otherEnd, msgs);
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOutputOf()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case IretPackage.ENTITY__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case IretPackage.ENTITY__ADMITTED_STATES:
				return ((InternalEList<?>)getAdmittedStates()).basicRemove(otherEnd, msgs);
			case IretPackage.ENTITY__IS_INPUT_OF:
				return ((InternalEList<?>)getIsInputOf()).basicRemove(otherEnd, msgs);
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				return ((InternalEList<?>)getIsOutputOf()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IretPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case IretPackage.ENTITY__REFERENCES:
				return getReferences();
			case IretPackage.ENTITY__ADMITTED_STATES:
				return getAdmittedStates();
			case IretPackage.ENTITY__IS_IN_STATE:
				return getIsInState();
			case IretPackage.ENTITY__IS_INPUT_OF:
				return getIsInputOf();
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				return getIsOutputOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IretPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case IretPackage.ENTITY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case IretPackage.ENTITY__ADMITTED_STATES:
				getAdmittedStates().clear();
				getAdmittedStates().addAll((Collection<? extends State>)newValue);
				return;
			case IretPackage.ENTITY__IS_IN_STATE:
				setIsInState((String)newValue);
				return;
			case IretPackage.ENTITY__IS_INPUT_OF:
				getIsInputOf().clear();
				getIsInputOf().addAll((Collection<? extends Operation>)newValue);
				return;
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				getIsOutputOf().clear();
				getIsOutputOf().addAll((Collection<? extends Operation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IretPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case IretPackage.ENTITY__REFERENCES:
				getReferences().clear();
				return;
			case IretPackage.ENTITY__ADMITTED_STATES:
				getAdmittedStates().clear();
				return;
			case IretPackage.ENTITY__IS_IN_STATE:
				setIsInState(IS_IN_STATE_EDEFAULT);
				return;
			case IretPackage.ENTITY__IS_INPUT_OF:
				getIsInputOf().clear();
				return;
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				getIsOutputOf().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IretPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case IretPackage.ENTITY__REFERENCES:
				return references != null && !references.isEmpty();
			case IretPackage.ENTITY__ADMITTED_STATES:
				return admittedStates != null && !admittedStates.isEmpty();
			case IretPackage.ENTITY__IS_IN_STATE:
				return IS_IN_STATE_EDEFAULT == null ? isInState != null : !IS_IN_STATE_EDEFAULT.equals(isInState);
			case IretPackage.ENTITY__IS_INPUT_OF:
				return isInputOf != null && !isInputOf.isEmpty();
			case IretPackage.ENTITY__IS_OUTPUT_OF:
				return isOutputOf != null && !isOutputOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isInState: ");
		result.append(isInState);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
