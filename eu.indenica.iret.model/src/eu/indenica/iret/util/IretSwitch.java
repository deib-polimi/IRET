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
package eu.indenica.iret.util;

import eu.indenica.iret.ANDRefinementLink;
import eu.indenica.iret.Action;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.Attribute;
import eu.indenica.iret.AutomatedAgent;
import eu.indenica.iret.BehaviouralGoal;
import eu.indenica.iret.ContributionLink;
import eu.indenica.iret.Entity;
import eu.indenica.iret.EntityAttribute;
import eu.indenica.iret.Event;
import eu.indenica.iret.FormalDefinition;
import eu.indenica.iret.Goal;
import eu.indenica.iret.GoalDiagram;
import eu.indenica.iret.HumanAgent;
import eu.indenica.iret.IreneElement;
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.LinkNode;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.Parameter;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.Reference;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.State;
import eu.indenica.iret.TreeElement;
import eu.indenica.iret.Variability;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.indenica.iret.IretPackage
 * @generated
 */
public class IretSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IretPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IretSwitch() {
		if (modelPackage == null) {
			modelPackage = IretPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IretPackage.IRENE_ELEMENT: {
				IreneElement ireneElement = (IreneElement)theEObject;
				T result = caseIreneElement(ireneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseIreneElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseObject(agent);
				if (result == null) result = caseParameter(agent);
				if (result == null) result = caseIreneElement(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.OBJECT: {
				eu.indenica.iret.Object object = (eu.indenica.iret.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseParameter(object);
				if (result == null) result = caseIreneElement(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.HUMAN_AGENT: {
				HumanAgent humanAgent = (HumanAgent)theEObject;
				T result = caseHumanAgent(humanAgent);
				if (result == null) result = caseAgent(humanAgent);
				if (result == null) result = caseObject(humanAgent);
				if (result == null) result = caseParameter(humanAgent);
				if (result == null) result = caseIreneElement(humanAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.AUTOMATED_AGENT: {
				AutomatedAgent automatedAgent = (AutomatedAgent)theEObject;
				T result = caseAutomatedAgent(automatedAgent);
				if (result == null) result = caseAgent(automatedAgent);
				if (result == null) result = caseObject(automatedAgent);
				if (result == null) result = caseParameter(automatedAgent);
				if (result == null) result = caseIreneElement(automatedAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseObject(entity);
				if (result == null) result = caseParameter(entity);
				if (result == null) result = caseIreneElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseObject(event);
				if (result == null) result = caseParameter(event);
				if (result == null) result = caseIreneElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseParameter(goal);
				if (result == null) result = caseIreneElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.BEHAVIOURAL_GOAL: {
				BehaviouralGoal behaviouralGoal = (BehaviouralGoal)theEObject;
				T result = caseBehaviouralGoal(behaviouralGoal);
				if (result == null) result = caseGoal(behaviouralGoal);
				if (result == null) result = caseTreeElement(behaviouralGoal);
				if (result == null) result = caseParameter(behaviouralGoal);
				if (result == null) result = caseIreneElement(behaviouralGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.ADAPTATION_GOAL: {
				AdaptationGoal adaptationGoal = (AdaptationGoal)theEObject;
				T result = caseAdaptationGoal(adaptationGoal);
				if (result == null) result = caseGoal(adaptationGoal);
				if (result == null) result = caseParameter(adaptationGoal);
				if (result == null) result = caseIreneElement(adaptationGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseParameter(action);
				if (result == null) result = caseIreneElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseIreneElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.LINK_NODE: {
				LinkNode linkNode = (LinkNode)theEObject;
				T result = caseLinkNode(linkNode);
				if (result == null) result = caseIreneElement(linkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.REFINEMENT_LINK: {
				RefinementLink refinementLink = (RefinementLink)theEObject;
				T result = caseRefinementLink(refinementLink);
				if (result == null) result = caseLinkNode(refinementLink);
				if (result == null) result = caseTreeElement(refinementLink);
				if (result == null) result = caseIreneElement(refinementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.AND_REFINEMENT_LINK: {
				ANDRefinementLink andRefinementLink = (ANDRefinementLink)theEObject;
				T result = caseANDRefinementLink(andRefinementLink);
				if (result == null) result = caseRefinementLink(andRefinementLink);
				if (result == null) result = caseLinkNode(andRefinementLink);
				if (result == null) result = caseTreeElement(andRefinementLink);
				if (result == null) result = caseIreneElement(andRefinementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.OR_REFINEMENT_LINK: {
				ORRefinementLink orRefinementLink = (ORRefinementLink)theEObject;
				T result = caseORRefinementLink(orRefinementLink);
				if (result == null) result = caseRefinementLink(orRefinementLink);
				if (result == null) result = caseLinkNode(orRefinementLink);
				if (result == null) result = caseTreeElement(orRefinementLink);
				if (result == null) result = caseIreneElement(orRefinementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.CONTRIBUTION_LINK: {
				ContributionLink contributionLink = (ContributionLink)theEObject;
				T result = caseContributionLink(contributionLink);
				if (result == null) result = caseLinkNode(contributionLink);
				if (result == null) result = caseIreneElement(contributionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.FORMAL_DEFINITION: {
				FormalDefinition formalDefinition = (FormalDefinition)theEObject;
				T result = caseFormalDefinition(formalDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.PRIMITIVE_ATTRIBUTE: {
				PrimitiveAttribute primitiveAttribute = (PrimitiveAttribute)theEObject;
				T result = casePrimitiveAttribute(primitiveAttribute);
				if (result == null) result = caseAttribute(primitiveAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.ENTITY_ATTRIBUTE: {
				EntityAttribute entityAttribute = (EntityAttribute)theEObject;
				T result = caseEntityAttribute(entityAttribute);
				if (result == null) result = caseAttribute(entityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.VARIABILITY: {
				Variability variability = (Variability)theEObject;
				T result = caseVariability(variability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.GOAL_DIAGRAM: {
				GoalDiagram goalDiagram = (GoalDiagram)theEObject;
				T result = caseGoalDiagram(goalDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.IRENE_MODEL: {
				IreneModel ireneModel = (IreneModel)theEObject;
				T result = caseIreneModel(ireneModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IretPackage.TREE_ELEMENT: {
				TreeElement treeElement = (TreeElement)theEObject;
				T result = caseTreeElement(treeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irene Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irene Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIreneElement(IreneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(eu.indenica.iret.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanAgent(HumanAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automated Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automated Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatedAgent(AutomatedAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralGoal(BehaviouralGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationGoal(AdaptationGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkNode(LinkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinementLink(RefinementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Refinement Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Refinement Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDRefinementLink(ANDRefinementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Refinement Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Refinement Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORRefinementLink(ORRefinementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionLink(ContributionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalDefinition(FormalDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveAttribute(PrimitiveAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariability(Variability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalDiagram(GoalDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irene Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irene Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIreneModel(IreneModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeElement(TreeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IretSwitch
