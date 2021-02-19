package com.cybage;

public class Saving extends BankAccount{
	double balance, rateOfInterest = 0.035;

	public Saving(String name, String bankName, double balance) {
		super(name, bankName);
		this.balance = balance;
	}

	double showYearlyDeduction() {
		return balance * rateOfInterest;
	}
}
