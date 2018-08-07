/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dungnd.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungotis
 */

public class MainGiaoDich {
    private static Scanner sc = new Scanner(System.in);
    private static void nhapGD(GiaoDich g){
        System.out.print("Ma giao dich: "); g.setMaGD(sc.nextLine());
        System.out.print("Ngay giao dich: "); g.setNgayGD(sc.nextLine());
        System.out.print("Don gia: "); g.setDonGia(sc.nextDouble());
        System.out.print("So luong: "); g.setSoLuong(sc.nextInt());
        if(g instanceof GiaoDichVang){
            sc.nextLine();
            System.out.print("Loai vang: "); ((GiaoDichVang) g).setLoaiVang(sc.nextLine());
        }else if(g instanceof GiaoDichTienTe){
            System.out.print("Ti gia: "); ((GiaoDichTienTe) g).setTiGia(sc.nextDouble());
            System.out.print("Loai tien (1-VND, 2-USD, 3-EURO): "); ((GiaoDichTienTe) g).setLoaiTien(sc.nextInt());
            sc.nextLine();
        }
    }
    
    private static void inGiaoDihc(GiaoDich g){
        if(g instanceof GiaoDichVang) System.out.println(((GiaoDichVang) g).toString());
        else if(g instanceof GiaoDichTienTe) System.out.println(((GiaoDichTienTe) g).toString());
    }
    public static void main(String[] args) {
        
        List<GiaoDichVang> listGDV = new ArrayList<>();
        List<GiaoDichTienTe> listTT = new ArrayList<>();
        while(true){
            System.out.println("QUAN LY GIAO DICH --------------");
            System.out.println("1. Nhap giao dich vang");
            System.out.println("2. Nhap giao dich tien te");
            System.out.println("3. Xuat giao dich vang");
            System.out.println("4. Xuat giao dich tien te");
            System.out.println("5. Thoat");
            System.out.print("Ban chon: ");
            int lc = sc.nextInt(); sc.nextLine();
            switch(lc){
                case 1:
                    GiaoDichVang gv = new GiaoDichVang();
                    nhapGD(gv); listGDV.add(gv);
                    break;
                case 2:
                    GiaoDichTienTe gt = new GiaoDichTienTe();
                    nhapGD(gt); listTT.add(gt);
                    break;
                case 3:
                    for(GiaoDichVang g1 : listGDV) inGiaoDihc(g1);
                    System.out.println("Tong giao dich: " + listGDV.size());
                    break;
                case 4:
                    for (GiaoDichTienTe g2 : listTT) inGiaoDihc(g2);
                    System.out.println("Tong giao dich: " + listTT.size());
                    break;
                case 5:
                    System.out.println("Tam biet nha!");
                    System.exit(0);
                default:
                    System.out.println("Chon sai roi, chon lai di.");
                    break;
            }
        }
        
    }
}
