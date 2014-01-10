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
import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;
import eu.indenica.iret.RefinementLink;

import eu.indenica.iret.TreeElement;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioural Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getContributesOn <em>Contributes On</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getOperationalizedBy <em>Operationalized By</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getFormalDefinition <em>Formal Definition</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#isSoft <em>Soft</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getSatisfaction <em>Satisfaction</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#isRollback <em>Rollback</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getContributedBy <em>Contributed By</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.BehaviouralGoalImpl#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviouralGoalImpl extends EObjectImpl implements BehaviouralGoal {
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
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementLink> refines;

	/**
	 * The default value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean leaf = LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributesOn() <em>Contributes On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ContributionLink> contributesOn;

	/**
	 * The cached value of the '{@link #getOperationalizedBy() <em>Operationalized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operationalizedBy;

	/**
	 * The cached value of the '{@link #getFormalDefinition() <em>Formal Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalDefinition()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition formalDefinition;

	/**
	 * The default value of the '{@link #isSoft() <em>Soft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSoft() <em>Soft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoft()
	 * @generated
	 * @ordered
	 */
	protected boolean soft = SOFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfaction() <em>Satisfaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfaction()
	 * @generated
	 * @ordered
	 */
	protected static final float SATISFACTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSatisfaction() <em>Satisfaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfaction()
	 * @generated
	 * @ordered
	 */
	protected float satisfaction = SATISFACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRollback() <em>Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRollback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROLLBACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRollback() <em>Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRollback()
	 * @generated
	 * @ordered
	 */
	protected boolean rollback = ROLLBACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributedBy() <em>Contributed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ContributionLink> contributedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviouralGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.BEHAVIOURAL_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__VARIABILITY, oldVariability, newVariability);
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
				msgs = ((InternalEObject)variability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.BEHAVIOURAL_GOAL__VARIABILITY, null, msgs);
			if (newVariability != null)
				msgs = ((InternalEObject)newVariability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.BEHAVIOURAL_GOAL__VARIABILITY, null, msgs);
			msgs = basicSetVariability(newVariability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__VARIABILITY, newVariability, newVariability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaf(boolean newLeaf) {
		boolean oldLeaf = leaf;
		leaf = newLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__LEAF, oldLeaf, leaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementLink getRefinedBy() {
		if (eContainerFeatureID() != IretPackage.BEHAVIOURAL_GOAL__REFINED_BY) return null;
		return (RefinementLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefinedBy(RefinementLink newRefinedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRefinedBy, IretPackage.BEHAVIOURAL_GOAL__REFINED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedBy(RefinementLink newRefinedBy) {
		if (newRefinedBy != eInternalContainer() || (eContainerFeatureID() != IretPackage.BEHAVIOURAL_GOAL__REFINED_BY && newRefinedBy != null)) {
			if (EcoreUtil.isAncestor(this, newRefinedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefinedBy != null)
				msgs = ((InternalEObject)newRefinedBy).eInverseAdd(this, IretPackage.REFINEMENT_LINK__REFINED_GOAL, RefinementLink.class, msgs);
			msgs = basicSetRefinedBy(newRefinedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__REFINED_BY, newRefinedBy, newRefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementLink> getRefines() {
		if (refines == null) {
			refines = new EObjectWithInverseResolvingEList.ManyInverse<RefinementLink>(RefinementLink.class, this, IretPackage.BEHAVIOURAL_GOAL__REFINES, IretPackage.REFINEMENT_LINK__REFINING_GOALS);
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContributionLink> getContributesOn() {
		if (contributesOn == null) {
			contributesOn = new EObjectWithInverseResolvingEList<ContributionLink>(ContributionLink.class, this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON, IretPackage.CONTRIBUTION_LINK__CONTRIBUTOR);
		}
		return contributesOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperationalizedBy() {
		if (operationalizedBy == null) {
			operationalizedBy = new EObjectResolvingEList<Operation>(Operation.class, this, IretPackage.BEHAVIOURAL_GOAL__OPERATIONALIZED_BY);
		}
		return operationalizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getFormalDefinition() {
		return formalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalDefinition(FormalDefinition newFormalDefinition, NotificationChain msgs) {
		FormalDefinition oldFormalDefinition = formalDefinition;
		formalDefinition = newFormalDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION, oldFormalDefinition, newFormalDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalDefinition(FormalDefinition newFormalDefinition) {
		if (newFormalDefinition != formalDefinition) {
			NotificationChain msgs = null;
			if (formalDefinition != null)
				msgs = ((InternalEObject)formalDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION, null, msgs);
			if (newFormalDefinition != null)
				msgs = ((InternalEObject)newFormalDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION, null, msgs);
			msgs = basicSetFormalDefinition(newFormalDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION, newFormalDefinition, newFormalDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSoft() {
		return soft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoft(boolean newSoft) {
		boolean oldSoft = soft;
		soft = newSoft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__SOFT, oldSoft, soft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSatisfaction() {
		return satisfaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfaction(float newSatisfaction) {
		float oldSatisfaction = satisfaction;
		satisfaction = newSatisfaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__SATISFACTION, oldSatisfaction, satisfaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRollback() {
		return rollback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollback(boolean newRollback) {
		boolean oldRollback = rollback;
		rollback = newRollback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.BEHAVIOURAL_GOAL__ROLLBACK, oldRollback, rollback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContributionLink> getContributedBy() {
		if (contributedBy == null) {
			contributedBy = new EObjectWithInverseResolvingEList<ContributionLink>(ContributionLink.class, this, IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY, IretPackage.CONTRIBUTION_LINK__DESTINATION_GOAL);
		}
		return contributedBy;
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
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefines()).basicAdd(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributesOn()).basicAdd(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributedBy()).basicAdd(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRefinedBy((RefinementLink)otherEnd, msgs);
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
			case IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__VARIABILITY:
				return basicSetVariability(null, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				return ((InternalEList<?>)getRefines()).basicRemove(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				return ((InternalEList<?>)getContributesOn()).basicRemove(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION:
				return basicSetFormalDefinition(null, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				return ((InternalEList<?>)getContributedBy()).basicRemove(otherEnd, msgs);
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				return basicSetRefinedBy(null, msgs);
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
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				return eInternalContainer().eInverseRemove(this, IretPackage.REFINEMENT_LINK__REFINED_GOAL, RefinementLink.class, msgs);
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
			case IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.BEHAVIOURAL_GOAL__VARIABILITY:
				return getVariability();
			case IretPackage.BEHAVIOURAL_GOAL__PRIORITY:
				return getPriority();
			case IretPackage.BEHAVIOURAL_GOAL__DESCRIPTION:
				return getDescription();
			case IretPackage.BEHAVIOURAL_GOAL__NAME:
				return getName();
			case IretPackage.BEHAVIOURAL_GOAL__ID:
				return getId();
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				return getRefines();
			case IretPackage.BEHAVIOURAL_GOAL__LEAF:
				return isLeaf();
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				return getContributesOn();
			case IretPackage.BEHAVIOURAL_GOAL__OPERATIONALIZED_BY:
				return getOperationalizedBy();
			case IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION:
				return getFormalDefinition();
			case IretPackage.BEHAVIOURAL_GOAL__SOFT:
				return isSoft();
			case IretPackage.BEHAVIOURAL_GOAL__SATISFACTION:
				return getSatisfaction();
			case IretPackage.BEHAVIOURAL_GOAL__ROLLBACK:
				return isRollback();
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				return getContributedBy();
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				return getRefinedBy();
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
			case IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__VARIABILITY:
				setVariability((Variability)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__NAME:
				setName((String)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__ID:
				setId((Integer)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends RefinementLink>)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__LEAF:
				setLeaf((Boolean)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				getContributesOn().clear();
				getContributesOn().addAll((Collection<? extends ContributionLink>)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__OPERATIONALIZED_BY:
				getOperationalizedBy().clear();
				getOperationalizedBy().addAll((Collection<? extends Operation>)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION:
				setFormalDefinition((FormalDefinition)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__SOFT:
				setSoft((Boolean)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__SATISFACTION:
				setSatisfaction((Float)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__ROLLBACK:
				setRollback((Boolean)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				getContributedBy().clear();
				getContributedBy().addAll((Collection<? extends ContributionLink>)newValue);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				setRefinedBy((RefinementLink)newValue);
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
			case IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.BEHAVIOURAL_GOAL__VARIABILITY:
				setVariability((Variability)null);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__ID:
				setId(ID_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				getRefines().clear();
				return;
			case IretPackage.BEHAVIOURAL_GOAL__LEAF:
				setLeaf(LEAF_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				getContributesOn().clear();
				return;
			case IretPackage.BEHAVIOURAL_GOAL__OPERATIONALIZED_BY:
				getOperationalizedBy().clear();
				return;
			case IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION:
				setFormalDefinition((FormalDefinition)null);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__SOFT:
				setSoft(SOFT_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__SATISFACTION:
				setSatisfaction(SATISFACTION_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__ROLLBACK:
				setRollback(ROLLBACK_EDEFAULT);
				return;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				getContributedBy().clear();
				return;
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				setRefinedBy((RefinementLink)null);
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
			case IretPackage.BEHAVIOURAL_GOAL__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.BEHAVIOURAL_GOAL__VARIABILITY:
				return variability != null;
			case IretPackage.BEHAVIOURAL_GOAL__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IretPackage.BEHAVIOURAL_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IretPackage.BEHAVIOURAL_GOAL__ID:
				return id != ID_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__REFINES:
				return refines != null && !refines.isEmpty();
			case IretPackage.BEHAVIOURAL_GOAL__LEAF:
				return leaf != LEAF_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTES_ON:
				return contributesOn != null && !contributesOn.isEmpty();
			case IretPackage.BEHAVIOURAL_GOAL__OPERATIONALIZED_BY:
				return operationalizedBy != null && !operationalizedBy.isEmpty();
			case IretPackage.BEHAVIOURAL_GOAL__FORMAL_DEFINITION:
				return formalDefinition != null;
			case IretPackage.BEHAVIOURAL_GOAL__SOFT:
				return soft != SOFT_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__SATISFACTION:
				return satisfaction != SATISFACTION_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__ROLLBACK:
				return rollback != ROLLBACK_EDEFAULT;
			case IretPackage.BEHAVIOURAL_GOAL__CONTRIBUTED_BY:
				return contributedBy != null && !contributedBy.isEmpty();
			case IretPackage.BEHAVIOURAL_GOAL__REFINED_BY:
				return getRefinedBy() != null;
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
				case IretPackage.BEHAVIOURAL_GOAL__REFINES: return IretPackage.TREE_ELEMENT__REFINES;
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
				case IretPackage.TREE_ELEMENT__REFINES: return IretPackage.BEHAVIOURAL_GOAL__REFINES;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", leaf: ");
		result.append(leaf);
		result.append(", soft: ");
		result.append(soft);
		result.append(", satisfaction: ");
		result.append(satisfaction);
		result.append(", rollback: ");
		result.append(rollback);
		result.append(')');
		return result.toString();
	}

} //BehaviouralGoalImpl
