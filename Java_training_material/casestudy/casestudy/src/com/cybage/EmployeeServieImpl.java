package com.cybage;

public class EmployeeServieImpl implements EmployeeService{

	private Employee emp[] = new Employee[10];
	private static int count = 0;
	///instance initializer block , it executes before constructor
//	{
//		emp[count] = new RegularEmployee("regular", "pune101", 123);
//		count ++;
//		emp[count] = new RetiredEmployee("retired", "pune102", 12345);
//		count ++;
//	}

	@Override
	public void add(String name, String address, int comp, String type) throws EmployeeException{

		if(name == null) {
			throw new EmployeeException("Cannot add employee as name is blank");
		}
		if(address == null){
			throw new EmployeeException("Cannot add employee as address is blank");
		}	
		if(comp <= 0) {
			throw new EmployeeException("Cannot add employee as comp is less than 0");
		}
		if(type.equals("REG")) {
			emp[count] = new RegularEmployee(name, address, comp);
			count ++;
		}else if(type.equals("RET")){
			emp[count] = new RetiredEmployee(name, address, comp);
			count ++;	
		}else {
			System.out.println("not able to add employee as type is invalid");
		}
	}

	@Override
	public void displayAll() throws EmployeeException{
		if(count <= 0) {
			throw new EmployeeException("there are no records in database");
		}
		for(Employee e : emp) {
			if(e == null) break;
			System.out.println(e);
		}
	}

	@Override
	public void displayComp() {
		
		for(Employee e : emp) {
			if(e == null) break;
			System.out.println("Id: " + e.getId() +" comp: " + e.getCompensation());
		}
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public void update(int id, Employee emp) {

	}
}