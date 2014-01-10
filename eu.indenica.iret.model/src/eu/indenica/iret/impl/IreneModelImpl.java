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

import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.IretPackage;

import eu.indenica.iret.integration.easy.Variability;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irene Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.IreneModelImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.IreneModelImpl#getHasView <em>Has View</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.IreneModelImpl#getEasyVariability <em>Easy Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IreneModelImpl extends EObjectImpl implements IreneModel {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<IreneElement> contains;

	/**
	 * The cached value of the '{@link #getHasView() <em>Has View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasView()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalDiagram> hasView;

	/**
	 * The cached value of the '{@link #getEasyVariability() <em>Easy Variability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEasyVariability()
	 * @generated
	 * @ordered
	 */
	protected Variability easyVariability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IreneModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.IRENE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.IRENE_MODEL__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalDiagram> getHasView() {
		if (hasView == null) {
			hasView = new EObjectContainmentWithInverseEList<GoalDiagram>(GoalDiagram.class, this, IretPackage.IRENE_MODEL__HAS_VIEW, IretPackage.GOAL_DIAGRAM__IS_VIEW_OF);
		}
		return hasView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability getEasyVariability() {
		return easyVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEasyVariability(Variability newEasyVariability, NotificationChain msgs) {
		Variability oldEasyVariability = easyVariability;
		easyVariability = newEasyVariability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.IRENE_MODEL__EASY_VARIABILITY, oldEasyVariability, newEasyVariability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEasyVariability(Variability newEasyVariability) {
		if (newEasyVariability != easyVariability) {
			NotificationChain msgs = null;
			if (easyVariability != null)
				msgs = ((InternalEObject)easyVariability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.IRENE_MODEL__EASY_VARIABILITY, null, msgs);
			if (newEasyVariability != null)
				msgs = ((InternalEObject)newEasyVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.IRENE_MODEL__EASY_VARIABILITY, null, msgs);
			msgs = basicSetEasyVariability(newEasyVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.IRENE_MODEL__EASY_VARIABILITY, newEasyVariability, newEasyVariability));
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
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasView()).basicAdd(otherEnd, msgs);
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
			case IretPackage.IRENE_MODEL__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				return ((InternalEList<?>)getHasView()).basicRemove(otherEnd, msgs);
			case IretPackage.IRENE_MODEL__EASY_VARIABILITY:
				return basicSetEasyVariability(null, msgs);
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
			case IretPackage.IRENE_MODEL__CONTAINS:
				return getContains();
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				return getHasView();
			case IretPackage.IRENE_MODEL__EASY_VARIABILITY:
				return getEasyVariability();
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
			case IretPackage.IRENE_MODEL__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				getHasView().clear();
				getHasView().addAll((Collection<? extends GoalDiagram>)newValue);
				return;
			case IretPackage.IRENE_MODEL__EASY_VARIABILITY:
				setEasyVariability((Variability)newValue);
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
			case IretPackage.IRENE_MODEL__CONTAINS:
				getContains().clear();
				return;
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				getHasView().clear();
				return;
			case IretPackage.IRENE_MODEL__EASY_VARIABILITY:
				setEasyVariability((Variability)null);
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
			case IretPackage.IRENE_MODEL__CONTAINS:
				return contains != null && !contains.isEmpty();
			case IretPackage.IRENE_MODEL__HAS_VIEW:
				return hasView != null && !hasView.isEmpty();
			case IretPackage.IRENE_MODEL__EASY_VARIABILITY:
				return easyVariability != null;
		}
		return super.eIsSet(featureID);
	}

} //IreneModelImpl
