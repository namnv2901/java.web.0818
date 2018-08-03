package lesson1.excercise2.tamgiac;

public class Main {

	public static void main(String[] args) {
		TamGiac tg = new TamGiac(3d, 3d, 3d);
		tg.loaiTamGiac();
		System.out.println("Chu vi tam giac la: " + tg.tinhChuVi());
		System.out.println("Dien tich tam giac la: " + tg.tinhDienTich());

	}

}
