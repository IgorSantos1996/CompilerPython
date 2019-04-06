package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class CompoundComando extends Comando {
	
	private Comando cm0;
	private Comando cm1;
	
	public CompoundComando(Comando cm0, Comando cm1) {
		this.cm0 = cm0;
		this.cm1 = cm1;
	}
	public CompoundComando(Comando cm0) {
		this.cm0 = cm0;
	}
	public Comando getCm0() {
		return cm0;
	}
	public void setCm0(Comando cm0) {
		this.cm0 = cm0;
	}
	public Comando getCm1() {
		return cm1;
	}
	public void setCm1(Comando cm1) {
		this.cm1 = cm1;
	}
	@Override
	public Object accept(AbstractVisitor av) {
		av.visit(this);
		return null;
	}

}
