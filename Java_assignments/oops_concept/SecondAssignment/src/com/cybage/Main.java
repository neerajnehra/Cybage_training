package com.cybage;

public class Main {
	public static void main(String[] args) {
		Saving s = new Saving("Neeraj", "HDFC", 50000);
		Current c = new Current("Neeraj", "HDFC", 15000);
		System.out.println("Yearly deduction from savings account: " + s.showYearlyDeduction());
		System.out.println("Yearly deduction from current account: " + c.showYearlyDeduction());
	}
}