package com.cybage.spring_example;

public class Employee {
    private int id;
    private String name;
    private Address address;
    
    
    public Employee() {
		super();
		System.out.println("Default constructor called.");
	}
    
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("Employee object created.");
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void myInit() {
    	System.out.println("Bean getting initialized.");
    }
    public void myDestroy() {
    	System.out.println("Bean destroyed.");
    }
    
}