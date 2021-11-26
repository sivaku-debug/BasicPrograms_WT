package com.app.pkg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.RegisterBean;

/**
 * Servlet implementation class DBServlet
 */

public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
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
		
		
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		long mob=Long.parseLong(request.getParameter("ph"));
		
		RegisterBean bean=new RegisterBean();
		bean.setName(name);
		bean.setPwd(pwd);
		bean.setMob(mob);
		
		
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nion","root","root");
			
	PreparedStatement ps=con.prepareStatement("insert into cus(name,pwd,mob) values(?,?,?)");
	ps.setString(1, bean.getName());
	ps.setString(2, bean.getPwd());
	ps.setLong(3, bean.getMob());
	int i=ps.executeUpdate();
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
