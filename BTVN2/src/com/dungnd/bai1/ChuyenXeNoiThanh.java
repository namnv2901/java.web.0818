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
public class ChuyenXeNoiThanh extends ChuyenXe{
    
    private int soTuyen;
    private float soKM;
    
    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(String maChuyen, String tenTaiXe, String soXe, 
            double doanhThu, int soTuyen, float soKM) {
        super(maChuyen, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKM() {
        return soKM;
    }

    public void setSoKM(float soKM) {
        this.soKM = soKM;
    }   
    
    
    
    @Override
    public String toString() {
        return super.getMaChuyen() + " " + super.getTenTaiXe() + " " + super.getSoXe() 
                + " " + soTuyen + " " + soKM + " " + super.getDoanhThu();
    }
    
}
