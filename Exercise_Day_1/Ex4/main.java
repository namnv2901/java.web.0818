/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author Hoc_Anms
 */
public class main {
    public static void main(String[] args) {
        Fraction fr1=new Fraction();
        Fraction fr2=new Fraction();
        fr1.nhap(1);
        fr2.nhap(2);
   
        System.out.println("Phan so 1 o dang toi gian: "); fr1.hienThi(fr1);
        System.out.println("Phan so 2 o dang toi gian: "); fr2.hienThi(fr2);
        System.out.println("Phan so tong:"); fr1.hienThi(fr1.add(fr1, fr2));
        System.out.println("Phan so hieu:"); fr1.hienThi(fr1.sub(fr1, fr2));
        System.out.println("Phan so tich:"); fr1.hienThi(fr1.mul(fr1, fr2));
        System.out.println("Phan so thuong:"); fr1.hienThi(fr1.div(fr1, fr2));
        
    }
}
