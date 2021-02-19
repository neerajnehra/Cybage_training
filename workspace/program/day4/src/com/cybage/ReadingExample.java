package com.cybage;

import java.io.FileInputStream;

public class ReadingExample {
	public static void main(String[] args) throws Exception{
		//Declaration
		FileInputStream input = null;
		int data;
		
		//Programming Logic
		input = new FileInputStream("file.txt");
		
		while((data = input.read()) != -1) {	//Will read the file character by character.
			System.out.print((char)data);
		}
		input.close();
	}
}
