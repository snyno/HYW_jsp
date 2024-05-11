<%@page import="addrBook.addrDo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 수정된 데이터 처리하기 (addrModifyProc.jsp) </h2>
	<hr>
	
	<jsp:useBean id="ado" class="addrBook.addrDo" />
	<jsp:setProperty property="*" name="ado" />
	
	<jsp:useBean id="adao" class="addrBook.addrDao" />
	
	
	
	<%
		int num = Integer.parseInt(request.getParameter("num"));
		adao.modifyAddr(ado);
		
		//수정된 데이터를 전체 리스트 보기에서 확인하기
		response.sendRedirect("addrList.jsp");
	%>
	
</body>
</html>