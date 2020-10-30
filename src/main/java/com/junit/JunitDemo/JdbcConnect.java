package com.junit.JunitDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnect {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static boolean connect(){
		//static connection = null ;
			try
		    {
		    	Class.forName("com.mysql.jdbc.Driver");
		    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apisero","root","");
		    	
		    	return true;
		    
		    }
		    catch(Exception e) {e.printStackTrace();}
			
			return false ;
		}
	public static int getId(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apisero","root","");
	    	PreparedStatement ps = con.prepareStatement("Select * from Employee where id = ? ");
	    	ps.setInt(1,1);
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next()){
	    		int i = rs.getInt(1);
	    		System.out.println(i);
	    		return i;
	    	}
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

	}


