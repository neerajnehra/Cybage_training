package com.cybage;

import java.sql.SQLException;
import com.cybage.exception.EmployeeException;
import com.cybage.model.RegularEmployee;
import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

public class UI {
    public static void main(String[] args) throws SQLException,Exception{
        System.out.println("employee demo...");
        
        EmployeeService empService = new EmployeeServiceImpl();
        
//        try {
//            //add one regular employee
//            empService.add("reg101", "reg address", 12000, "REG");            
//        }catch(EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
                
//        try {
//            //add one retired employee
//            empService.add("Monica", "ret address", 10, "RET");            
//        }catch(EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
//        
//        try {
//            empService.displayAll();    
//        }catch (EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
//        
//        try {
//            empService.displayWithId(58527);    
//        }catch (EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
//        try {
//            empService.delete(30830);    
//        }catch (EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
        
        try {
        	RegularEmployee re = new RegularEmployee(71550, "Thaw", "address", 18000);
            empService.update(71550,re,"REG");    
        }catch (EmployeeException ee) {
            System.err.println(ee.getLocalizedMessage());
        }
    }
}



