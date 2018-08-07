package com.rikkeisoft.electricity;

public class Customer {
	private String code;
	private String name;
	private String date;
	private double electricityConsumption;
	private double unitPrice;
	private double amount;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getElectricityConsumption() {
		return electricityConsumption;
	}
	public void setElectricityConsumtion(double electricityConsumption) {
		this.electricityConsumption = electricityConsumption;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
