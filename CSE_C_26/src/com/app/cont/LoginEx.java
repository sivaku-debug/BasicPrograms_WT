package com.app.cont;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginEx
 */
@WebServlet("/LoginEx")
public class LoginEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEx() {
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
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/cse_c";
		String db_user_name="root";
		String db_pwd="root";
		
		String uname=null;
		long		mobile_no=0;
		
		
String name=		request.getParameter("name");
	long phno=Long.parseLong(request.getParameter("phno"));
	
	
	
	
	
	
	try{
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection(url,db_user_name,db_pwd);
	
	PreparedStatement ps=con.prepareStatement("select name,phno from student where name=? and phno=?");
	ps.setString(1, name);
	ps.setLong(2, phno);
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
		 uname=rs.getString(1);
				mobile_no=rs.getLong(2);
	}
	if(name.equals(uname) && phno==mobile_no){
		HttpSession session=request.getSession();
		session.setAttribute("session_name", name);
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
	
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
