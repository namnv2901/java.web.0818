package com.rikkeisoft.transaction;
public class Transaction {
	private String code;
	private String dateOfTrans;
	private double unitPrice;
	private int quantities;
	private double amount;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDateOfTrans() {
		return dateOfTrans;
	}
	public void setDateOfTrans(String dateOfTrans) {
		this.dateOfTrans = dateOfTrans;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantities() {
		return quantities;
	}
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
