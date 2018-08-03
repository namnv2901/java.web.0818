/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoc_Anms
 */
public class demo {
       public static void main(String[] args) {
        // TODO code application logic here
          NhanVien nv1=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv2=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv3=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv4=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv5=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv6=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv7=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv8=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv9=new NhanVien("A",18,"HaNoi",100,20);
          NhanVien nv10=new NhanVien("A",18,"HaNoi",100,20);
          List <NhanVien> list=new ArrayList <NhanVien>();
          list.add(nv1);
          list.add(nv2);
          list.add(nv3);
          list.add(nv4);
          list.add(nv5);
          list.add(nv6);
          list.add(nv7);
          list.add(nv8);
          list.add(nv9);
          list.add(nv10);
          
           for (NhanVien nhanVien : list) {
               nhanVien.printInfor();
               nhanVien.tongThuNhap();
           }
         
           
    }
}
