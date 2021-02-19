package com.cybage;

public class Manager extends Employee{
	int allowance;

	public Manager(String name, int salary, int allowance) {
		super(name, salary);
		this.allowance = allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "Manager [allowance=" + allowance + "]";
	}
	
	public int calculateSalary() {
		return salary + allowance;
	}
	
}