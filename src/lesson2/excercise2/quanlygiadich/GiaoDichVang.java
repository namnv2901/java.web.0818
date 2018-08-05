package lesson2.excercise2.quanlygiadich;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang() {
		
	}
	
	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai vang: ");
		loaiVang = sc.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Loai vang la: " + loaiVang);
		System.out.println("Thanh tien: " + getThanhTien());
	}
}
