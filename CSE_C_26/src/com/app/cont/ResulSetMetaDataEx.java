package com.app.cont;

import java.sql.*;
public class ResulSetMetaDataEx
{
public static void main(String args[])
{
try
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse_c","root","root"); 
Statement st=con.createStatement(); 
ResultSet rs = st.executeQuery("select * from student");
ResultSetMetaData a = rs.getMetaData();
System.out.println("The column count is " + a.getColumnCount());
System.out.println("The table name is " + a.getTableName(1));
for(int i=1 ; i<=2 ;i++)
{
 System.out.println("Column "+i+ a.getColumnName(i));
 System.out.println("Column Type "+i+ a.getColumnTypeName(i));
}
con.close(); 
 
}
catch(Exception e)
{ 
 System.out.println(e);
} 
}
}
