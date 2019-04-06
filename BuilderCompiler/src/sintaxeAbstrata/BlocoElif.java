package sintaxeAbstrata;

public class BlocoElif {
	private OperacaoLogica op;
	private CompoundComando cc;
	public BlocoElif(OperacaoLogica op, CompoundComando cc) {
		
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
	
}
