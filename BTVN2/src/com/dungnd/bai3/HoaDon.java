/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dungnd.bai3;

/**
 *
 * @author dungotis
 */
public class HoaDon {
    private String maKhach;
    private String hoTen;
    private String ngayLap;
    private double soLuong;
    private double donGia;

    public HoaDon() {
    }

    public HoaDon(String maKhach, String hoTen, String ngayLap, double soLuong, double donGia) {
        this.maKhach = maKhach;
        this.hoTen = hoTen;
        this.ngayLap = ngayLap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
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
    
    
}
