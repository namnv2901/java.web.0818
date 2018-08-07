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
public class XeNgoaiThanh extends CarManagement{
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh() {
    }
    

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoChuyen, String ten, int soXe, double doanhThu) {
        super(maSoChuyen, ten, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Noi den :" +getNoiDen());
        System.out.println("So ngay di duoc : "+ getSoNgayDiDuoc());
        System.out.println("Xe ngoai thanh");
                
    }
    
    
}
