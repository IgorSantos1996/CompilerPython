package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class StringExp extends Expr{
	private String s;
	
	public StringExp(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		return null;
	}

}
