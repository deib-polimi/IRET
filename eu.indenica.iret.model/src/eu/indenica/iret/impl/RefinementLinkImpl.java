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

import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.RefinementLink;

import eu.indenica.iret.TreeElement;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.RefinementLinkImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.RefinementLinkImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.RefinementLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.RefinementLinkImpl#getRefiningGoals <em>Refining Goals</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.RefinementLinkImpl#getRefinedGoal <em>Refined Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementLinkImpl extends EObjectImpl implements RefinementLink {
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
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementLink> refines;

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
	 * The cached value of the '{@link #getRefiningGoals() <em>Refining Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefiningGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeElement> refiningGoals;

	/**
	 * The cached value of the '{@link #getRefinedGoal() <em>Refined Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedGoal()
	 * @generated
	 * @ordered
	 */
	protected BehaviouralGoal refinedGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.REFINEMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.REFINEMENT_LINK__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementLink> getRefines() {
		if (refines == null) {
			refines = new EObjectWithInverseResolvingEList.ManyInverse<RefinementLink>(RefinementLink.class, this, IretPackage.REFINEMENT_LINK__REFINES, IretPackage.REFINEMENT_LINK__REFINING_GOALS);
		}
		return refines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.REFINEMENT_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeElement> getRefiningGoals() {
		if (refiningGoals == null) {
			refiningGoals = new EObjectWithInverseResolvingEList.ManyInverse<TreeElement>(TreeElement.class, this, IretPackage.REFINEMENT_LINK__REFINING_GOALS, IretPackage.TREE_ELEMENT__REFINES);
		}
		return refiningGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal getRefinedGoal() {
		return refinedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefinedGoal(BehaviouralGoal newRefinedGoal, NotificationChain msgs) {
		BehaviouralGoal oldRefinedGoal = refinedGoal;
		refinedGoal = newRefinedGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.REFINEMENT_LINK__REFINED_GOAL, oldRefinedGoal, newRefinedGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedGoal(BehaviouralGoal newRefinedGoal) {
		if (newRefinedGoal != refinedGoal) {
			NotificationChain msgs = null;
			if (refinedGoal != null)
				msgs = ((InternalEObject)refinedGoal).eInverseRemove(this, IretPackage.BEHAVIOURAL_GOAL__REFINED_BY, BehaviouralGoal.class, msgs);
			if (newRefinedGoal != null)
				msgs = ((InternalEObject)newRefinedGoal).eInverseAdd(this, IretPackage.BEHAVIOURAL_GOAL__REFINED_BY, BehaviouralGoal.class, msgs);
			msgs = basicSetRefinedGoal(newRefinedGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.REFINEMENT_LINK__REFINED_GOAL, newRefinedGoal, newRefinedGoal));
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
			case IretPackage.REFINEMENT_LINK__REFINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefines()).basicAdd(otherEnd, msgs);
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefiningGoals()).basicAdd(otherEnd, msgs);
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				if (refinedGoal != null)
					msgs = ((InternalEObject)refinedGoal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.REFINEMENT_LINK__REFINED_GOAL, null, msgs);
				return basicSetRefinedGoal((BehaviouralGoal)otherEnd, msgs);
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
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.REFINEMENT_LINK__REFINES:
				return ((InternalEList<?>)getRefines()).basicRemove(otherEnd, msgs);
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				return ((InternalEList<?>)getRefiningGoals()).basicRemove(otherEnd, msgs);
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				return basicSetRefinedGoal(null, msgs);
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
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.REFINEMENT_LINK__REFINES:
				return getRefines();
			case IretPackage.REFINEMENT_LINK__ID:
				return getId();
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				return getRefiningGoals();
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				return getRefinedGoal();
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
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.REFINEMENT_LINK__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends RefinementLink>)newValue);
				return;
			case IretPackage.REFINEMENT_LINK__ID:
				setId((Integer)newValue);
				return;
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				getRefiningGoals().clear();
				getRefiningGoals().addAll((Collection<? extends TreeElement>)newValue);
				return;
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				setRefinedGoal((BehaviouralGoal)newValue);
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
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.REFINEMENT_LINK__REFINES:
				getRefines().clear();
				return;
			case IretPackage.REFINEMENT_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				getRefiningGoals().clear();
				return;
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				setRefinedGoal((BehaviouralGoal)null);
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
			case IretPackage.REFINEMENT_LINK__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.REFINEMENT_LINK__REFINES:
				return refines != null && !refines.isEmpty();
			case IretPackage.REFINEMENT_LINK__ID:
				return id != ID_EDEFAULT;
			case IretPackage.REFINEMENT_LINK__REFINING_GOALS:
				return refiningGoals != null && !refiningGoals.isEmpty();
			case IretPackage.REFINEMENT_LINK__REFINED_GOAL:
				return refinedGoal != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TreeElement.class) {
			switch (derivedFeatureID) {
				case IretPackage.REFINEMENT_LINK__REFINES: return IretPackage.TREE_ELEMENT__REFINES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TreeElement.class) {
			switch (baseFeatureID) {
				case IretPackage.TREE_ELEMENT__REFINES: return IretPackage.REFINEMENT_LINK__REFINES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //RefinementLinkImpl
