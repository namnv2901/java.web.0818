/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlygiaodich;

import java.util.Scanner;

/**
 *
 * @author Xuan Nguyen
 */
public class TienTe extends GiaoDich{
    private double tiGia;
    private String loaiTienTe;

    public TienTe() {
    }

    public TienTe(double tiGia, String loaiTienTe) {
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public TienTe(double tiGia, String loaiTienTe, String maGiaoDich, int ngay, int thang, int nam, double donGia, int soLuong) {
        super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

//    @Override
//    public void input() {
//        super.input(); //To change body of generated methods, choose Tools | Templates.
//        System.out.println("Ti gia : ");
//        tiGia = new Scanner(System.in).nextDouble();
//        System.out.println("Loai tien te : " );
//        loaiTienTe  = new Scanner(System.in).nextLine();
//    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ti gia : "+ getTiGia());
        System.out.println("Loai tien te : " + getLoaiTienTe());
    }

    @Override
    public double thanhTien() {
        return super.thanhTien()*getTiGia(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
}
