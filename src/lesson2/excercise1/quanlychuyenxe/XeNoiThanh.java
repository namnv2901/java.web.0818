package lesson2.excercise1.quanlychuyenxe;

import java.util.Scanner;

public class XeNoiThanh extends Xe{
	private String soTuyen;
	private int soKm;
	
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	
	public int getSoKm() {
		return soKm;
	}
	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	
	public XeNoiThanh() {
		
	}
	public XeNoiThanh(String soTuyen, int soKm) {
		super();
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	public XeNoiThanh(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu, String soTuyen, int soKm) {
		super(maChuyenXe, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so tuyen: ");
		soTuyen = sc.nextLine();
		
		System.out.println("Nhap so km: ");
		soKm = sc.nextInt();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("So tuyen: " + soTuyen);
		System.out.println("So km: " + soKm);
	}
}
