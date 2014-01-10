/*******************************************************************************
 * Copyright (c) 2008 Conselleria de Infraestructuras y Transporte, Generalitat 
 * de la Comunitat Valenciana . All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Francisco Javier Cano Muñoz (Prodevelop) – Initial implementation.
 *
 ******************************************************************************/
package eu.indenica.iret.diagram.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

// TODO: Auto-generated Javadoc
/**
 * A DragAndDropEditPolicy for <Diagram>s. Checks whether the dropped elements
 * can be shown as views in the canvas and if so, creates their views and add
 * their references to the diagram's list of references.
 * 
 * @author <a href="mailto:fjcano@prodevelop.es">Francisco Javier Cano Muñoz</a>
 */
public class DiagramDragDropEditPolicy
		extends
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy {

//	/** The resolver. */
//	private ViewResolver resolver = null;
//
//	/**
//	 * Instantiates a new diagram drag drop edit policy.
//	 * 
//	 * @param resolver the resolver
//	 */
//	public DiagramDragDropEditPolicy(ViewResolver resolver) {
//		this.resolver = resolver;
//	}

	/**
	 * Gets the graphical host.
	 * 
	 * @return the graphical host
	 */
	public IGraphicalEditPart getGraphicalHost() {
		if (getHost() instanceof IGraphicalEditPart) {
			return (IGraphicalEditPart) getHost();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy#getDropObjectsCommand(org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest)
	 */
	@Override
	public Command getDropObjectsCommand(DropObjectsRequest dropRequest) {
		// get nodes and edges to add to this Diagram.
		List<EObject> nodeObjects = findNodesInDrop(dropRequest);
		List<ViewDescriptor> viewDescriptors = createViewDescriptors(nodeObjects);
		List<EObject> edgeObjects = findEdgesInDrop(dropRequest);
		// build commands that add references to the diagram.
		Command command = buildAddEObjectsReferencesCommand(nodeObjects);
		Command edgesCommand = buildAddEObjectsReferencesCommand(edgeObjects);
		command = command == null ? edgesCommand : command.chain(edgesCommand);
		// if no nodes or edges are to be added, there is nothing to do.
		if (command == null) {
			return null;
		}
		// build the create views commands.
		Command viewsCommand = createViewsAndArrangeCommand(dropRequest,
				viewDescriptors);
		if (viewsCommand != null && viewsCommand.canExecute()) {
			command = command.chain(viewsCommand);
		}
		// update diagram.
		command = command.chain(new UpdateDiagramCommand(getGraphicalHost()));
		
		// return command
		return command;
	}

	/**
	 * Find nodes in drop.
	 * 
	 * @param request the request
	 * 
	 * @return the list< e object>
	 */
	protected List<EObject> findNodesInDrop(DropObjectsRequest request) {
		List<EObject> nodes = new ArrayList<EObject>();
		for (Object object : request.getObjects()) {
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				if (isEObjectNode(element)) {
					nodes.add(element);
				}
			}
		}
		return nodes;
	}
	
	private boolean isEObjectNode(Object object) {
		return object instanceof EObject;
	}

	private boolean isEObjectLink(Object object) {
		return object instanceof EObject;
	}

	/**
	 * Find edges in drop.
	 * 
	 * @param request the request
	 * 
	 * @return the list< e object>
	 */
	protected List<EObject> findEdgesInDrop(DropObjectsRequest request) {
		List<EObject> edges = new ArrayList<EObject>();
		for (Object object : request.getObjects()) {
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				if (isEObjectLink(element)) {
					edges.add(element);
				}
			}
		}
		return edges;
	}

	/**
	 * Creates the view descriptors.
	 * 
	 * @param elements the elements
	 * 
	 * @return the list< view descriptor>
	 */
	protected List<ViewDescriptor> createViewDescriptors(List<EObject> elements) {
		List<ViewDescriptor> viewDescriptors = new ArrayList<ViewDescriptor>();
		for (EObject element : elements) {
			int semanticHint = -1;
//			resolver.getEObjectSemanticHint(element);
			if (semanticHint > -1) {
				ViewDescriptor viewDescriptor = new ViewDescriptor(
						new EObjectAdapter(element), Node.class, String
								.valueOf(semanticHint), getGraphicalHost()
								.getDiagramPreferencesHint());
				viewDescriptors.add(viewDescriptor);
			}
		}
		return viewDescriptors;
	}

	/**
	 * Builds the add e objects references command.
	 * 
	 * @param elements the elements
	 * 
	 * @return the command
	 */
	protected Command buildAddEObjectsReferencesCommand(List<EObject> elements) {
		if (elements != null && elements.size() > 0) {
			TransactionalEditingDomain domain = getGraphicalHost()
					.getEditingDomain();
			View view = getGraphicalHost().getNotationView();
			Diagram diagram = view instanceof Diagram ? (Diagram) view : null;
			if (diagram != null) {
				return new ICommandProxy(new AddEObjectReferencesToDiagram(
						domain, diagram, elements));
			}
		}
		return null;
	}

	
	public class UpdateDiagramCommand extends Command {

		/** The edit part. */
		private IGraphicalEditPart editPart;

		/**
		 * Instantiates a new uML update diagram command.
		 * 
		 * @param editPart
		 *            the edit part
		 */
		public UpdateDiagramCommand(IGraphicalEditPart editPart) {
			this.editPart = editPart;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.commands.Command#canExecute()
		 */
		@Override
		public boolean canExecute() {
			return editPart != null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.commands.Command#canUndo()
		 */
		@Override
		public boolean canUndo() {
			return editPart != null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.commands.Command#execute()
		 */
		@Override
		public void execute() {
			System.out.println("Execute");
		}

		@Override
		public void undo() {
			// super.undo();
			//
			System.out.println("Undo");
		}
	}
	
	public class AddEObjectReferencesToDiagram extends AbstractTransactionalCommand {

		/** The diagram. */
		private Diagram diagram = null;
		
		/** The e objects. */
		private List<EObject> eObjects = null;
		
		/**
		 * Instantiates a new adds the e object references to diagram.
		 * 
		 * @param domain the domain
		 * @param diagram the diagram
		 * @param eObjects the e objects
		 */
		public AddEObjectReferencesToDiagram(TransactionalEditingDomain domain, Diagram diagram, List<EObject> eObjects) {
			super(domain, "Add EObject references to Diagram", null);
			this.diagram = diagram;
			this.eObjects = eObjects;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.core.commands.operations.AbstractOperation#canExecute()
		 */
		@Override
		public boolean canExecute() {
			return diagram != null;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
		 */
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			for (EObject eObject : eObjects) {
				addReferences(eObject);
			}
			return CommandResult.newOKCommandResult();
		}

		/**
		 * Adds the references.
		 * 
		 * @param eObject the e object
		 */
		private void addReferences(EObject eObject) {
			for (EObject e : eObject.eContents()) {
				addReferences(e);
			}
			System.out.println("AAA");
//			MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram, eObject);
		}
		
	}
}
