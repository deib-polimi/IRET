/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL - Politecnico di Milano
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

import eu.indenica.iret.IreneElement;
import eu.indenica.iret.diagram.similarity.IRETMergeSimilarities;
import eu.indenica.iret.diagram.similarity.SimilarityEvaluator;
import eu.indenica.iret.diagram.wizard.beans.IRETMergeViewConfiguration;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;
import eu.indenica.iret.diagram.part.IretDiagramEditor;
import eu.indenica.iret.diagram.part.IretMergeUtil;
import eu.indenica.iret.diagram.perspective.SimilarityPanelRow;
import org.eclipse.swt.widgets.Scale;

public class MergeViewPart extends ViewPart implements IPropertyChangeListener {

	Label lblEntry1;
	private ScrolledComposite scrolledComposite;
	private static Composite composite;
	Button btnDoMerge;
	DoMergeListener listener=new DoMergeListener();

	private Integer confideceIndex=100;
	private static Map<IreneElementPair, Button> SimilarityPanelStruct = new HashMap<IreneElementPair, Button>();

	public MergeViewPart() {
		// TODO Auto-generated constructor stub
	}

	public Map<IreneElementPair, Button> getSimilarityPanelStruct () {
		return SimilarityPanelStruct;
	}

	@Override
	public void createPartControl(Composite parent) {
		SimilarityEvaluator.getInstance().addPropertyChangeListener(this);

		scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);
		scrolledComposite.setMinHeight(1370);

		composite = new Composite(scrolledComposite, SWT.NONE);
		GridLayout gl_composite = new GridLayout(4, false);
		composite.setLayout(gl_composite);

		composite.addListener(SWT.Resize, new Listener() {
			int width=-1;
			@Override
			public void handleEvent(Event event) {
				int newWidth = composite.getSize().x;
				if(newWidth!=width){
					scrolledComposite.setMinHeight(composite.computeSize(newWidth, SWT.DEFAULT).y);
					width=newWidth;
				}
			}
		});
						new Label(composite, SWT.NONE);
						
		
						Label lblSemanticConfidence = new Label(composite, SWT.NONE);
						lblSemanticConfidence.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
						lblSemanticConfidence.setText("SEMANTIC CONFIDENCE   0");
		
						
						
								
										final Scale scale = new Scale(composite, SWT.NONE);
										scale.setSelection(100);								
										GridData gd_scale = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_scale.widthHint = 129;
										scale.setLayoutData(gd_scale);
										
												scale.addListener(SWT.MouseUp,new Listener() {
													@Override
													public void handleEvent(org.eclipse.swt.widgets.Event event) {
														// TODO Auto-generated method stub
														confideceIndex=scale.getSelection();
														SimilarityEvaluator dse = SimilarityEvaluator.getInstance();
														dse.computeSimilarities(confideceIndex);
														
														//RESET SHAPE BACKGROUND COLOR
														DoChangeShapeColorListener.ResetAll();
										
													}
												});
										
												Label label_1 = new Label(composite, SWT.NONE);
												label_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
												label_1.setText("1");
		
		Label label_4 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label_4 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_label_4.widthHint = 230;
		label_4.setLayoutData(gd_label_4);
				
						btnDoMerge = new Button(composite, SWT.NONE);
						btnDoMerge.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
						btnDoMerge.setText("MERGE");
						
								btnDoMerge.addSelectionListener(listener);
				new Label(composite, SWT.NONE);
		
		Label label_2 = new Label(composite, SWT.BORDER);
		label_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		label_2.setText("SELECT THE CONDITIONS");
		
		Label lblAcceptDiscard = new Label(composite, SWT.NONE);
		lblAcceptDiscard.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblAcceptDiscard.setText("ACCEPT   DISCARD   CONFIDENCE");
		lblAcceptDiscard.setAlignment(SWT.CENTER);
		
		/*
		Label lbl_c = new Label(composite, SWT.NONE);
		lbl_c.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lbl_c.setText("");
		 */

		scrolledComposite.setContent(composite);

	}

	@Override
	public void setFocus() {

	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		System.out.println("PropertyChange entered");
		List<String> imsgt=new ArrayList<String>();
		List<Integer> lci=new ArrayList<Integer>();
		List<IreneElementPair> imsgn=new ArrayList<IreneElementPair>();

		if(event.getProperty().equals("NewSimilarity")) {
			Object os = event.getNewValue();
			if(os==null){
				System.out.println("No similarities");
			}
			else if(os instanceof IRETMergeSimilarities){
				IRETMergeSimilarities ims = (IRETMergeSimilarities)os;

				btnDoMerge.setVisible(true);

				imsgt=ims.getTupla();
				imsgn=ims.getNodes();
				lci=ims.getConfidenceIndex();

				for(Control c : composite.getChildren()){
					if(c instanceof Composite)
						c.dispose();
				}

				SimilarityPanelStruct.clear();

				Composite body = new Composite(composite, SWT.NONE);

				body.setLayout(new GridLayout(3, false));
				GridData gd_body = new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1);
				body.setLayoutData(gd_body);


				for(int l=0;l<imsgt.size();l++){
					if(lci.get(l)>=confideceIndex)
					{
						SimilarityPanelRow l1=new SimilarityPanelRow(body, imsgt.get(l), lci.get(l).toString(),imsgn.get(l), ims.getMergeModelMap());	
						l1.drawLine();
						SimilarityPanelStruct.put(imsgn.get(l),l1.getbtnAccept());
					}
				}

				//				Button btnDoMerge = new Button(body, SWT.NONE);
				//				btnDoMerge.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 5, 1));
				//				btnDoMerge.setText("MERGE");

				Object o = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getData("eu.indenica.iret.diagram.perspective.merge.views");

				//BASILIO IMPORTANTE: switchare e pulire la nuova View
				if(o==null){
					System.out.println("No input parameter");
				}
				else if(o instanceof IRETMergeViewConfiguration){
					IRETMergeViewConfiguration imvc = (IRETMergeViewConfiguration)o;

					listener.SetDoMergeListener(imvc,ims,SimilarityPanelStruct,btnDoMerge);
				}

				body.layout();

				composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT, true));
				composite.layout();	

				scrolledComposite.setMinHeight(composite.getSize().y);

				scrolledComposite.pack();
				scrolledComposite.redraw();
				scrolledComposite.layout(true);

				scrolledComposite.getParent().pack();
				scrolledComposite.getParent().redraw();
				scrolledComposite.getParent().layout(true, true);
			}

		}

	}
}
