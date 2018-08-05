package lesson2.excercise2.quanlyhoadon;

import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
	private String loaiKhachHang;
	private double dinhMuc;
	
	public String getLoaiKhachHang() {
		return loaiKhachHang;
	}
	public void setLoaiKhachHang(String loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public double getThanhTien() {
		if(getSoLuong() <= dinhMuc) {
			return super.getThanhTien();
		}
		return super.getThanhTien() * dinhMuc + (getSoLuong() - dinhMuc) * getDonGia() * 2.5;
	}
	
	public KhachHangVietNam() {
		
	}
	
	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngay, double soLuong, double donGia,
			String loaiKhachHang, double dinhMuc) {
		super(maKhachHang, hoTen, ngay, soLuong, donGia);
		this.loaiKhachHang = loaiKhachHang;
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai khach hang: ");
		loaiKhachHang = sc.nextLine();
		System.out.println("Nhap dinh muc: ");
		dinhMuc = Double.parseDouble(sc.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Loai khach hang la: " + loaiKhachHang);
		System.out.println("Dinh muc: " + dinhMuc);
		System.out.println("Thanh tien: " + getThanhTien());
	}
}
