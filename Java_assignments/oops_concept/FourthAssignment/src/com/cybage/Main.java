package com.cybage;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		
		//Use of Function functional interface using anonymous class.
		Function<Integer, Integer> square = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				System.out.println(t);
				return null;
			}
		};
		square.apply(10);
		
		
//	    BiFunction<Integer, Integer, Integer> addition = new BiFunction<Integer, Integer, Integer>() {
//	    	@Override
//	    	public Integer apply(Integer t, Integer u) {
//	    		System.out.println("Addtion: " + t+u);
//	    		return null;
//	    	}
//		}; 
//		addition.apply(5,7);
		
		//Use of Predicate functional interface using anonymous class.
	    //want to check age is greater than 18
	    Predicate<Integer> checkingAge = new Predicate<Integer>() {
	    	@Override
	    	public boolean test(Integer t) {
	    		return t>18;
	    	}
		};         
	    System.out.println(checkingAge.test(35));        
	    
	    //Use of Consumer functional interface using anonymous class.
	    //Printing a string.
	    Consumer<String> printer = new Consumer<String>() {
	    	@Override
	    	public void accept(String t) {
	    		System.out.println(t);
	    		
	    	}
		};
	    printer.accept("Use of Consumer");
	    
	    //Use of Supplier functional interface using anonymous class.
	    //generate random number
	    Supplier<Double> numGenerator = new Supplier<Double>() {
	    	@Override
	    	public Double get() {
	    		return Math.random();
	    	}
		};	
	    System.out.println(numGenerator.get());

	}
}