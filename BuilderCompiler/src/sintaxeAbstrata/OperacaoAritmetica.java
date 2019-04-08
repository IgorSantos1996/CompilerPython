package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class OperacaoAritmetica {
	private OperacaoAritmetica oa;
	private T t;
	
	public OperacaoAritmetica(OperacaoAritmetica oa, T t) {
		this.oa = oa;
		this.t = t;
	}
	public OperacaoAritmetica (T t) {
		this.t = t;
	}

	public OperacaoAritmetica getOa() {
		return oa;
	}

	public void setOa(OperacaoAritmetica oa) {
		this.oa = oa;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
}
