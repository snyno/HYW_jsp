<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> footer page </h2>
	<hr>
	<p> 이메일 : <%= request.getParameter("email") %> </p>
	<p> 전화번호 : <%= request.getParameter("tel") %> </p>
	<hr>
</body>
</html>