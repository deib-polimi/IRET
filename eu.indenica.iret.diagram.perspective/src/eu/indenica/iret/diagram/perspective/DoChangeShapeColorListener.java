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
package eu.indenica.iret.diagram.perspective;

import java.util.Map;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import eu.indenica.iret.IreneElement;
import eu.indenica.iret.diagram.part.IretDiagramEditor;
import eu.indenica.iret.diagram.part.IretMergeUtil;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;

public class DoChangeShapeColorListener implements SelectionListener {
	Object _iep;
	Map<IreneElement,IreneElement> _MergeModelMap;
	Boolean _y;

	public DoChangeShapeColorListener (Object iep, Map<IreneElement,IreneElement> MergeModelMap, Boolean y){
		_iep=iep;
		_MergeModelMap=MergeModelMap;
		_y=y;
	}
	public DoChangeShapeColorListener (Object iep, Map<IreneElement,IreneElement> MergeModelMap){
		_iep=iep;
		_MergeModelMap=MergeModelMap;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		IreneElement node=((IreneElementPair)_iep).getFirstModelNode();

		//---------------
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();	
		IretDiagramEditor idge;
		IEditorPart edtr = page.getActiveEditor();
		idge = (IretDiagramEditor)edtr;


		if(edtr instanceof IretDiagramEditor){


			for(IreneElement hNodo : _MergeModelMap.keySet())
			{
				if(hNodo==node) {
					final ShapeNodeEditPart ep=IretMergeUtil.getNodeEditPart(idge, _MergeModelMap.get(hNodo));

					idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
						@Override
						protected void doExecute() {
							ShapeImpl notationView = (ShapeImpl) ep.getNotationView();


							if(_y==null)
								notationView.setFillColor(0xffffff);
							else
							{		
//								if(notationView.getFillColor()==0x00f6fa)
//									notationView.setFillColor(Color.GREEN.getRGB());
//								else
									notationView.setFillColor(0x00f6fa);
							}

							ep.refresh();
						}
					});											
				}
			}

		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}
	
	public static void ResetAll() {
		//undo background highlight
		IEditorPart edtr = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(edtr instanceof IretDiagramEditor){
			IretDiagramEditor idge = (IretDiagramEditor)edtr;

			for(Object o: idge.getDiagramGraphicalViewer().getEditPartRegistry().values()){
				if(o !=null && o instanceof ShapeNodeEditPart){
					final ShapeNodeEditPart ep = (ShapeNodeEditPart)o;
					idge.getEditingDomain().getCommandStack().execute(new RecordingCommand(idge.getEditingDomain()) {
						@Override
						protected void doExecute() {
							ShapeImpl notationView = (ShapeImpl) ep.getNotationView();
							notationView.setFillColor(0xffffff);
							ep.refresh();
						}
					});	
				}
			}
		}		
	}

}
