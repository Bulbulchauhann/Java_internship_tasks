<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
   if(session.getAttribute("user") == null){
	response.sendRedirect("login.jsp");
	}
	%> --%>
	
<%--  <%
   if(session.getAttribute("user") != "nashit"){
	response.sendRedirect("login.jsp");
	}
	%> 
} --%>
<h1>
Welcome to our Application, 
<span style="color:red">
${user}
</span>
</h1>


<form action = "logoutservlet">
<input type = "submit" value="logout"/>
</form>

</body>
</html>