/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dungnd.bai1;

/**
 *
 * @author dungotis
 */
public class ChuyenXe {
    private String maChuyen;
    private String tenTaiXe;
    private String soXe;
    private double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyen, String tenTaiXe, String soXe, double doanhThu) {
        this.maChuyen = maChuyen;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
