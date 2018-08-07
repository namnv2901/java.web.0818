package Bai2;

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
public final class Currency extends Deal {

    private double rate;
    private String kind;

    public Currency() {
    }
    
    public Currency(double rate, String kind, String id, Date date, double bill, int quantum) {
        super(id, date, bill, quantum);
        this.rate = rate;
        setKind(kind);
    }

    public Currency(double rate, String kind, String id, Date date, double bill, int quantum, double total) {
        super(id, date, bill, quantum, total);
        this.rate = rate;
        setKind(kind);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate > 0) {
            this.rate = rate;
        }
        this.rate = 0;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        if (kind.equalsIgnoreCase("VND") || kind.equalsIgnoreCase("USD") || kind.equalsIgnoreCase("Euro")) {
            this.kind = kind;
        }
        this.kind = "VND";
    }

    @Override
    public double getTotal() {
        if (kind.equalsIgnoreCase("VND")) {
            return getQuantum() * getBill();
        }
        return getQuantum() * getBill() * rate;
    }
    
    @Override
    public String toString() {
        return getId() + "\t" + getDate() + "\t" + getBill() + "\t" + getQuantum() + "\t" + rate + "\t" + kind + "\t" + getTotal();
    }

}