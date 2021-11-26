package com.app.vce.cse.db;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class DBConnectionEx {
public static void main(String[] args) {
	try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement stmt=con.createStatement();
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			String name=br.readLine();
			int i=stmt.executeUpdate("insert into student.stu values("+id+",'"+name+"')");
			if(i==1){
			System.out.println("inserted");
			}else{
			System.out.println("not inserted");
			}
			}
			catch(Exception e){
			e.printStackTrace();
			}

}
}
