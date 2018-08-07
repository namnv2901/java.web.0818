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
public class KhachVietNam extends HoaDon{
    private int doiTuong;
    private double dinhMuc;

    public KhachVietNam(String maKhach, String hoTen, String ngayLap, double soLuong, double donGia, int doiTuong, double dinhMuc) {
        super(maKhach, hoTen, ngayLap, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public KhachVietNam() {
    }

    public int getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(int doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    
    
    @Override
    public String toString() {
        return "KhachVietNam{" + "doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + '}';
    }
    
    
}
