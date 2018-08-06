
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Manager {

    Scanner sc = new Scanner(System.in);
    static List<Gold> gold = new ArrayList();
    static List<Currency> currency = new ArrayList();
    static SimpleDateFormat dateFormats = new SimpleDateFormat("dd/MM/yyyy");

    public void mainMenu() {
        System.out.println("----- Deal Manager -----");
        System.out.println("1. List Deal");
        System.out.println("2. Total Deal");
        System.out.println("3. Average of Currency Deal");
        System.out.println("4. Total > 1000000000");
        System.out.println("5. Exit");
    }

    public void listMenu() {
        System.out.println("----- List Deal -----");
        System.out.println("1. Import Deal");
        System.out.println("2. Export Deal");
        System.out.println("3. Exit");
    }

    public void tourMenu() {
        System.out.println("1. Gold Deal");
        System.out.println("2. Currency Deal");
        System.out.println("3. Exit");
    }

    public int checkChoice(String mess) {
        int choice;
        while (true) {
            try {
                System.out.print(mess);
                choice = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number");
            } catch (NullPointerException e) {
                System.out.println("Please don't input space");
            }
        }
        return choice;
    }

    public List importGold() {
        while (true) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            Date date = checkDate();
            double bill = checkDouble("Enter bill: ");
            int quantum = checkChoice("Enter quantum: ");
            System.out.print("Enter kind of gold: ");
            String kind = sc.nextLine();
            gold.add(new Gold(kind, id, date, bill, quantum));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return gold;
    }

    public List importCurrency() {
        while (true) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            Date date = checkDate();
            double bill = checkDouble("Enter bill: ");
            int quantum = checkChoice("Enter quantum: ");
            double rate = checkDouble("Enter rate: ");
            String kind = checkCurrency("Enter kind of currency: ");
            currency.add(new Currency(rate, kind, id, date, bill, quantum));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return currency;
    }

    public Date checkDate() {
        Date date = null;
        while (true) {
            System.out.print("Enter date: ");
            String input = sc.nextLine();

            try {
                dateFormats.setLenient(false);
                date = dateFormats.parse(input);
                break;
            } catch (ParseException e) {
                System.out.println("Date is invalid. Try again");
            }

            if (date != null) {
                break;
            }
        }
        return date;
    }

    public String checkCurrency(String mess) {
        String kind;
        while (true) {
            System.out.print(mess);
            kind = sc.nextLine();
            if (kind.equalsIgnoreCase("VND") || kind.equalsIgnoreCase("USD") || kind.equalsIgnoreCase("Euro")) {
                break;
            } else {
                System.out.println("Try again!");
            }
        }
        return kind;
    }

    public double checkDouble(String mess) {
        double num;
        while (true) {
            try {
                System.out.print(mess);
                num = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            } catch (NullPointerException e) {
                System.out.println("Please don't input space");
            }
        }
        return num;
    }

    public void exportGold() {
        if (gold.isEmpty()) {
            System.out.println("No data");
        } else {
            gold.forEach((g) -> {
                System.out.println(g.toString());
            });
        }
    }

    public void exportCurrency() {
        if (currency.isEmpty()) {
            System.out.println("No data");
        } else {
            currency.forEach((cur) -> {
                System.out.println(cur.toString());
            });
        }
    }

    public double totalGold() {
        double total = 0;
        for (Gold g : gold) {
            total += g.getTotal();
        }
        return total;
    }

    public double totalCurrency() {
        double total = 0;
        for (Currency cur : currency) {
            total += cur.getTotal();
        }
        return total;
    }

    public double avgCurrency() {
        if (currency.isEmpty()) {
            return 0;
        }
        return totalCurrency() / currency.size();
    }

    public void exportGoldCondition() {
        if (gold.isEmpty()) {
            System.out.println("No data");
        } else {
            int count = 0;
            for (int i = 0; i < gold.size(); i++) {
                if (gold.get(i).getTotal() > 1000000000) {
                    System.out.println(gold.get(i).toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No deal has total > 1000000000");
            }
        }
    }

    public void exportCurrencyCondition() {
        if (currency.isEmpty()) {
            System.out.println("No data");
        } else {
            int count = 0;
            for (int i = 0; i < currency.size(); i++) {
                if (currency.get(i).getTotal() > 1000000000) {
                    System.out.println(currency.get(i).toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No deal has total > 1000000000");
            }
        }
    }

    public void control() {
        mainMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                controlList();
                break;
            case 2:
                controlTotal();
                break;
            case 3:
                System.out.println("----- Average -----");
                System.out.println(avgCurrency());
                control();
                break;
            case 4:
                controlTotalCondition();
                break;
            default:
                break;
        }
    }

    public void controlList() {
        listMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                controlImport();
                break;
            case 2:
                controlExport();
                break;
            default:
                control();
                break;
        }
    }

    public void controlTotal() {
        System.out.println("----- Total -----");
        tourMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                System.out.println(totalGold());
                controlTotal();
                break;
            case 2:
                System.out.println(totalCurrency());
                controlTotal();
                break;
            default:
                control();
                break;
        }
    }

    public void controlImport() {
        System.out.println("----- Import -----");
        tourMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                importGold();
                controlImport();
                break;
            case 2:
                importCurrency();
                controlImport();
                break;
            default:
                controlList();
                break;
        }
    }

    public void controlExport() {
        System.out.println("----- Export -----");
        tourMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                exportGold();
                controlExport();
                break;
            case 2:
                exportCurrency();
                controlExport();
                break;
            default:
                controlList();
                break;
        }
    }

    public void controlTotalCondition() {
        System.out.println("----- Total > 1000000000-----");
        tourMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                exportGoldCondition();
                controlTotalCondition();
                break;
            case 2:
                exportCurrencyCondition();
                controlTotalCondition();
                break;
            default:
                control();
                break;
        }
    }
}
