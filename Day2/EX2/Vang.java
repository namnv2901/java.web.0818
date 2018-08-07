/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlygiaodich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xuan Nguyen
 */
public class Vang extends GiaoDich{
    private String loaiVang;

    public Vang() {
    }

    public Vang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public Vang(String loaiVang, String maGiaoDich, int ngay, int thang, int nam, double donGia, int soLuong) {
        super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    

//    @Override
//    public void input() {
//        super.input();
//        System.out.println("Loai vang : " );
//        loaiVang = new Scanner(System.in).nextLine();
//    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Loai vang : " +getLoaiVang());
    }

    @Override
    public double thanhTien() {
        return super.thanhTien();
    }
    int tongVang =0;
    public void showList(){
        List<Vang> vangs = new ArrayList<Vang>();
        for (Vang vang : vangs) {
            vang.showInfo();
            tongVang +=vang.getSoLuong();    
        }
        System.out.println("Tong so vang " +tongVang);
    }
    
    
    
    
    
    
}
