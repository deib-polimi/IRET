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
package eu.indenica.iret.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import eu.indenica.iret.IretPackage;
import eu.indenica.iret.diagram.edit.parts.AdaptationGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.AutomatedAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.BehaviouralGoalNameEditPart;
import eu.indenica.iret.diagram.edit.parts.ContributionLinkWeightEditPart;
import eu.indenica.iret.diagram.edit.parts.EntityNameEditPart;
import eu.indenica.iret.diagram.edit.parts.EventNameEditPart;
import eu.indenica.iret.diagram.edit.parts.HumanAgentNameEditPart;
import eu.indenica.iret.diagram.edit.parts.OperationNameEditPart;
import eu.indenica.iret.diagram.parsers.MessageFormatParser;
import eu.indenica.iret.diagram.part.IretVisualIDRegistry;

/**
 * @generated
 */
public class IretParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser behaviouralGoalName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getBehaviouralGoalName_5001Parser() {
		if (behaviouralGoalName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getGoal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			behaviouralGoalName_5001Parser = parser;
		}
		return behaviouralGoalName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser humanAgentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getHumanAgentName_5002Parser() {
		if (humanAgentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			humanAgentName_5002Parser = parser;
		}
		return humanAgentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser automatedAgentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAutomatedAgentName_5003Parser() {
		if (automatedAgentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			automatedAgentName_5003Parser = parser;
		}
		return automatedAgentName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5004Parser() {
		if (operationName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5004Parser = parser;
		}
		return operationName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5005Parser() {
		if (entityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5005Parser = parser;
		}
		return entityName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEventName_5006Parser() {
		if (eventName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventName_5006Parser = parser;
		}
		return eventName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser contributionLinkWeight_5007Parser;

	/**
	 * @generated
	 */
	private IParser getContributionLinkWeight_5007Parser() {
		if (contributionLinkWeight_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getContributionLink_Weight() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contributionLinkWeight_5007Parser = parser;
		}
		return contributionLinkWeight_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser adaptationGoalName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAdaptationGoalName_5008Parser() {
		if (adaptationGoalName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { IretPackage.eINSTANCE
					.getGoal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adaptationGoalName_5008Parser = parser;
		}
		return adaptationGoalName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BehaviouralGoalNameEditPart.VISUAL_ID:
			return getBehaviouralGoalName_5001Parser();
		case HumanAgentNameEditPart.VISUAL_ID:
			return getHumanAgentName_5002Parser();
		case AutomatedAgentNameEditPart.VISUAL_ID:
			return getAutomatedAgentName_5003Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5004Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5005Parser();
		case EventNameEditPart.VISUAL_ID:
			return getEventName_5006Parser();
		case ContributionLinkWeightEditPart.VISUAL_ID:
			return getContributionLinkWeight_5007Parser();
		case AdaptationGoalNameEditPart.VISUAL_ID:
			return getAdaptationGoalName_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(IretVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(IretVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (IretElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
