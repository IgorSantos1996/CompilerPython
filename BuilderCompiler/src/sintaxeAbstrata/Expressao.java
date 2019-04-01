package sintaxeAbstrata;

import visitor.AbstractVisitor;

public abstract class Expressao {
	public abstract Object accept(AbstractVisitor av);
}
