package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class Atribuicao extends Comando{
	private Id id;
	private Expr e;
	private Vetor v;
	
	public Atribuicao(Id id, Expr e) {
		this.id = id;
		this.e = e;
	}
	public Atribuicao(Id id, Vetor v) {
		this.id = id;
		this.v = v;
	}
	
	public Vetor getV() {
		return v;
	}


	public void setV(Vetor v) {
		this.v = v;
	}


	public Id getId() {
		return id;
	}


	public void setId(Id id) {
		this.id = id;
	}

	public Expr getE() {
		return e;
	}

	public void setE(Expr e) {
		this.e = e;
	}

	

	@Override
	public Object accept(AbstractVisitor av) {
		av.visit(this);
		return null;
	}

}
