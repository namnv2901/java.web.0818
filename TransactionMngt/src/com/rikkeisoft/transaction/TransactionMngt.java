package com.rikkeisoft.transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransactionMngt {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);

	public void showMenu() {
		System.out.println("========================================================================");
		System.out.println("|                    Transaction Management System                     |");
		System.out.println("========================================================================");
		System.out.println("| 1. Perform a gold transaction                                        |");
		System.out.println("| 2. Perform a currency transaction                                    |");
		System.out.println("| 3. Display list all transactions                                     |");
		System.out.println("| 4. Caculate total quantities each transactions                       |");
		System.out.println("| 5. Caculate average amount of the currency transactions              |");
		System.out.println("| 6. Display all transactions having exchange rate greater 1 billion   |");
		System.out.println("| 7. Exit                                                              |");
		System.out.println("========================================================================");
		System.out.print("Enter your choice: ");
	}

	public GoldTransaction inputGoldTransaction() {

		System.out.print("Input a gold transaction's code: ");
		String code = sc.nextLine();
		System.out.print("Input date of Transaction (dd/MM/yyyy): ");
		String dateOfTrans = sc.nextLine();
		System.out.print("Input a Gold's unit price : ");
		double unitPrice = Double.parseDouble(sc.nextLine());
		System.out.print("Input quantites: ");
		int quantities = Integer.parseInt(sc.nextLine());
		System.out.print("Input a type of gold: ");
		String type = sc.nextLine();

		GoldTransaction gold = new GoldTransaction();
		gold.setCode(code);
		try {
			Date date = simpleDateFormat.parse(dateOfTrans);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			gold.setDateOfTrans(sdf.format(date));
		} catch (ParseException e) {
			System.out.println("Parse Exception");
		}

		gold.setUnitPrice(unitPrice);
		gold.setQuantities(quantities);
		gold.setType(type);
		gold.setAmount(gold.getQuantities() * gold.getUnitPrice());
		return gold;

	}

	public CurrencyTransaction inputCurrencyTransaction() {
		System.out.print("Input a currency transaction's code: ");
		String code = sc.nextLine();
		System.out.print("Input date of Transaction (dd/MM/yyyy): ");
		String dateOfTrans = sc.nextLine();
		System.out.print("Input a currency's unit price : ");
		double unitPrice = Double.parseDouble(sc.nextLine());
		System.out.print("Input quantities: ");
		int quantities = Integer.parseInt(sc.nextLine());
		System.out.print("Input a exchange rate: ");
		double exchangeRate = Double.parseDouble(sc.nextLine());
		System.out.print("Input type of currency (vnd, usd, euro): ");
		String type = sc.nextLine();

		CurrencyTransaction currency = new CurrencyTransaction();
		currency.setCode(code);

		try {
			Date date = simpleDateFormat.parse(dateOfTrans);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			currency.setDateOfTrans(sdf.format(date));
		} catch (ParseException e) {
			System.out.println("Parse Exception");
		}
		currency.setUnitPrice(unitPrice);
		currency.setQuantities(quantities);
		currency.setExchangeRate(exchangeRate);
		currency.setType(type);
		return currency;

	}

	public void calAmount(List<CurrencyTransaction> cuList) {
		for (CurrencyTransaction currency : cuList) {
			if ((currency.getType().equals("usd")) || (currency.getType().equals("euro"))) {
				currency.setAmount(currency.getQuantities() * currency.getUnitPrice() * currency.getExchangeRate());
			} else if (currency.getType().equals("vnd")) {
				currency.setAmount(currency.getQuantities() * currency.getUnitPrice());
			} else {
				System.out.println("Invalid type of the currency!");
			}
		}

	}

	public void displayGoldTrans(List<GoldTransaction> goldTrans) {
		for (GoldTransaction gold : goldTrans) {
			System.out.printf("\n%-10s %-20s %-15.2f %-15d %-15s %-15.2f\n", gold.getCode(), gold.getDateOfTrans(),
					gold.getUnitPrice(), gold.getQuantities(), gold.getType(), gold.getAmount());
		}
	}

	public void displayCurrencyTrans(List<CurrencyTransaction> currencyTrans) {
		for (CurrencyTransaction currency : currencyTrans) {
			System.out.printf("\n%-10s %-20s %-15.2f %-15d %-15.2f %-15s %-20.2f\n", currency.getCode(),
					currency.getDateOfTrans(), currency.getUnitPrice(), currency.getQuantities(),
					currency.getExchangeRate(), currency.getType(), currency.getAmount());
		}
	}

	public void run() {

		showMenu();
		List<GoldTransaction> goldTrans = new ArrayList<>();
		List<CurrencyTransaction> currencyTrans = new ArrayList<>();
		int choice = 0;
		do {
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {

			case 1: {
				goldTrans.add(inputGoldTransaction());
				showMenu();
				break;
			}
			case 2: {
				currencyTrans.add(inputCurrencyTransaction());
				showMenu();
				break;
			}
			case 3: {
				System.out.println("\t-------All gold transactions-----------");
				System.out.printf("\n%-10s %-20s %-15s %-15s %-15s %-15s", "Code", "Date of transaction", "Unit Price",
						"Quantities", "Type", "Amount");
				displayGoldTrans(goldTrans);

				System.out.println("\n\t-------All currency transactions-----------");
				System.out.printf("\n%-10s %-20s %-15s %-15s %-15s %-15s %-20s", "Code", "Date of transaction",
						"Unit Price", "Quantities", "Exchange Rate", "Type", "Amount");
				calAmount(currencyTrans);
				displayCurrencyTrans(currencyTrans);
				showMenu();
				break;
			}
			case 4: {
				int goldQuantities = 0;
				for (GoldTransaction gold : goldTrans) {
					goldQuantities += gold.getQuantities();
				}
				System.out.println("Total gold quantities: " + goldQuantities);
				int currencyQuantities = 0;
				for (CurrencyTransaction currency : currencyTrans) {
					currencyQuantities += currency.getQuantities();
				}
				System.out.println("Total currency quantities: " + currencyQuantities);
				showMenu();
				break;
			}
			case 5: {
				calAmount(currencyTrans);
				double totalAmount = 0;
				for (CurrencyTransaction currency : currencyTrans) {
					totalAmount += currency.getAmount();

				}
				double average = totalAmount / currencyTrans.size();
				System.out.printf("\nThe average amount of the currency transactions: %f \n ", average);
				showMenu();
				break;

			}
			case 6: {
				System.out.println("All transactions having exchange rate greater 1 billion: ");
				System.out.printf("\n%-10s %-20s %-15s %-15s %-15s %-15s", "Code", "Date of transaction", "Unit Price",
						"Quantities", "Type", "Amount");
				for (GoldTransaction gold : goldTrans) {
					if (gold.getUnitPrice() > 1000000000) {
						System.out.printf("\n%-10s %-20s %-15.2f %-15d %-15s %-15.2f\n", gold.getCode(),
								gold.getDateOfTrans(), gold.getUnitPrice(), gold.getQuantities(), gold.getType(),
								gold.getAmount());
					}
				}
				System.out.printf("\n%-10s %-20s %-15s %-15s %-15s %-15s %-20s", "Code", "Date of transaction",
						"Unit Price", "Quantities", "Exchange Rate", "Type", "Amount");
				for (CurrencyTransaction currency : currencyTrans) {
					if (currency.getUnitPrice() > 1000000000) {
						System.out.printf("\n%-10s %-20s %-15.2f %-15d %-15.2f %-15s %-20.2f\n", currency.getCode(),
								currency.getDateOfTrans(), currency.getUnitPrice(), currency.getQuantities(),
								currency.getExchangeRate(), currency.getType(), currency.getAmount());
					}
				}
				showMenu();
				break;
			}
			case 7: {
				System.out.println("Goodbye!");
				break;
			}
			}

		} while (choice != 7);
	}

	public static void main(String[] args) {
		TransactionMngt transaction = new TransactionMngt();
		transaction.run();
	}

}
