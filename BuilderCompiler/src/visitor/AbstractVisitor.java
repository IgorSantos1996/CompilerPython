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

public abstract class AbstractVisitor {
	public abstract Object visit(Atribuicao a);
	
	public abstract Object visit(BlocoFor f);
	public abstract Object visit(BlocoIf bl);
	public abstract Object visit(BlocoWhile bw);
	public abstract Object visit(CompoundComando c);
	public abstract Object visit(FloatExp e);
	public abstract Object visit(Funcao f);	
	public abstract Object visit(IntExp e);
	public abstract Object visit(OperacaoLogica op);	
	public abstract Object visit(Vetor v);
	
}
