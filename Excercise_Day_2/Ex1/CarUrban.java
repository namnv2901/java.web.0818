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
public class CarUrban extends Rikkeitour{
    private String carNumber;
    private double kmNumber;

    public CarUrban() {
    }

    public CarUrban(String carNumber, double kmNumber) {
        this.carNumber = carNumber;
        this.kmNumber = kmNumber;
    }

    public CarUrban(String carNumber, double kmNumber, String idTour, String idDriver, String idCar, double money) {
        super(idTour, idDriver, idCar, money);
        this.carNumber = carNumber;
        this.kmNumber = kmNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public double getKmNumber() {
        return kmNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setKmNumber(double kmNumber) {
        this.kmNumber = kmNumber;
    }

    
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Car Numner:");
        carNumber=sc.nextLine();
        System.out.println("Input Km Number:");
        kmNumber=sc.nextDouble();
    }
    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Car Numner:"+carNumber);
        System.out.println("Km Number:"+kmNumber);
    }

    
    
    
    
}
