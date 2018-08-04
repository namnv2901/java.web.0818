package bai1;

public abstract class XeBus {
	protected String maChuyen;
	protected String tenLaiXe;
	protected String soXe;
	protected double doanhthu;

	public XeBus() {
	}

	public XeBus(String maChuyen, String tenLaiXe, String soXe, double doanhthu) {
		this.maChuyen = maChuyen;
		this.tenLaiXe = tenLaiXe;
		this.soXe = soXe;
		this.doanhthu = doanhthu;
	}

	public String getMaChuyen() {
		return maChuyen;
	}

	public void setMaChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}

	public String getTenLaiXe() {
		return tenLaiXe;
	}

	public void setTenLaiXe(String tenLaiXe) {
		this.tenLaiXe = tenLaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhthu() {
		return doanhthu;
	}

	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}

	public abstract void inThongTin();

}
