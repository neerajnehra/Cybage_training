package com.cybage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListExample {
	public static void main(String[] args) {
		List<String> devices = new LinkedList<>();
		
		devices.add("Hardware");
		devices.add("Software");
		devices.add("Input");
		devices.add("Output");
		devices.add("Input");
		devices.add(0,"Mobile");	//Adding at index 0
		
		//Printing the List
		
		//way 1: using sysout
		System.out.println("----1.Using sysout----");
		System.out.println(devices);
		
		//Way 2: Using For Each
		System.out.println("----2. Using For Each----");
		for(String d : devices) {
			System.out.println(d);
		}
		
		//Way3:using Iterator
		System.out.println("----3. Using iterator----");
		Iterator<String> deviceIterator = devices.iterator();
		while(deviceIterator.hasNext()) {
			System.out.println(deviceIterator.next());
		}
		//Removing from List.
		
		//Removing an element using index.
		devices.remove(1);	
		System.out.println("---After Removal---");
		System.out.println(devices);
		
		//Removing an element using object name.
		devices.remove("Input");	//Removes the first element that matches the value.
		System.out.println("---After Removal---");
		System.out.println(devices);
		
		
		//Searching In list.
		
		//Searching using index.
		System.out.println("Search using index: "+devices.get(2));
		
		//Searching using Object.
		System.out.println(); 		//returns T/F
	
		
		//Sorting a list.
		
		//Sorting-Ascending
		Collections.sort(devices);
		System.out.println("After Sorting: "+ devices);
		
		//Sorting-Descending
		Collections.sort(devices,Collections.reverseOrder());
		System.out.println("After Sorting: "+ devices);

		//For Updating list.
		devices.set(2, "Ios");
		System.out.println("After Updating: "+ devices);
	}
}
