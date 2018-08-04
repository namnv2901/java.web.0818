package CarManagement;

public class Xe {
    private String maSoChuyen;
    private String tenTaiXe;
    private String soXe;
    private double doanhThu;


    public Xe(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
//
//    public Xe() {
//    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }


    public void xuat() {
        System.out.println("Ma so chuyen la : " + getMaSoChuyen());
        System.out.println("Ten tai xe : " + getTenTaiXe());
        System.out.println("So xe : " + getSoXe());
        System.out.println("Doanh thu : " + getDoanhThu());

    }

    public int tongDoanhThu() {

        return -1;
    }
}
