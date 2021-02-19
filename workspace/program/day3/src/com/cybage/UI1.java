package com.cybage;

import java.util.Scanner;

public class UI1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age = scanner.nextInt();
		
		try {
			if(age >18)
				System.out.println("You are eligible.");
			else
				throw new VotingException("Not eligible.");
		}catch(VotingException ve) {
			System.err.println(ve.getMessage());
		}finally {
			scanner.close();
		}
				
	}
}
