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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.indenica.iret.IretPackage
 * @generated
 */
public class IretAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IretPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IretAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IretPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IretSwitch<Adapter> modelSwitch =
		new IretSwitch<Adapter>() {
			@Override
			public Adapter caseIreneElement(IreneElement object) {
				return createIreneElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseObject(eu.indenica.iret.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseHumanAgent(HumanAgent object) {
				return createHumanAgentAdapter();
			}
			@Override
			public Adapter caseAutomatedAgent(AutomatedAgent object) {
				return createAutomatedAgentAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseBehaviouralGoal(BehaviouralGoal object) {
				return createBehaviouralGoalAdapter();
			}
			@Override
			public Adapter caseAdaptationGoal(AdaptationGoal object) {
				return createAdaptationGoalAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseLinkNode(LinkNode object) {
				return createLinkNodeAdapter();
			}
			@Override
			public Adapter caseRefinementLink(RefinementLink object) {
				return createRefinementLinkAdapter();
			}
			@Override
			public Adapter caseANDRefinementLink(ANDRefinementLink object) {
				return createANDRefinementLinkAdapter();
			}
			@Override
			public Adapter caseORRefinementLink(ORRefinementLink object) {
				return createORRefinementLinkAdapter();
			}
			@Override
			public Adapter caseContributionLink(ContributionLink object) {
				return createContributionLinkAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseFormalDefinition(FormalDefinition object) {
				return createFormalDefinitionAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter casePrimitiveAttribute(PrimitiveAttribute object) {
				return createPrimitiveAttributeAdapter();
			}
			@Override
			public Adapter caseEntityAttribute(EntityAttribute object) {
				return createEntityAttributeAdapter();
			}
			@Override
			public Adapter caseVariability(Variability object) {
				return createVariabilityAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseGoalDiagram(GoalDiagram object) {
				return createGoalDiagramAdapter();
			}
			@Override
			public Adapter caseIreneModel(IreneModel object) {
				return createIreneModelAdapter();
			}
			@Override
			public Adapter caseTreeElement(TreeElement object) {
				return createTreeElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.IreneElement <em>Irene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.IreneElement
	 * @generated
	 */
	public Adapter createIreneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.HumanAgent <em>Human Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.HumanAgent
	 * @generated
	 */
	public Adapter createHumanAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.AutomatedAgent <em>Automated Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.AutomatedAgent
	 * @generated
	 */
	public Adapter createAutomatedAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.BehaviouralGoal <em>Behavioural Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.BehaviouralGoal
	 * @generated
	 */
	public Adapter createBehaviouralGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.AdaptationGoal <em>Adaptation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.AdaptationGoal
	 * @generated
	 */
	public Adapter createAdaptationGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.LinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.LinkNode
	 * @generated
	 */
	public Adapter createLinkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.RefinementLink <em>Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.RefinementLink
	 * @generated
	 */
	public Adapter createRefinementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.ANDRefinementLink <em>AND Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.ANDRefinementLink
	 * @generated
	 */
	public Adapter createANDRefinementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.ORRefinementLink <em>OR Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.ORRefinementLink
	 * @generated
	 */
	public Adapter createORRefinementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.ContributionLink <em>Contribution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.ContributionLink
	 * @generated
	 */
	public Adapter createContributionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.FormalDefinition <em>Formal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.FormalDefinition
	 * @generated
	 */
	public Adapter createFormalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.PrimitiveAttribute <em>Primitive Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.PrimitiveAttribute
	 * @generated
	 */
	public Adapter createPrimitiveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.EntityAttribute
	 * @generated
	 */
	public Adapter createEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.Variability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.Variability
	 * @generated
	 */
	public Adapter createVariabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.GoalDiagram <em>Goal Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.GoalDiagram
	 * @generated
	 */
	public Adapter createGoalDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.IreneModel <em>Irene Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.IreneModel
	 * @generated
	 */
	public Adapter createIreneModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.indenica.iret.TreeElement <em>Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.indenica.iret.TreeElement
	 * @generated
	 */
	public Adapter createTreeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IretAdapterFactory
