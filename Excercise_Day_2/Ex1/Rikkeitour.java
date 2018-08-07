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
public class Rikkeitour {
    private String idTour;
    private String idDriver;
    private String idCar;
    private double money;

    public Rikkeitour() {
    }

    public Rikkeitour(String idTour, String idDriver, String idCar, double money) {
        this.idTour = idTour;
        this.idDriver = idDriver;
        this.idCar = idCar;
        this.money = money;
    }

    public String getIdTour() {
        return idTour;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getIdCar() {
        return idCar;
    }

    public double getMoney() {
        return money;
    }

    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input ID Tour:");
        idTour=sc.nextLine();
        System.out.println("Input ID Driver:");
        idDriver=sc.nextLine();
        System.out.println("Input ID Car:");
        idCar=sc.nextLine();
        System.out.println("Input Money:");
        money=sc.nextDouble();
    }
    public void output(){
        System.out.println("ID Tour:"+idTour);
        System.out.println("ID Driver:"+idDriver);
        System.out.println("ID Car:"+idCar);
        System.out.println("Money:"+money);
    }
}
