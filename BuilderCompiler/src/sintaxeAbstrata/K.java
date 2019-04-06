package sintaxeAbstrata;

public class K {
	private K k;
	private OperacaoAritmetica pl;

	
	public K(K k, OperacaoAritmetica pl) {
		this.k = k;
		this.pl = pl;
	}

	public K(OperacaoAritmetica pl) {

		this.pl = pl;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}
	

}
