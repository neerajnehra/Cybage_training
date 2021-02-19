package com.cybage;

public class UI {
	public static void main(String[] args) {
		System.out.println("employee demo...");
		
		EmployeeService empService = new EmployeeServieImpl();
		
		try {
			//add one regular employee
			empService.add("reg101", null, 123, "REG");			
		}catch(EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		try {
			//add one retired employee
			empService.add("ret102", null, 789, "RET");			
		}catch(EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		try {
			empService.displayAll();	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		System.out.println("-------------------------------------");
		empService.displayComp();
	}
}