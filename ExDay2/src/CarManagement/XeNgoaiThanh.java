package CarManagement;

public class XeNgoaiThanh extends Xe {
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public void nhap(int soTuyen, int soKm) {


    }

    public void xuat() {
        super.xuat();
        System.out.println("Noi den :" + getNoiDen());
        System.out.println("so ngay di duoc :" + getSoNgayDiDuoc());


    }
}
