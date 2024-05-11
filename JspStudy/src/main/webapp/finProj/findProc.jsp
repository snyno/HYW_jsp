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
	session.setAttribute("countryfrom", rdo.getCountryfrom());
	session.setAttribute("countryto", rdo.getCountryto());
	session.setAttribute("datefrom", rdo.getDatefrom());
	session.setAttribute("dateto", rdo.getDateto());
	session.setAttribute("sort", rdo.getSort());
%>
	<jsp:forward page="result.jsp">
		<jsp:param name="countryfrom" value="<%=rdo.getCountryfrom()%>"/>
		<jsp:param name="countryto" value="<%=rdo.getCountryto()%>"/>
		<jsp:param name="datefrom" value="<%=rdo.getDatefrom()%>"/>
		<jsp:param name="dateto" value="<%=rdo.getDateto()%>"/>
		<jsp:param name="sort" value="<%=rdo.getSort()%>"/>
	</jsp:forward>
</body>
</html>