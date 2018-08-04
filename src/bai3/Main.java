package bai3;

import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		HoaDon.donGia = 1200;
		HoaDonNoi.dinhMuc = 100;

		HoaDon hoaDon1 = new HoaDonNoi("N1", "Nguyen Van A", new Date(), 120);
		HoaDon hoaDon2 = new HoaDonNoi("N1", "Nguyen Van B", new Date(), 90);
		HoaDon hoaDon3 = new HoaDonNoi("N1", "Nguyen Van C", new Date(), 80);
		HoaDon hoaDon4 = new HoaDonNoi("N1", "Nguyen Van D", new Date(), 140);
		HoaDon hoaDon5 = new HoaDonNoi("N1", "Nguyen Van E", new Date(), 125);

		HoaDon hoaDon6 = new HoaDonNgoai("NG1", "Jonh1", new Date(), 100, "Anh");
		HoaDon hoaDon7 = new HoaDonNgoai("NG2", "Jonh2", new Date(), 60, "Phap");
		HoaDon hoaDon8 = new HoaDonNgoai("NG3", "Jonh3", new Date(), 90, "Bi");
		HoaDon hoaDon9 = new HoaDonNgoai("NG4", "Jonh4", new Date(), 120, "Duc");
		HoaDon hoaDon10 = new HoaDonNgoai("NG5", "Jonh5", new Date(), 180, "Mi");

		ArrayList<HoaDon> danhsach = new ArrayList<>();
		danhsach.add(hoaDon1);
		danhsach.add(hoaDon2);
		danhsach.add(hoaDon3);
		danhsach.add(hoaDon4);
		danhsach.add(hoaDon5);
		danhsach.add(hoaDon6);
		danhsach.add(hoaDon7);
		danhsach.add(hoaDon8);
		danhsach.add(hoaDon9);
		danhsach.add(hoaDon10);

		QuanLiHoaDon quanLiHoaDon = new QuanLiHoaDon(danhsach);
		quanLiHoaDon.inDanhSachHoaDon();
		
		System.out.println();
		
		System.out.println(quanLiHoaDon.tongHoaDonTheoLoai("HoaDonNgoai"));
		System.out.println(quanLiHoaDon.trungBinhThanhTienTheoLoai("HoaDonNgoai"));
	}
}
