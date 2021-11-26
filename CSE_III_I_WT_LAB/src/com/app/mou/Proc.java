package com.app.mou;

import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{  
	/*mysql> delimiter &&
	mysql> use dbname &&
	Database changed
	mysql> create procedure insertemp2(in id int,in name varchar(20))
	    -> begin
	    -> insert into dbname.emp values(id,name);
	    -> end &&
	Query OK, 0 rows affected (0.56 sec)*/
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://192.168.43.56:3306/dbname","root","root");  
  
CallableStatement stmt=con.prepareCall("{call insert1(?,?)}");  
stmt.setInt(1,1032);  
stmt.setString(2,"sriraghuvaran");  
stmt.execute();  
  
System.out.println("success");  
}  
}  