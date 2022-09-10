package advance.dev;

public class Teacher extends Person {
	public Teacher(String ten, int tuoi, String soDT) {
		super(ten, tuoi, soDT);
		// TODO Auto-generated constructor stub
	}

	String maGV;
	double hsl;
	double luongCB;
	
	public double tinhLuong() {
		return hsl * luongCB;
	}

	public Teacher(String ten, int tuoi, String soDT, String maGV, double hsl, double luongCB) {
		super(ten, tuoi, soDT);
		this.maGV = maGV;
		this.hsl = hsl;
		this.luongCB = luongCB;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s - age: %d - phone: %s - magv: %s - luong: %s",ten, tuoi, soDT, maGV, tinhLuong());
		
	}
	
}
