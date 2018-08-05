package lesson2.excercise2.quanlygiadich;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private String loaiTien;
	
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	
	public String getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	@Override
	public double getThanhTien() {
		if(loaiTien.equals("VND")) {
			return super.getThanhTien();
		}
		return tiGia * super.getThanhTien();
	}
	
	public GiaoDichTienTe() {
		
	}
	
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong, double tiGia, String loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ti gia: ");
		tiGia = Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhap loai tien: ");
		loaiTien = sc.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Ti gia la: " + tiGia);
		System.out.println("Loai tien: " + loaiTien);
		System.out.println("Thanh tien: " + getThanhTien());
	}
}
