package com.app.mou;

import java.sql.*;
public class DBConnectionEx {
public static void main(String[] args) {
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");
	PreparedStatement ps=con.prepareStatement("select * from emp");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
		System.out.println(rs.getInt("id")+" "+rs.getString("name"));
	}
	con.close();
	}catch(Exception e){
	e.printStackTrace();
}

	}

}
