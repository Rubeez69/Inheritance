package advance.dev;

public class Person {
	protected String ten;
	protected int tuoi;
	protected String soDT;
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		if (tuoi < 0) tuoi = 0;
		this.tuoi = tuoi;
	}
	public Person(String ten, int tuoi, String soDT) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.soDT = soDT;
	}
	
	
	
}
