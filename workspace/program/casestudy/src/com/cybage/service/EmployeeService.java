package com.cybage.service;

import com.cybage.exception.EmployeeException;
import com.cybage.model.Employee;


public interface EmployeeService {
    public abstract void add(String name, String address, int comp, String type) throws EmployeeException, Exception;
    public abstract void displayAll() throws EmployeeException, Exception;
    public abstract void displayWithId(int id) throws EmployeeException, Exception;
    public abstract void delete(int id) throws EmployeeException, Exception;
    public abstract void update(int id, Employee emp, String type) throws EmployeeException, Exception;
    //update
    //delete
    //CRUD --> create , read, update, delete
}