package com.app.cont;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ContextEx() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		String driver_name=context.getInitParameter("driver");
		
		
		Enumeration e=context.getInitParameterNames();
		String s="";
		while(e.hasMoreElements()){
			s=(String) e.nextElement();
			out.print("<br>name:"+s);
			out.print(" "+"values:"+context.getInitParameter(s)+"<br>");
		}
		
		
		context.setAttribute("college", "vce");
		
		
		
		String collegename=(String) context.getAttribute("college");
		
		out.print(collegename);
		
	}

	

}
