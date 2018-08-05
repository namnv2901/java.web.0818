package lesson2.excercise2.quanlyhoadon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.omg.PortableServer.ThreadPolicyOperations;

public class KhachHang {
	private String maKhachHang;
	private String hoTen;
	private LocalDate ngay;
	private double soLuong;
	private double donGia;
	private double thanhTien;
	
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public LocalDate getNgay() {
		return ngay;
	}
	public void setNgay(LocalDate ngay) {
		this.ngay = ngay;
	}
	
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double getThanhTien() {
		return soLuong * donGia;
	}
	
	public KhachHang() {
		
	}
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngay, double soLuong, double donGia) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngay = ngay;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap ma khach hang: ");
		maKhachHang = sc.nextLine();
		System.out.println("Nhap ho te: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap thoi gian (dd/MM/yyyy): ");
		do {
			try {
				String strDate = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				ngay = LocalDate.parse(strDate, formatter);
			} catch (Exception e) {
				System.out.println("Khong dung dinh dang thoi gian. Nhap lai");
				continue;
			}
			break;
		} while(true);
		System.out.println("Nhap so luong (so KW tieu thu): ");
		soLuong = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap don gia: ");
		donGia = sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ma khach hang la: " + maKhachHang);
		System.out.println("Ho te: " + hoTen);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Thoi gian (dd/MM/yyyy): " + ngay.format(formatter));
		System.out.println("So luong (so KW tieu thu): " + soLuong);
		System.out.println("Don gia: " + donGia);
	}
}
