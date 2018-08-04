package bai1;

import java.util.ArrayList;

public class QuanLiBus {
	private ArrayList<XeBus> danhSachXe;

	public QuanLiBus() {
	}

	public QuanLiBus(ArrayList<XeBus> danhSachXe) {
		this.danhSachXe = danhSachXe;
	}

	public void nhapDanhSachXe(ArrayList<XeBus> danhSachXe) {
		this.danhSachXe = danhSachXe;
	}

	public ArrayList<XeBus> layDanhSachXe() {
		return danhSachXe;
	}

	public void inThongTinDanhSach() {
		for (XeBus xeBus : danhSachXe) {
			xeBus.inThongTin();
		}
	}

	public double tongDoanhThu(String loaiXe) {
		double doanhThu = 0;
		for (XeBus xeBus : danhSachXe) {
			if (xeBus.getClass().getSimpleName().equals(loaiXe))
				doanhThu += xeBus.getDoanhthu();
		}
		return doanhThu;
	}

}
