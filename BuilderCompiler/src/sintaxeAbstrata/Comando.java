package sintaxeAbstrata;

import visitor.AbstractVisitor;

public abstract class Comando {
	public abstract Object accept(AbstractVisitor av);
}
