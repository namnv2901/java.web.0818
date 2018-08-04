package CarManagement;

public class Main {
    private static Xe xeNoiThanh = new XeNoiThanh("NT1", "Tx1", "SX1", 10, 10, 10);
    private static Xe xeNoiThanh2 = new XeNoiThanh("NT", "Tx2", "SX2", 5, 5, 2);
    private static Xe xeNgoaiThanh1 = new XeNgoaiThanh("NGT1", "Tx1", "SX1", 10, "Ha Noi", 15);
    private static Xe xeNgoaiThanh2 = new XeNgoaiThanh("NGT2", "Tx2", "SX1", 112.5, "Ha Noi", 15);

    public static void main(String[] args) {
        showInfo();
    }

    public static void showInfo() {
        double sumXeNoiThanh = 0;
        double sumXeNgoaiThanh = 0;

        Xe arrXe[] = {xeNoiThanh, xeNoiThanh2, xeNgoaiThanh1, xeNgoaiThanh2};
        for (int i = 0; i < arrXe.length; i++) {
            if (arrXe[i] instanceof XeNoiThanh) {
                sumXeNoiThanh += arrXe[i].getDoanhThu();
            }
            if (arrXe[i] instanceof XeNgoaiThanh) {
                sumXeNgoaiThanh += arrXe[i].getDoanhThu();
            }
            arrXe[i].xuat();
            System.out.println("--------------------------------");
        }
        System.out.println("Doanh thu xe noi thanh : " + sumXeNoiThanh);
        System.out.println("Doanh thu xe Ngoai thanh : " + sumXeNgoaiThanh);
    }
}

