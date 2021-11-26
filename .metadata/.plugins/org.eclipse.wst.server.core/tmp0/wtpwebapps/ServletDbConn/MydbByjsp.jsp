<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String name=request.getParameter("uname");
String pwd=request.getParameter("pwd");
long mob=Long.parseLong(request.getParameter("mob"));

try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vce","root","root");
	PreparedStatement ps=con.prepareStatement("insert into customer(uname,pwd,mob) values(?,?,?)");
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


%>





</body>
</html>