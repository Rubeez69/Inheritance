package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person[] persons = new Person[5];
		input(persons);
		print(persons);
		findTeacher(persons);
		findStudent(persons);
		
		
	}

	private static void findStudent(Person[] persons) {
		// TODO Auto-generated method stub
		double max = 0;
		int store = 0;
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				Student std = (Student) persons[i];
				if (max < std.diemTB()) {
					max = std.diemTB();
					store = i;
				}
			}
		}
		System.out.println(persons[store]);
	}

	private static void findTeacher(Person[] persons) {
		// TODO Auto-generated method stub
		double max = 0;
		int store = 0;
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Teacher ) {
				Teacher tc = (Teacher) persons[i];
				if (max < tc.tinhLuong()) {
					max = tc.tinhLuong();
					store = i;
				}
			}
		}
		System.out.println(persons[store]);
		
	}

	private static void print(Person[] persons) {
		// TODO Auto-generated method stub
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}

	private static void input(Person[] persons) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 2 giao vien: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ten: ");
			String ten = sc.nextLine();
			
			System.out.println("Nhap tuoi: ");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhap so dien thoai: ");
			String phone = sc.nextLine();
			
			System.out.println("Nhap ma giao vien: ");
			String mgv = sc.nextLine();
			
			System.out.println("Nhap he so luong: ");
			double hsl = Double.parseDouble(sc.nextLine());
			
			System.out.println("Nhap luong co ban: ");
			double lcb = Double.parseDouble(sc.nextLine());
			
			Teacher tc = new Teacher(ten, age, phone, mgv, hsl, lcb);
			persons[i] = tc;
		}
		
		System.out.println("Nhap 3 sinh vien: ");
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Nhap ten: ");
			String ten = sc.nextLine();
			
			System.out.println("Nhap tuoi: ");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhap so dien thoai: ");
			String phone = sc.nextLine();
			
			System.out.println("Nhap diem toan: ");
			double dt = Double.parseDouble(sc.nextLine());
			
			System.out.println("Nhap diem hoa: ");
			double dh = Double.parseDouble(sc.nextLine());
			
			System.out.println("Nhap diem ly: ");
			double dl = Double.parseDouble(sc.nextLine());
			
			System.out.println("Nhap ma sinh vien: ");
			String msv = sc.nextLine();
			
			System.out.println("Nhap lop: ");
			String lop = sc.nextLine();
			
			Student std = new Student(ten,age,phone,dt, dh,dl,msv,lop);
			persons[i+2] = std;
		}
	}
	
}
