package com.rikkeisoft.electricity;

public class VietnameseCustomer extends Customer {
	private String customerType;
	private double level;
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
	
}
