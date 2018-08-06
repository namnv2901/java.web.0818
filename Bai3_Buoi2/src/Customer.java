
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
public class Customer {

    private String id;
    private String name;
    private Date date;
    private int quantum;
    private double price;
    private double total;

    public Customer() {
    }

    public Customer(String id, String name, Date date, int quantum, double price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.quantum = quantum;
        this.price = price;
    }

    public Customer(String id, String name, Date date, int quantum, double price, double total) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.quantum = quantum;
        this.price = price;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return quantum * price;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
