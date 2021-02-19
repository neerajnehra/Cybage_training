package com.cybage;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("Employee", 13890);
		Manager m = new Manager("Manager", 15000, 12000);
		SalesManager sm = new SalesManager("Sales Manager", 12000 , 5000);
		System.out.println("Employee salary: " + e.calculateSalary());
		System.out.println("Manager salary: " + m.calculateSalary());
		System.out.println("Sales Manager salary: " + sm.calculateSalary());
	}
}