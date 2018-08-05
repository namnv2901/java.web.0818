package lesson2.excercise2.quanlygiadich;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Nhập xuất
		List<GiaoDichVang> giaodichVang = new ArrayList<GiaoDichVang>();
		List<GiaoDichTienTe> giaodichTienTe = new ArrayList<GiaoDichTienTe>();
		
		String check = "";
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("------- MENU ------");
			System.out.println("1. Nhap giao dich vang");
			System.out.println("2. Nhap giao dich tien te");
			System.out.println("3. In cac giao dich vang");
			System.out.println("4. In cac giao dich tien te");
			System.out.println("any. Thoat");
			
			System.out.println("Moi ban chon....");
			check = sc.nextLine();
			
			if(check.equals("1")) {
				GiaoDichVang gd = new GiaoDichVang();
				gd.nhap();
				giaodichVang.add(gd);
			}
			else if(check.equals("2")) {
				GiaoDichTienTe gd = new GiaoDichTienTe();
				gd.nhap();
				giaodichTienTe.add(gd);
			}
			else if (check.equals("3")) {
				System.out.println("------ Thong tin cac giao dich vang ------");
				for(GiaoDichVang gd : giaodichVang) {
					gd.xuat();
				}
			}
			else if (check.equals("4")) {
				System.out.println("------ Thong tin cac giao dich tien te ------");
				for(GiaoDichTienTe gd : giaodichTienTe) {
					gd.xuat();
				}
			}
			else {
				break;
			}
		}
		
		//Tính tổng số lượng giao dịch từng loại
		int tongSoLuongGiaDichVang = 0;
		int tongSoLuongGiaDichTienTe = 0;
		for (int i = 0; i < giaodichVang.size(); i++) {
			tongSoLuongGiaDichVang += giaodichVang.get(i).getSoLuong();
		}
		for (int i = 0; i < giaodichTienTe.size(); i++) {
			tongSoLuongGiaDichTienTe += giaodichTienTe.get(i).getSoLuong();
		}
		System.out.println("Tong so luong cho giao dich vang la: " + tongSoLuongGiaDichVang);
		System.out.println("Tong so luong cho giao dich tien te la: " + tongSoLuongGiaDichTienTe);
		
		//Tính tổng trung bình thành tiền của giao dịch tiền tệ
		double tongThanhTienGiaoDichTienTe = 0;
		for(int i = 0; i < giaodichTienTe.size(); i++) {
			tongThanhTienGiaoDichTienTe += giaodichTienTe.get(i).getThanhTien();
		}
		System.out.println("Tong trung binh thanh tien cua giao dich tien te la: " + tongThanhTienGiaoDichTienTe/giaodichTienTe.size());
		
		//Các giao dịch có đơn giá > 1 tỷ
		System.out.println("Cac gia dich co don gia lon hon 1 ty la: ");
		System.out.println("Doi voi giao dich vang: ");
		checkDonGia(giaodichVang, 1);
		System.out.println("Doi voi dich tien te: ");
		checkDonGia(giaodichTienTe, 1);
		
	}
	
	private static<E extends GiaoDich> void checkDonGia (List<E> list, double d) {
		list.forEach(e -> {
			if (e.getDonGia()>d) {
				e.xuat();
			}
		});
	}
}
