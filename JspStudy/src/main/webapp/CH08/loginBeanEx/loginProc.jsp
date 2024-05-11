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
	<jsp:useBean id="login" class="model.loginBean">
		<%-- <jsp:setProperty name="login" property="userid" />
		<jsp:setProperty name="login" property="userpassword" /> --%>
		<jsp:setProperty name="login" property="*" />
	</jsp:useBean>
	
	<%
		if(login.checkUser()) {
			out.println("로그인 성공");
		}else {
			out.print("로그인 실패");
		}
	%>
		
	<h2> loginProc.jsp </h2>
	<hr>
	<p> userid : <%=request.getParameter("userid") %></p>
	<p> userpassword : <%=request.getParameter("userpassword") %></p>
	
	
	<h2> getProperty 이용 </h2>
	<hr>
	<p> userid : <jsp:getProperty name="login" property="userid" /></p>
	<p> userpassword : <jsp:getProperty name="login" property="userpassword" /></p>

</body>
</html>