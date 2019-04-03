package sintaxeAbstrata;

import visitor.AbstractVisitor;

public class BlocoFor extends Comando {

	private Id id;
	private Range range;
	private CompoundComando cc;

	public BlocoFor(Id id, Range range, CompoundComando cc) {
		this.id = id;
		this.range = range;
		this.cc = cc;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
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
