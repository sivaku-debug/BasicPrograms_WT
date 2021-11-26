<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>my profile data</h1>



<%!   
int cube(int n){  
return n*n*n;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  

<%
/* JSP Scripting elements
The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:

1)scriptlet tag: is used to execute java source code in JSP
2)expression tag:is written to the output stream of the response. So you need not write out.print() to write data. It is mainly used to print the values of variable or method.
3)declaration tag :is used to declare fields and methods.




*/

/* HttpSession session1=request.getSession(false); */
String name=(String)session.getAttribute("session_name");

%>
<%=name %>










</body>
</html>