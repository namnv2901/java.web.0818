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
public class GiaoDich {
    private String maGiaoDich;
    private int ngay;
    private int thang;
    private int nam;
    private double donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, int ngay, int thang, int nam, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
//    public void input(){
//        
//            System.out.println("Nhap ma giao dich : ");
//            maGiaoDich = new Scanner(System.in).nextLine();
//            System.out.println("Ngay giao dich : ");
//            ngay = new Scanner(System.in).nextInt();
//            System.out.println("Thang giao dich ");
//            thang = new Scanner(System.in).nextInt();
//            System.out.println("Nam giao dich ");
//            nam = new Scanner(System.in).nextInt();
//            System.out.println("Don gia ");
//            donGia=  new Scanner(System.in).nextDouble();
//            System.out.println("So luong ");
//            soLuong = new Scanner(System.in).nextInt();
//        
//    }
    
    public void showInfo(){
        System.out.println("==============");
        System.out.println(" Ma giao dich : " +maGiaoDich);
        System.out.println(" Ngay giao dich : "+ ngay);
        System.out.println(" Thang giao dich : "+ thang);
        System.out.println(" Nam giao dich : "+ nam);
        System.out.println(" Don gia : "+ donGia);
        System.out.println(" So luong : "+ soLuong);
    }
    double money = 0;
    public double thanhTien(){
        money = getSoLuong()*getDonGia();
        return money;
    }
    
}
