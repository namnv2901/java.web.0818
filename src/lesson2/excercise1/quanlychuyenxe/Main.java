package lesson2.excercise1.quanlychuyenxe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Nhập xuất
		Scanner sc = new Scanner(System.in);
		List<XeNoiThanh> xeNoiThanh = new ArrayList<XeNoiThanh>();
		List<XeNgoaiThanh> xeNgoaiThanh = new ArrayList<XeNgoaiThanh>();
		
		String check = "";
		
		while (true)
		{
			System.out.println("------- MENU ------");
			System.out.println("1. Nhap xe noi thanh");
			System.out.println("2. Nhap xe ngoai thanh");
			System.out.println("3. In cac xe noi thanh");
			System.out.println("4. In cac xe ngoai thanh");
			System.out.println("any. Thoat");
			
			System.out.println("Moi ban chon....");
			check = sc.nextLine();
			
			if(check.equals("1")) {
				XeNoiThanh xe = new XeNoiThanh();
				xe.nhap();
				xeNoiThanh.add(xe);
			}
			else if(check.equals("2")) {
				XeNgoaiThanh xe = new XeNgoaiThanh();
				xe.nhap();
				xeNgoaiThanh.add(xe);
			}
			else if (check.equals("3")) {
				System.out.println("------ Thong tin cac xe noi thanh ------");
				for(XeNoiThanh xe : xeNoiThanh) {
					xe.xuat();
				}
			}
			else if (check.equals("4")) {
				System.out.println("------ Thong tin cac xe ngoai thanh ------");
				for(XeNgoaiThanh xe : xeNgoaiThanh) {
					xe.xuat();
				}
			}
			else {
				break;
			}
		}
		
		//Tổng doanh thu cho từng loại xe
		double doanhThuXeNoiThanh = 0;
		double doanhThuXeNgoaiThanh = 0;
		
		for(int i = 0; i < xeNoiThanh.size(); i++) {
			doanhThuXeNoiThanh += xeNoiThanh.get(i).getDoanhThu();
		}
		
		for (int i = 0; i < xeNgoaiThanh.size(); i++) {
			doanhThuXeNgoaiThanh += xeNgoaiThanh.get(i).getDoanhThu();
		}
		
		System.out.println("Tong doanh thu xe noi thanh la: " + doanhThuXeNoiThanh);
		System.out.println("Tong doanh thu xe ngoai thanh la: " + doanhThuXeNgoaiThanh);
		
//		Xe xeNoiThanh = new XeNoiThanh();
//		xeNoiThanh.nhap();
//		xeNoiThanh.xuat();
//		
//		Xe xeNgoaiThanh = new XeNgoaiThanh();
//		xeNgoaiThanh.nhap();
//		xeNgoaiThanh.xuat();
	}

}
