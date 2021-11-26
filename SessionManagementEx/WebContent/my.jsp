<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- request.getSession() will return a current session. if current session does not exist, then it will create a new one.

request.getSession(true) will return current session. If current session does not exist, then it will create a new session.

So basically there is not difference between both method.

request.getSession(false) will return current session if current session exists. If not, it will not create a new session.


Method with boolean argument :
----------------------------------

  request.getSession(true);
returns new session, if the session is not associated with the request
 
 request.getSession();
returns new session, if the session is not associated with the request and returns the existing session, if the session is associated with the request.It won't return null.

  request.getSession(false);
returns null, if the session is not associated with the request.



 




 -->
<%
String name=request.getParameter("name");
/* String name=(String)session.getAttribute("s"); */


%>

<%=name %>

</body>
</html>