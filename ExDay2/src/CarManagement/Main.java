package CarManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Xe> arrXe = new ArrayList<>();

    public static void initData() {

        Xe xeNoiThanh = new XeNoiThanh("NT1", "Tx1", "SX1", 10, 10, 10);
        Xe xeNoiThanh2 = new XeNoiThanh("NT", "Tx2", "SX2", 5, 5, 2);
        Xe xeNgoaiThanh1 = new XeNgoaiThanh("NGT1", "Tx1", "SX1", 10, "Ha Noi", 15);
        Xe xeNgoaiThanh2 = new XeNgoaiThanh("NGT2", "Tx2", "SX1", 112.5, "Ha Noi", 15);

        arrXe.add(xeNoiThanh);
        arrXe.add(xeNoiThanh2);
        arrXe.add(xeNgoaiThanh1);
        arrXe.add(xeNgoaiThanh2);
    }

    public static void main(String[] args) {
        initData();
        showInfo();
    }

    public static void showInfo() {
        double sumXeNoiThanh = 0;
        double sumXeNgoaiThanh = 0;

        for (Xe obj : arrXe) {
            if (obj instanceof XeNoiThanh) {
                sumXeNoiThanh += obj.getDoanhThu();
            }
            if (obj instanceof XeNgoaiThanh) {
                sumXeNgoaiThanh += obj.getDoanhThu();
            }
            obj.xuat();
            System.out.println("--------------------------------");
        }
        System.out.println("Doanh thu xe noi thanh : " + sumXeNoiThanh);
        System.out.println("Doanh thu xe Ngoai thanh : " + sumXeNgoaiThanh);
    }
}

