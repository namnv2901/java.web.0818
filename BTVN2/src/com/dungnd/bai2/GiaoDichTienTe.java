/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dungnd.bai2;

/**
 *
 * @author dungotis
 */
public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private int loaiTien;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String maGD, String ngayGD, double donGia, int soLuong, double tiGia, int loaiTien) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        if(tiGia > 0) this.tiGia = tiGia;
    }

    public int getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(int loaiTien) {
        this.loaiTien = loaiTien;
    }
    
    public double thanhTien(){
        if(loaiTien == 1) return getSoLuong() * getDonGia();
        else return getSoLuong() * getDonGia() * tiGia;
    }
    
    @Override
    public String toString() {
        return "GiaoDichTienTe{" + "tiGia=" + tiGia + '}';
    }
    
}
