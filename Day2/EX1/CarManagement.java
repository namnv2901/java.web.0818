/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlychuyenxe;


/**
 *
 * @author Xuan Nguyen
 */
public class CarManagement {
    private String maSoChuyen;
    private String ten;
    private int soXe;
    private double doanhThu;

    public CarManagement() {
    }

    public CarManagement(String maSoChuyen, String ten, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.ten = ten;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void showInfo(){
        System.out.println("============");
        System.out.println("Ma so chuyen : " + getMaSoChuyen());
        System.out.println("Ho ten tai xe : "+ getTen());
        System.out.println("So xe: " +getSoXe());
        System.out.println("Doanh thu: "+getDoanhThu());
    }
    
    
    
}
