package bai1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<XeBus> list = new ArrayList<>();

		XeBus xeBus1 = new BusNoiThanh("N1", "nguyen van A", "A1234", 20000000, 5, 200);
		XeBus xeBus2 = new BusNoiThanh("N2", "nguyen van B", "A1234", 20000000, 5, 200);
		XeBus xeBus3 = new BusNoiThanh("N3", "nguyen van C", "A1234", 20000000, 5, 200);
		XeBus xeBus4 = new BusNoiThanh("N4", "nguyen van D", "A1234", 20000000, 5, 200);
		XeBus xeBus5 = new BusNoiThanh("N5", "nguyen van E", "A1234", 20000000, 5, 200);

		XeBus xeBus6 = new BusNgoaiThanh("NG1", "nguyenvanA", "B1234", 40000000, "HaTay", 1200);
		XeBus xeBus7 = new BusNgoaiThanh("NG2", "nguyenvanB", "B1234", 40000000, "HaTay", 1200);
		XeBus xeBus8 = new BusNgoaiThanh("NG3", "nguyenvanC", "B1234", 40000000, "HaTay", 1200);
		XeBus xeBus9 = new BusNgoaiThanh("NG4", "nguyenvanD", "B1234", 40000000, "HaTay", 1200);
		XeBus xeBus10 = new BusNgoaiThanh("NG5", "nguyenvanE", "B1234", 40000000, "HaTay", 1200);

		list.add(xeBus1);
		list.add(xeBus2);
		list.add(xeBus3);
		list.add(xeBus4);
		list.add(xeBus5);
		list.add(xeBus6);
		list.add(xeBus7);
		list.add(xeBus8);
		list.add(xeBus9);
		list.add(xeBus10);

		QuanLiBus quanLiBus = new QuanLiBus(list);
		
		quanLiBus.inThongTinDanhSach();
		
		System.out.println("tong doanh thu xe noi thanh: " + quanLiBus.tongDoanhThu("BusNoiThanh"));
		System.out.println("tong doanh thu xe ngoai thanh: " + quanLiBus.tongDoanhThu("BusNgoaiThanh"));

	}
}
