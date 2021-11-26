package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		long mob=Long.parseLong(request.getParameter("mob"));
		/*out.print(name+" "+pwd);*/
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sri","root","root");
			PreparedStatement ps=con.prepareStatement("insert into customer(name,pwd,mob) values(?,?,?)");
			
			ps.setString(1,name );
			ps.setString(2, pwd);
			ps.setLong(3, mob);
			
		int i=	ps.executeUpdate();
			if(i==1){
				response.sendRedirect("success.jsp");
			}else{
				response.sendRedirect("error.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
