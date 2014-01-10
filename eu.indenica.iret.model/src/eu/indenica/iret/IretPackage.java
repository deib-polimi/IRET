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
package eu.indenica.iret;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.indenica.iret.IretFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface IretPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iret";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://indenica.dei.polimi.it/iret#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iret";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IretPackage eINSTANCE = eu.indenica.iret.impl.IretPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.indenica.iret.IreneElement <em>Irene Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.IreneElement
	 * @see eu.indenica.iret.impl.IretPackageImpl#getIreneElement()
	 * @generated
	 */
	int IRENE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_ELEMENT__DERIVED_FROM = 0;

	/**
	 * The number of structural features of the '<em>Irene Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.Parameter <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.Parameter
	 * @see eu.indenica.iret.impl.IretPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DERIVED_FROM = IRENE_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VARIABILITY = IRENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = IRENE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ObjectImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DERIVED_FROM = PARAMETER__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__VARIABILITY = PARAMETER__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_MONITORED_BY = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_CONTROLLED_BY = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.AgentImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 2;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DERIVED_FROM = OBJECT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__VARIABILITY = OBJECT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__IS_MONITORED_BY = OBJECT__IS_MONITORED_BY;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__IS_CONTROLLED_BY = OBJECT__IS_CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Operat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OPERAT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MONITORS = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONTROLS = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.HumanAgentImpl <em>Human Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.HumanAgentImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getHumanAgent()
	 * @generated
	 */
	int HUMAN_AGENT = 4;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__DERIVED_FROM = AGENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__VARIABILITY = AGENT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__IS_MONITORED_BY = AGENT__IS_MONITORED_BY;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__IS_CONTROLLED_BY = AGENT__IS_CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Operat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__OPERAT = AGENT__OPERAT;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__MONITORS = AGENT__MONITORS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__CONTROLS = AGENT__CONTROLS;

	/**
	 * The number of structural features of the '<em>Human Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.AutomatedAgentImpl <em>Automated Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.AutomatedAgentImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAutomatedAgent()
	 * @generated
	 */
	int AUTOMATED_AGENT = 5;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__DERIVED_FROM = AGENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__VARIABILITY = AGENT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__IS_MONITORED_BY = AGENT__IS_MONITORED_BY;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__IS_CONTROLLED_BY = AGENT__IS_CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Operat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__OPERAT = AGENT__OPERAT;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__MONITORS = AGENT__MONITORS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT__CONTROLS = AGENT__CONTROLS;

	/**
	 * The number of structural features of the '<em>Automated Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.EntityImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DERIVED_FROM = OBJECT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VARIABILITY = OBJECT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_MONITORED_BY = OBJECT__IS_MONITORED_BY;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_CONTROLLED_BY = OBJECT__IS_CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCES = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Admitted States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ADMITTED_STATES = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_IN_STATE = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Input Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INPUT_OF = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Output Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_OUTPUT_OF = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.EventImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DERIVED_FROM = OBJECT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VARIABILITY = OBJECT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Is Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_MONITORED_BY = OBJECT__IS_MONITORED_BY;

	/**
	 * The feature id for the '<em><b>Is Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_CONTROLLED_BY = OBJECT__IS_CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ATTRIBUTES = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Add Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ADD_ARGUMENTS = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.Goal <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.Goal
	 * @see eu.indenica.iret.impl.IretPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 8;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DERIVED_FROM = PARAMETER__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__VARIABILITY = PARAMETER__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PRIORITY = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.BehaviouralGoalImpl <em>Behavioural Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.BehaviouralGoalImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getBehaviouralGoal()
	 * @generated
	 */
	int BEHAVIOURAL_GOAL = 9;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__DERIVED_FROM = GOAL__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__VARIABILITY = GOAL__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__PRIORITY = GOAL__PRIORITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__DESCRIPTION = GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__ID = GOAL__ID;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__REFINES = GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__LEAF = GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contributes On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__CONTRIBUTES_ON = GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operationalized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__OPERATIONALIZED_BY = GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formal Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__FORMAL_DEFINITION = GOAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Soft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__SOFT = GOAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Satisfaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__SATISFACTION = GOAL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__ROLLBACK = GOAL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contributed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__CONTRIBUTED_BY = GOAL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL__REFINED_BY = GOAL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Behavioural Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.AdaptationGoalImpl <em>Adaptation Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.AdaptationGoalImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAdaptationGoal()
	 * @generated
	 */
	int ADAPTATION_GOAL = 10;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__DERIVED_FROM = GOAL__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__VARIABILITY = GOAL__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__PRIORITY = GOAL__PRIORITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__DESCRIPTION = GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__ID = GOAL__ID;

	/**
	 * The feature id for the '<em><b>Max Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__MAX_ACTIVATIONS = GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__TRIGGER = GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__CONDITION = GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__HELP = GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL__ACTIONS = GOAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Adaptation Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ActionImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DERIVED_FROM = PARAMETER__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VARIABILITY = PARAMETER__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_TYPE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_PARAMETER = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.OperationImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DERIVED_FROM = IRENE_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = IRENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dom Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOM_PRE = IRENE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dom Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOM_POST = IRENE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Req Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQ_PRE = IRENE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Req Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQ_POST = IRENE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trig Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TRIG_PRE = IRENE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IN = IRENE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUT = IRENE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HAS_EVENT = IRENE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Exec TImes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MIN_EXEC_TIMES = IRENE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Exec Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MAX_EXEC_TIMES = IRENE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = IRENE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = IRENE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = IRENE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.LinkNode <em>Link Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.LinkNode
	 * @see eu.indenica.iret.impl.IretPackageImpl#getLinkNode()
	 * @generated
	 */
	int LINK_NODE = 13;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__DERIVED_FROM = IRENE_ELEMENT__DERIVED_FROM;

	/**
	 * The number of structural features of the '<em>Link Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_FEATURE_COUNT = IRENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.RefinementLinkImpl <em>Refinement Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.RefinementLinkImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getRefinementLink()
	 * @generated
	 */
	int REFINEMENT_LINK = 14;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK__DERIVED_FROM = LINK_NODE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK__REFINES = LINK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK__ID = LINK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refining Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK__REFINING_GOALS = LINK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK__REFINED_GOAL = LINK_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Refinement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_LINK_FEATURE_COUNT = LINK_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ANDRefinementLinkImpl <em>AND Refinement Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ANDRefinementLinkImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getANDRefinementLink()
	 * @generated
	 */
	int AND_REFINEMENT_LINK = 15;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK__DERIVED_FROM = REFINEMENT_LINK__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK__REFINES = REFINEMENT_LINK__REFINES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK__ID = REFINEMENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Refining Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK__REFINING_GOALS = REFINEMENT_LINK__REFINING_GOALS;

	/**
	 * The feature id for the '<em><b>Refined Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK__REFINED_GOAL = REFINEMENT_LINK__REFINED_GOAL;

	/**
	 * The number of structural features of the '<em>AND Refinement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_LINK_FEATURE_COUNT = REFINEMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ORRefinementLinkImpl <em>OR Refinement Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ORRefinementLinkImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getORRefinementLink()
	 * @generated
	 */
	int OR_REFINEMENT_LINK = 16;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK__DERIVED_FROM = REFINEMENT_LINK__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK__REFINES = REFINEMENT_LINK__REFINES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK__ID = REFINEMENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Refining Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK__REFINING_GOALS = REFINEMENT_LINK__REFINING_GOALS;

	/**
	 * The feature id for the '<em><b>Refined Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK__REFINED_GOAL = REFINEMENT_LINK__REFINED_GOAL;

	/**
	 * The number of structural features of the '<em>OR Refinement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_LINK_FEATURE_COUNT = REFINEMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ContributionLinkImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getContributionLink()
	 * @generated
	 */
	int CONTRIBUTION_LINK = 17;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK__DERIVED_FROM = LINK_NODE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK__WEIGHT = LINK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK__CONTRIBUTOR = LINK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK__DESTINATION_GOAL = LINK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK__ID = LINK_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contribution Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_LINK_FEATURE_COUNT = LINK_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.ReferenceImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.FormalDefinitionImpl <em>Formal Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.FormalDefinitionImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getFormalDefinition()
	 * @generated
	 */
	int FORMAL_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_DEFINITION__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Formal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.AttributeImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.PrimitiveAttributeImpl <em>Primitive Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.PrimitiveAttributeImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getPrimitiveAttribute()
	 * @generated
	 */
	int PRIMITIVE_ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.EntityAttributeImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getEntityAttribute()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.VariabilityImpl <em>Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.VariabilityImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getVariability()
	 * @generated
	 */
	int VARIABILITY = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.StateImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getState()
	 * @generated
	 */
	int STATE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INT = 1;

	/**
	 * The feature id for the '<em><b>Dom Inv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DOM_INV = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.GoalDiagramImpl <em>Goal Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.GoalDiagramImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getGoalDiagram()
	 * @generated
	 */
	int GOAL_DIAGRAM = 25;

	/**
	 * The feature id for the '<em><b>Has RLink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_RLINK = 0;

	/**
	 * The feature id for the '<em><b>Has Behavioural Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Has Adaptation Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_ADAPTATION_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Has Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Has Oper</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_OPER = 4;

	/**
	 * The feature id for the '<em><b>Has Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Has Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_AGENT = 6;

	/**
	 * The feature id for the '<em><b>Has Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Has CLink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__HAS_CLINK = 8;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__READONLY = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__LABEL = 10;

	/**
	 * The feature id for the '<em><b>Is View Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM__IS_VIEW_OF = 11;

	/**
	 * The number of structural features of the '<em>Goal Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_DIAGRAM_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.impl.IreneModelImpl <em>Irene Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.impl.IreneModelImpl
	 * @see eu.indenica.iret.impl.IretPackageImpl#getIreneModel()
	 * @generated
	 */
	int IRENE_MODEL = 26;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_MODEL__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Has View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_MODEL__HAS_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Easy Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_MODEL__EASY_VARIABILITY = 2;

	/**
	 * The number of structural features of the '<em>Irene Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRENE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.TreeElement <em>Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.TreeElement
	 * @see eu.indenica.iret.impl.IretPackageImpl#getTreeElement()
	 * @generated
	 */
	int TREE_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__REFINES = 0;

	/**
	 * The number of structural features of the '<em>Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.RefType <em>Ref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.RefType
	 * @see eu.indenica.iret.impl.IretPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 28;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.ActionType
	 * @see eu.indenica.iret.impl.IretPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 29;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.Multiplicity
	 * @see eu.indenica.iret.impl.IretPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 30;

	/**
	 * The meta object id for the '{@link eu.indenica.iret.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.indenica.iret.AttributeType
	 * @see eu.indenica.iret.impl.IretPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.IreneElement <em>Irene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irene Element</em>'.
	 * @see eu.indenica.iret.IreneElement
	 * @generated
	 */
	EClass getIreneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.IreneElement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived From</em>'.
	 * @see eu.indenica.iret.IreneElement#getDerivedFrom()
	 * @see #getIreneElement()
	 * @generated
	 */
	EReference getIreneElement_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see eu.indenica.iret.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Parameter#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variability</em>'.
	 * @see eu.indenica.iret.Parameter#getVariability()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Variability();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see eu.indenica.iret.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Agent#getOperat <em>Operat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operat</em>'.
	 * @see eu.indenica.iret.Agent#getOperat()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Operat();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Agent#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see eu.indenica.iret.Agent#getMonitors()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Monitors();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Agent#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see eu.indenica.iret.Agent#getControls()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Controls();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see eu.indenica.iret.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Object#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.indenica.iret.Object#getId()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Object#getIsMonitoredBy <em>Is Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Monitored By</em>'.
	 * @see eu.indenica.iret.Object#getIsMonitoredBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsMonitoredBy();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Object#getIsControlledBy <em>Is Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Controlled By</em>'.
	 * @see eu.indenica.iret.Object#getIsControlledBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsControlledBy();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.HumanAgent <em>Human Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Agent</em>'.
	 * @see eu.indenica.iret.HumanAgent
	 * @generated
	 */
	EClass getHumanAgent();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.AutomatedAgent <em>Automated Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automated Agent</em>'.
	 * @see eu.indenica.iret.AutomatedAgent
	 * @generated
	 */
	EClass getAutomatedAgent();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see eu.indenica.iret.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see eu.indenica.iret.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.Entity#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see eu.indenica.iret.Entity#getReferences()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_References();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.Entity#getAdmittedStates <em>Admitted States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admitted States</em>'.
	 * @see eu.indenica.iret.Entity#getAdmittedStates()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AdmittedStates();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Entity#getIsInState <em>Is In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is In State</em>'.
	 * @see eu.indenica.iret.Entity#getIsInState()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsInState();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Entity#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Input Of</em>'.
	 * @see eu.indenica.iret.Entity#getIsInputOf()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IsInputOf();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Entity#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Output Of</em>'.
	 * @see eu.indenica.iret.Entity#getIsOutputOf()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IsOutputOf();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see eu.indenica.iret.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.Event#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see eu.indenica.iret.Event#getAttributes()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.Event#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.indenica.iret.Event#getParameters()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Event#getAddArguments <em>Add Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Add Arguments</em>'.
	 * @see eu.indenica.iret.Event#getAddArguments()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_AddArguments();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see eu.indenica.iret.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Goal#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see eu.indenica.iret.Goal#getPriority()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Priority();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.indenica.iret.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Goal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.indenica.iret.Goal#getId()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Id();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.BehaviouralGoal <em>Behavioural Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Goal</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal
	 * @generated
	 */
	EClass getBehaviouralGoal();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.BehaviouralGoal#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#isLeaf()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EAttribute getBehaviouralGoal_Leaf();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.BehaviouralGoal#getContributesOn <em>Contributes On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes On</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getContributesOn()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EReference getBehaviouralGoal_ContributesOn();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.BehaviouralGoal#getOperationalizedBy <em>Operationalized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operationalized By</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getOperationalizedBy()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EReference getBehaviouralGoal_OperationalizedBy();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.BehaviouralGoal#getFormalDefinition <em>Formal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formal Definition</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getFormalDefinition()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EReference getBehaviouralGoal_FormalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.BehaviouralGoal#isSoft <em>Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#isSoft()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EAttribute getBehaviouralGoal_Soft();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.BehaviouralGoal#getSatisfaction <em>Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getSatisfaction()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EAttribute getBehaviouralGoal_Satisfaction();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.BehaviouralGoal#isRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rollback</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#isRollback()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EAttribute getBehaviouralGoal_Rollback();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.BehaviouralGoal#getContributedBy <em>Contributed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributed By</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getContributedBy()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EReference getBehaviouralGoal_ContributedBy();

	/**
	 * Returns the meta object for the container reference '{@link eu.indenica.iret.BehaviouralGoal#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refined By</em>'.
	 * @see eu.indenica.iret.BehaviouralGoal#getRefinedBy()
	 * @see #getBehaviouralGoal()
	 * @generated
	 */
	EReference getBehaviouralGoal_RefinedBy();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.AdaptationGoal <em>Adaptation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Goal</em>'.
	 * @see eu.indenica.iret.AdaptationGoal
	 * @generated
	 */
	EClass getAdaptationGoal();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.AdaptationGoal#getMaxActivations <em>Max Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Activations</em>'.
	 * @see eu.indenica.iret.AdaptationGoal#getMaxActivations()
	 * @see #getAdaptationGoal()
	 * @generated
	 */
	EAttribute getAdaptationGoal_MaxActivations();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.AdaptationGoal#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see eu.indenica.iret.AdaptationGoal#getTrigger()
	 * @see #getAdaptationGoal()
	 * @generated
	 */
	EReference getAdaptationGoal_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.AdaptationGoal#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see eu.indenica.iret.AdaptationGoal#getCondition()
	 * @see #getAdaptationGoal()
	 * @generated
	 */
	EReference getAdaptationGoal_Condition();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.AdaptationGoal#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Help</em>'.
	 * @see eu.indenica.iret.AdaptationGoal#getHelp()
	 * @see #getAdaptationGoal()
	 * @generated
	 */
	EReference getAdaptationGoal_Help();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.AdaptationGoal#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see eu.indenica.iret.AdaptationGoal#getActions()
	 * @see #getAdaptationGoal()
	 * @generated
	 */
	EReference getAdaptationGoal_Actions();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see eu.indenica.iret.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Action#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see eu.indenica.iret.Action#getActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionType();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Action#getActionParameter <em>Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Parameter</em>'.
	 * @see eu.indenica.iret.Action#getActionParameter()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionParameter();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see eu.indenica.iret.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.indenica.iret.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Description();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Operation#getDomPre <em>Dom Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dom Pre</em>'.
	 * @see eu.indenica.iret.Operation#getDomPre()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DomPre();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Operation#getDomPost <em>Dom Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dom Post</em>'.
	 * @see eu.indenica.iret.Operation#getDomPost()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DomPost();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Operation#getReqPre <em>Req Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Req Pre</em>'.
	 * @see eu.indenica.iret.Operation#getReqPre()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReqPre();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Operation#getReqPost <em>Req Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Req Post</em>'.
	 * @see eu.indenica.iret.Operation#getReqPost()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReqPost();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.Operation#getTrigPre <em>Trig Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trig Pre</em>'.
	 * @see eu.indenica.iret.Operation#getTrigPre()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_TrigPre();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Operation#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see eu.indenica.iret.Operation#getIn()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_In();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Operation#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see eu.indenica.iret.Operation#getOut()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Out();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.Operation#getHasEvent <em>Has Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Event</em>'.
	 * @see eu.indenica.iret.Operation#getHasEvent()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_HasEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Operation#getMinExecTImes <em>Min Exec TImes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exec TImes</em>'.
	 * @see eu.indenica.iret.Operation#getMinExecTImes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MinExecTImes();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Operation#getMaxExecTimes <em>Max Exec Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exec Times</em>'.
	 * @see eu.indenica.iret.Operation#getMaxExecTimes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MaxExecTimes();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Operation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.indenica.iret.Operation#getId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Id();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.LinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Node</em>'.
	 * @see eu.indenica.iret.LinkNode
	 * @generated
	 */
	EClass getLinkNode();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.RefinementLink <em>Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Link</em>'.
	 * @see eu.indenica.iret.RefinementLink
	 * @generated
	 */
	EClass getRefinementLink();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.RefinementLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.indenica.iret.RefinementLink#getId()
	 * @see #getRefinementLink()
	 * @generated
	 */
	EAttribute getRefinementLink_Id();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.RefinementLink#getRefiningGoals <em>Refining Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refining Goals</em>'.
	 * @see eu.indenica.iret.RefinementLink#getRefiningGoals()
	 * @see #getRefinementLink()
	 * @generated
	 */
	EReference getRefinementLink_RefiningGoals();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.RefinementLink#getRefinedGoal <em>Refined Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refined Goal</em>'.
	 * @see eu.indenica.iret.RefinementLink#getRefinedGoal()
	 * @see #getRefinementLink()
	 * @generated
	 */
	EReference getRefinementLink_RefinedGoal();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.ANDRefinementLink <em>AND Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Refinement Link</em>'.
	 * @see eu.indenica.iret.ANDRefinementLink
	 * @generated
	 */
	EClass getANDRefinementLink();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.ORRefinementLink <em>OR Refinement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Refinement Link</em>'.
	 * @see eu.indenica.iret.ORRefinementLink
	 * @generated
	 */
	EClass getORRefinementLink();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.ContributionLink <em>Contribution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution Link</em>'.
	 * @see eu.indenica.iret.ContributionLink
	 * @generated
	 */
	EClass getContributionLink();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.ContributionLink#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see eu.indenica.iret.ContributionLink#getWeight()
	 * @see #getContributionLink()
	 * @generated
	 */
	EAttribute getContributionLink_Weight();

	/**
	 * Returns the meta object for the reference '{@link eu.indenica.iret.ContributionLink#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contributor</em>'.
	 * @see eu.indenica.iret.ContributionLink#getContributor()
	 * @see #getContributionLink()
	 * @generated
	 */
	EReference getContributionLink_Contributor();

	/**
	 * Returns the meta object for the reference '{@link eu.indenica.iret.ContributionLink#getDestinationGoal <em>Destination Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Goal</em>'.
	 * @see eu.indenica.iret.ContributionLink#getDestinationGoal()
	 * @see #getContributionLink()
	 * @generated
	 */
	EReference getContributionLink_DestinationGoal();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.ContributionLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.indenica.iret.ContributionLink#getId()
	 * @see #getContributionLink()
	 * @generated
	 */
	EAttribute getContributionLink_Id();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see eu.indenica.iret.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Reference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see eu.indenica.iret.Reference#getMultiplicity()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link eu.indenica.iret.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.indenica.iret.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.FormalDefinition <em>Formal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Definition</em>'.
	 * @see eu.indenica.iret.FormalDefinition
	 * @generated
	 */
	EClass getFormalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.FormalDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see eu.indenica.iret.FormalDefinition#getDefinition()
	 * @see #getFormalDefinition()
	 * @generated
	 */
	EAttribute getFormalDefinition_Definition();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see eu.indenica.iret.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.PrimitiveAttribute <em>Primitive Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Attribute</em>'.
	 * @see eu.indenica.iret.PrimitiveAttribute
	 * @generated
	 */
	EClass getPrimitiveAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.PrimitiveAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.indenica.iret.PrimitiveAttribute#getType()
	 * @see #getPrimitiveAttribute()
	 * @generated
	 */
	EAttribute getPrimitiveAttribute_Type();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see eu.indenica.iret.EntityAttribute
	 * @generated
	 */
	EClass getEntityAttribute();

	/**
	 * Returns the meta object for the reference '{@link eu.indenica.iret.EntityAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.indenica.iret.EntityAttribute#getType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EReference getEntityAttribute_Type();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.Variability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability</em>'.
	 * @see eu.indenica.iret.Variability
	 * @generated
	 */
	EClass getVariability();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.Variability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.indenica.iret.Variability#getDescription()
	 * @see #getVariability()
	 * @generated
	 */
	EAttribute getVariability_Description();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see eu.indenica.iret.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.indenica.iret.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.State#isIsInt <em>Is Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Int</em>'.
	 * @see eu.indenica.iret.State#isIsInt()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInt();

	/**
	 * Returns the meta object for the reference '{@link eu.indenica.iret.State#getDomInv <em>Dom Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dom Inv</em>'.
	 * @see eu.indenica.iret.State#getDomInv()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DomInv();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.GoalDiagram <em>Goal Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Diagram</em>'.
	 * @see eu.indenica.iret.GoalDiagram
	 * @generated
	 */
	EClass getGoalDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasRLink <em>Has RLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has RLink</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasRLink()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasRLink();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasBehaviouralGoal <em>Has Behavioural Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Behavioural Goal</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasBehaviouralGoal()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasBehaviouralGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasAdaptationGoal <em>Has Adaptation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Adaptation Goal</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasAdaptationGoal()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasAdaptationGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasEvent <em>Has Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Event</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasEvent()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasOper <em>Has Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Oper</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasOper()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasOper();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasEntity <em>Has Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Entity</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasEntity()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasAgent <em>Has Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Agent</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasAgent()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasAction <em>Has Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Action</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasAction()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasAction();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.GoalDiagram#getHasCLink <em>Has CLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CLink</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getHasCLink()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_HasCLink();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.GoalDiagram#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see eu.indenica.iret.GoalDiagram#isReadonly()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EAttribute getGoalDiagram_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link eu.indenica.iret.GoalDiagram#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getLabel()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EAttribute getGoalDiagram_Label();

	/**
	 * Returns the meta object for the container reference '{@link eu.indenica.iret.GoalDiagram#getIsViewOf <em>Is View Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is View Of</em>'.
	 * @see eu.indenica.iret.GoalDiagram#getIsViewOf()
	 * @see #getGoalDiagram()
	 * @generated
	 */
	EReference getGoalDiagram_IsViewOf();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.IreneModel <em>Irene Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irene Model</em>'.
	 * @see eu.indenica.iret.IreneModel
	 * @generated
	 */
	EClass getIreneModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.IreneModel#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see eu.indenica.iret.IreneModel#getContains()
	 * @see #getIreneModel()
	 * @generated
	 */
	EReference getIreneModel_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.indenica.iret.IreneModel#getHasView <em>Has View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has View</em>'.
	 * @see eu.indenica.iret.IreneModel#getHasView()
	 * @see #getIreneModel()
	 * @generated
	 */
	EReference getIreneModel_HasView();

	/**
	 * Returns the meta object for the containment reference '{@link eu.indenica.iret.IreneModel#getEasyVariability <em>Easy Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Easy Variability</em>'.
	 * @see eu.indenica.iret.IreneModel#getEasyVariability()
	 * @see #getIreneModel()
	 * @generated
	 */
	EReference getIreneModel_EasyVariability();

	/**
	 * Returns the meta object for class '{@link eu.indenica.iret.TreeElement <em>Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Element</em>'.
	 * @see eu.indenica.iret.TreeElement
	 * @generated
	 */
	EClass getTreeElement();

	/**
	 * Returns the meta object for the reference list '{@link eu.indenica.iret.TreeElement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refines</em>'.
	 * @see eu.indenica.iret.TreeElement#getRefines()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Refines();

	/**
	 * Returns the meta object for enum '{@link eu.indenica.iret.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ref Type</em>'.
	 * @see eu.indenica.iret.RefType
	 * @generated
	 */
	EEnum getRefType();

	/**
	 * Returns the meta object for enum '{@link eu.indenica.iret.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see eu.indenica.iret.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link eu.indenica.iret.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see eu.indenica.iret.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link eu.indenica.iret.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see eu.indenica.iret.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IretFactory getIretFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.indenica.iret.IreneElement <em>Irene Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.IreneElement
		 * @see eu.indenica.iret.impl.IretPackageImpl#getIreneElement()
		 * @generated
		 */
		EClass IRENE_ELEMENT = eINSTANCE.getIreneElement();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRENE_ELEMENT__DERIVED_FROM = eINSTANCE.getIreneElement_DerivedFrom();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.Parameter <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.Parameter
		 * @see eu.indenica.iret.impl.IretPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VARIABILITY = eINSTANCE.getParameter_Variability();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.AgentImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Operat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__OPERAT = eINSTANCE.getAgent_Operat();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MONITORS = eINSTANCE.getAgent_Monitors();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__CONTROLS = eINSTANCE.getAgent_Controls();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ObjectImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__ID = eINSTANCE.getObject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Is Monitored By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_MONITORED_BY = eINSTANCE.getObject_IsMonitoredBy();

		/**
		 * The meta object literal for the '<em><b>Is Controlled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_CONTROLLED_BY = eINSTANCE.getObject_IsControlledBy();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.HumanAgentImpl <em>Human Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.HumanAgentImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getHumanAgent()
		 * @generated
		 */
		EClass HUMAN_AGENT = eINSTANCE.getHumanAgent();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.AutomatedAgentImpl <em>Automated Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.AutomatedAgentImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAutomatedAgent()
		 * @generated
		 */
		EClass AUTOMATED_AGENT = eINSTANCE.getAutomatedAgent();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.EntityImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCES = eINSTANCE.getEntity_References();

		/**
		 * The meta object literal for the '<em><b>Admitted States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ADMITTED_STATES = eINSTANCE.getEntity_AdmittedStates();

		/**
		 * The meta object literal for the '<em><b>Is In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_IN_STATE = eINSTANCE.getEntity_IsInState();

		/**
		 * The meta object literal for the '<em><b>Is Input Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IS_INPUT_OF = eINSTANCE.getEntity_IsInputOf();

		/**
		 * The meta object literal for the '<em><b>Is Output Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IS_OUTPUT_OF = eINSTANCE.getEntity_IsOutputOf();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.EventImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ATTRIBUTES = eINSTANCE.getEvent_Attributes();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PARAMETERS = eINSTANCE.getEvent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Add Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ADD_ARGUMENTS = eINSTANCE.getEvent_AddArguments();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.Goal <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.Goal
		 * @see eu.indenica.iret.impl.IretPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__ID = eINSTANCE.getGoal_Id();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.BehaviouralGoalImpl <em>Behavioural Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.BehaviouralGoalImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getBehaviouralGoal()
		 * @generated
		 */
		EClass BEHAVIOURAL_GOAL = eINSTANCE.getBehaviouralGoal();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_GOAL__LEAF = eINSTANCE.getBehaviouralGoal_Leaf();

		/**
		 * The meta object literal for the '<em><b>Contributes On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_GOAL__CONTRIBUTES_ON = eINSTANCE.getBehaviouralGoal_ContributesOn();

		/**
		 * The meta object literal for the '<em><b>Operationalized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_GOAL__OPERATIONALIZED_BY = eINSTANCE.getBehaviouralGoal_OperationalizedBy();

		/**
		 * The meta object literal for the '<em><b>Formal Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_GOAL__FORMAL_DEFINITION = eINSTANCE.getBehaviouralGoal_FormalDefinition();

		/**
		 * The meta object literal for the '<em><b>Soft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_GOAL__SOFT = eINSTANCE.getBehaviouralGoal_Soft();

		/**
		 * The meta object literal for the '<em><b>Satisfaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_GOAL__SATISFACTION = eINSTANCE.getBehaviouralGoal_Satisfaction();

		/**
		 * The meta object literal for the '<em><b>Rollback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_GOAL__ROLLBACK = eINSTANCE.getBehaviouralGoal_Rollback();

		/**
		 * The meta object literal for the '<em><b>Contributed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_GOAL__CONTRIBUTED_BY = eINSTANCE.getBehaviouralGoal_ContributedBy();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_GOAL__REFINED_BY = eINSTANCE.getBehaviouralGoal_RefinedBy();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.AdaptationGoalImpl <em>Adaptation Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.AdaptationGoalImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAdaptationGoal()
		 * @generated
		 */
		EClass ADAPTATION_GOAL = eINSTANCE.getAdaptationGoal();

		/**
		 * The meta object literal for the '<em><b>Max Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_GOAL__MAX_ACTIVATIONS = eINSTANCE.getAdaptationGoal_MaxActivations();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_GOAL__TRIGGER = eINSTANCE.getAdaptationGoal_Trigger();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_GOAL__CONDITION = eINSTANCE.getAdaptationGoal_Condition();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_GOAL__HELP = eINSTANCE.getAdaptationGoal_Help();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_GOAL__ACTIONS = eINSTANCE.getAdaptationGoal_Actions();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ActionImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_TYPE = eINSTANCE.getAction_ActionType();

		/**
		 * The meta object literal for the '<em><b>Action Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_PARAMETER = eINSTANCE.getAction_ActionParameter();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.OperationImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

		/**
		 * The meta object literal for the '<em><b>Dom Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__DOM_PRE = eINSTANCE.getOperation_DomPre();

		/**
		 * The meta object literal for the '<em><b>Dom Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__DOM_POST = eINSTANCE.getOperation_DomPost();

		/**
		 * The meta object literal for the '<em><b>Req Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REQ_PRE = eINSTANCE.getOperation_ReqPre();

		/**
		 * The meta object literal for the '<em><b>Req Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REQ_POST = eINSTANCE.getOperation_ReqPost();

		/**
		 * The meta object literal for the '<em><b>Trig Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TRIG_PRE = eINSTANCE.getOperation_TrigPre();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__IN = eINSTANCE.getOperation_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUT = eINSTANCE.getOperation_Out();

		/**
		 * The meta object literal for the '<em><b>Has Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__HAS_EVENT = eINSTANCE.getOperation_HasEvent();

		/**
		 * The meta object literal for the '<em><b>Min Exec TImes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MIN_EXEC_TIMES = eINSTANCE.getOperation_MinExecTImes();

		/**
		 * The meta object literal for the '<em><b>Max Exec Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MAX_EXEC_TIMES = eINSTANCE.getOperation_MaxExecTimes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ID = eINSTANCE.getOperation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.LinkNode <em>Link Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.LinkNode
		 * @see eu.indenica.iret.impl.IretPackageImpl#getLinkNode()
		 * @generated
		 */
		EClass LINK_NODE = eINSTANCE.getLinkNode();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.RefinementLinkImpl <em>Refinement Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.RefinementLinkImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getRefinementLink()
		 * @generated
		 */
		EClass REFINEMENT_LINK = eINSTANCE.getRefinementLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINEMENT_LINK__ID = eINSTANCE.getRefinementLink_Id();

		/**
		 * The meta object literal for the '<em><b>Refining Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_LINK__REFINING_GOALS = eINSTANCE.getRefinementLink_RefiningGoals();

		/**
		 * The meta object literal for the '<em><b>Refined Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_LINK__REFINED_GOAL = eINSTANCE.getRefinementLink_RefinedGoal();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ANDRefinementLinkImpl <em>AND Refinement Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ANDRefinementLinkImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getANDRefinementLink()
		 * @generated
		 */
		EClass AND_REFINEMENT_LINK = eINSTANCE.getANDRefinementLink();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ORRefinementLinkImpl <em>OR Refinement Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ORRefinementLinkImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getORRefinementLink()
		 * @generated
		 */
		EClass OR_REFINEMENT_LINK = eINSTANCE.getORRefinementLink();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ContributionLinkImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getContributionLink()
		 * @generated
		 */
		EClass CONTRIBUTION_LINK = eINSTANCE.getContributionLink();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION_LINK__WEIGHT = eINSTANCE.getContributionLink_Weight();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION_LINK__CONTRIBUTOR = eINSTANCE.getContributionLink_Contributor();

		/**
		 * The meta object literal for the '<em><b>Destination Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION_LINK__DESTINATION_GOAL = eINSTANCE.getContributionLink_DestinationGoal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION_LINK__ID = eINSTANCE.getContributionLink_Id();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.ReferenceImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MULTIPLICITY = eINSTANCE.getReference_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.FormalDefinitionImpl <em>Formal Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.FormalDefinitionImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getFormalDefinition()
		 * @generated
		 */
		EClass FORMAL_DEFINITION = eINSTANCE.getFormalDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_DEFINITION__DEFINITION = eINSTANCE.getFormalDefinition_Definition();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.AttributeImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.PrimitiveAttributeImpl <em>Primitive Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.PrimitiveAttributeImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getPrimitiveAttribute()
		 * @generated
		 */
		EClass PRIMITIVE_ATTRIBUTE = eINSTANCE.getPrimitiveAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_ATTRIBUTE__TYPE = eINSTANCE.getPrimitiveAttribute_Type();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.EntityAttributeImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getEntityAttribute()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ATTRIBUTE__TYPE = eINSTANCE.getEntityAttribute_Type();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.VariabilityImpl <em>Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.VariabilityImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getVariability()
		 * @generated
		 */
		EClass VARIABILITY = eINSTANCE.getVariability();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY__DESCRIPTION = eINSTANCE.getVariability_Description();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.StateImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INT = eINSTANCE.getState_IsInt();

		/**
		 * The meta object literal for the '<em><b>Dom Inv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DOM_INV = eINSTANCE.getState_DomInv();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.GoalDiagramImpl <em>Goal Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.GoalDiagramImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getGoalDiagram()
		 * @generated
		 */
		EClass GOAL_DIAGRAM = eINSTANCE.getGoalDiagram();

		/**
		 * The meta object literal for the '<em><b>Has RLink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_RLINK = eINSTANCE.getGoalDiagram_HasRLink();

		/**
		 * The meta object literal for the '<em><b>Has Behavioural Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_BEHAVIOURAL_GOAL = eINSTANCE.getGoalDiagram_HasBehaviouralGoal();

		/**
		 * The meta object literal for the '<em><b>Has Adaptation Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_ADAPTATION_GOAL = eINSTANCE.getGoalDiagram_HasAdaptationGoal();

		/**
		 * The meta object literal for the '<em><b>Has Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_EVENT = eINSTANCE.getGoalDiagram_HasEvent();

		/**
		 * The meta object literal for the '<em><b>Has Oper</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_OPER = eINSTANCE.getGoalDiagram_HasOper();

		/**
		 * The meta object literal for the '<em><b>Has Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_ENTITY = eINSTANCE.getGoalDiagram_HasEntity();

		/**
		 * The meta object literal for the '<em><b>Has Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_AGENT = eINSTANCE.getGoalDiagram_HasAgent();

		/**
		 * The meta object literal for the '<em><b>Has Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_ACTION = eINSTANCE.getGoalDiagram_HasAction();

		/**
		 * The meta object literal for the '<em><b>Has CLink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__HAS_CLINK = eINSTANCE.getGoalDiagram_HasCLink();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_DIAGRAM__READONLY = eINSTANCE.getGoalDiagram_Readonly();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_DIAGRAM__LABEL = eINSTANCE.getGoalDiagram_Label();

		/**
		 * The meta object literal for the '<em><b>Is View Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_DIAGRAM__IS_VIEW_OF = eINSTANCE.getGoalDiagram_IsViewOf();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.impl.IreneModelImpl <em>Irene Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.impl.IreneModelImpl
		 * @see eu.indenica.iret.impl.IretPackageImpl#getIreneModel()
		 * @generated
		 */
		EClass IRENE_MODEL = eINSTANCE.getIreneModel();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRENE_MODEL__CONTAINS = eINSTANCE.getIreneModel_Contains();

		/**
		 * The meta object literal for the '<em><b>Has View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRENE_MODEL__HAS_VIEW = eINSTANCE.getIreneModel_HasView();

		/**
		 * The meta object literal for the '<em><b>Easy Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRENE_MODEL__EASY_VARIABILITY = eINSTANCE.getIreneModel_EasyVariability();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.TreeElement <em>Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.TreeElement
		 * @see eu.indenica.iret.impl.IretPackageImpl#getTreeElement()
		 * @generated
		 */
		EClass TREE_ELEMENT = eINSTANCE.getTreeElement();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__REFINES = eINSTANCE.getTreeElement_Refines();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.RefType <em>Ref Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.RefType
		 * @see eu.indenica.iret.impl.IretPackageImpl#getRefType()
		 * @generated
		 */
		EEnum REF_TYPE = eINSTANCE.getRefType();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.ActionType
		 * @see eu.indenica.iret.impl.IretPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.Multiplicity
		 * @see eu.indenica.iret.impl.IretPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link eu.indenica.iret.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.indenica.iret.AttributeType
		 * @see eu.indenica.iret.impl.IretPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

	}

} //IretPackage
