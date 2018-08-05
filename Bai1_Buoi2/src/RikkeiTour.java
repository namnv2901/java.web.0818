/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class RikkeiTour {

    private String idTour;
    private String name;
    private String idBus;
    private double income;

    public RikkeiTour() {
    }

    public RikkeiTour(String idTour, String name, String idBus, double income) {
        this.idTour = idTour;
        this.name = name;
        this.idBus = idBus;
        this.income = income;
    }

    public String getIdTour() {
        return idTour;
    }

    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

}
