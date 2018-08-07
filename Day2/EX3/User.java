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
public class User {
    private String id;
    private String hoTen;
    private int ngay;
    private int thang;
    private int nam;
    private double soLuong;
    private double donGia;

    public User() {
    }

    public User(String id, String hoTen, int ngay, int thang, int nam, double soLuong, double donGia) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void showInfo(){
        System.out.println("======================");
        System.out.println("ma khach hang: "+getId());
        System.out.println("ho ten:  "+getHoTen());
        System.out.println("ngay ra hoa don: "+getNgay());
        System.out.println("Thang ra hoa don "+getThang());
        System.out.println("Nam ra hoa don: "+getNam());
        System.out.println("So luong: "+getSoLuong());
        System.out.println("Don gia: "+getDonGia());
    }
    
    public double thanhTien(){
        return getDonGia()*getSoLuong();
    }
    
}
