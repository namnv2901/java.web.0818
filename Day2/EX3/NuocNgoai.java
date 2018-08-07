/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlyhoadontiendien;

/**
 *
 * @author Xuan Nguyen
 */
public class NuocNgoai extends User{
    private String quocTich;

    public NuocNgoai() {
    }

    public NuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public NuocNgoai(String quocTich, String id, String hoTen, int ngay, int thang, int nam, double soLuong, double donGia) {
        super(id, hoTen, ngay, thang, nam, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Quoc tich: "+ getQuocTich());
    }
    
    
    
    
}
