package com.rikkeisoft.electricity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ElectricityBillMngt {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);

	public void showMenu() {
		System.out.println("========================================================================");
		System.out.println("|                    Electricity Bill Management System                |");
		System.out.println("========================================================================");
		System.out.println("| 1. Input a Vietnamese customer's electricity bill                    |");
		System.out.println("| 2. Input a foreign customer's electricity bill                       |");
		System.out.println("| 3. Display list all electricity bills                                |");
		System.out.println("| 4. Caculate total electricity consumption for each customer type     |");
		System.out.println("| 5. Caculate average amount of the foreign customers                  |");
		System.out.println("| 6. Exit                                                              |");
		System.out.println("========================================================================");
		System.out.print("Enter your choice: ");
	}

	public VietnameseCustomer inputVietnameseCustomer() {
		System.out.print("Input a vietnamese customer code: ");
		String code = sc.nextLine();
		System.out.print("Input a customer name: ");
		String name = sc.nextLine();
		System.out.print("Input a date the bill is exported (dd/MM/yyyy): ");
		String date = sc.nextLine();
		System.out.print("Input a type of the customer: ");
		String customerType = sc.nextLine();
		System.out.print("Input electricity comsumption(kW): ");
		double electricityConsumption = Double.parseDouble(sc.nextLine());
		System.out.print("Input a unit price: ");
		double unitPrice = Double.parseDouble(sc.nextLine());
		System.out.print("Input a consumption limit for the customer: ");
		double level = Double.parseDouble(sc.nextLine());

		VietnameseCustomer vn = new VietnameseCustomer();
		vn.setCode(code);
		vn.setName(name);
		try {
			Date d = simpleDateFormat.parse(date);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			vn.setDate(sdf.format(d));

		} catch (ParseException e) {
			System.err.println(e);
		}
		vn.setCustomerType(customerType);
		vn.setElectricityConsumtion(electricityConsumption);
		vn.setUnitPrice(unitPrice);
		vn.setLevel(level);
		return vn;

	}

	public ForeignCustomer inputForeignCustomer() {
		System.out.print("Input a foreign customer code: ");
		String code = sc.nextLine();
		System.out.print("Input a customer name : ");
		String name = sc.nextLine();
		System.out.print("Input a date the bill is exported (dd/MM/yyyy): ");
		String date = sc.nextLine();
		System.out.print("Input a customer's nationality: ");
		String nationality = sc.nextLine();
		System.out.print("Input electricity comsumption(kW): ");
		double electricityConsumption = Double.parseDouble(sc.nextLine());
		System.out.print("Input a unit price: ");
		double unitPrice = Double.parseDouble(sc.nextLine());

		ForeignCustomer foreign = new ForeignCustomer();
		foreign.setCode(code);
		foreign.setName(name);
		try {
			Date d = simpleDateFormat.parse(date);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			foreign.setDate(sdf.format(d));
		} catch (ParseException e) {
			System.err.println(e);
		}
		foreign.setNationality(nationality);
		foreign.setElectricityConsumtion(electricityConsumption);
		foreign.setUnitPrice(unitPrice);
		foreign.setAmount(foreign.getElectricityConsumption() * foreign.getUnitPrice());
		return foreign;
	}

	public void calAmount(List<VietnameseCustomer> customers) {
		for (VietnameseCustomer customer : customers) {
			if (customer.getElectricityConsumption() <= customer.getLevel()) {
				customer.setAmount(customer.getElectricityConsumption() * customer.getUnitPrice());
			} else {
				customer.setAmount(customer.getElectricityConsumption() * customer.getUnitPrice() * customer.getLevel()
						+ ((customer.getElectricityConsumption() - customer.getLevel()) * customer.getUnitPrice()
								* 2.5));
			}
		}
	}

	public void displayVietnameseCustomer(List<VietnameseCustomer> vnCustomers) {
		for (VietnameseCustomer vn : vnCustomers) {
			System.out.printf("\n%-10s %-20s %-15s %-25s %-30.2f %-20.2f %-20.2f %-20.2f\n", vn.getCode(), vn.getName(),
					vn.getDate(), vn.getCustomerType(), vn.getElectricityConsumption(), vn.getUnitPrice(),
					vn.getLevel(), vn.getAmount());
		}

	}

	public void displayForeignCustomer(List<ForeignCustomer> foreignCustomers) {
		for (ForeignCustomer foreign : foreignCustomers) {
			System.out.printf("\n%-10s %-20s %-15s %-25s %-30.2f %-20.2f %-20.2f\n", foreign.getCode(),
					foreign.getName(), foreign.getDate(), foreign.getNationality(), foreign.getElectricityConsumption(),
					foreign.getUnitPrice(), foreign.getAmount());
		}
	}

	public void displayForeignCustomer() {

	}

	public void run() {
		showMenu();
		int choice = 0;
		List<VietnameseCustomer> vnCustomers = new ArrayList<>();
		List<ForeignCustomer> foreignCustomers = new ArrayList<>();
		do {
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				vnCustomers.add(inputVietnameseCustomer());
				showMenu();
				break;
			}
			case 2: {
				foreignCustomers.add(inputForeignCustomer());
				showMenu();
				break;
			}
			case 3: {
				System.out.println("\t----------All electricity Bills for Vietnamese customers -----------");
				calAmount(vnCustomers);
				System.out.printf("\n%-10s %-20s %-15s %-25s %-30s %-20s %-20s %-20s\n", "Code", "Name", "Date",
						"Customer Type", "Electricity Consumption", "Unit Price", "Consumption Limit", "Amount");
				displayVietnameseCustomer(vnCustomers);

				System.out.println("\n\t----------All electricity Bills for foreign customers -----------");
				System.out.printf("\n%-10s %-20s %-15s %-25s %-30s %-20s %-20s\n", "Code", "Name", "Date",
						"Nationality", "Electricity Consumption", "Unit Price", "Amount");
				displayForeignCustomer(foreignCustomers);
				showMenu();
				break;
			}
			case 4: {
				double vnElecConsumption = 0;
				for (VietnameseCustomer vn : vnCustomers) {
					vnElecConsumption += vn.getElectricityConsumption();
				}
				System.out.println("Total electricity comsumption for Vietnamese customers: " + vnElecConsumption);

				double foreignElecConsumption = 0;
				for (ForeignCustomer foreign : foreignCustomers) {
					foreignElecConsumption += foreign.getElectricityConsumption();
				}
				System.out.println("Total electricity comsumption for foreign customers: " + foreignElecConsumption);
				showMenu();
				break;
			}
			case 5: {
				double totalAmount = 0;
				for (ForeignCustomer foreign : foreignCustomers) {
					totalAmount += foreign.getAmount();
				}
				double averageAmount = totalAmount / foreignCustomers.size();
				System.out.printf("\nThe everage amount of the foreign customers: %f \n", averageAmount);
				showMenu();
				break;
			}
			case 6: {
				System.out.println("Good bye!");
				break;
			}
			}
		} while (choice != 6);
	}

	public static void main(String[] args) {
		ElectricityBillMngt electricityBillMngt = new ElectricityBillMngt();
		electricityBillMngt.run();

	}
}
