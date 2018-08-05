package lesson2.excercise2.quanlygiadich;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double soLuong;
	private double thanhTien;
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	
	public double getThanhTien() {
		return soLuong * donGia;
	}
	
	public GiaoDich() {
		
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma giao dich: ");
		maGiaoDich  = sc.nextLine();
		
		System.out.println("Nhap ngay gia dich (dd/MM/yyyy): ");
		do {
			try {
				String strDate = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				ngayGiaoDich = LocalDate.parse(strDate, formatter);
			} catch (Exception ex){
				System.out.println("Khong dung dinh dang ngay thang.Nhap lai");
				continue;
			}
			break;
		} while(true);
		
		System.out.println("Nhap don gia: ");
		donGia = Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhap so luong: ");
		soLuong = Double.parseDouble(sc.nextLine());
	}
	
	public void xuat() {
		System.out.println("Ma giao dich la: " + maGiaoDich);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ngay giao dich: " + ngayGiaoDich.format(formatter));
		System.out.println("Don gia: " + donGia);
		System.out.println("So luong: " + soLuong);
	}
	
	
}
