package com.app.mypack;

import java.sql.*;
public class DbWithCallableStatementEx {

	public static void main(String[] args) {
	
		try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	CallableStatement cs=con.prepareCall("{call insertcse(?,?)}");
	cs.setInt(1, 123);
	cs.setString(2, "krishna");
			int i=cs.executeUpdate();
			if(i==1){
				System.out.println("inserted");
			}else{
				System.out.println("not inserted");
			}
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		

	}

}
