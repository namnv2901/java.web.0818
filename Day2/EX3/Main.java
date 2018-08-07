/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rikkeisoft.buoi2.quanlyhoadontiendien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xuan Nguyen
 */
public class Main {
    public static void main(String[] args) {
        List<VietNam> vietNams = new ArrayList<VietNam>();
        List<NuocNgoai> nuocNgoais = new ArrayList<NuocNgoai>();
        
        VietNam v1= new VietNam("sinh hoat", 50, "123", "Nguyen Van A",
                12 , 12, 2017, 70, 3.5);
        VietNam v2= new VietNam("sinh hoat", 50, "123", "Nguyen Van A",
                12 , 12, 2017, 70, 3500);
        NuocNgoai n1 = new NuocNgoai("My", "1234", "Jonh", 12, 12, 2017, 70, 5000);
        NuocNgoai n2 = new NuocNgoai("My", "1234", "Jonh", 12, 12, 2017, 70, 3000);
    
        vietNams.add(v1);
        vietNams.add(v2);
        nuocNgoais.add(n1);
        nuocNgoais.add(n2);
        
        double tongVN =0;
        double tongNN = 0;
        double money = 0;
        double tb = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.println("=====Choose :=======");
            System.out.println("1 Xuat khach hang viet nam");
            System.out.println("2 Xuat khach hang nuoc ngoai");
            System.out.println("An phim bat ki de thoat");
            
            String choose = sc.nextLine();
            switch(choose){
                case "1":
                {
                    for (VietNam vietNam : vietNams) {
                        vietNam.showInfo();
                        tongVN += vietNam.getSoLuong();
                        vietNam.thanhTien();
                
                    }
                    System.out.println("Tong so luong : " +tongVN);
                    System.out.println("=====================");
                    break;
                }
                
                case "2":
                {
                    for (NuocNgoai nuocNgoai : nuocNgoais) {
                     nuocNgoai.showInfo();
                     tongNN+= nuocNgoai.getSoLuong();
                     money += nuocNgoai.thanhTien();
                     
                    }
                    tb = money/tongNN;
                    System.out.println("Tong so luong : " +tongVN);
                    System.out.println("Tb thanh tien: "+tb);
                    System.out.println("================");
                    break;
                }
            }
            
        }
    }
    
    
}
