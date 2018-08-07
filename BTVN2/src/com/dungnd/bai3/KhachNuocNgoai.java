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
public class KhachNuocNgoai extends HoaDon{
    private String quocTich;

    public KhachNuocNgoai() {
    }

    public KhachNuocNgoai(String quocTich, String maKhach, String hoTen, String ngayLap, double soLuong, double donGia) {
        super(maKhach, hoTen, ngayLap, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachNuocNgoai{" + "quocTich=" + quocTich + '}';
    }
}
