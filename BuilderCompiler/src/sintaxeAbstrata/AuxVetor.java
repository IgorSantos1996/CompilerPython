package sintaxeAbstrata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuxVetor {
	List<Object> listinha = new ArrayList<Object>();

	public AuxVetor(List<Object> listinha) {
		for (Object o : listinha) {
			listinha.add(o);
		}
	}
	public List<Object> getListinha() {
		return listinha;
	}

	public void setListinha(List<Object> listinha) {
		this.listinha = listinha;
	}
	
}
