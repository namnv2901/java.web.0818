/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.util.Scanner;

/**
 *
 * @author Hoc_Anms
 */
public class Fraction {
    private int tuSo;
    private int mauSo;
    
    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
     
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }


    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public Fraction nhap(int x){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phan so thu "+x);
        System.out.println("Nhap tu so:");
        tuSo=sc.nextInt();
        System.out.println("Nhap mau so:");
        do{
            mauSo=sc.nextInt();
            if(mauSo==0)  System.out.println("Nhap lai mau so");
        }while(mauSo==0);
        Fraction ps=new Fraction();
        return ps;
    }
    public int UCLN(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public Fraction rutGon(Fraction ps){
         Fraction fr=new Fraction();
         fr.tuSo=ps.tuSo/UCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
         fr.mauSo=ps.mauSo/UCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
        // System.out.println("Phan so sau khi duoc rut gon:"+fr);        
         return fr;
    }
    public Fraction add(Fraction fr1,Fraction fr2){
        Fraction fr=new Fraction();
        fr.tuSo=fr1.tuSo*fr2.mauSo+fr1.mauSo*fr2.tuSo;
        fr.mauSo=fr1.mauSo*fr2.mauSo;
        if(fr.tuSo!=0){
            fr=rutGon(fr);
        }
        return fr;
    }
    
     public Fraction sub(Fraction fr1,Fraction fr2){
        Fraction fr=new Fraction();
        fr.tuSo=fr1.tuSo*fr2.mauSo-fr1.mauSo*fr2.tuSo;
        fr.mauSo=fr1.mauSo*fr2.mauSo;
        if(fr.tuSo!=0){
            fr=rutGon(fr);
        }
        return fr;
    }
     public Fraction mul(Fraction fr1,Fraction fr2){
        Fraction fr=new Fraction();
        fr.tuSo=fr1.tuSo*fr2.tuSo;
        fr.mauSo=fr1.mauSo*fr2.mauSo;
        if(fr.tuSo!=0){
            fr=rutGon(fr);
        }
        return fr;
    }
     public Fraction div(Fraction fr1,Fraction fr2){
        Fraction fr=new Fraction();
        fr.tuSo=fr1.tuSo*fr2.mauSo;
        fr.mauSo=fr1.mauSo*fr2.tuSo;
        if(fr.tuSo!=0){
            fr=rutGon(fr);
        }
        return fr;
    }
    public void hienThi(Fraction fr){
        if(fr.tuSo==0||fr.mauSo==1) System.out.println(fr.tuSo);
       else System.out.println(fr.tuSo+"/"+fr.mauSo);
    }
//      public static void main(String[] args) {
//        Fraction fr1=new Fraction();
//        Fraction fr2=new Fraction();
//        fr1.nhap(1);
//        fr2.nhap(2);
//        if(fr1.tuSo!=0) fr1=fr1.rutGon(fr1);
//        if(fr2.mauSo!=0) fr2=fr2.rutGon(fr2);
//        System.out.println("Phan so 1 o dang toi gian: "); fr1.hienThi(fr1);
//        System.out.println("Phan so 2 o dang toi gian: "); fr2.hienThi(fr2);
//        System.out.println("Phan so tong:"); fr1.hienThi(fr1.add(fr1, fr2));
//        System.out.println("Phan so hieu:"); fr1.hienThi(fr1.sub(fr1, fr2));
//        System.out.println("Phan so tich:"); fr1.hienThi(fr1.sub(fr1, fr2));
//        System.out.println("Phan so thuong:"); fr1.hienThi(fr1.sub(fr1, fr2));
//        
//    }
}

   
