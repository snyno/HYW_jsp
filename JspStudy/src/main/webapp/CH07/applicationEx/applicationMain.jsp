<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> applicationMain.jsp </h2>
	<p> 서버 정보 : <%= application.getServerInfo() %></p>
	
	<%
		//어플리케이션 객체에 정보 저장
		application.setAttribute("username", "hong");
		application.setAttribute("count", 1);
	%>
	<a href="applicationProc.jsp"> 다른 페이지 방문 ! </a>
	
</body>
</html>