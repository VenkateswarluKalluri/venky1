package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class DbConn {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=(Statement) con.createStatement();  
		
		}catch(Exception e){ System.out.println(e);}  

	
}
}
