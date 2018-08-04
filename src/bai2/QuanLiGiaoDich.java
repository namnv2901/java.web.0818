package bai2;

import java.util.ArrayList;

public class QuanLiGiaoDich {
	private ArrayList<GiaoDich> giaodich;

	public QuanLiGiaoDich(ArrayList<GiaoDich> giaodich) {
		this.giaodich = giaodich;
	}

	public ArrayList<GiaoDich> getGiaodich() {
		return giaodich;
	}

	public void setGiaodich(ArrayList<GiaoDich> giaodich) {
		this.giaodich = giaodich;
	}

	public void inDanhSachgiaoDich() {
		for (GiaoDich giaoDich : giaodich) {
			giaoDich.inThongTinGiaoDich();
		}
	}

	public int tongGiaoDichTheoLoai(String tenGiaoDich) {
		int sum = 0;
		for (GiaoDich giaoDich : giaodich) {
			if (giaoDich.getClass().getSimpleName().equals(tenGiaoDich))
				sum++;
		}
		return sum;
	}

	public float trungBinhThanhTien(String tenGiaoDich) {
		float tongTien = 0;
		int soLuongGiaoDich = 0;
		for (GiaoDich giaoDich : giaodich) {
			if (giaoDich.getClass().getSimpleName().equals(tenGiaoDich)) {
				tongTien += giaoDich.thanhTien();
				soLuongGiaoDich++;
			}
		}
		return tongTien / soLuongGiaoDich;
	}

	public void inGiaoDichDonGiaHonMotTy() {
		for (GiaoDich giaoDich : giaodich) {
			if (giaoDich.getDonGia() > 1000000000)
				giaoDich.inThongTinGiaoDich();
		}
	}

}
