<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> applicationProc.jsp </h2>
	<p> username : <%= application.getAttribute("username") %></p>
	<%
		Integer count = (Integer)application.getAttribute("count");
		int cnt = count.intValue() + 1;
		application.setAttribute("count", cnt);
		
	%>
	<h3> 방문자 수 : <%= cnt %></h3>
</body>
</html>