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
public class VietNam extends User{
    private String doiTuong;
    private double dinhMuc;

    public VietNam(String doiTuong, double dinhMuc) {
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public VietNam(String doiTuong, double dinhMuc, String id, String hoTen, int ngay, int thang, int nam, double soLuong, double donGia) {
        super(id, hoTen, ngay, thang, nam, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public VietNam() {
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    double money = 0;

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Doi tuong : "+ getDoiTuong());
        System.out.println("Dinh muc : "+ getDinhMuc());
    }
    
    
    @Override
    public double thanhTien() {
        if(getSoLuong()<=getDinhMuc()){
            money = super.thanhTien();
        }else
            money = super.thanhTien()*getDinhMuc()+(getSoLuong()-getDinhMuc())*getDonGia()*2.5;
    return money;
    }
    
    
    
}
