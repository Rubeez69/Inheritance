package advance.dev;

public class Student extends Person {
	public Student(String ten, int tuoi, String soDT) {
		super(ten, tuoi, soDT);
		// TODO Auto-generated constructor stub
	}

	double diemToan;
	double diemLy;
	double diemHoa;
	String maSV;
	String lop;
	
	public double diemTB() {
		return (diemToan + diemLy + diemHoa)/3;
	}

	public Student(String ten, int tuoi, String soDT, double diemToan, double diemLy, double diemHoa, String maSV,
			String lop) {
		super(ten, tuoi, soDT);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSV = maSV;
		this.lop = lop;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s - age: %d - phone: %s - masv: %s - lop: %s - dtb: %.2f",ten, tuoi, soDT, maSV, lop, diemTB());
	}
}
