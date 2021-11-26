package com.app.pkg;

import java.sql.*;

public class DBconnection {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");
		
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		
		
		while(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			System.out.println(id+" "+name);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			con.close();
		}
		
		
	}

}
