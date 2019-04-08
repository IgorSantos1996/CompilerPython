package visitor;

import sintaxeAbstrata.Atribuicao;
import sintaxeAbstrata.BlocoFor;
import sintaxeAbstrata.BlocoIf;
import sintaxeAbstrata.BlocoWhile;
import sintaxeAbstrata.CompoundComando;
import sintaxeAbstrata.FloatExp;
import sintaxeAbstrata.Funcao;
import sintaxeAbstrata.IntExp;
import sintaxeAbstrata.OperacaoLogica;
import sintaxeAbstrata.Vetor;

public class PPVisitor extends AbstractVisitor {

	@Override
	public Object visit(Atribuicao a) {
		
		return null;
	}
	

	@Override
	public Object visit(BlocoFor f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(BlocoIf bl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(BlocoWhile bw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(CompoundComando c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(FloatExp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Funcao f) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object visit(IntExp e) {
		
		return null;
	}

	@Override
	public Object visit(OperacaoLogica op) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Vetor v) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
