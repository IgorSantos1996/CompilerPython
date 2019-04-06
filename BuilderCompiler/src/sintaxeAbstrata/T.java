package sintaxeAbstrata;

public class T {
	private T t;
	private Y y;
	public T(T t, Y y) {
		this.t = t;
		this.y = y;
	}
	public T(Y y){
		this.y = y;
	}

	public Y getY() {
		return y;
	}


	public void setY(Y y) {
		this.y = y;
	}


	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
