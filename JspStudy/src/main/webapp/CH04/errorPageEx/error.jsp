<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 관리자에게 문의해 주세요... 빠른 시일 내에 복구하겠습니다. </h2>
	에러 메시지 : <%= exception.getMessage() %>
	<%--여기서는 <%= 문장의 값을 출력하라는 의미이므로 여기 안에서는 세미콜론(;)넣으면 안돼!!! %> --%>
	
</body>
</html>