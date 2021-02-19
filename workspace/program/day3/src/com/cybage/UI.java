package com.cybage;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		System.out.println("Welcome to Java Day3");
		//System.in --> standard input, keyboard
		//System.out --> standard output, monitor
		//System.err --> standard output, monitor
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		try {													//Runtime problem may occur
			int div = n1/n2;
			System.out.println("Division is:"+ div);
		}catch(ArithmeticException ae){							//Corrective Action
			System.err.println("Not able to divide number by 0");		//End Users
			System.err.println(ae.getMessage());				//Developers
			//ae.printStackTrace();
		}finally {
			System.out.println("This is useful for resource management");
			System.out.println("Finally Block.");
			scanner.close();
		}
		System.out.println("Program Completed.");
	}
}
