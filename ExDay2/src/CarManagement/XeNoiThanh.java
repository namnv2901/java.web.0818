package CarManagement;

public class XeNoiThanh extends Xe {
    private int soTuyen;
    private int soKm;
    private Xe xe;

    public XeNoiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, int soTuyen, int soKm) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public float getSoKm() {
        return soKm;
    }


    public void xuat() {
        super.xuat();
        System.out.println("so tuyen :" + getSoTuyen());
        System.out.println("so km :" + getSoKm());


    }
}
