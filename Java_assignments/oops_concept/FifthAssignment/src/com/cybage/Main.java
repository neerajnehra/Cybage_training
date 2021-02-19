package com.cybage;

import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) {
		//Lambda expression for addition 
        BiFunction <Integer, Integer, Integer> addition = (i1, i2) -> i1 + i2;
 
        //Lambda expression for subtract
        BiFunction <Integer, Integer, Integer> substraction = (i1, i2) -> i1 - i2;
 
        //Lambda expression for multiply
        BiFunction <Integer, Integer, Integer> multiplication = (i1, i2) -> i1 * i2;
 
        //Lambda expression for division
        BiFunction <Integer, Integer, Integer> division = (i1, i2) -> i1 / i2;
 
        //Lambda expression for division
        BiFunction <Integer, Integer, Integer> modulus = (i1, i2) -> i1 % i2;
 
        System.out.println("Addition: " + addition.apply(10, 5));
        System.out.println("Subtract: " + substraction.apply(10, 5));
        System.out.println("Multiply: " + multiplication.apply(10, 5)); 
        System.out.println("Division: " + division.apply(10, 5));
        System.out.println("Modulo: " + modulus.apply(10, 5));
	}
}
