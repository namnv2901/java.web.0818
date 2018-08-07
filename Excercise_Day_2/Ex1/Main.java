/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hoc_Anms
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        List<CarUrban> carUrban=new ArrayList<CarUrban>();
        List<CarSuburban> carSuburban=new ArrayList<CarSuburban>();
        
        
        String check = "";
		
	while (true)
	{
            System.out.println("------- MENU ------");
            System.out.println("1.Input Car Urban");
            System.out.println("2.Input Car Suburban");
            System.out.println("3.Output Car Urban");
            System.out.println("4.Output Car Suburban");
            System.out.println("#Exit");
			
            System.out.println("Let choice");
            check = sc.nextLine();
			
            if(check.equals("1")) {
		CarUrban car = new CarUrban();
		car.input();
		carUrban.add(car);
            }
            else if(check.equals("2")) {
		CarSuburban car = new CarSuburban();
		car.input();
		carSuburban.add(car);
            }
            else if (check.equals("3")) {
                System.out.println("Car Urban");
		for(CarUrban car : carUrban) {
                    car.output();
		}
            }
            else if (check.equals("4")) {
		System.out.println("Car Suburban");
		for(CarSuburban car : carSuburban) {
                    car.output();
		}
            }
            else {
		break;
            }
	}
		
		//Tổng doanh thu cho từng loại xe
		double moneyUrban = 0;
		double moneySuburban = 0;
		
		for(int i = 0; i < carUrban.size(); i++) {
			moneyUrban += carUrban.get(i).getMoney();
		}
		
		for (int i = 0; i < carSuburban.size(); i++) {
			moneySuburban += carSuburban.get(i).getMoney();
		}
		
		System.out.println("Money Urban: " + moneyUrban);
		System.out.println("Money Suburban:" + moneySuburban);
    }
    
}
