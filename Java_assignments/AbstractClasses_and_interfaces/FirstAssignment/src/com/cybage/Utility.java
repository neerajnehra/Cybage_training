package com.cybage;

public class Utility implements Printable{
	public void printAll(Printable p[]) {
		for(Printable printer: p) {
			printer.print(printer);
		}
	}
	
	public void print(Printable p) {
		System.out.println(p);
	}
}
