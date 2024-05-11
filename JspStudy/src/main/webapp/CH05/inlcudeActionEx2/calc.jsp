<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="adder.jsp">
		<jsp:param value="1" name="num1"/>
		<jsp:param value="2" name="num2"/>
	</jsp:include>
</body>
</html>