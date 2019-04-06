package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class Vetor extends Comando{
	private AuxVetor a;
	
	public Vetor(AuxVetor a) {
		super();
		this.a = a;
	}

	public AuxVetor getA() {
		return a;
	}

	public void setA(AuxVetor a) {
		this.a = a;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		av.visit(this);
		return null;
	}

}
