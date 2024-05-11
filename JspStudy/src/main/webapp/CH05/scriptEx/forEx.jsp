<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 스크립트 릿을 이용하여 for문 연습 (out.println()) </h2><hr>
	<%
		for(int i =0; i<10; i++){
			out.println(i + "<br>");
		}
	
	%>
	<h2> 스크립트 릿을 이용하여 for문 연습 (표현식 이용) </h2><hr>
	<%
		for(int i = 0; i<10; i++){	
	%>
		<%= i %> <br>
	<%
		}
	%>
	
	
	<h2> 스크립트 릿을 이용하여 for문 연습 (구구단 출력) </h2> <hr>
	<%
		for(int i = 2; i<10; i++){		// 2 ~ 9단	
			for(int j = 1; j<10; j++){	
	%>
				<%= i %> X <%= j %> = <%= i*j %> <br>
	<%
			} //for(j)
	%>
		<br>
	<%
		} //for(i)
	%>

	<h2> 스크립트 릿을 이용하여 for문 연습 (별표 찍기)</h2><hr>
	<%
		for(int i = 5; i>0; i--){
			for(int j = 0; j<i; j++){
	%>
			<%= '*' %>
	<%
			}
	%>
		<br>
	<%
		}
	%>



</body>
</html>