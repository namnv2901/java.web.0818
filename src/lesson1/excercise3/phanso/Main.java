package lesson1.excercise3.phanso;

public class Main {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(2, 3);
		PhanSo ps2 = new PhanSo(4, 5);
		
		PhanSo ps3 = ps1.cong(ps1, ps2);
		PhanSo ps4 = ps1.tru(ps1, ps2);
		PhanSo ps5 = ps1.nhan(ps1, ps2);
		PhanSo ps6 = ps1.chia(ps1, ps2);
		
		System.out.println("Phan so thu nhat la: ");
		ps1.in();
		System.out.println("Phan so nghich dao cua phan so thu nhat la: ");
		ps1.nghichdao();
		System.out.println("Phan so thu hai la: ");
		ps2.in();
		System.out.println("Phan so nghich dao cua phan so thu hai la: ");
		ps2.nghichdao();
		
		System.out.println("Tong hai phan so la: ");
		ps3.in();
		System.out.println("Hieu hai phan so la: ");
		ps4.in();
		System.out.println("Tich hai phan so la: ");
		ps5.in();
		System.out.println("thuong hai phan so la: ");
		ps6.in();

	}

}
