package bai3;

import java.util.Date;

public class HoaDonNoi extends HoaDon {
	public static int dinhMuc;

	public HoaDonNoi() {

	}

	public HoaDonNoi(String makh, String tenKh, Date ngayLap, int soLuong) {
		super(makh, tenKh, ngayLap, soLuong);
	}

	@Override
	public void inHoaDon() {
		System.out.println("HoaDonNoi [dinhMuc=" + dinhMuc + ", makh=" + makh + ", tenKh=" + tenKh + ", ngayLap="
				+ ngayLap + ", soLuong=" + soLuong + ", donGia=" + donGia + "]");
	}

	@Override
	public double thanhTien() {
		if (soLuong <= dinhMuc) {
			return super.thanhTien();
		} else {
			return donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
		}
	}

}
