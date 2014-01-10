package eu.indenica.iret.diagram.wizard.beans;

import eu.indenica.iret.IreneElement;

public class IreneElementPair {
	private IreneElement firstModelNode;
	private IreneElement secondModelNode;
	
	
	
	public IreneElementPair(IreneElement firstModelNode,
			IreneElement secondModelNode) {
		super();
		this.firstModelNode = firstModelNode;
		this.secondModelNode = secondModelNode;
	}



	public IreneElement getFirstModelNode() {
		return firstModelNode;
	}



	public void setFirstModelNode(IreneElement firstModelNode) {
		this.firstModelNode = firstModelNode;
	}



	public IreneElement getSecondModelNode() {
		return secondModelNode;
	}



	public void setSecondModelNode(IreneElement secondModelNode) {
		this.secondModelNode = secondModelNode;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IreneElementPair)
			if(firstModelNode.equals(((IreneElementPair)obj).getFirstModelNode()) && secondModelNode.equals(((IreneElementPair)obj).getSecondModelNode()))
				return true;
		return false;
	}
}
