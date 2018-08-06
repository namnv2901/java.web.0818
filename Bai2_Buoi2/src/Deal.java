
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Deal {
    private String id;
    private Date date;
    private double bill;
    private int quantum;
    private double total;

    public Deal() {
    }

    public Deal(String id, Date date, double bill, int quantum, double total) {
        this.id = id;
        this.date = date;
        this.bill = bill;
        this.quantum = quantum;
        this.total = total;
    }
    
    public Deal(String id, Date date, double bill, int quantum) {
        this.id = id;
        this.date = date;
        this.bill = bill;
        this.quantum = quantum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public double getTotal() {
        return quantum * bill;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
