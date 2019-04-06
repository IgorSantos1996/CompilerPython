package visitor;

import sintaxeAbstrata.Atribuicao;
import sintaxeAbstrata.AuxVetor;
import sintaxeAbstrata.BlocoElif;
import sintaxeAbstrata.BlocoElse;
import sintaxeAbstrata.BlocoFor;
import sintaxeAbstrata.BlocoIf;
import sintaxeAbstrata.BlocoRange;
import sintaxeAbstrata.BlocoWhile;
import sintaxeAbstrata.Booleanos;
import sintaxeAbstrata.CompoundComando;
import sintaxeAbstrata.FloatExp;
import sintaxeAbstrata.Funcao;
import sintaxeAbstrata.Id;
import sintaxeAbstrata.IntExp;
import sintaxeAbstrata.K;
import sintaxeAbstrata.ListaParametros;
import sintaxeAbstrata.ListaParametrosAux;
import sintaxeAbstrata.O;
import sintaxeAbstrata.OperacaoAritmetica;
import sintaxeAbstrata.OperacaoLogica;
import sintaxeAbstrata.PrecedenciaLogica;
import sintaxeAbstrata.Range;
import sintaxeAbstrata.RangeValues;
import sintaxeAbstrata.StringExp;
import sintaxeAbstrata.T;
import sintaxeAbstrata.Vetor;
import sintaxeAbstrata.Y;

public abstract class AbstractVisitor {
	public abstract Object visit(Atribuicao a);
	public abstract Object visit(AuxVetor a);
	public abstract Object visit(BlocoElif e);
	public abstract Object visit(BlocoElse e);
	public abstract Object visit(BlocoFor f);
	public abstract Object visit(BlocoIf bl);
	public abstract Object visit(BlocoWhile bw);
	public abstract Object visit(Booleanos b);
	public abstract Object visit(CompoundComando c);
	public abstract Object visit(FloatExp e);
	public abstract Object visit(Funcao f);
	public abstract Object visit(Id id);
	public abstract Object visit(IntExp e);
	public abstract Object visit(K e);
	public abstract Object visit(ListaParametros l);
	public abstract Object visit(ListaParametrosAux ap);
	public abstract Object visit(O o);
	public abstract Object visit(OperacaoAritmetica oa);
	public abstract Object visit(OperacaoLogica op);
	public abstract Object visit(PrecedenciaLogica a);
	public abstract Object visit(Range r);
	public abstract Object visit(RangeValues r);
	public abstract Object visit(StringExp a);
	public abstract Object visit(T t);
	public abstract Object visit(Vetor v);
	public abstract Object visit(Y y );
	
	
	
	
	
}
