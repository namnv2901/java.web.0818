package lesson2.excercise1.quanlychuyenxe;

import java.util.Scanner;

public class XeNgoaiThanh extends Xe{
	private String noiDen;
	private int soNgay;
	
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	public XeNgoaiThanh() {
		
	}
	public XeNgoaiThanh(String noiDen, int soNgay) {
		super();
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap noi den: ");
		noiDen = sc.nextLine();
		
		System.out.println("Nhap so ngay: ");
		soNgay = sc.nextInt();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Noi den: " + noiDen);
		System.out.println("So ngay: " + getSoNgay());
	}
}
