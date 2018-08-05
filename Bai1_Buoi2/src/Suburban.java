/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Suburban extends RikkeiTour {

    private String place;
    private double day;

    public Suburban() {
    }

    public Suburban(String place, double day, String idTour, String name, String idBus, double income) {
        super(idTour, name, idBus, income);
        this.place = place;
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return getIdTour() + "\t" + getName() + "\t" + getIdBus() + "\t" + place + "\t" + day + "\t" + getIncome();
    }

}
