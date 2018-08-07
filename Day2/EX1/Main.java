/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlychuyenxe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xuan Nguyen
 */
public class Main {
    public static void main(String[] args) {
        XeNoiThanh noiThanh1 = new XeNoiThanh(25, 12.5, "35A", "Nguyen Van A",
                25, 1000);
        XeNoiThanh noiThanh2 = new XeNoiThanh(22, 12.5, "35A", "Nguyen Van A",
                25, 1000);
        XeNgoaiThanh ngoaiThanh1 = new XeNgoaiThanh("Phu Tho", 30, "Ha Noi_Phu Tho"
                , "Nguyen Van B",10, 1000);
        XeNgoaiThanh ngoaiThanh2 = new XeNgoaiThanh("Phu Tho", 30, "Ha Noi_Phu Tho"
                , "Nguyen Van B",10, 1000);
        
        List<XeNoiThanh> xe = new ArrayList<>();
        xe.add(noiThanh1);
        xe.add(noiThanh2);
        List<XeNgoaiThanh> xe1 = new ArrayList<>();
        xe1.add(ngoaiThanh1);
        xe1.add(ngoaiThanh2);
        
        double doanhThuXeNoiThanh =0;
        double doanhThuXeNgoaiThanh =0;

        for (XeNoiThanh xeNoiThanh : xe) {
            xeNoiThanh.showInfo();
            doanhThuXeNoiThanh+= xeNoiThanh.getDoanhThu();
        }
        for (XeNgoaiThanh xeNgoaiThanh : xe1) {
            xeNgoaiThanh.showInfo();
            doanhThuXeNgoaiThanh+= xeNgoaiThanh.getDoanhThu();
        }
        
        System.out.println("==================");
        System.out.println(" Tong Doanh thu xe noi thanh : " +doanhThuXeNoiThanh);
        System.out.println("Tong Doanh thu xe ngoai thanh : "+ doanhThuXeNgoaiThanh);
        
        
        
    }
    
}
