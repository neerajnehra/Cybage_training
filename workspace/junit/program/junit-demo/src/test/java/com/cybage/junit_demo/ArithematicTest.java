package com.cybage.junit_demo;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
@TestMethodOrder(MethodOrderer.MethodName.class)	//For ordering the test cases.
class ArithematicTest {
	
	//Use this to open jdbc connection or necessary things required before testing.
	@BeforeAll
	static void setup() {
		System.out.println("This will execute at the start of testing.");
	}
	
	@BeforeEach
	void afterEveryUnitTestCase() {
		System.out.println("It will execute before every unit.");
	}
	
	@AfterEach
	void beforeEveryUnitTestCase() {
		System.out.println("It will execute after every unit.");
	}
	
	Arithematic arithematic = new Arithematic();
	
	@Test		//@Test is used to signal that the annotated method is a test method. 
	void testAddition() {
		int actual = arithematic.addition(10, 20);
		int expected = 30;
		assertEquals(expected, actual);		//Testing for correct result.
		//assertNotEquals(10, arithematic.addition(5, 5));	//Testing for failure.
		assertEquals(0, arithematic.addition(0, 0));
		assertEquals(-2, arithematic.addition(-1, -1));
		//assertEquals(20, arithematic.addition(-10, 10));
	}
	
	@Test
	void testSubstraction() {
		int actual = arithematic.substraction(10, 20);
		int expected = -10;
		assertEquals(expected, actual);		//Testing for correct result.
		//assertNotEquals(10, arithematic.addition(5, 5));	//Testing for failure.
		assertEquals(0, arithematic.substraction(0, 0));
		assertEquals(0, arithematic.substraction(-1, -1));
		assertEquals(-20, arithematic.substraction(-10, 10));
	}
	
	//Testing array example
	@Test
	void testArray() {
		int expected[] = {1,2,3,4,5};
		int actual[] = {1,4,3,4,5};
		assertEquals(expected, actual);	//Pass
	}
	
	//Testing list.
	@Test
	void testCollection() {
		List<Integer> expected = Arrays.asList(1,2,3,4,5);
		List<Integer> actual = Arrays.asList(1,2,3,4,6);
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void failTest() {
		fail("It will fail without any cause.");
	}
	
	//Conditional test cases
	@Test
	@EnabledOnOs({OS.LINUX, OS.WINDOWS})
	void testOs() {
		System.out.println("Working on linux and windows.");	//No output on windows.
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void jre8() {
		System.out.println("Working on java 8");
	}
	
	//Use this to close jdbc connection.
	@AfterAll
	static void finish() {
		System.out.println("Testing completed.");
	}

}
