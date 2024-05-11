<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 별표찍기</h2>
	<hr>
	<%
		for(int i = 5; i>0; i--){
			if(i%2 != 0){
				for(int k = 0; k<((5-i)/2);k++){
					out.println("&nbsp");		//HTML에 공백 넣는 코드
				}
				for(int j = 0; j<i; j++){
					out.println("*");
				}
			}
	%>
			<br>
	<%
		}
	%>
</body>
</html>