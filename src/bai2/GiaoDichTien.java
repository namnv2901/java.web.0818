package bai2;

import java.util.Date;

public class GiaoDichTien extends GiaoDich {
	private float tiGia;

	public GiaoDichTien() {

	}

	public GiaoDichTien(String maGiaoDich, Date ngayGiaoDich, float donGia, int soluong, float tiGia) {
		super(maGiaoDich, ngayGiaoDich, donGia, soluong);
		this.tiGia = tiGia;
	}

	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	@Override
	public float thanhTien() {
		return donGia * soluong * tiGia;
	}

	@Override
	public void inThongTinGiaoDich() {
		System.out.println("GiaoDichTien [tiGia=" + tiGia + ", maGiaoDich=" + maGiaoDich + ", ngayGiaoDich="
				+ ngayGiaoDich + ", donGia=" + donGia + ", soluong=" + soluong + "]");

	}

}
