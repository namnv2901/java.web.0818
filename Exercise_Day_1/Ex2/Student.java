/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author Hoc_Anms
 */
public class Student {
    public static final String NAN="NAN";
     public static final int DIEM_MAC_DINH=0;
    private String id;
    private float diemTB;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(String id, float diemTB, int age, String lop) {
        this.id = id;
        this.diemTB = diemTB;
        this.age = age;
        this.lop = lop;
    }

    public void setId(String id) {
        this.id = id;
        if(id.length()!=8){ 
            this.id=NAN;
        }
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
        if(diemTB<0&&diemTB>10){
            this.diemTB=(float)DIEM_MAC_DINH;
        }
    }

    public void setAge(int age) {
        this.age = age;
        if(age<18){
            this.age=DIEM_MAC_DINH;
        }
    }

    public void setLop(String lop) {
        this.lop = lop;
        if(lop.startsWith("A")||lop.startsWith("C")){
            this.lop=NAN;
        }
    }

    public String getId() {
        return id;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public int getAge() {
        return age;
    }

    public String getLop() {
        return lop;
    }
    public void nhapSinhvien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MSV:");
        id=sc.nextLine();
        System.out.println("Nhap DTB:");
        diemTB=sc.nextFloat();
        System.out.println("Nhap tuoi:");
        age=sc.nextInt();
        System.out.println("Nhap lop:");
        lop=sc.next();
    }
    public void showInfor(){
        System.out.println("MSV: "+id+"\n"+"DTB: "+diemTB+"\n" +"age:"+age +"\n"+"Lop: "+ lop);
    }
    public void scholarShip(){
        if(diemTB>8) System.out.println("Have Scholarship");
        else System.out.println("Don't Scholarship");
    }
}
