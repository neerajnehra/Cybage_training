package com.cybage;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private int pin;
	public Address() {
		super();
	}
	public Address(int pin, String city) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}	
}