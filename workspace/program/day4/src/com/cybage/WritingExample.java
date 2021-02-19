package com.cybage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExample {
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to Java Day4.");
		
		//All variables should be in the beginning.
		FileOutputStream output = null;
		String data = "Data to be stored";
		
		//Programming logic goes from here.
		try {
			output = new FileOutputStream("file.txt");
			output.write(data.getBytes());
		}catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			output.close();
		}
	}
}
