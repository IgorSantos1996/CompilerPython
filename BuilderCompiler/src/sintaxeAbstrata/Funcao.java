package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class Funcao extends Comando {
	private ListaParametros lp;
	private CompoundComando cc;
	
	
	public Funcao(ListaParametros lp, CompoundComando cc) {
		this.lp = lp;
		this.cc = cc;
	}
	public Funcao(CompoundComando cc) {
		this.cc = cc;
	}

	public ListaParametros getLp() {
		return lp;
	}


	public void setLp(ListaParametros lp) {
		this.lp = lp;
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
