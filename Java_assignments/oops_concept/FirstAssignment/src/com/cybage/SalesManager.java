package com.cybage;

public class SalesManager extends Employee {
	int com;

	public SalesManager(String name, int salary, int com) {
		super(name, salary);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "SalesManager [compensation=" + com + "]";
	}
	
	public int calculateSalary() {
		return salary + com;
	}
}
