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
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//세션에 username 정보 저장
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		
		//main.jsp 호출(nav.jsp에 username 반영)
		response.sendRedirect("main.jsp");
	%>
</body>
</html>