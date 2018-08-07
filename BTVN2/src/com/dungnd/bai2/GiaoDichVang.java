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
public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
    }

    
    public GiaoDichVang(String loaiVang, String maGD, String ngayGD, double donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" + "loaiVang=" + loaiVang + '}';
    }
    
}
