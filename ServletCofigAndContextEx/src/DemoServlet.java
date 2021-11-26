

import java.io.*;  
import java.util.Enumeration;

import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class DemoServlet extends HttpServlet {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    ServletConfig config=getServletConfig();  
  
    String driver=config.getInitParameter("driver");  
    out.print("Driver is: "+driver);  
    
    Enumeration<String> e=config.getInitParameterNames();
    String s="";
    while(e.hasMoreElements()){
    	s=e.nextElement();
    	out.print("<br>Name:"+s);
    	out.print("&nbsp;&nbsp;&nbsp;&nbsp;value       :"+config.getInitParameter(s));
    	
    }
    
    out.close();  
    }  
  
}  