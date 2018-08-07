package com.rikkeisoft.bus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusMngt {
	public void showMenu() {
		System.out.println("====================================================");
		System.out.println("|               Buses Management System            |");
		System.out.println("====================================================");
		System.out.println("| 1. Input a urban bus                             |");
		System.out.println("| 2. Input a suberban bus                          |");
		System.out.println("| 3. Display all buses                             |");
		System.out.println("| 4. Display total revenue of the buses            |");
		System.out.println("| 5. Exit                                          |");
		System.out.println("====================================================");
		System.out.print("Enter your choice: ");
	}

	public void run() {
		showMenu();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		List<UrbanBus> urbanBuses = new ArrayList<>();
		List<SuburbanBus> suburbanBuses = new ArrayList<>();
		do {
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				UrbanBus urbanBus = new UrbanBus();
				System.out.print("Input a urban bus code: ");
				String code = sc.nextLine();
				System.out.print("Input a urban bus driver's name: ");
				String driverName = sc.nextLine();
				System.out.print("Input a urban bus number: ");
				int busNumber = Integer.parseInt(sc.nextLine());
				System.out.print("Input number of turns: ");
				int turn = Integer.parseInt(sc.nextLine());
				System.out.print("Input kilometerage: ");
				double kilometerage = Double.parseDouble(sc.nextLine());
				System.out.print("Input a urban bus's revenue: ");
				double revenue = Double.parseDouble(sc.nextLine());

				urbanBus.setCode(code);
				urbanBus.setDriverName(driverName);
				urbanBus.setBusNumber(busNumber);
				urbanBus.setTurn(turn);
				urbanBus.setKilometerage(kilometerage);
				urbanBus.setRevenue(revenue);

				urbanBuses.add(urbanBus);
				showMenu();
				break;
			}
			case 2: {
				SuburbanBus suburbanBus = new SuburbanBus();
				System.out.print("Input a suburban bus code: ");
				String code = sc.nextLine();
				System.out.print("Input a suburban bus driver's name: ");
				String driverName = sc.nextLine();
				System.out.print("Input a suburban bus number: ");
				int busNumber = Integer.parseInt(sc.nextLine());
				System.out.print("Input a suburban bus's destination: ");
				String destination = sc.nextLine();
				System.out.print("Input number of days: ");
				int day = Integer.parseInt(sc.nextLine());
				System.out.print("Input a suburban bus's revenue: ");
				double revenue = Double.parseDouble(sc.nextLine());

				suburbanBus.setCode(code);
				suburbanBus.setDriverName(driverName);
				suburbanBus.setBusNumber(busNumber);
				suburbanBus.setDestination(destination);
				suburbanBus.setDay(day);
				suburbanBus.setRevenue(revenue);

				suburbanBuses.add(suburbanBus);
				showMenu();
				break;
			}
			case 3: {
				System.out.println("\t------All urban buses------");
				System.out.printf("\n%-10s %-20s %-15s %-15s %-20s %-20s", "Code", "Driver's Name", "Bus Number",
						"Turn", "Kilometerage", "Revenue");
				for (UrbanBus urban : urbanBuses) {
					System.out.printf("\n%-10s %-20s %-15d %-15d %-20f %-20f\n", urban.getCode(), urban.getDriverName(),
							urban.getBusNumber(), urban.getTurn(), urban.getKilometerage(), urban.getRevenue());
				}
				System.out.println("\t------All suburban buses------");
				System.out.printf("\n%-10s %-20s %-15s %-15s %-20s %-20s", "Code", "Driver's Name", "Bus Number",
						"Destination", "Day", "Revenue");
				for (SuburbanBus suburban : suburbanBuses) {
					System.out.printf("\n%-10s %-20s %-15d %-15s %-20d %-20f\n", suburban.getCode(),
							suburban.getDriverName(), suburban.getBusNumber(), suburban.getDestination(),
							suburban.getDay(), suburban.getRevenue());

				}
				showMenu();
				break;
			}
			case 4: {

				double urbanBusRevenue = 0;
				for (UrbanBus urban : urbanBuses) {
					urbanBusRevenue += urban.getRevenue();
				}
				System.out.println("The total revenue of the urban buses: " + urbanBusRevenue);

				double suburbanBusRevenue = 0;
				for (SuburbanBus suburban : suburbanBuses) {
					suburbanBusRevenue += suburban.getRevenue();
				}
				System.out.println("The total revenue of the suburban buses: " + suburbanBusRevenue);
				showMenu();
				break;
			}
			case 5: {
				System.out.println("Good bye!");
				break;
			}
			}
		} while (choice != 5);
		sc.close();
	}

	public static void main(String[] args) {
		BusMngt bus = new BusMngt();
		bus.run();
	}

}
