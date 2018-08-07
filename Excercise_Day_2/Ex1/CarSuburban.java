/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author Hoc_Anms
 */
public class CarSuburban extends Rikkeitour{
    private String place;
    private int day;

    public CarSuburban() {
    }

    public CarSuburban(String place, int day) {
        this.place = place;
        this.day = day;
    }

    public CarSuburban(String place, int day, String idTour, String idDriver, String idCar, double money) {
        super(idTour, idDriver, idCar, money);
        this.place = place;
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public int getDay() {
        return day;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDay(int day) {
        this.day = day;
    }
     @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Place:");
        place=sc.nextLine();
        System.out.println("Input Day:");
        day=sc.nextInt();
    }
    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Place:"+place);
        System.out.println("Day:"+day);
    }
    
}
