package lesson2.excercise2.quanlyhoadon;

import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	
	public KhachHangNuocNgoai() {
		
	}
	
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngay, double soLuong, double donGia,
			String quocTich) {
		super(maKhachHang, hoTen, ngay, soLuong, donGia);
		this.quocTich = quocTich;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap quoc tich: ");
		quocTich = sc.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Quoc tich: " + quocTich);
		System.out.println("Thanh tien: " + getThanhTien());
	}
}
