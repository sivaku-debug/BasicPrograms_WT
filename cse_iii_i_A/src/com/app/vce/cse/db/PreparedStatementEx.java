package com.app.vce.cse.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx {

	public static void main(String[] args) {
		
		try{
			
			Class.class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			PreparedStatement ps=con.prepareStatement("update emp set name='kalyan' where id=?");
			
ps.setInt(1, 101);

			int i=	ps.executeUpdate();
			if(i==1){
				System.out.println("updated");
			}else{
				System.out.println("not updated");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
