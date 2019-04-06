package sintaxeAbstrata;

public class O {
	private O o;
	private K k;
	
	public O(O o, K k) {
		this.o = o;
		this.k = k;
	}
	
	public O(K k) {
		this.k = k;
	}
	

	public O getO() {
		return o;
	}
	public void setO(O o) {
		this.o = o;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	
}
