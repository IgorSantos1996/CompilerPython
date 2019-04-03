package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class IntExp extends NumberAux{
	private Integer i;
	
	public IntExp(Integer i) {
		this.i = i;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		return null;
	}

}
