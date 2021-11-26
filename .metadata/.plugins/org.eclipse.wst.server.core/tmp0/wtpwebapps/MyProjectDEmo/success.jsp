<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>inserted successfully</h1>
<table border="1" cellpadding="1" cellspacing="1">
<tr><th>name</th><th>pwd</th><th>mob</tr>
<%!

String name=null;
String pwd=null;
long mob=0;
%>

<% 

try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sri","root","root");
	PreparedStatement ps=con.prepareStatement("select * from customer");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()){
		name=rs.getString(1);
		pwd=rs.getString(2);
		mob=rs.getLong(3);
		
		%>
		
		<tr><td><%=name %></td><td><%=pwd %></td><td><%=mob %></td></tr>
		
		
		
		
<% 		
		
	}
	
	
	
	
	
	
}catch(Exception e){
	e.printStackTrace();
}




%>






</body>
</html>