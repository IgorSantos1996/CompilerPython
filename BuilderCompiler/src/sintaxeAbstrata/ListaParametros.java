package sintaxeAbstrata;

import java.util.ArrayList;
import java.util.List;

public class ListaParametros {
	private Id id;
	private List<Object> list = new ArrayList<Object>();
	
	
	public ListaParametros(Id id, List<Object> list) {
		this.id = id;
		for (Object a : list) {
			list.add(a);
		}
	}
	public ListaParametros(Id id) {
		this.id = id;
	}
	
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
}
