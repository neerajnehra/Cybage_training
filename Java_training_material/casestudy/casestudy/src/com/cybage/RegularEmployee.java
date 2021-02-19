package com.cybage;

public class RegularEmployee extends Employee{
	//id, name, address will be inherited
	private int salary;

	public RegularEmployee() {
		super();
	}

	public RegularEmployee(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + "]";
	}

	@Override
	public int getCompensation() {
		return this.salary;
	}
	
}