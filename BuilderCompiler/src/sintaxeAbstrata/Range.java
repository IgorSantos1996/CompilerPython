package sintaxeAbstrata;

public class Range  {
	private RangeValues rv;
	private RangeValues rv01;
	private RangeValues rv02;
	
	public Range(RangeValues rv) {
		this.rv = rv;
	}
	
	public Range(RangeValues rv, RangeValues rv01) {
		this.rv = rv;
		this.rv01 = rv01;
	}
	

	public Range(RangeValues rv, RangeValues rv01, RangeValues rv02) {
		this.rv = rv;
		this.rv01 = rv01;
		this.rv02 = rv02;
	}

	public RangeValues getRv() {
		return rv;
	}
	public void setRv(RangeValues rv) {
		this.rv = rv;
	}
	public RangeValues getRv01() {
		return rv01;
	}
	public void setRv01(RangeValues rv01) {
		this.rv01 = rv01;
	}
	public RangeValues getRv02() {
		return rv02;
	}
	public void setRv02(RangeValues rv02) {
		this.rv02 = rv02;
	}
	
	
}
