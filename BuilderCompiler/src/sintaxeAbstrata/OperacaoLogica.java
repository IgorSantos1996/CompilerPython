package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class OperacaoLogica extends Expr{

	private OperacaoLogica ol;
	private PrecedenciaLogica pl;
	private O o;
	
	public OperacaoLogica(OperacaoLogica ol, PrecedenciaLogica pl) {
		
		this.ol = ol;
		this.pl = pl;
	}
	public OperacaoLogica ( O o) {
		this.o = o;
	}

	public OperacaoLogica getOl() {
		return ol;
	}

	public void setOl(OperacaoLogica ol) {
		this.ol = ol;
	}

	public PrecedenciaLogica getPl() {
		return pl;
	}

	public void setPl(PrecedenciaLogica pl) {
		this.pl = pl;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		
		return null;
	}

}
