package com.cybage.service;

import java.sql.SQLException;
import com.cybage.dao.EmployeeDao;
import com.cybage.dao.EmployeeDaoImpl;
import com.cybage.exception.EmployeeException;
import com.cybage.model.Employee;
import com.cybage.model.RegularEmployee;
import com.cybage.model.RetiredEmployee;

public class EmployeeServiceImpl implements EmployeeService{
    
    EmployeeDao empDao = new EmployeeDaoImpl();
    
    private int generateId() {
        return (int) (Math.round(Math.random()*100000));
    }
 
    //Method to Add the employees.
    @Override
    public void add(String name, String address, int comp, String type) throws EmployeeException,SQLException,Exception{
        if(name == null) 
            throw new EmployeeException("Cannot add employee as name is blank");
        if(address == null)
            throw new EmployeeException("Cannot add employee as address is blank");   
        if(comp <= 0) 
            throw new EmployeeException("Cannot add employee as comp is less than 0");
        
        if(type.equals("REG")) 
            empDao.add(new RegularEmployee(generateId() , name, address, comp),type);
        else if(type.equals("RET"))
            empDao.add(new RetiredEmployee( generateId(),  name, address, comp),type);
        else 
            System.out.println("not able to add employee as type is invalid");
        
    }

 
    //Method to display all employees.
    @Override
    public void displayAll() throws EmployeeException, Exception{
        empDao.displayAllEmployee();
    }

 
    //Method to display employee with id.
    @Override
    public void displayWithId(int id) throws EmployeeException, Exception{
        empDao.displayWithId(id);
    }

 

    @Override
    public void delete(int id) throws EmployeeException, SQLException, Exception{
    	empDao.delete(id);
    }

 

    @Override
    public void update(int id, Employee emp, String type) throws EmployeeException, SQLException, Exception{
    	empDao.update(id, emp, type);

    }
}