package com.cybage;

public interface EmployeeService {
	public abstract void add(String name, String address, int comp, String type) throws EmployeeException;
	public abstract void displayAll() throws EmployeeException;
	public abstract void displayComp();
	public abstract void delete(int id);
	public abstract void update(int id, Employee emp);
	//update
	//delete
	//CRUD --> create , read, update, delete
}
