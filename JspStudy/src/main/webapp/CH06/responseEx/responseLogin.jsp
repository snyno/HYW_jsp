<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> responseLogin.jsp </h2>
	<%
		String id = request.getParameter("id");
		String password  = request.getParameter("password");
	%>
	<p> id : <%= id %> </p>
	<p> password : <%= password %> </p>
	
	<%
		// response.sendRedirect("redirectLogin.jsp");
	%>
	<jsp:forward page="redirectLogin.jsp">
		<jsp:param value="<%=id%>" name="id"/>
		<jsp:param value="<%=password%>" name="password"/>
	</jsp:forward>
</body>
</html>