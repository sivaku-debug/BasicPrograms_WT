package com.app.vc;

/*import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/



import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;


public class ConfEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ConfEx() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		ServletConfig config=getServletConfig();
		
	String s=	config.getInitParameter("username");
	out.print(s);
	
	
	Enumeration< String> e=config.getInitParameterNames();
	
	String k="";
	
	while(e.hasMoreElements()){
	k=	e.nextElement();
	
	out.println(k);
String pnames=	config.getInitParameter(k);
	
	out.print("pnames:"+pnames);
	
	}
	
	
	
	
		
		
		
		
		
		
	}


	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


}
