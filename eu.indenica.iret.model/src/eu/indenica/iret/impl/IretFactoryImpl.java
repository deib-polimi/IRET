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
import eu.indenica.iret.IreneModel;
import eu.indenica.iret.IretFactory;
import eu.indenica.iret.IretPackage;
import eu.indenica.iret.Multiplicity;
import eu.indenica.iret.ORRefinementLink;
import eu.indenica.iret.Operation;
import eu.indenica.iret.PrimitiveAttribute;
import eu.indenica.iret.RefType;
import eu.indenica.iret.Reference;
import eu.indenica.iret.RefinementLink;
import eu.indenica.iret.State;
import eu.indenica.iret.TreeElement;
import eu.indenica.iret.Variability;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IretFactoryImpl extends EFactoryImpl implements IretFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IretFactory init() {
		try {
			IretFactory theIretFactory = (IretFactory)EPackage.Registry.INSTANCE.getEFactory("http://indenica.dei.polimi.it/iret#"); 
			if (theIretFactory != null) {
				return theIretFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IretFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IretFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IretPackage.AGENT: return createAgent();
			case IretPackage.HUMAN_AGENT: return createHumanAgent();
			case IretPackage.AUTOMATED_AGENT: return createAutomatedAgent();
			case IretPackage.ENTITY: return createEntity();
			case IretPackage.EVENT: return createEvent();
			case IretPackage.BEHAVIOURAL_GOAL: return createBehaviouralGoal();
			case IretPackage.ADAPTATION_GOAL: return createAdaptationGoal();
			case IretPackage.ACTION: return createAction();
			case IretPackage.OPERATION: return createOperation();
			case IretPackage.REFINEMENT_LINK: return createRefinementLink();
			case IretPackage.AND_REFINEMENT_LINK: return createANDRefinementLink();
			case IretPackage.OR_REFINEMENT_LINK: return createORRefinementLink();
			case IretPackage.CONTRIBUTION_LINK: return createContributionLink();
			case IretPackage.REFERENCE: return createReference();
			case IretPackage.FORMAL_DEFINITION: return createFormalDefinition();
			case IretPackage.ATTRIBUTE: return createAttribute();
			case IretPackage.PRIMITIVE_ATTRIBUTE: return createPrimitiveAttribute();
			case IretPackage.ENTITY_ATTRIBUTE: return createEntityAttribute();
			case IretPackage.VARIABILITY: return createVariability();
			case IretPackage.STATE: return createState();
			case IretPackage.GOAL_DIAGRAM: return createGoalDiagram();
			case IretPackage.IRENE_MODEL: return createIreneModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IretPackage.REF_TYPE:
				return createRefTypeFromString(eDataType, initialValue);
			case IretPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case IretPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case IretPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IretPackage.REF_TYPE:
				return convertRefTypeToString(eDataType, instanceValue);
			case IretPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case IretPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case IretPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanAgent createHumanAgent() {
		HumanAgentImpl humanAgent = new HumanAgentImpl();
		return humanAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatedAgent createAutomatedAgent() {
		AutomatedAgentImpl automatedAgent = new AutomatedAgentImpl();
		return automatedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralGoal createBehaviouralGoal() {
		BehaviouralGoalImpl behaviouralGoal = new BehaviouralGoalImpl();
		return behaviouralGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationGoal createAdaptationGoal() {
		AdaptationGoalImpl adaptationGoal = new AdaptationGoalImpl();
		return adaptationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementLink createRefinementLink() {
		RefinementLinkImpl refinementLink = new RefinementLinkImpl();
		return refinementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDRefinementLink createANDRefinementLink() {
		ANDRefinementLinkImpl andRefinementLink = new ANDRefinementLinkImpl();
		return andRefinementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORRefinementLink createORRefinementLink() {
		ORRefinementLinkImpl orRefinementLink = new ORRefinementLinkImpl();
		return orRefinementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionLink createContributionLink() {
		ContributionLinkImpl contributionLink = new ContributionLinkImpl();
		return contributionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalDefinition createFormalDefinition() {
		FormalDefinitionImpl formalDefinition = new FormalDefinitionImpl();
		return formalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveAttribute createPrimitiveAttribute() {
		PrimitiveAttributeImpl primitiveAttribute = new PrimitiveAttributeImpl();
		return primitiveAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAttribute createEntityAttribute() {
		EntityAttributeImpl entityAttribute = new EntityAttributeImpl();
		return entityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability createVariability() {
		VariabilityImpl variability = new VariabilityImpl();
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalDiagram createGoalDiagram() {
		GoalDiagramImpl goalDiagram = new GoalDiagramImpl();
		return goalDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IreneModel createIreneModel() {
		IreneModelImpl ireneModel = new IreneModelImpl();
		return ireneModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType createRefTypeFromString(EDataType eDataType, String initialValue) {
		RefType result = RefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IretPackage getIretPackage() {
		return (IretPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IretPackage getPackage() {
		return IretPackage.eINSTANCE;
	}

} //IretFactoryImpl
