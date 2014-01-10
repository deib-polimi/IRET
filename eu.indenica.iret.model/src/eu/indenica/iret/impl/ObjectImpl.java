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

import eu.indenica.iret.Agent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Variability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getIsMonitoredBy <em>Is Monitored By</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ObjectImpl#getIsControlledBy <em>Is Controlled By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectImpl extends EObjectImpl implements eu.indenica.iret.Object {
	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<IreneElement> derivedFrom;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected Variability variability;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getIsMonitoredBy() <em>Is Monitored By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMonitoredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> isMonitoredBy;

	/**
	 * The cached value of the '{@link #getIsControlledBy() <em>Is Controlled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsControlledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> isControlledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.OBJECT__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariability(Variability newVariability, NotificationChain msgs) {
		Variability oldVariability = variability;
		variability = newVariability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OBJECT__VARIABILITY, oldVariability, newVariability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(Variability newVariability) {
		if (newVariability != variability) {
			NotificationChain msgs = null;
			if (variability != null)
				msgs = ((InternalEObject)variability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OBJECT__VARIABILITY, null, msgs);
			if (newVariability != null)
				msgs = ((InternalEObject)newVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OBJECT__VARIABILITY, null, msgs);
			msgs = basicSetVariability(newVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OBJECT__VARIABILITY, newVariability, newVariability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OBJECT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getIsMonitoredBy() {
		if (isMonitoredBy == null) {
			isMonitoredBy = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this, IretPackage.OBJECT__IS_MONITORED_BY, IretPackage.AGENT__MONITORS);
		}
		return isMonitoredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getIsControlledBy() {
		if (isControlledBy == null) {
			isControlledBy = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this, IretPackage.OBJECT__IS_CONTROLLED_BY, IretPackage.AGENT__CONTROLS);
		}
		return isControlledBy;
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
			case IretPackage.OBJECT__IS_MONITORED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsMonitoredBy()).basicAdd(otherEnd, msgs);
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsControlledBy()).basicAdd(otherEnd, msgs);
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
			case IretPackage.OBJECT__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.OBJECT__VARIABILITY:
				return basicSetVariability(null, msgs);
			case IretPackage.OBJECT__IS_MONITORED_BY:
				return ((InternalEList<?>)getIsMonitoredBy()).basicRemove(otherEnd, msgs);
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				return ((InternalEList<?>)getIsControlledBy()).basicRemove(otherEnd, msgs);
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
			case IretPackage.OBJECT__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.OBJECT__VARIABILITY:
				return getVariability();
			case IretPackage.OBJECT__ID:
				return getId();
			case IretPackage.OBJECT__NAME:
				return getName();
			case IretPackage.OBJECT__IS_MONITORED_BY:
				return getIsMonitoredBy();
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				return getIsControlledBy();
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
			case IretPackage.OBJECT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.OBJECT__VARIABILITY:
				setVariability((Variability)newValue);
				return;
			case IretPackage.OBJECT__ID:
				setId((Integer)newValue);
				return;
			case IretPackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case IretPackage.OBJECT__IS_MONITORED_BY:
				getIsMonitoredBy().clear();
				getIsMonitoredBy().addAll((Collection<? extends Agent>)newValue);
				return;
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				getIsControlledBy().clear();
				getIsControlledBy().addAll((Collection<? extends Agent>)newValue);
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
			case IretPackage.OBJECT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.OBJECT__VARIABILITY:
				setVariability((Variability)null);
				return;
			case IretPackage.OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case IretPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IretPackage.OBJECT__IS_MONITORED_BY:
				getIsMonitoredBy().clear();
				return;
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				getIsControlledBy().clear();
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
			case IretPackage.OBJECT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.OBJECT__VARIABILITY:
				return variability != null;
			case IretPackage.OBJECT__ID:
				return id != ID_EDEFAULT;
			case IretPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IretPackage.OBJECT__IS_MONITORED_BY:
				return isMonitoredBy != null && !isMonitoredBy.isEmpty();
			case IretPackage.OBJECT__IS_CONTROLLED_BY:
				return isControlledBy != null && !isControlledBy.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
