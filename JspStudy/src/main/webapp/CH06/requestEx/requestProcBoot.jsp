<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");	//한글 안깨지게!!	
	%>
	<h2> requestProcBoot.jsp </h2>
	<P>username : <%= request.getParameter("username") %></P>
	<P>email : <%= request.getParameter("email") %></P>
	<P>tel : <%= request.getParameter("tel") %></P>
	<P>hobby : <%= request.getParameter("hobby") %></P>
	<P>job : 
	<%
		String jobs[] = request.getParameterValues("job");
		for(String job : jobs) {
	%>
		<%= job %> &nbsp&nbsp
	<% } %>
	</P>
</body>
</html>