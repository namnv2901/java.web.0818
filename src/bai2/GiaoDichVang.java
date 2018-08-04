package bai2;

import java.util.Date;

public class GiaoDichVang extends GiaoDich {

	private int loaiVang;

	public GiaoDichVang() {

	}

	public GiaoDichVang(String maGiaoDich, Date ngayGiaoDich, float donGia, int soluong, int loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soluong);
		this.loaiVang = loaiVang;
	}

	public int getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(int loaiVang) {
		this.loaiVang = loaiVang;
	}

	@Override
	public void inThongTinGiaoDich() {
		System.out.println("GiaoDichVang [loaiVang=" + loaiVang + ", maGiaoDich=" + maGiaoDich + ", ngayGiaoDich="
				+ ngayGiaoDich + ", donGia=" + donGia + ", soluong=" + soluong + "]");
	}

}
