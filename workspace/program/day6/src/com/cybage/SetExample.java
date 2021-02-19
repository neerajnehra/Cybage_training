package com.cybage;

//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

 

public class SetExample {
    public static void main(String[] args) {
        System.out.println("set example...");
        //Set<String> skills = new HashSet<>();		//no sequence for storing an element, it uses hash function(Efficient)
        //Set<String> skills = new LinkedHashSet<>();		//LinkedHashSet can be used to store in sequence
        Set<String> skills = new TreeSet<>();									//Sorting in Ascending order
        //Set<String> skills = new TreeSet<>(Collections.reverseOrder());		//Sorting in Descending order
        //java, angular, java
        skills.add("java");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        
        System.out.println(skills);
        //We can remove an element using iterator method, thats an advantage of using iterator over for loop..
        //use .remove() to remove an element
        

        
    }
}