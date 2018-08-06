
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
public class Gold extends Deal {

    private String kind;

    public Gold() {
    }

    public Gold(String kind, String id, Date date, double bill, int quantum) {
        super(id, date, bill, quantum);
        this.kind = kind;
    }

    public Gold(String kind, String id, Date date, double bill, int quantum, double total) {
        super(id, date, bill, quantum, total);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getDate() + "\t" + getBill() + "\t" + getQuantum() + "\t" + kind + "\t" + getTotal();
    }

    
}
