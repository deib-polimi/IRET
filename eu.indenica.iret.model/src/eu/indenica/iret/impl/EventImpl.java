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
import eu.indenica.iret.Event;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Parameter;
import eu.indenica.iret.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.EventImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EventImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.EventImpl#getAddArguments <em>Add Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends ObjectImpl implements Event {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parameters;

	/**
	 * The cached value of the '{@link #getAddArguments() <em>Add Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> addArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, IretPackage.EVENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Reference>(Reference.class, this, IretPackage.EVENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getAddArguments() {
		if (addArguments == null) {
			addArguments = new EObjectResolvingEList<Parameter>(Parameter.class, this, IretPackage.EVENT__ADD_ARGUMENTS);
		}
		return addArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.EVENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case IretPackage.EVENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case IretPackage.EVENT__ATTRIBUTES:
				return getAttributes();
			case IretPackage.EVENT__PARAMETERS:
				return getParameters();
			case IretPackage.EVENT__ADD_ARGUMENTS:
				return getAddArguments();
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
			case IretPackage.EVENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case IretPackage.EVENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Reference>)newValue);
				return;
			case IretPackage.EVENT__ADD_ARGUMENTS:
				getAddArguments().clear();
				getAddArguments().addAll((Collection<? extends Parameter>)newValue);
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
			case IretPackage.EVENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case IretPackage.EVENT__PARAMETERS:
				getParameters().clear();
				return;
			case IretPackage.EVENT__ADD_ARGUMENTS:
				getAddArguments().clear();
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
			case IretPackage.EVENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case IretPackage.EVENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case IretPackage.EVENT__ADD_ARGUMENTS:
				return addArguments != null && !addArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
