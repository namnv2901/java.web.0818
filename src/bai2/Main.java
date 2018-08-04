package bai2;

import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ArrayList<GiaoDich> danhsach = new ArrayList<>();
		GiaoDich giaoDich1 = new GiaoDichTien("T1", new Date(), 1500000000, 1, 2);
		GiaoDich giaoDich2 = new GiaoDichTien("T2", new Date(), 1000000000, 1, 1);
		GiaoDich giaoDich3 = new GiaoDichTien("T3", new Date(), 1500000000, 1, 2);
		GiaoDich giaoDich4 = new GiaoDichTien("T4", new Date(), 1500000000, 1, 4);
		GiaoDich giaoDich5 = new GiaoDichTien("T5", new Date(), 1500000000, 1, 2);

		GiaoDich giaoDich6 = new GiaoDichVang("V1", new Date(), 1000000000, 20, 1);
		GiaoDich giaoDich7 = new GiaoDichVang("V2", new Date(), 1200000000, 20, 2);
		GiaoDich giaoDich8 = new GiaoDichVang("V3", new Date(), 1000000000, 20, 3);
		GiaoDich giaoDich9 = new GiaoDichVang("V4", new Date(), 1600000000, 20, 4);
		GiaoDich giaoDich10 = new GiaoDichVang("V5", new Date(), 1900000000, 20, 5);

		danhsach.add(giaoDich1);
		danhsach.add(giaoDich2);
		danhsach.add(giaoDich3);
		danhsach.add(giaoDich4);
		danhsach.add(giaoDich5);
		danhsach.add(giaoDich6);
		danhsach.add(giaoDich7);
		danhsach.add(giaoDich8);
		danhsach.add(giaoDich9);
		danhsach.add(giaoDich10);

		QuanLiGiaoDich quanLiGiaoDich = new QuanLiGiaoDich(danhsach);
		quanLiGiaoDich.inDanhSachgiaoDich();
		System.out.println();

		System.out.println("giao dich hon mot ti: ");
		quanLiGiaoDich.inGiaoDichDonGiaHonMotTy();

		System.out.println(
				"trung binh thanh tien giao dich tien te: " + quanLiGiaoDich.trungBinhThanhTien("GiaoDichTien"));

	}
}
