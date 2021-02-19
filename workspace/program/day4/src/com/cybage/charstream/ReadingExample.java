package com.cybage.charstream;

import java.io.FileReader;

public class ReadingExample{
	public static void main(String[] args) throws Exception {
		FileReader reader = null;
		int data;
		
		//Programming logic
		reader = new FileReader("charStream.txt");
		
		while((data = reader.read()) != -1) {
			System.out.print((char)data);
		}
		
		reader.close();
	}
}
