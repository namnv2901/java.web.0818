package bai1;

public class BusNgoaiThanh extends XeBus {
	private String noiDen;
	private int soNgayDaDi;

	public BusNgoaiThanh() {

	}

	public BusNgoaiThanh(String maChuyen, String tenLaiXe, String soXe, double doanhthu, String noiDen,
			int soNgayDaDi) {
		super(maChuyen, tenLaiXe, soXe, doanhthu);
		this.noiDen = noiDen;
		this.soNgayDaDi = soNgayDaDi;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDaDi() {
		return soNgayDaDi;
	}

	public void setSoNgayDaDi(int soNgayDaDi) {
		this.soNgayDaDi = soNgayDaDi;
	}

	@Override
	public void inThongTin() {
		System.out.println("ma chuyen: " + maChuyen + "\t ten lai xe: " + tenLaiXe + "\t so xe: " + soXe + "\t doanh thu: "
				+ doanhthu + "\t noi den: " + noiDen + "\t so ngay da di: " + soNgayDaDi);
	}

}
