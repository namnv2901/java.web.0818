package bai3;

import java.util.ArrayList;

public class QuanLiHoaDon {
	private ArrayList<HoaDon> danhsach;

	public QuanLiHoaDon() {

	}

	public QuanLiHoaDon(ArrayList<HoaDon> danhsach) {
		this.danhsach = danhsach;
	}

	public ArrayList<HoaDon> getDanhsach() {
		return danhsach;
	}

	public void setDanhsach(ArrayList<HoaDon> danhsach) {
		this.danhsach = danhsach;
	}

	public void inDanhSachHoaDon() {
		for (HoaDon hoaDon : danhsach) {
			hoaDon.inHoaDon();
		}
	}

	public double tongHoaDonTheoLoai(String loaiHoaDon) {
		double tong = 0;

		for (HoaDon hoaDon : danhsach) {
			if (hoaDon.getClass().getSimpleName().equals(loaiHoaDon)) {
				tong += hoaDon.thanhTien();
			}
		}
		return tong;
	}

	public double trungBinhThanhTienTheoLoai(String loaiHoaDon) {
		int soluong = 0;
		for (HoaDon hoaDon : danhsach) {
			if (hoaDon.getClass().getSimpleName().equals(loaiHoaDon))
				soluong++;
		}
		if (soluong != 0)
			return tongHoaDonTheoLoai(loaiHoaDon) / soluong;
		return 0;
	}

}
