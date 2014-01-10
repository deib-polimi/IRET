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
import eu.indenica.iret.ActionType;
import eu.indenica.iret.AdaptationGoal;
import eu.indenica.iret.Agent;
import eu.indenica.iret.Attribute;
import eu.indenica.iret.AttributeType;
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
import eu.indenica.iret.Multiplicity;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.Parameter;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.RefType;
import eu.indenica.iret.Reference;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.State;
import eu.indenica.iret.TreeElement;
import eu.indenica.iret.Variability;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.indenica.iret.IretPackage
 * @generated
 */
public class IretValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IretValidator INSTANCE = new IretValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.indenica.iret";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IretValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return IretPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IretPackage.IRENE_ELEMENT:
				return validateIreneElement((IreneElement)value, diagnostics, context);
			case IretPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case IretPackage.AGENT:
				return validateAgent((Agent)value, diagnostics, context);
			case IretPackage.OBJECT:
				return validateObject((eu.indenica.iret.Object)value, diagnostics, context);
			case IretPackage.HUMAN_AGENT:
				return validateHumanAgent((HumanAgent)value, diagnostics, context);
			case IretPackage.AUTOMATED_AGENT:
				return validateAutomatedAgent((AutomatedAgent)value, diagnostics, context);
			case IretPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case IretPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case IretPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case IretPackage.BEHAVIOURAL_GOAL:
				return validateBehaviouralGoal((BehaviouralGoal)value, diagnostics, context);
			case IretPackage.ADAPTATION_GOAL:
				return validateAdaptationGoal((AdaptationGoal)value, diagnostics, context);
			case IretPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case IretPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case IretPackage.LINK_NODE:
				return validateLinkNode((LinkNode)value, diagnostics, context);
			case IretPackage.REFINEMENT_LINK:
				return validateRefinementLink((RefinementLink)value, diagnostics, context);
			case IretPackage.AND_REFINEMENT_LINK:
				return validateANDRefinementLink((ANDRefinementLink)value, diagnostics, context);
			case IretPackage.OR_REFINEMENT_LINK:
				return validateORRefinementLink((ORRefinementLink)value, diagnostics, context);
			case IretPackage.CONTRIBUTION_LINK:
				return validateContributionLink((ContributionLink)value, diagnostics, context);
			case IretPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case IretPackage.FORMAL_DEFINITION:
				return validateFormalDefinition((FormalDefinition)value, diagnostics, context);
			case IretPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case IretPackage.PRIMITIVE_ATTRIBUTE:
				return validatePrimitiveAttribute((PrimitiveAttribute)value, diagnostics, context);
			case IretPackage.ENTITY_ATTRIBUTE:
				return validateEntityAttribute((EntityAttribute)value, diagnostics, context);
			case IretPackage.VARIABILITY:
				return validateVariability((Variability)value, diagnostics, context);
			case IretPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case IretPackage.GOAL_DIAGRAM:
				return validateGoalDiagram((GoalDiagram)value, diagnostics, context);
			case IretPackage.IRENE_MODEL:
				return validateIreneModel((IreneModel)value, diagnostics, context);
			case IretPackage.TREE_ELEMENT:
				return validateTreeElement((TreeElement)value, diagnostics, context);
			case IretPackage.REF_TYPE:
				return validateRefType((RefType)value, diagnostics, context);
			case IretPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case IretPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			case IretPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIreneElement(IreneElement ireneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ireneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgent(Agent agent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllOut(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllIn(agent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InglobeAllOut constraint of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AGENT__INGLOBE_ALL_OUT__EEXPRESSION = "write->includesAll(operat.out)";

	/**
	 * Validates the InglobeAllOut constraint of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgent_InglobeAllOut(Agent agent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IretPackage.Literals.AGENT,
				 agent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "InglobeAllOut",
				 AGENT__INGLOBE_ALL_OUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InglobeAllIn constraint of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AGENT__INGLOBE_ALL_IN__EEXPRESSION = "read->includesAll(operat._'in')";

	/**
	 * Validates the InglobeAllIn constraint of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgent_InglobeAllIn(Agent agent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IretPackage.Literals.AGENT,
				 agent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "InglobeAllIn",
				 AGENT__INGLOBE_ALL_IN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(eu.indenica.iret.Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanAgent(HumanAgent humanAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(humanAgent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllOut(humanAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllIn(humanAgent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomatedAgent(AutomatedAgent automatedAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(automatedAgent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllOut(automatedAgent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgent_InglobeAllIn(automatedAgent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralGoal(BehaviouralGoal behaviouralGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviouralGoal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralGoal_IsLeafe(behaviouralGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviouralGoal_SatisfactionRange(behaviouralGoal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IsLeafe constraint of '<em>Behavioural Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOURAL_GOAL__IS_LEAFE__EEXPRESSION = "if(leafe = true) then (ref = null) else (ref <> null) endif";

	/**
	 * Validates the IsLeafe constraint of '<em>Behavioural Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralGoal_IsLeafe(BehaviouralGoal behaviouralGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IretPackage.Literals.BEHAVIOURAL_GOAL,
				 behaviouralGoal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "IsLeafe",
				 BEHAVIOURAL_GOAL__IS_LEAFE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SatisfactionRange constraint of '<em>Behavioural Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOURAL_GOAL__SATISFACTION_RANGE__EEXPRESSION = "satisfactionLevel<=1 and satisfactionLevel>=0";

	/**
	 * Validates the SatisfactionRange constraint of '<em>Behavioural Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviouralGoal_SatisfactionRange(BehaviouralGoal behaviouralGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IretPackage.Literals.BEHAVIOURAL_GOAL,
				 behaviouralGoal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SatisfactionRange",
				 BEHAVIOURAL_GOAL__SATISFACTION_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdaptationGoal(AdaptationGoal adaptationGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adaptationGoal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkNode(LinkNode linkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinementLink(RefinementLink refinementLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refinementLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefinementLink_RefinementLoop(refinementLink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RefinementLoop constraint of '<em>Refinement Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFINEMENT_LINK__REFINEMENT_LOOP__EEXPRESSION = "not target->includes(myFather)";

	/**
	 * Validates the RefinementLoop constraint of '<em>Refinement Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinementLink_RefinementLoop(RefinementLink refinementLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IretPackage.Literals.REFINEMENT_LINK,
				 refinementLink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RefinementLoop",
				 REFINEMENT_LINK__REFINEMENT_LOOP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANDRefinementLink(ANDRefinementLink andRefinementLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(andRefinementLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(andRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefinementLink_RefinementLoop(andRefinementLink, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORRefinementLink(ORRefinementLink orRefinementLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orRefinementLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orRefinementLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefinementLink_RefinementLoop(orRefinementLink, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributionLink(ContributionLink contributionLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributionLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalDefinition(FormalDefinition formalDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveAttribute(PrimitiveAttribute primitiveAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityAttribute(EntityAttribute entityAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariability(Variability variability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalDiagram(GoalDiagram goalDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIreneModel(IreneModel ireneModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ireneModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreeElement(TreeElement treeElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treeElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType(RefType refType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IretValidator
