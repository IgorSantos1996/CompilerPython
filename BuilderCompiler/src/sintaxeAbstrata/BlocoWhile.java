package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class BlocoWhile extends Comando {
	private OperacaoLogica op;
	private CompoundComando cc;
	
	public BlocoWhile(OperacaoLogica op, CompoundComando cc) {
		this.op = op;
		this.cc = cc;
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

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		return null;
	}

}
