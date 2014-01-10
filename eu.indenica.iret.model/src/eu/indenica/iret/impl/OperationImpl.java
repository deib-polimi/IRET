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

import eu.indenica.iret.Entity;
import eu.indenica.iret.Event;
import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Operation;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getDomPre <em>Dom Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getDomPost <em>Dom Post</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getReqPre <em>Req Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getReqPost <em>Req Post</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getTrigPre <em>Trig Pre</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getIn <em>In</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getOut <em>Out</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getMinExecTImes <em>Min Exec TImes</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getMaxExecTimes <em>Max Exec Times</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.indenica.iret.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
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
	 * The cached value of the '{@link #getDomPre() <em>Dom Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomPre()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition domPre;

	/**
	 * The cached value of the '{@link #getDomPost() <em>Dom Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomPost()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition domPost;

	/**
	 * The cached value of the '{@link #getReqPre() <em>Req Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqPre()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition reqPre;

	/**
	 * The cached value of the '{@link #getReqPost() <em>Req Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqPost()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition reqPost;

	/**
	 * The cached value of the '{@link #getTrigPre() <em>Trig Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigPre()
	 * @generated
	 * @ordered
	 */
	protected FormalDefinition trigPre;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> out;

	/**
	 * The cached value of the '{@link #getHasEvent() <em>Has Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEvent;

	/**
	 * The default value of the '{@link #getMinExecTImes() <em>Min Exec TImes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExecTImes()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EXEC_TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinExecTImes() <em>Min Exec TImes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExecTImes()
	 * @generated
	 * @ordered
	 */
	protected int minExecTImes = MIN_EXEC_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxExecTimes() <em>Max Exec Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExecTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EXEC_TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxExecTimes() <em>Max Exec Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExecTimes()
	 * @generated
	 * @ordered
	 */
	protected int maxExecTimes = MAX_EXEC_TIMES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IretPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IreneElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<IreneElement>(IreneElement.class, this, IretPackage.OPERATION__DERIVED_FROM);
		}
		return derivedFrom;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getDomPre() {
		return domPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomPre(FormalDefinition newDomPre, NotificationChain msgs) {
		FormalDefinition oldDomPre = domPre;
		domPre = newDomPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__DOM_PRE, oldDomPre, newDomPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomPre(FormalDefinition newDomPre) {
		if (newDomPre != domPre) {
			NotificationChain msgs = null;
			if (domPre != null)
				msgs = ((InternalEObject)domPre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__DOM_PRE, null, msgs);
			if (newDomPre != null)
				msgs = ((InternalEObject)newDomPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__DOM_PRE, null, msgs);
			msgs = basicSetDomPre(newDomPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__DOM_PRE, newDomPre, newDomPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getDomPost() {
		return domPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomPost(FormalDefinition newDomPost, NotificationChain msgs) {
		FormalDefinition oldDomPost = domPost;
		domPost = newDomPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__DOM_POST, oldDomPost, newDomPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomPost(FormalDefinition newDomPost) {
		if (newDomPost != domPost) {
			NotificationChain msgs = null;
			if (domPost != null)
				msgs = ((InternalEObject)domPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__DOM_POST, null, msgs);
			if (newDomPost != null)
				msgs = ((InternalEObject)newDomPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__DOM_POST, null, msgs);
			msgs = basicSetDomPost(newDomPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__DOM_POST, newDomPost, newDomPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getReqPre() {
		return reqPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReqPre(FormalDefinition newReqPre, NotificationChain msgs) {
		FormalDefinition oldReqPre = reqPre;
		reqPre = newReqPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__REQ_PRE, oldReqPre, newReqPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqPre(FormalDefinition newReqPre) {
		if (newReqPre != reqPre) {
			NotificationChain msgs = null;
			if (reqPre != null)
				msgs = ((InternalEObject)reqPre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__REQ_PRE, null, msgs);
			if (newReqPre != null)
				msgs = ((InternalEObject)newReqPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__REQ_PRE, null, msgs);
			msgs = basicSetReqPre(newReqPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__REQ_PRE, newReqPre, newReqPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getReqPost() {
		return reqPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReqPost(FormalDefinition newReqPost, NotificationChain msgs) {
		FormalDefinition oldReqPost = reqPost;
		reqPost = newReqPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__REQ_POST, oldReqPost, newReqPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqPost(FormalDefinition newReqPost) {
		if (newReqPost != reqPost) {
			NotificationChain msgs = null;
			if (reqPost != null)
				msgs = ((InternalEObject)reqPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__REQ_POST, null, msgs);
			if (newReqPost != null)
				msgs = ((InternalEObject)newReqPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__REQ_POST, null, msgs);
			msgs = basicSetReqPost(newReqPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__REQ_POST, newReqPost, newReqPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition getTrigPre() {
		return trigPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigPre(FormalDefinition newTrigPre, NotificationChain msgs) {
		FormalDefinition oldTrigPre = trigPre;
		trigPre = newTrigPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__TRIG_PRE, oldTrigPre, newTrigPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigPre(FormalDefinition newTrigPre) {
		if (newTrigPre != trigPre) {
			NotificationChain msgs = null;
			if (trigPre != null)
				msgs = ((InternalEObject)trigPre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__TRIG_PRE, null, msgs);
			if (newTrigPre != null)
				msgs = ((InternalEObject)newTrigPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IretPackage.OPERATION__TRIG_PRE, null, msgs);
			msgs = basicSetTrigPre(newTrigPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__TRIG_PRE, newTrigPre, newTrigPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList.ManyInverse<Entity>(Entity.class, this, IretPackage.OPERATION__IN, IretPackage.ENTITY__IS_INPUT_OF);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList.ManyInverse<Entity>(Entity.class, this, IretPackage.OPERATION__OUT, IretPackage.ENTITY__IS_OUTPUT_OF);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEvent() {
		if (hasEvent == null) {
			hasEvent = new EObjectResolvingEList<Event>(Event.class, this, IretPackage.OPERATION__HAS_EVENT);
		}
		return hasEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinExecTImes() {
		return minExecTImes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExecTImes(int newMinExecTImes) {
		int oldMinExecTImes = minExecTImes;
		minExecTImes = newMinExecTImes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__MIN_EXEC_TIMES, oldMinExecTImes, minExecTImes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxExecTimes() {
		return maxExecTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExecTimes(int newMaxExecTimes) {
		int oldMaxExecTimes = maxExecTimes;
		maxExecTimes = newMaxExecTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__MAX_EXEC_TIMES, oldMaxExecTimes, maxExecTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IretPackage.OPERATION__NAME, oldName, name));
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
			case IretPackage.OPERATION__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
			case IretPackage.OPERATION__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
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
			case IretPackage.OPERATION__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case IretPackage.OPERATION__DOM_PRE:
				return basicSetDomPre(null, msgs);
			case IretPackage.OPERATION__DOM_POST:
				return basicSetDomPost(null, msgs);
			case IretPackage.OPERATION__REQ_PRE:
				return basicSetReqPre(null, msgs);
			case IretPackage.OPERATION__REQ_POST:
				return basicSetReqPost(null, msgs);
			case IretPackage.OPERATION__TRIG_PRE:
				return basicSetTrigPre(null, msgs);
			case IretPackage.OPERATION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case IretPackage.OPERATION__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
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
			case IretPackage.OPERATION__DERIVED_FROM:
				return getDerivedFrom();
			case IretPackage.OPERATION__DESCRIPTION:
				return getDescription();
			case IretPackage.OPERATION__DOM_PRE:
				return getDomPre();
			case IretPackage.OPERATION__DOM_POST:
				return getDomPost();
			case IretPackage.OPERATION__REQ_PRE:
				return getReqPre();
			case IretPackage.OPERATION__REQ_POST:
				return getReqPost();
			case IretPackage.OPERATION__TRIG_PRE:
				return getTrigPre();
			case IretPackage.OPERATION__IN:
				return getIn();
			case IretPackage.OPERATION__OUT:
				return getOut();
			case IretPackage.OPERATION__HAS_EVENT:
				return getHasEvent();
			case IretPackage.OPERATION__MIN_EXEC_TIMES:
				return getMinExecTImes();
			case IretPackage.OPERATION__MAX_EXEC_TIMES:
				return getMaxExecTimes();
			case IretPackage.OPERATION__ID:
				return getId();
			case IretPackage.OPERATION__NAME:
				return getName();
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
			case IretPackage.OPERATION__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends IreneElement>)newValue);
				return;
			case IretPackage.OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IretPackage.OPERATION__DOM_PRE:
				setDomPre((FormalDefinition)newValue);
				return;
			case IretPackage.OPERATION__DOM_POST:
				setDomPost((FormalDefinition)newValue);
				return;
			case IretPackage.OPERATION__REQ_PRE:
				setReqPre((FormalDefinition)newValue);
				return;
			case IretPackage.OPERATION__REQ_POST:
				setReqPost((FormalDefinition)newValue);
				return;
			case IretPackage.OPERATION__TRIG_PRE:
				setTrigPre((FormalDefinition)newValue);
				return;
			case IretPackage.OPERATION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Entity>)newValue);
				return;
			case IretPackage.OPERATION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Entity>)newValue);
				return;
			case IretPackage.OPERATION__HAS_EVENT:
				getHasEvent().clear();
				getHasEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case IretPackage.OPERATION__MIN_EXEC_TIMES:
				setMinExecTImes((Integer)newValue);
				return;
			case IretPackage.OPERATION__MAX_EXEC_TIMES:
				setMaxExecTimes((Integer)newValue);
				return;
			case IretPackage.OPERATION__ID:
				setId((Integer)newValue);
				return;
			case IretPackage.OPERATION__NAME:
				setName((String)newValue);
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
			case IretPackage.OPERATION__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case IretPackage.OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IretPackage.OPERATION__DOM_PRE:
				setDomPre((FormalDefinition)null);
				return;
			case IretPackage.OPERATION__DOM_POST:
				setDomPost((FormalDefinition)null);
				return;
			case IretPackage.OPERATION__REQ_PRE:
				setReqPre((FormalDefinition)null);
				return;
			case IretPackage.OPERATION__REQ_POST:
				setReqPost((FormalDefinition)null);
				return;
			case IretPackage.OPERATION__TRIG_PRE:
				setTrigPre((FormalDefinition)null);
				return;
			case IretPackage.OPERATION__IN:
				getIn().clear();
				return;
			case IretPackage.OPERATION__OUT:
				getOut().clear();
				return;
			case IretPackage.OPERATION__HAS_EVENT:
				getHasEvent().clear();
				return;
			case IretPackage.OPERATION__MIN_EXEC_TIMES:
				setMinExecTImes(MIN_EXEC_TIMES_EDEFAULT);
				return;
			case IretPackage.OPERATION__MAX_EXEC_TIMES:
				setMaxExecTimes(MAX_EXEC_TIMES_EDEFAULT);
				return;
			case IretPackage.OPERATION__ID:
				setId(ID_EDEFAULT);
				return;
			case IretPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case IretPackage.OPERATION__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case IretPackage.OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IretPackage.OPERATION__DOM_PRE:
				return domPre != null;
			case IretPackage.OPERATION__DOM_POST:
				return domPost != null;
			case IretPackage.OPERATION__REQ_PRE:
				return reqPre != null;
			case IretPackage.OPERATION__REQ_POST:
				return reqPost != null;
			case IretPackage.OPERATION__TRIG_PRE:
				return trigPre != null;
			case IretPackage.OPERATION__IN:
				return in != null && !in.isEmpty();
			case IretPackage.OPERATION__OUT:
				return out != null && !out.isEmpty();
			case IretPackage.OPERATION__HAS_EVENT:
				return hasEvent != null && !hasEvent.isEmpty();
			case IretPackage.OPERATION__MIN_EXEC_TIMES:
				return minExecTImes != MIN_EXEC_TIMES_EDEFAULT;
			case IretPackage.OPERATION__MAX_EXEC_TIMES:
				return maxExecTimes != MAX_EXEC_TIMES_EDEFAULT;
			case IretPackage.OPERATION__ID:
				return id != ID_EDEFAULT;
			case IretPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", minExecTImes: ");
		result.append(minExecTImes);
		result.append(", maxExecTimes: ");
		result.append(maxExecTimes);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
