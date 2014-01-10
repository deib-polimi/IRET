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
import eu.indenica.iret.Agent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasRLink <em>Has RLink</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasBehaviouralGoal <em>Has Behavioural Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasAdaptationGoal <em>Has Adaptation Goal</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasOper <em>Has Oper</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasEntity <em>Has Entity</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasAgent <em>Has Agent</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getHasCLink <em>Has CLink</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.GoalDiagramImpl#getIsViewOf <em>Is View Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalDiagramImpl extends EObjectImpl implements GoalDiagram {
	/**
	 * The cached value of the '{@link #getHasRLink() <em>Has RLink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRLink()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementLink> hasRLink;

	/**
	 * The cached value of the '{@link #getHasBehaviouralGoal() <em>Has Behavioural Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBehaviouralGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralGoal> hasBehaviouralGoal;

	/**
	 * The cached value of the '{@link #getHasAdaptationGoal() <em>Has Adaptation Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAdaptationGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationGoal> hasAdaptationGoal;

	/**
	 * The cached value of the '{@link #getHasEvent() <em>Has Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEvent;

	/**
	 * The cached value of the '{@link #getHasOper() <em>Has Oper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOper()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> hasOper;

	/**
	 * The cached value of the '{@link #getHasEntity() <em>Has Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> hasEntity;

	/**
	 * The cached value of the '{@link #getHasAgent() <em>Has Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> hasAgent;

	/**
	 * The cached value of the '{@link #getHasAction() <em>Has Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> hasAction;

	/**
	 * The cached value of the '{@link #getHasCLink() <em>Has CLink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCLink()
	 * @generated
	 * @ordered
	 */
	protected EList<ContributionLink> hasCLink;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.GOAL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementLink> getHasRLink() {
		if (hasRLink == null) {
			hasRLink = new EObjectContainmentEList<RefinementLink>(RefinementLink.class, this, IretPackage.GOAL_DIAGRAM__HAS_RLINK);
		}
		return hasRLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviouralGoal> getHasBehaviouralGoal() {
		if (hasBehaviouralGoal == null) {
			hasBehaviouralGoal = new EObjectContainmentEList<BehaviouralGoal>(BehaviouralGoal.class, this, IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL);
		}
		return hasBehaviouralGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationGoal> getHasAdaptationGoal() {
		if (hasAdaptationGoal == null) {
			hasAdaptationGoal = new EObjectContainmentEList<AdaptationGoal>(AdaptationGoal.class, this, IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL);
		}
		return hasAdaptationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEvent() {
		if (hasEvent == null) {
			hasEvent = new EObjectContainmentEList<Event>(Event.class, this, IretPackage.GOAL_DIAGRAM__HAS_EVENT);
		}
		return hasEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getHasOper() {
		if (hasOper == null) {
			hasOper = new EObjectContainmentEList<Operation>(Operation.class, this, IretPackage.GOAL_DIAGRAM__HAS_OPER);
		}
		return hasOper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getHasEntity() {
		if (hasEntity == null) {
			hasEntity = new EObjectContainmentEList<Entity>(Entity.class, this, IretPackage.GOAL_DIAGRAM__HAS_ENTITY);
		}
		return hasEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getHasAgent() {
		if (hasAgent == null) {
			hasAgent = new EObjectContainmentEList<Agent>(Agent.class, this, IretPackage.GOAL_DIAGRAM__HAS_AGENT);
		}
		return hasAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getHasAction() {
		if (hasAction == null) {
			hasAction = new EObjectContainmentEList<Action>(Action.class, this, IretPackage.GOAL_DIAGRAM__HAS_ACTION);
		}
		return hasAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContributionLink> getHasCLink() {
		if (hasCLink == null) {
			hasCLink = new EObjectContainmentEList<ContributionLink>(ContributionLink.class, this, IretPackage.GOAL_DIAGRAM__HAS_CLINK);
		}
		return hasCLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.GOAL_DIAGRAM__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.GOAL_DIAGRAM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IreneModel getIsViewOf() {
		if (eContainerFeatureID() != IretPackage.GOAL_DIAGRAM__IS_VIEW_OF) return null;
		return (IreneModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsViewOf(IreneModel newIsViewOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsViewOf, IretPackage.GOAL_DIAGRAM__IS_VIEW_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsViewOf(IreneModel newIsViewOf) {
		if (newIsViewOf != eInternalContainer() || (eContainerFeatureID() != IretPackage.GOAL_DIAGRAM__IS_VIEW_OF && newIsViewOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsViewOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsViewOf != null)
				msgs = ((InternalEObject)newIsViewOf).eInverseAdd(this, IretPackage.IRENE_MODEL__HAS_VIEW, IreneModel.class, msgs);
			msgs = basicSetIsViewOf(newIsViewOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.GOAL_DIAGRAM__IS_VIEW_OF, newIsViewOf, newIsViewOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsViewOf((IreneModel)otherEnd, msgs);
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
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
				return ((InternalEList<?>)getHasRLink()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
				return ((InternalEList<?>)getHasBehaviouralGoal()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
				return ((InternalEList<?>)getHasAdaptationGoal()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
				return ((InternalEList<?>)getHasEvent()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
				return ((InternalEList<?>)getHasOper()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
				return ((InternalEList<?>)getHasEntity()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
				return ((InternalEList<?>)getHasAgent()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
				return ((InternalEList<?>)getHasAction()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
				return ((InternalEList<?>)getHasCLink()).basicRemove(otherEnd, msgs);
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				return basicSetIsViewOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				return eInternalContainer().eInverseRemove(this, IretPackage.IRENE_MODEL__HAS_VIEW, IreneModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
				return getHasRLink();
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
				return getHasBehaviouralGoal();
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
				return getHasAdaptationGoal();
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
				return getHasEvent();
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
				return getHasOper();
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
				return getHasEntity();
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
				return getHasAgent();
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
				return getHasAction();
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
				return getHasCLink();
			case IretPackage.GOAL_DIAGRAM__READONLY:
				return isReadonly();
			case IretPackage.GOAL_DIAGRAM__LABEL:
				return getLabel();
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				return getIsViewOf();
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
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
				getHasRLink().clear();
				getHasRLink().addAll((Collection<? extends RefinementLink>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
				getHasBehaviouralGoal().clear();
				getHasBehaviouralGoal().addAll((Collection<? extends BehaviouralGoal>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
				getHasAdaptationGoal().clear();
				getHasAdaptationGoal().addAll((Collection<? extends AdaptationGoal>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
				getHasEvent().clear();
				getHasEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
				getHasOper().clear();
				getHasOper().addAll((Collection<? extends Operation>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
				getHasEntity().clear();
				getHasEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
				getHasAgent().clear();
				getHasAgent().addAll((Collection<? extends Agent>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
				getHasAction().clear();
				getHasAction().addAll((Collection<? extends Action>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
				getHasCLink().clear();
				getHasCLink().addAll((Collection<? extends ContributionLink>)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__LABEL:
				setLabel((String)newValue);
				return;
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				setIsViewOf((IreneModel)newValue);
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
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
				getHasRLink().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
				getHasBehaviouralGoal().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
				getHasAdaptationGoal().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
				getHasEvent().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
				getHasOper().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
				getHasEntity().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
				getHasAgent().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
				getHasAction().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
				getHasCLink().clear();
				return;
			case IretPackage.GOAL_DIAGRAM__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case IretPackage.GOAL_DIAGRAM__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				setIsViewOf((IreneModel)null);
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
			case IretPackage.GOAL_DIAGRAM__HAS_RLINK:
				return hasRLink != null && !hasRLink.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL:
				return hasBehaviouralGoal != null && !hasBehaviouralGoal.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_ADAPTATION_GOAL:
				return hasAdaptationGoal != null && !hasAdaptationGoal.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_EVENT:
				return hasEvent != null && !hasEvent.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_OPER:
				return hasOper != null && !hasOper.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_ENTITY:
				return hasEntity != null && !hasEntity.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_AGENT:
				return hasAgent != null && !hasAgent.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_ACTION:
				return hasAction != null && !hasAction.isEmpty();
			case IretPackage.GOAL_DIAGRAM__HAS_CLINK:
				return hasCLink != null && !hasCLink.isEmpty();
			case IretPackage.GOAL_DIAGRAM__READONLY:
				return readonly != READONLY_EDEFAULT;
			case IretPackage.GOAL_DIAGRAM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case IretPackage.GOAL_DIAGRAM__IS_VIEW_OF:
				return getIsViewOf() != null;
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
		result.append(" (readonly: ");
		result.append(readonly);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //GoalDiagramImpl
