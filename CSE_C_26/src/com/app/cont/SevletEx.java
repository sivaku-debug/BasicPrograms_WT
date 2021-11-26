package com.app.cont;

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
 * Servlet implementation class SevletEx
 */
@WebServlet("/SevletEx")
public class SevletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletEx() {
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
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/cse_c";
		String db_user_name="root";
		String db_pwd="root";
		
String name=		request.getParameter("name");
	long phno=Long.parseLong(request.getParameter("phno"));
	try{
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection(url,db_user_name,db_pwd);
	
	PreparedStatement ps=con.prepareStatement("insert into student (name,phno) values(?,?)");
	ps.setString(1, name);
	ps.setLong(2, phno);
	
	int i=ps.executeUpdate();
	if(i==1){
		//out.print("inserted successfully");
		response.sendRedirect("login.jsp");
	}else{
		response.sendRedirect("register.jsp");
	}
	
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	
	out.print("<h1>"+name+"</h1>");
				
	}

}
