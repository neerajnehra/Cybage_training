package com.cybage.spring_example;

public class Address {
	private int pin;
	private String location;
	
	
	public Address() {
		super();
		System.out.println("Default constructor called.");
	}


	public Address(int pin, String location) {
		super();
		this.pin = pin;
		this.location = location;
		System.out.println("Address object created.");
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Address [pin=" + pin + ", location=" + location + "]";
	}
	
	
}
