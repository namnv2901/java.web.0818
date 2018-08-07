package com.rikkeisoft.transaction;

public class CurrencyTransaction extends Transaction{
	private double exchangeRate; 
	private String type;
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

