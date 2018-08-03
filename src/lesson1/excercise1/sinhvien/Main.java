package lesson1.excercise1.sinhvien;

public class Main {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien("12345678", 8.1d, 20, "A10");
		sv.showinfo();
		boolean check = sv.xemHocBong();
		if (check == true) {
			System.out.println("Duoc nhan hoc bong");
		}
		else {
			System.out.println("Khong duoc nhan hoc bong");
		}

	}

}
