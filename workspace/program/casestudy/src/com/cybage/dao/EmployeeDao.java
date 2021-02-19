package com.cybage.dao;

import com.cybage.exception.EmployeeException;
import com.cybage.model.Employee;

public interface EmployeeDao {
    public void add(Employee emp, String type) throws Exception;
    public void delete(int id) throws EmployeeException, Exception;
    public void update(int id, Employee emp, String type) throws EmployeeException, Exception;
    public void displayAllEmployee() throws Exception;
    public void displayWithId(int id) throws Exception;
}