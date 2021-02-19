package com.cybage;

 

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

 

public class JDBCExample {
    
    public void getResultInfo() throws Exception{
    
        String sql = "select * from customer";
        //1. get connection
        Connection con = DbUtil.getCon();
        
        //2. create prepared statement
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ResultSetMetaData metaData = rs.getMetaData();
        
        
        System.out.println("number of columns: "+ metaData.getColumnCount());
        rs.close();
        ps.close();
        con.close();		//It will close connection and submit to the connection pool.
    }
    public void getDbInfo() throws Exception{
        
        Connection con = DbUtil.getCon();
        
        DatabaseMetaData dbMetadata = con.getMetaData();
        System.out.println("username: "+ dbMetadata.getUserName());
        System.out.println("driver name : "+ dbMetadata.getDriverName());
        System.out.println("driver version: "+ dbMetadata.getDriverVersion());
        System.out.println(dbMetadata.getDriverMinorVersion());
        System.out.println(dbMetadata.getDriverMajorVersion());
    }
    
    public void txnMgmnt() throws Exception{
        Connection con = DbUtil.getCon();
        
        con.setAutoCommit(false);
        PreparedStatement ps = con.prepareStatement("insert into customer values (1234456, 'dm1234')");
        ps.executeUpdate();
        //con.rollback();
        con.commit();
    }
}