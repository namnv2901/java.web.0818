
import java.util.ArrayList;
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
    static List<Urban> urban = new ArrayList();
    static List<Suburban> suburban = new ArrayList();

    public void mainMenu() {
        System.out.println("----- Rikkei Tour -----");
        System.out.println("1. List Tour");
        System.out.println("2. Total income");
        System.out.println("3. Exit");
    }

    public void listMenu() {
        System.out.println("----- List Tour -----");
        System.out.println("1. Import tour");
        System.out.println("2. Export Tour");
        System.out.println("3. Exit");
    }

    public void tourMenu() {
        System.out.println("1. Urban Tour");
        System.out.println("2. Suburban Tour");
        System.out.println("3. Exit");
    }

    public int checkChoice(String mess) {
        int choice;
        while (true) {
            try {
                System.out.print(mess);
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                } else {
                    System.out.println("Please just enter 1 or 2 or 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number (1/2/3)");
            } catch (NullPointerException e) {
                System.out.println("Please don't input space");
            }
        }
        return choice;
    }

    public List importUrban() {
        while (true) {
            System.out.print("Enter ID tour: ");
            String idTour = sc.nextLine();
            System.out.print("Fullname of driver: ");
            String name = sc.nextLine();
            System.out.print("Enter ID bus: ");
            String idBus = sc.nextLine();
            System.out.print("Enter number tour: ");
            String numTour = sc.nextLine();
            double distance = checkDouble("Enter distance (km): ");
            double income = checkDouble("Enter income: ");
            urban.add(new Urban(numTour, distance, idTour, name, idBus, income));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return urban;
    }

    public List importSuburban() {
        while (true) {
            System.out.print("Enter ID tour: ");
            String idTour = sc.nextLine();
            System.out.print("Fullname of driver: ");
            String name = sc.nextLine();
            System.out.print("Enter ID bus: ");
            String idBus = sc.nextLine();
            System.out.print("Enter place: ");
            String place = sc.nextLine();
            double day = checkDouble("Enter day: ");
            double income = checkDouble("Enter income: ");
            suburban.add(new Suburban(place, day, idTour, name, idBus, income));
            System.out.print("Do you want to continue (y/n): ");
            String c = sc.nextLine();
            if (!"y".equals(c)) {
                break;
            }
        }
        return suburban;
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

    public void exportUrban() {
        if (urban.isEmpty()) {
            System.out.println("No data");
        } else {
            urban.forEach((u) -> {
                System.out.println(u.toString());
            });
        }
    }

    public void exportSuburban() {
        if (suburban.isEmpty()) {
            System.out.println("No data");
        } else {
            suburban.forEach((sub) -> {
                System.out.println(sub.toString());
            });
        }
    }

    public double incomeUrban() {
        double income = 0;
        for (Urban u : urban) {
            income += u.getIncome();
        }
        return income;
    }

    public double incomeSuburban() {
        double income = 0;
        for (Suburban sub : suburban) {
            income += sub.getIncome();
        }
        return income;
    }

    public void control() {
        mainMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                controlList();
                break;
            case 2:
                controlIncome();
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

    public void controlIncome() {
        System.out.println("----- Income -----");
        tourMenu();
        int choice = checkChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                System.out.println(incomeUrban());
                controlIncome();
                break;
            case 2:
                System.out.println(incomeSuburban());
                controlIncome();
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
                importUrban();
                controlImport();
                break;
            case 2:
                importSuburban();
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
                exportUrban();
                controlExport();
                break;
            case 2:
                exportSuburban();
                controlExport();
                break;
            default:
                controlList();
                break;
        }
    }
}
