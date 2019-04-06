package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class BlocoIf extends Comando{

	private OperacaoLogica op;
	private CompoundComando cc;
	private BlocoElif bef;
	private BlocoElse bee;
	
	public BlocoIf(OperacaoLogica op, CompoundComando cc) {
		this.op = op;
		this.cc = cc;
	}
	public BlocoIf(OperacaoLogica op, CompoundComando cc, BlocoElif bef) {
		this.op = op;
		this.cc = cc;
		this.bef = bef;
	}
	
	public BlocoIf(OperacaoLogica op, CompoundComando cc, BlocoElse bee) {
		this.op = op;
		this.cc = cc;
		this.bee = bee;
	}
	public OperacaoLogica getOp() {
		return op;
	}

	public void setOp(OperacaoLogica op) {
		this.op = op;
	}

	public CompoundComando getCc() {
		return cc;
	}

	public void setCc(CompoundComando cc) {
		this.cc = cc;
	}

	public BlocoElif getBef() {
		return bef;
	}

	public void setBef(BlocoElif bef) {
		this.bef = bef;
	}

	public BlocoElse getBee() {
		return bee;
	}

	public void setBee(BlocoElse bee) {
		this.bee = bee;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		av.visit(this);
		return null;
	}

}
