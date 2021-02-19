package com.cybage;

public class Current extends BankAccount{
	double balance, rateOfInterest = 0.0;
	
	public Current(String name, String bankName, double balance) {
		super(name, bankName);
		this.balance = balance;
	}

	double showYearlyDeduction() {
		return balance * rateOfInterest;
	}

}
