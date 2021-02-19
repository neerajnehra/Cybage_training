package com.cybage.charstream;

import java.io.FileWriter;


public class WritingExample {
	public static void main(String[] args) throws Exception{
		FileWriter writer = null;
		String data = "I love it when you call me Senorita";
		
		//Programming Logic
		writer = new FileWriter("charStream.txt");
		writer.write(data);
		
		writer.close();
	}
}
