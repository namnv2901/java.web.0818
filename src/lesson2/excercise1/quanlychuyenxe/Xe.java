package lesson2.excercise1.quanlychuyenxe;

import java.rmi.MarshalledObject;
import java.util.Scanner;

public class Xe {
	private String maChuyenXe;
	private String tenTaiXe;
	private String soXe;	
	private double doanhThu;
	
	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}
	
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	public Xe() {
		
	}
	
	public Xe(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu) {
		super();
		this.maChuyenXe = maChuyenXe;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma chuyen xe: ");
		maChuyenXe = sc.nextLine();

		System.out.println("Nhap ho ten tai xe: ");
		tenTaiXe = sc.nextLine();
		
		System.out.println("Nhap ma so xe: ");
		soXe = sc.nextLine();
		
		System.out.println("Nhap doanh thu: ");
		doanhThu  = sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ma chuyen xe la: " + maChuyenXe);
		System.out.println("Ho ten tai xe la: " + tenTaiXe);
		System.out.println("Ma so xe la: " + soXe);
		System.out.println("Doanh thu cua xe la: " + doanhThu);
	}
	
	
//	public abstract void nhap();
//	
//	public abstract void xuat();

}
