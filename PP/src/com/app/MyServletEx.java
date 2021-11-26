package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServletEx")
public class MyServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServletEx() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*PrintWriter out=response.getWriter();
		out.print("helo");
		*/
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.print("helo"+" ");
		
	String name=	request.getParameter("name");
	String pwd=request.getParameter("pwd");
	out.print(name+" "+pwd);
	
	
	
	
		
	}

}
