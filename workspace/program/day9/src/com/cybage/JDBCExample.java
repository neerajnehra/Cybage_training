package com.cybage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
		
	//Function to fetch a record.
    public void getRecord() throws Exception{
        ///1. need to load necessary class
        Class.forName("com.mysql.jdbc.Driver");    //class will be provided by vendor (mysql)
        
        //2. connect to actual database using mysql class(mysql driver)
        Connection con 
        = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybage", "root", "cybage@123");
        
        //3. now we can talk to database through con connection
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery("select * from customer");
        
        while(result.next()) {
            System.out.println(result.getInt(1) + "   "+ result.getString(2));
        }
        
        result.close();
        statement.close();
        con.close();
    }
    
  //Function to add a record.
    public void addRecord() throws Exception{
        ///1. need to load necessary class
        Class.forName("com.mysql.jdbc.Driver");    //class will be provided by vendor (mysql)

 

        //2. connect to actual database using mysql class(mysql driver)
        Connection con 
        = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybage", "root", "cybage@123");

 

        //3. now we can talk to database through con connection
        PreparedStatement ps = con.prepareStatement("insert into customer values (? , ?)");
        ps.setInt(1, 347);
        ps.setString(2, "dmjadhav2");
        
        if(!ps.execute()) {
            System.out.println("Record added successfully...");
        }else {
            System.out.println("Could not add record in database...");
        }
        ps.close();
        con.close();        
    }
}