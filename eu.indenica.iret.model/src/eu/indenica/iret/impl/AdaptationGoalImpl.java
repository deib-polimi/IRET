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

import eu.indenica.iret.Action;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.FormalDefinition;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getMaxActivations <em>Max Activations</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.AdaptationGoalImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptationGoalImpl extends EObjectImpl implements AdaptationGoal {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getMaxActivations() <em>Max Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActivations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACTIVATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxActivations() <em>Max Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActivations()
	 * @generated
	 * @ordered
	 */
	protected int maxActivations = MAX_ACTIVATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition trigger;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalDefinition> condition;

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralGoal> help;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.ADAPTATION_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.ADAPTATION_GOAL__DERIVED_FROM);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__VARIABILITY, oldVariability, newVariability);
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
				msgs = ((InternalEObject)variability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.ADAPTATION_GOAL__VARIABILITY, null, msgs);
			if (newVariability != null)
				msgs = ((InternalEObject)newVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.ADAPTATION_GOAL__VARIABILITY, null, msgs);
			msgs = basicSetVariability(newVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__VARIABILITY, newVariability, newVariability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxActivations() {
		return maxActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActivations(int newMaxActivations) {
		int oldMaxActivations = maxActivations;
		maxActivations = newMaxActivations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__MAX_ACTIVATIONS, oldMaxActivations, maxActivations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(FormalDefinition newTrigger, NotificationChain msgs) {
		FormalDefinition oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(FormalDefinition newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.ADAPTATION_GOAL__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.ADAPTATION_GOAL__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.ADAPTATION_GOAL__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalDefinition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<FormalDefinition>(FormalDefinition.class, this, IretPackage.ADAPTATION_GOAL__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviouralGoal> getHelp() {
		if (help == null) {
			help = new EObjectResolvingEList<BehaviouralGoal>(BehaviouralGoal.class, this, IretPackage.ADAPTATION_GOAL__HELP);
		}
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Action>(Action.class, this, IretPackage.ADAPTATION_GOAL__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.ADAPTATION_GOAL__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.ADAPTATION_GOAL__VARIABILITY:
				return basicSetVariability(null, msgs);
			case IretPackage.ADAPTATION_GOAL__TRIGGER:
				return basicSetTrigger(null, msgs);
			case IretPackage.ADAPTATION_GOAL__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
			case IretPackage.ADAPTATION_GOAL__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.ADAPTATION_GOAL__VARIABILITY:
				return getVariability();
			case IretPackage.ADAPTATION_GOAL__PRIORITY:
				return getPriority();
			case IretPackage.ADAPTATION_GOAL__DESCRIPTION:
				return getDescription();
			case IretPackage.ADAPTATION_GOAL__NAME:
				return getName();
			case IretPackage.ADAPTATION_GOAL__ID:
				return getId();
			case IretPackage.ADAPTATION_GOAL__MAX_ACTIVATIONS:
				return getMaxActivations();
			case IretPackage.ADAPTATION_GOAL__TRIGGER:
				return getTrigger();
			case IretPackage.ADAPTATION_GOAL__CONDITION:
				return getCondition();
			case IretPackage.ADAPTATION_GOAL__HELP:
				return getHelp();
			case IretPackage.ADAPTATION_GOAL__ACTIONS:
				return getActions();
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
			case IretPackage.ADAPTATION_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__VARIABILITY:
				setVariability((Variability)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__NAME:
				setName((String)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__ID:
				setId((Integer)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__MAX_ACTIVATIONS:
				setMaxActivations((Integer)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__TRIGGER:
				setTrigger((FormalDefinition)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends FormalDefinition>)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__HELP:
				getHelp().clear();
				getHelp().addAll((Collection<? extends BehaviouralGoal>)newValue);
				return;
			case IretPackage.ADAPTATION_GOAL__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case IretPackage.ADAPTATION_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.ADAPTATION_GOAL__VARIABILITY:
				setVariability((Variability)null);
				return;
			case IretPackage.ADAPTATION_GOAL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case IretPackage.ADAPTATION_GOAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IretPackage.ADAPTATION_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IretPackage.ADAPTATION_GOAL__ID:
				setId(ID_EDEFAULT);
				return;
			case IretPackage.ADAPTATION_GOAL__MAX_ACTIVATIONS:
				setMaxActivations(MAX_ACTIVATIONS_EDEFAULT);
				return;
			case IretPackage.ADAPTATION_GOAL__TRIGGER:
				setTrigger((FormalDefinition)null);
				return;
			case IretPackage.ADAPTATION_GOAL__CONDITION:
				getCondition().clear();
				return;
			case IretPackage.ADAPTATION_GOAL__HELP:
				getHelp().clear();
				return;
			case IretPackage.ADAPTATION_GOAL__ACTIONS:
				getActions().clear();
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
			case IretPackage.ADAPTATION_GOAL__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.ADAPTATION_GOAL__VARIABILITY:
				return variability != null;
			case IretPackage.ADAPTATION_GOAL__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case IretPackage.ADAPTATION_GOAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IretPackage.ADAPTATION_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IretPackage.ADAPTATION_GOAL__ID:
				return id != ID_EDEFAULT;
			case IretPackage.ADAPTATION_GOAL__MAX_ACTIVATIONS:
				return maxActivations != MAX_ACTIVATIONS_EDEFAULT;
			case IretPackage.ADAPTATION_GOAL__TRIGGER:
				return trigger != null;
			case IretPackage.ADAPTATION_GOAL__CONDITION:
				return condition != null && !condition.isEmpty();
			case IretPackage.ADAPTATION_GOAL__HELP:
				return help != null && !help.isEmpty();
			case IretPackage.ADAPTATION_GOAL__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", maxActivations: ");
		result.append(maxActivations);
		result.append(')');
		return result.toString();
	}

} //AdaptationGoalImpl
