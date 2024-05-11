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
		String a =  request.getParameter("num1");
		String b = request.getParameter("num2");
		int a1 = Integer.parseInt(a);
		int a2 = Integer.parseInt(b);
	%>
	
	

	<%= a1 %> + <%= a2 %> = <%= a1 + a2 %> 입니다.

</body>
</html>