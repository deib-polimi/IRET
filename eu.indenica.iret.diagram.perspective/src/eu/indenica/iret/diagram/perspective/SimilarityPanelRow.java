/*******************************************************************************
 * Copyright 2010-2013 CEFRIEL - Politecnico di Milano
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

import org.eclipse.swt.widgets.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import eu.indenica.iret.IreneElement;
import eu.indenica.iret.diagram.wizard.beans.IreneElementPair;


public class SimilarityPanelRow {


	private static Composite _composite;
	private Button btnEntry1Yes, btnEntry1No;
	private Label lbl, lblConfidence, lblpConfidence;
	private static String _txt, _ctxt;
	private IreneElementPair _nodi;
	Map<IreneElement,IreneElement> _MergeModelMap;



	public SimilarityPanelRow(Composite composite, String ltxt, String confidenceValue, IreneElementPair nodi, Map<IreneElement,IreneElement> MergeModelMap) {
		_composite=composite;
		_txt=ltxt;
		_ctxt=confidenceValue;
		_nodi=nodi;
		_MergeModelMap=MergeModelMap;
	}

	private Group _group;




	public void drawLine() {
		lbl = new Label(_composite, SWT.NONE);
		GridData gd=new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd.widthHint = 230;
		lbl.setLayoutData(gd);
		lbl.setText(_txt);
		
		
		_group = new Group(_composite, SWT.NONE);
		GridData gd_group = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_group.widthHint = 100;
		gd_group.heightHint = 27;
		_group.setLayoutData(gd_group);
		


		btnEntry1Yes = new Button(_group, SWT.RADIO);
		//btnEntry1Yes.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		btnEntry1Yes.setBounds(10, 4, 27, 27);
		btnEntry1Yes.setData(_nodi);

		DoChangeShapeColorListener listener=new DoChangeShapeColorListener(btnEntry1Yes.getData(), _MergeModelMap, true); 
		btnEntry1Yes.addSelectionListener(listener);

		btnEntry1No = new Button(_group, SWT.RADIO);
		//btnEntry1No.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		btnEntry1No.setBounds(60, 4, 27, 27);
		btnEntry1No.setSelection(true);
		btnEntry1No.setData(_nodi);
		DoChangeShapeColorListener listenerN=new DoChangeShapeColorListener(btnEntry1No.getData(), _MergeModelMap); 
			btnEntry1No.addSelectionListener(listenerN);
		
		lblConfidence = new Label(_composite, SWT.CENTER);
		//lblConfidence.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblConfidence.setText(_ctxt);

		



			
		//return _group;
	}	

	public Button getbtnAccept(){
		return btnEntry1Yes;
	}

}
