<%@page import="finProj_flight.findResultDo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id="rdo" class="finProj_flight.findResultDo">
		<jsp:setProperty name="rdo" property="*"/>
	</jsp:useBean>
	<jsp:useBean id="rdao" class="finProj_flight.findResultDao" />
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		rdao.deleteReservation(no);
		response.sendRedirect("myReservation.jsp");
	%>
	
</body>
</html>