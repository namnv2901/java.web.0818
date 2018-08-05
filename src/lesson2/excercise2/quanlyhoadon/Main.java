package lesson2.excercise2.quanlyhoadon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Nhập xuất
		List<KhachHangVietNam> khVietNam = new ArrayList<KhachHangVietNam>();
		List<KhachHangNuocNgoai> khkNuocNgoai = new ArrayList<KhachHangNuocNgoai>();
		
		String check = "";
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("------- MENU ------");
			System.out.println("1. Nhap khach hang Viet Nam");
			System.out.println("2. Nhap khach hang nuoc ngoai");
			System.out.println("3. In danh sach khach hang Viet Nam");
			System.out.println("4. In danh sach khach hang nuoc ngoai");
			System.out.println("any. Thoat");
			
			System.out.println("Moi ban chon....");
			check = sc.nextLine();
			
			if(check.equals("1")) {
				KhachHangVietNam kh = new KhachHangVietNam();
				kh.nhap();
				khVietNam.add(kh);
			}
			else if(check.equals("2")) {
				KhachHangNuocNgoai kh = new KhachHangNuocNgoai();
				kh.nhap();
				khkNuocNgoai.add(kh);
			}
			else if (check.equals("3")) {
				System.out.println("------ Thong tin cac khach hang Viet Nam ------");
				for(KhachHangVietNam kh : khVietNam) {
					kh.xuat();
				}
			}
			else if (check.equals("4")) {
				System.out.println("------ Thong tin cac giao dich tien te ------");
				for(KhachHangNuocNgoai kh : khkNuocNgoai) {
					kh.xuat();
				}
			}
			else {
				break;
			}
		}
		
		//Tính tổng số lượng từng loại khách hàng
		int tongSoLuongKhVietNam = 0;
		int tongSoLuongkhNuocNgoai = 0;
		for (int i = 0; i < khVietNam.size(); i++) {
			tongSoLuongKhVietNam += khVietNam.get(i).getSoLuong();
		}
		for (int i = 0; i < khkNuocNgoai.size(); i++) {
			tongSoLuongkhNuocNgoai += khkNuocNgoai.get(i).getSoLuong();
		}
		System.out.println("Tong so luong cho khack hang Viet Nam la: " + tongSoLuongKhVietNam);
		System.out.println("Tong so luong cho khach hang nuoc ngoai la: " + tongSoLuongkhNuocNgoai);
		
		//Tính tổng trung bình thành tiền của khách hàng nước ngoài
		double tongThanhTienkhNuocNgoai = 0;
		for(int i = 0; i < khkNuocNgoai.size(); i++) {
			tongThanhTienkhNuocNgoai += khkNuocNgoai.get(i).getThanhTien();
		}
		System.out.println("Tong trung binh thanh tien cua khách hàng nước ngoài la: " + tongThanhTienkhNuocNgoai/khkNuocNgoai.size());
	}

}
