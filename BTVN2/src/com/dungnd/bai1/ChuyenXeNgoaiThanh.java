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
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maChuyen, 
            String tenTaiXe, String soXe, double doanhThu) {
        super(maChuyen, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public String toString() {
        return super.getMaChuyen() + " " + super.getTenTaiXe() + " " + super.getSoXe() 
                + " " + noiDen + " " + soNgay + " " + super.getDoanhThu();
    }    
    
}
