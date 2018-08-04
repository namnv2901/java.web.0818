package bai2;

import java.util.Date;

public abstract class GiaoDich {
	protected String maGiaoDich;
	protected Date ngayGiaoDich;
	protected float donGia;
	protected int soluong;

	public GiaoDich() {

	}

	public GiaoDich(String maGiaoDich, Date ngayGiaoDich, float donGia, int soluong) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soluong = soluong;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public Date getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public float thanhTien() {
		return soluong * donGia;
	}

	public abstract void inThongTinGiaoDich();

}
