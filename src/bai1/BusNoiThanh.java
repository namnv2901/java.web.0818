package bai1;

public class BusNoiThanh extends XeBus {
	private int soTuyen;
	private int soKm;

	public BusNoiThanh() {

	}

	public BusNoiThanh(String maChuyen, String tenLaiXe, String soXe, double doanhthu, int soTuyen, int soKm) {
		super(maChuyen, tenLaiXe, soXe, doanhthu);
		this.soKm = soKm;
		this.soTuyen = soTuyen;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}

	@Override
	public void inThongTin() {
		System.out.println("ma chuyen: " + maChuyen + "\t ten lai xe: " + tenLaiXe + "\t so xe: " + soXe + "\t doanh thu: "
				+ doanhthu + "\t so tuyen: " + soTuyen + "\t soKm: " + soKm);
	}

}
