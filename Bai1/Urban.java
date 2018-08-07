/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author PC
 */
public class Urban extends RikkeiTour {

    private String numTour;
    private double distance;

    public Urban() {
    }

    public Urban(String numTour, double distance, String idTour, String name, String idBus, double income) {
        super(idTour, name, idBus, income);
        this.numTour = numTour;
        this.distance = distance;
    }

    public String getNumTour() {
        return numTour;
    }

    public void setNumTour(String numTour) {
        this.numTour = numTour;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return getIdTour() + "\t" + getName() + "\t" + getIdBus() + "\t" + numTour + "\t" + distance + "\t" + getIncome();
    }

}
