<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> cookieProc.jsp </h2>
	<%
		String id = request.getParameter("id");
		String save = request.getParameter("save");
		
		if (save != null ) {	//	save 체크박스가 선택되었으면
			//1. 쿠키 객체 생성
			Cookie cookie = new Cookie("id", id);
			//2. 쿠키 유효기간 설정
			cookie.setMaxAge(60*1); //1분
			//3. 쿠키를 클라이언트에 전송
			response.addCookie(cookie);
			
			out.println("쿠키 생성 완료 ");
		}
	%>
	<p> 아이디 : <%= id %> </p>
</body>
</html>