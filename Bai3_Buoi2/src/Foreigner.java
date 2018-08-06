/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.util.Date;

public class Foreigner extends Customer {

    private String national;

    public Foreigner() {
    }

    public Foreigner(String national, String id, String name, Date date, int quantum, double price) {
        super(id, name, date, quantum, price);
        this.national = national;
    }

    public Foreigner(String national, String id, String name, Date date, int quantum, double price, double total) {
        super(id, name, date, quantum, price, total);
        this.national = national;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getDate() + "\t" + national + "\t" + getQuantum() + "\t" + getPrice() + "\t" + "\t" + getTotal();
    }

}
