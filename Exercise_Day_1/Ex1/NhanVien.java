/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author Hoc_Anms
 */
public class NhanVien {
    private String name;
    private int  age;
    private String address;
    private double salary;
    private int time;
    
    public NhanVien(){
    
    }

    public NhanVien(String name, int age, String address, double salary, int time) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    public void printInfor(){
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Salary:"+salary);
        System.out.println("Total Time:"+time);
       
    }
    public double tongThuNhap(){
        double thunhap;
        
        if(time>=200){
            thunhap=salary*0.2+ salary;
            System.out.println("Thu nhap:"+thunhap);
        }
        else if(100<time&&time<200){
            thunhap=salary*0.2+ salary;
            System.out.println("Thu nhap:"+thunhap);
        }
        else if(time<100){
            thunhap=salary*0.2+ salary;
            System.out.println("Thu nhap:"+thunhap);
        }
        return 0;
    }
    
   
}

