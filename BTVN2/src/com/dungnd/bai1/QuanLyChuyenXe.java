/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dungnd.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungotis
 */
public class QuanLyChuyenXe {
    private static Scanner sc = new Scanner(System.in);
    public static void nhapXe(ChuyenXe cx){
        System.out.print("Ma chuyen: "); cx.setMaChuyen(sc.nextLine());
        System.out.print("Ho ten tai xe: "); cx.setTenTaiXe(sc.nextLine());
        System.out.print("So xe: "); cx.setSoXe(sc.nextLine());
        if(cx instanceof ChuyenXeNoiThanh){
            System.out.print("So tuyen: "); ((ChuyenXeNoiThanh) cx).setSoTuyen(sc.nextInt());
            System.out.print("So KM di duoc: "); ((ChuyenXeNoiThanh) cx).setSoKM(sc.nextFloat());
        } else if(cx instanceof ChuyenXeNgoaiThanh) {
            System.out.print("Noi den: "); ((ChuyenXeNgoaiThanh) cx).setNoiDen(sc.nextLine());
            System.out.print("So ngay di duoc: "); ((ChuyenXeNgoaiThanh) cx).setSoNgay(sc.nextInt());
        }
        System.out.print("Doanh thu: "); cx.setDoanhThu(sc.nextDouble()); sc.nextLine();
    }
    
    public static void inXe(ChuyenXe cx){
        if(cx instanceof ChuyenXeNoiThanh) 
            System.out.println(((ChuyenXeNoiThanh) cx).toString());
        else if(cx instanceof ChuyenXeNgoaiThanh)
            System.out.println(((ChuyenXeNgoaiThanh) cx).toString());
    }
    
    public static void inDTXeNoiThanh(List<ChuyenXeNoiThanh> list){
        double tong = 0;
        for (ChuyenXeNoiThanh cx : list) tong += cx.getDoanhThu();
        System.out.println("--------------------\nTong doanh thu: " + tong);
    }
    
    public static void inDTXeNgoaiThanh(List<ChuyenXeNgoaiThanh> list){
        double tong = 0;
        for (ChuyenXeNgoaiThanh cx : list) tong += cx.getDoanhThu();
        System.out.println("--------------------\nTong doanh thu: " + tong);
    }
    
    public static void main(String[] args) {
        List<ChuyenXeNoiThanh> xeNoiThanh = new ArrayList<>();
        List<ChuyenXeNgoaiThanh> xeNgoaiThanh = new ArrayList<>();
        while(true){
            System.out.println("QUAN LY XE --------------");
            System.out.println("1. Nhap xe noi thanh");
            System.out.println("2. Nhap xe ngoai thanh");
            System.out.println("3. Xuat xe noi thanh");
            System.out.println("4. Xuat xe ngoai thanh");
            System.out.println("5. Thoat");
            System.out.print("Ban chon: ");
            int lc = sc.nextInt(); sc.nextLine();
            switch(lc){
                case 1:
                    ChuyenXeNoiThanh noiThanh = new ChuyenXeNoiThanh();
                    nhapXe(noiThanh); xeNoiThanh.add(noiThanh); //sc.close();
                    break;
                case 2:
                    ChuyenXeNgoaiThanh ngoaiThanh = new ChuyenXeNgoaiThanh();
                    nhapXe(ngoaiThanh); xeNgoaiThanh.add(ngoaiThanh); //sc.close();
                    break;
                case 3:
                    for (ChuyenXeNoiThanh cxnt : xeNoiThanh) inXe(cxnt); inDTXeNoiThanh(xeNoiThanh);
                    break;
                case 4:
                    for (ChuyenXeNgoaiThanh cxnt : xeNgoaiThanh) inXe(cxnt); inDTXeNgoaiThanh(xeNgoaiThanh);
                    break;
                case 5:
                    System.out.println("Tam biet nha!");
                    System.exit(0);
                default:
                    System.out.println("Chon sai roi, chon lai di.");
                    break;
            }
        }        
    }
}
