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

public class Vietnamese extends Customer {

    private String kind;
    private int quota;

    public Vietnamese() {
    }

    public Vietnamese(String kind, int quota, String id, String name, Date date, int quantum, double price) {
        super(id, name, date, quantum, price);
        this.kind = kind;
        this.quota = quota;
    }

    public Vietnamese(String kind, int quota, String id, String name, Date date, int quantum, double price, double total) {
        super(id, name, date, quantum, price, total);
        this.kind = kind;
        this.quota = quota;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public double getTotal() {
        if (getQuantum() <= quota) {
            return getQuantum() * getPrice();
        }
        return getQuantum() * getPrice() * quota + (quota - getQuantum()) * getPrice() * 2.5;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getDate() + "\t" + kind + "\t" + getQuantum() + "\t" + getPrice() + "\t" + quota + "\t" + getTotal();
    }
    
    
}
