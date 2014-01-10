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
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.AgentImpl#getOperat <em>Operat</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AgentImpl#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AgentImpl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends ObjectImpl implements Agent {
	/**
	 * The cached value of the '{@link #getOperat() <em>Operat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperat()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operat;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<eu.indenica.iret.Object> monitors;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<eu.indenica.iret.Object> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperat() {
		if (operat == null) {
			operat = new EObjectResolvingEList<Operation>(Operation.class, this, IretPackage.AGENT__OPERAT);
		}
		return operat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<eu.indenica.iret.Object> getMonitors() {
		if (monitors == null) {
			monitors = new EObjectWithInverseResolvingEList.ManyInverse<eu.indenica.iret.Object>(eu.indenica.iret.Object.class, this, IretPackage.AGENT__MONITORS, IretPackage.OBJECT__IS_MONITORED_BY);
		}
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<eu.indenica.iret.Object> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList.ManyInverse<eu.indenica.iret.Object>(eu.indenica.iret.Object.class, this, IretPackage.AGENT__CONTROLS, IretPackage.OBJECT__IS_CONTROLLED_BY);
		}
		return controls;
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
			case IretPackage.AGENT__MONITORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMonitors()).basicAdd(otherEnd, msgs);
			case IretPackage.AGENT__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
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
			case IretPackage.AGENT__MONITORS:
				return ((InternalEList<?>)getMonitors()).basicRemove(otherEnd, msgs);
			case IretPackage.AGENT__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case IretPackage.AGENT__OPERAT:
				return getOperat();
			case IretPackage.AGENT__MONITORS:
				return getMonitors();
			case IretPackage.AGENT__CONTROLS:
				return getControls();
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
			case IretPackage.AGENT__OPERAT:
				getOperat().clear();
				getOperat().addAll((Collection<? extends Operation>)newValue);
				return;
			case IretPackage.AGENT__MONITORS:
				getMonitors().clear();
				getMonitors().addAll((Collection<? extends eu.indenica.iret.Object>)newValue);
				return;
			case IretPackage.AGENT__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends eu.indenica.iret.Object>)newValue);
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
			case IretPackage.AGENT__OPERAT:
				getOperat().clear();
				return;
			case IretPackage.AGENT__MONITORS:
				getMonitors().clear();
				return;
			case IretPackage.AGENT__CONTROLS:
				getControls().clear();
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
			case IretPackage.AGENT__OPERAT:
				return operat != null && !operat.isEmpty();
			case IretPackage.AGENT__MONITORS:
				return monitors != null && !monitors.isEmpty();
			case IretPackage.AGENT__CONTROLS:
				return controls != null && !controls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
