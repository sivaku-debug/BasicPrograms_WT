package com.app.sdb;

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

import com.app.model.REgisterBean;

/**
 * Servlet implementation class ServletDb
 */
@WebServlet("/ServletDb")
public class ServletDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDb() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		long mob=Long.parseLong(req.getParameter("mob"));
		
		REgisterBean rbean=new REgisterBean();
		
		
		rbean.setUname(name);
		rbean.setPwd(pwd);
		rbean.setMob(mob);
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vce","root","root");
			PreparedStatement ps=con.prepareStatement("insert into customer(uname,pwd,mob) values(?,?,?)");
			ps.setString(1,rbean.getUname() );
			ps.setString(2, rbean.getPwd());
			ps.setLong(3, rbean.getMob());
		int i=	ps.executeUpdate();
			if(i==1){
				res.sendRedirect("success.jsp");
			}else{
				res.sendRedirect("error.jsp");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
