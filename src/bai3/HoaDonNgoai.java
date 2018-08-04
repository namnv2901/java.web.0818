package bai3;

import java.util.Date;

public class HoaDonNgoai extends HoaDon {
	private String quocTich;

	public HoaDonNgoai() {

	}

	public HoaDonNgoai(String makh, String tenKh, Date ngayLap, int soLuong, String quocTich) {
		super(makh, tenKh, ngayLap, soLuong);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Override
	public void inHoaDon() {
		System.out.println("HoaDonNgoai [quocTich=" + quocTich + ", makh=" + makh + ", tenKh=" + tenKh + ", ngayLap="
				+ ngayLap + ", soLuong=" + soLuong + ", donGia=" + donGia + "]");
	}

}
