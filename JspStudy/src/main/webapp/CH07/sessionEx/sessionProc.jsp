<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> sessionProc.jsp </h2>
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	
		//세션에 저장
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		
	%>
	<p> id : <%= id %> </p>
	<p> password : <%= password %> </p>
	<a href="sessionProc2.jsp"> 다른 세션 프로시저 페이지로 이동</a>
</body>
</html>