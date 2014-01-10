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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.indenica.iret.IretPackage#getActionType()
 * @model
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>Add Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_GOAL(1, "addGoal", "addGoal"),

	/**
	 * The '<em><b>Remove Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_GOAL(2, "removeGoal", "removeGoal"),

	/**
	 * The '<em><b>Add Oper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_OPER_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_OPER(3, "addOper", "addOper"),

	/**
	 * The '<em><b>Remove Oper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_OPER_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_OPER(4, "removeOper", "removeOper"),

	/**
	 * The '<em><b>Substitute Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTE_GOAL(5, "substituteGoal", "substituteGoal"),

	/**
	 * The '<em><b>Substitute Agent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTE_AGENT(6, "substituteAgent", "substituteAgent"),

	/**
	 * The '<em><b>Substitute Oper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_OPER_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTE_OPER(7, "substituteOper", "substituteOper"),

	/**
	 * The '<em><b>Relax Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAX_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	RELAX_GOAL(8, "relaxGoal", "relaxGoal"),

	/**
	 * The '<em><b>Perform Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORM_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORM_GOAL(9, "performGoal", "performGoal"),

	/**
	 * The '<em><b>Perform Oper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORM_OPER_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORM_OPER(10, "performOper", "performOper"),

	/**
	 * The '<em><b>Remove Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_ENTITY(11, "removeEntity", "removeEntity"),

	/**
	 * The '<em><b>Add Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_ENTITY(12, "addEntity", "addEntity");

	/**
	 * The '<em><b>Add Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Add Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_GOAL
	 * @model name="addGoal"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_GOAL_VALUE = 1;

	/**
	 * The '<em><b>Remove Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_GOAL
	 * @model name="removeGoal"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_GOAL_VALUE = 2;

	/**
	 * The '<em><b>Add Oper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Add Oper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_OPER
	 * @model name="addOper"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_OPER_VALUE = 3;

	/**
	 * The '<em><b>Remove Oper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Oper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_OPER
	 * @model name="removeOper"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_OPER_VALUE = 4;

	/**
	 * The '<em><b>Substitute Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substitute Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_GOAL
	 * @model name="substituteGoal"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTE_GOAL_VALUE = 5;

	/**
	 * The '<em><b>Substitute Agent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substitute Agent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_AGENT
	 * @model name="substituteAgent"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTE_AGENT_VALUE = 6;

	/**
	 * The '<em><b>Substitute Oper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substitute Oper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_OPER
	 * @model name="substituteOper"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTE_OPER_VALUE = 7;

	/**
	 * The '<em><b>Relax Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relax Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELAX_GOAL
	 * @model name="relaxGoal"
	 * @generated
	 * @ordered
	 */
	public static final int RELAX_GOAL_VALUE = 8;

	/**
	 * The '<em><b>Perform Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perform Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORM_GOAL
	 * @model name="performGoal"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORM_GOAL_VALUE = 9;

	/**
	 * The '<em><b>Perform Oper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perform Oper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORM_OPER
	 * @model name="performOper"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORM_OPER_VALUE = 10;

	/**
	 * The '<em><b>Remove Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Entity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_ENTITY
	 * @model name="removeEntity"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_ENTITY_VALUE = 11;

	/**
	 * The '<em><b>Add Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Add Entity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_ENTITY
	 * @model name="addEntity"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_ENTITY_VALUE = 12;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
			ADD_GOAL,
			REMOVE_GOAL,
			ADD_OPER,
			REMOVE_OPER,
			SUBSTITUTE_GOAL,
			SUBSTITUTE_AGENT,
			SUBSTITUTE_OPER,
			RELAX_GOAL,
			PERFORM_GOAL,
			PERFORM_OPER,
			REMOVE_ENTITY,
			ADD_ENTITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
			case ADD_GOAL_VALUE: return ADD_GOAL;
			case REMOVE_GOAL_VALUE: return REMOVE_GOAL;
			case ADD_OPER_VALUE: return ADD_OPER;
			case REMOVE_OPER_VALUE: return REMOVE_OPER;
			case SUBSTITUTE_GOAL_VALUE: return SUBSTITUTE_GOAL;
			case SUBSTITUTE_AGENT_VALUE: return SUBSTITUTE_AGENT;
			case SUBSTITUTE_OPER_VALUE: return SUBSTITUTE_OPER;
			case RELAX_GOAL_VALUE: return RELAX_GOAL;
			case PERFORM_GOAL_VALUE: return PERFORM_GOAL;
			case PERFORM_OPER_VALUE: return PERFORM_OPER;
			case REMOVE_ENTITY_VALUE: return REMOVE_ENTITY;
			case ADD_ENTITY_VALUE: return ADD_ENTITY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActionType
