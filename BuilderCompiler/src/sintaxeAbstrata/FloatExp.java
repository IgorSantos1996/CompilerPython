package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class FloatExp extends NumberAux {
	
	private Float f;
	
	public FloatExp(Float f) {
		this.f = f;
	}

	public Float getF() {
		return f;
	}

	public void setF(Float f) {
		this.f = f;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		return null;
	}

}
