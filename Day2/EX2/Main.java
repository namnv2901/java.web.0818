/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlygiaodich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xuan Nguyen
 */
public class Main {
    
    public static void main(String[] args) {
        List<Vang> vangs = new ArrayList<Vang>();
        List<TienTe> tienTes = new ArrayList<TienTe>();
        Vang vang1 = new Vang("9999", "111", 12, 12, 2017, 3000,10);
        Vang vang2 = new Vang("9999", "111", 12, 12, 2017, 3000,10);
        TienTe tienTe1 = new TienTe(22, "USD", "123", 12, 12, 2017, 3000, 10);
        TienTe tienTe2 = new TienTe(1, "VN", "123", 12, 12, 2017, 2000000000, 10);
        vangs.add(vang2);
        vangs.add(vang1);
        tienTes.add(tienTe1);
        tienTes.add(tienTe2);
        int tongVang =0;
        int tongTienTe= 0;
        double money=0;
        double tongTigia=0;
        
        while(true){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Menu-----------");
        //System.out.println("1.nhap vang");
        System.out.println("2.xuat vang");
        //System.out.println("3.nhap tien te");
        System.out.println("4.xuat tien te");
        System.out.println("5. xuat giao dich tien te >1 tỷ");
        System.out.println("An phim bat ki de thoat");
        
        String check = sc.nextLine();
        
        switch(check){
//            case "1":
//            {
//               System.out.println("1.nhap vang");
//               vang.input();
//               vangs.add(vang);
//               break;
//            }
            case "2" :
            {
                System.out.println("4.xuat tien te");
                for (Vang vang : vangs) {
                    vang.showInfo();
                    tongVang += vang.getSoLuong();
                }
                System.out.println("Tong so luong vang " +tongVang);
                break;
            }

//            case "3" : 
//            {
//                System.out.println("3.nhap tien te");
//                tienTe.input();
//                tienTes.add(tienTe);
//                break;
//            }
            case "4": 
            {
             System.out.println("4.xuat tien te");
                for (TienTe tienTe : tienTes) {
                    tienTe.showInfo();
                    money+=tienTe.thanhTien();
                    tongTigia += tienTe.getTiGia();
                    tongTienTe += tienTe.getSoLuong();
                }
                double tb = money/tongTigia;
                System.out.println("tb thanh tien " +tb);
                System.out.println("Tong so luong tien te " +tongTienTe);
                break;
            }
            case "5" :
            {
                for (TienTe tienTe : tienTes) {
                    if(tienTe.getDonGia()>1000000000){
                        tienTe.showInfo();
                    }
                    
                }
                break;
            }
            default:
                
                System.exit(0);
                break;
                
        }
    }
        
    
}
}
