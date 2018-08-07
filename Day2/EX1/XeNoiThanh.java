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
public class XeNoiThanh extends CarManagement{
    private int soTuyen;
    private double soKmDiDuoc;

    public XeNoiThanh() {
    }


    public XeNoiThanh(int soTuyen, double soKmDiDuoc, String maSoChuyen, String ten, int soXe, double doanhThu) {
        super(maSoChuyen, ten, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("So tuyen :" +getSoTuyen());
        System.out.println("So km di duoc : "+ getSoKmDiDuoc());
        System.out.println("Xe noi thanh");
                
    }
    
    

    
    
    
    
    
    
    
    
    
}
