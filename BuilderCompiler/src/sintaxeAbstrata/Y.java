package sintaxeAbstrata;

public class Y {
	private StringExp e;
	private Id id;
	private NumberAux a;
	private Booleanos f;
		
	public Y(StringExp e) {
		this.e = e;
	}
		
	public Y(Id id) {
		this.id = id;
	}

	public Y(NumberAux a) {
		this.a = a;
	}

	public Y(Booleanos f) {
		this.f = f;
	}


	public StringExp getE() {
		return e;
	}
	public void setE(StringExp e) {
		this.e = e;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public NumberAux getA() {
		return a;
	}
	public void setA(NumberAux a) {
		this.a = a;
	}
	public Booleanos getF() {
		return f;
	}
	public void setF(Booleanos f) {
		this.f = f;
	}
	
}
