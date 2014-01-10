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

import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.StateImpl#isIsInt <em>Is Int</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.StateImpl#getDomInv <em>Dom Inv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInt() <em>Is Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInt() <em>Is Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInt()
	 * @generated
	 * @ordered
	 */
	protected boolean isInt = IS_INT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomInv() <em>Dom Inv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomInv()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition domInv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInt() {
		return isInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInt(boolean newIsInt) {
		boolean oldIsInt = isInt;
		isInt = newIsInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.STATE__IS_INT, oldIsInt, isInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getDomInv() {
		if (domInv != null && domInv.eIsProxy()) {
			InternalEObject oldDomInv = (InternalEObject)domInv;
			domInv = (FormalDefinition)eResolveProxy(oldDomInv);
			if (domInv != oldDomInv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IretPackage.STATE__DOM_INV, oldDomInv, domInv));
			}
		}
		return domInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition basicGetDomInv() {
		return domInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomInv(FormalDefinition newDomInv) {
		FormalDefinition oldDomInv = domInv;
		domInv = newDomInv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.STATE__DOM_INV, oldDomInv, domInv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IretPackage.STATE__NAME:
				return getName();
			case IretPackage.STATE__IS_INT:
				return isIsInt();
			case IretPackage.STATE__DOM_INV:
				if (resolve) return getDomInv();
				return basicGetDomInv();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IretPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case IretPackage.STATE__IS_INT:
				setIsInt((Boolean)newValue);
				return;
			case IretPackage.STATE__DOM_INV:
				setDomInv((FormalDefinition)newValue);
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
			case IretPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IretPackage.STATE__IS_INT:
				setIsInt(IS_INT_EDEFAULT);
				return;
			case IretPackage.STATE__DOM_INV:
				setDomInv((FormalDefinition)null);
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
			case IretPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IretPackage.STATE__IS_INT:
				return isInt != IS_INT_EDEFAULT;
			case IretPackage.STATE__DOM_INV:
				return domInv != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isInt: ");
		result.append(isInt);
		result.append(')');
		return result.toString();
	}

} //StateImpl
