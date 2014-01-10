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
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IretPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.ContributionLinkImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ContributionLinkImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ContributionLinkImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ContributionLinkImpl#getDestinationGoal <em>Destination Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.ContributionLinkImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionLinkImpl extends EObjectImpl implements ContributionLink {
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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected float weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected BehaviouralGoal contributor;

	/**
	 * The cached value of the '{@link #getDestinationGoal() <em>Destination Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationGoal()
	 * @generated
	 * @ordered
	 */
	protected BehaviouralGoal destinationGoal;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.CONTRIBUTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.CONTRIBUTION_LINK__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(float newWeight) {
		float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal getContributor() {
		if (contributor != null && contributor.eIsProxy()) {
			InternalEObject oldContributor = (InternalEObject)contributor;
			contributor = (BehaviouralGoal)eResolveProxy(oldContributor);
			if (contributor != oldContributor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR, oldContributor, contributor));
			}
		}
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal basicGetContributor() {
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributor(BehaviouralGoal newContributor, NotificationChain msgs) {
		BehaviouralGoal oldContributor = contributor;
		contributor = newContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR, oldContributor, newContributor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributor(BehaviouralGoal newContributor) {
		if (newContributor != contributor) {
			NotificationChain msgs = null;
			if (contributor != null)
				msgs = ((InternalEObject)contributor).eInverseRemove(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON, BehaviouralGoal.class, msgs);
			if (newContributor != null)
				msgs = ((InternalEObject)newContributor).eInverseAdd(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON, BehaviouralGoal.class, msgs);
			msgs = basicSetContributor(newContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR, newContributor, newContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal getDestinationGoal() {
		if (destinationGoal != null && destinationGoal.eIsProxy()) {
			InternalEObject oldDestinationGoal = (InternalEObject)destinationGoal;
			destinationGoal = (BehaviouralGoal)eResolveProxy(oldDestinationGoal);
			if (destinationGoal != oldDestinationGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL, oldDestinationGoal, destinationGoal));
			}
		}
		return destinationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal basicGetDestinationGoal() {
		return destinationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationGoal(BehaviouralGoal newDestinationGoal, NotificationChain msgs) {
		BehaviouralGoal oldDestinationGoal = destinationGoal;
		destinationGoal = newDestinationGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL, oldDestinationGoal, newDestinationGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationGoal(BehaviouralGoal newDestinationGoal) {
		if (newDestinationGoal != destinationGoal) {
			NotificationChain msgs = null;
			if (destinationGoal != null)
				msgs = ((InternalEObject)destinationGoal).eInverseRemove(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY, BehaviouralGoal.class, msgs);
			if (newDestinationGoal != null)
				msgs = ((InternalEObject)newDestinationGoal).eInverseAdd(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY, BehaviouralGoal.class, msgs);
			msgs = basicSetDestinationGoal(newDestinationGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL, newDestinationGoal, newDestinationGoal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.CONTRIBUTION_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				if (contributor != null)
					msgs = ((InternalEObject)contributor).eInverseRemove(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON, BehaviouralGoal.class, msgs);
				return basicSetContributor((BehaviouralGoal)otherEnd, msgs);
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				if (destinationGoal != null)
					msgs = ((InternalEObject)destinationGoal).eInverseRemove(this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY, BehaviouralGoal.class, msgs);
				return basicSetDestinationGoal((BehaviouralGoal)otherEnd, msgs);
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
			case IretPackage.CONTRIBUTION_LINK__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				return basicSetContributor(null, msgs);
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				return basicSetDestinationGoal(null, msgs);
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
			case IretPackage.CONTRIBUTION_LINK__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.CONTRIBUTION_LINK__WEIGHT:
				return getWeight();
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				if (resolve) return getContributor();
				return basicGetContributor();
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				if (resolve) return getDestinationGoal();
				return basicGetDestinationGoal();
			case IretPackage.CONTRIBUTION_LINK__ID:
				return getId();
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
			case IretPackage.CONTRIBUTION_LINK__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.CONTRIBUTION_LINK__WEIGHT:
				setWeight((Float)newValue);
				return;
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				setContributor((BehaviouralGoal)newValue);
				return;
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				setDestinationGoal((BehaviouralGoal)newValue);
				return;
			case IretPackage.CONTRIBUTION_LINK__ID:
				setId((Integer)newValue);
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
			case IretPackage.CONTRIBUTION_LINK__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.CONTRIBUTION_LINK__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				setContributor((BehaviouralGoal)null);
				return;
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				setDestinationGoal((BehaviouralGoal)null);
				return;
			case IretPackage.CONTRIBUTION_LINK__ID:
				setId(ID_EDEFAULT);
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
			case IretPackage.CONTRIBUTION_LINK__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.CONTRIBUTION_LINK__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR:
				return contributor != null;
			case IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL:
				return destinationGoal != null;
			case IretPackage.CONTRIBUTION_LINK__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ContributionLinkImpl
