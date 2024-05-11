<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> main.jsp </h2>
	<jsp:forward page="footer.jsp">
		<jsp:param value="111111" name="num1"/>
		<jsp:param value="222222" name="num2"/>
	</jsp:forward>
</body>
</html>