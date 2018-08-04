package bai3;

import java.util.Date;

public abstract class HoaDon {
	protected String makh;
	protected String tenKh;
	protected Date ngayLap;
	protected int soLuong;
	public static double donGia;

	public HoaDon() {

	}

	public HoaDon(String makh, String tenKh, Date ngayLap, int soLuong) {
		this.makh = makh;
		this.tenKh = tenKh;
		this.ngayLap = ngayLap;
		this.soLuong = soLuong;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getTenKh() {
		return tenKh;
	}

	public void setTenKh(String tenKh) {
		this.tenKh = tenKh;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double thanhTien() {
		return soLuong * donGia;
	}

	public abstract void inHoaDon();

}
