package lesson1.excercise1.sinhvien;

public class SinhVien {
	private String maSv;
	private double diemTrungBinh;
	private int tuoi;
	private String lop;
	
	private static final double DOUBLE_ZERO = 0.0;
	private static final int ZERO = 0;
	private static final String NAN = "NAN";
	
	public String getMaSv() {
		return maSv;
	}
	
	public void setMaSv(String maSV) {
		this.maSv = maSv;
		if(maSV.length() != 8)
		{
			this.maSv = NAN;
		}
	}
	
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
		if (diemTrungBinh < 0.0 && diemTrungBinh > 10.0)
		{
			this.diemTrungBinh = DOUBLE_ZERO;
		}
	}
	
	public int getTuoi() {
		return tuoi;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
		if (tuoi <= 18)
		{
			this.tuoi = ZERO;
		}
	}
	
	public String getLop() {
		return lop;
	}
	
	public void setLop(String lop) {
		this.lop = NAN;
		String kt = lop.substring(0, 1);
		if (kt.equals("A") || kt.equals("C"))
		{
			this.lop = lop;
		}
	}
	
	public SinhVien() 
	{}
	
	public SinhVien(String maSv, double diemTrungBinh, int tuoi, String lop) {
		super();
		this.maSv = maSv;
		this.diemTrungBinh = diemTrungBinh;
		this.tuoi = tuoi;
		this.lop = lop;
	}
	
	public void showinfo(){
		System.out.println("Ma sinh vien: " + getMaSv());
		System.out.println("Diem trung binh: " + getDiemTrungBinh());
		System.out.println("Tuoi: " + getTuoi());
		System.out.println("Lop: " + getLop());
	}
	
	public boolean xemHocBong(){
		if (diemTrungBinh > 8.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
