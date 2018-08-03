/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.Scanner;

/**
 *
 * @author Hoc_Anms
 */
public class TamGiac {
    private float a;
    private float b;
    private float c;

    public TamGiac() {
    }

    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void nhapCanh(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh a:");
        a=sc.nextFloat();
        System.out.println("Nhap canh b:");
        b=sc.nextFloat();
        System.out.println("Nhap canh c:");
        c=sc.nextFloat();
    }
    public void type(){
        if(a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c) System.out.println("La tam giac deu");
            else if(a==b||a==c||b==c) System.out.println("La tam giac can");
            else System.out.println("La tam giac thuong");
        }
        else System.out.println("Khong phai la tam giac");
    }
    
    public void chuVi(){
        float p=a+b+c;
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("Chu vi tam giac la:"+p);
        }
        else System.out.println("Khong phai la tam giac");        
    }
    public void dienTich(){
        float p=a+b+c;
        float s=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if(a+b>c&&a+c>b&&b+c>a){
             System.out.println("Dien tich tam giac la:"+s);
        }
        else System.out.println("Khong phai la tam giac");
    }
}
