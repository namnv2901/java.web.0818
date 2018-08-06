/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manager {

    Scanner sc = new Scanner(System.in);
    static List<Vietnamese> vietnamese = new ArrayList();
    static List<Foreigner> foreigner = new ArrayList();
    static SimpleDateFormat dateFormats = new SimpleDateFormat("dd/MM/yyyy");

    public void mainMenu() {
        System.out.println("----- Electricity Bills Manager -----");
        System.out.println("1. List Deal");
        System.out.println("2. Total Deal");
        System.out.println("3. Average Bills of Foreigner");
        System.out.println("4. Exit");
    }

    public void listMenu() {
        System.out.println("----- List Bills -----");
        System.out.println("1. Import Deal");
        System.out.println("2. Export Deal");
        System.out.println("3. Exit");
    }

    public void tourMenu() {
        System.out.println("1. Vietnamese Deal");
        System.out.println("2. Foreigner Deal");
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

    public List importVietnamese() {
        while (true) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            Date date = checkDate();
            String kind = checkKindCustomer("Enter kind of customer: ");
            int quantum = checkChoice("Enter quantum: ");
            double price = checkDouble("Enter price: ");
            int quota = checkChoice("Enter quota: ");
            vietnamese.add(new Vietnamese(kind, quota, id, name, date, quantum, price));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return vietnamese;
    }

    public List importForeigner() {
        while (true) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            Date date = checkDate();
            System.out.print("Enter national: ");
            String national = sc.nextLine();
            int quantum = checkChoice("Enter quantum: ");
            double price = checkDouble("Enter price: ");
            foreigner.add(new Foreigner(national, id, name, date, quantum, price));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return foreigner;
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

    public String checkKindCustomer(String mess) {
        String kind;
        while (true) {
            System.out.print(mess);
            kind = sc.nextLine();
            if (kind.equalsIgnoreCase("living") || kind.equalsIgnoreCase("business") || kind.equalsIgnoreCase("production")) {
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

    public void exportVietnamese() {
        if (vietnamese.isEmpty()) {
            System.out.println("No data");
        } else {
            vietnamese.forEach((v) -> {
                System.out.println(v.toString());
            });
        }
    }

    public void exportForeigner() {
        if (foreigner.isEmpty()) {
            System.out.println("No data");
        } else {
            foreigner.forEach((f) -> {
                System.out.println(f.toString());
            });
        }
    }

    public double totalVietnamese() {
        double total = 0;
        for (Vietnamese v : vietnamese) {
            total += v.getTotal();
        }
        return total;
    }

    public double totalForeigner() {
        double total = 0;
        for (Foreigner f : foreigner) {
            total += f.getTotal();
        }
        return total;
    }

    public double avgForeigner() {
        if (foreigner.isEmpty()) {
            return 0;
        }
        return totalForeigner() / foreigner.size();
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
                System.out.println("----- Average Bill of Foreigner -----");
                System.out.println(avgForeigner());
                control();
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
                System.out.println(totalVietnamese());
                controlTotal();
                break;
            case 2:
                System.out.println(totalForeigner());
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
                importVietnamese();
                controlImport();
                break;
            case 2:
                importForeigner();
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
                exportVietnamese();
                controlExport();
                break;
            case 2:
                exportForeigner();
                controlExport();
                break;
            default:
                controlList();
                break;
        }
    }
}
