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
	<h2> 선택된 주소록 데이터 보기 (addrInfo.jsp) </h2>
	<hr>
	<jsp:useBean id="adao" class="addrBook.addrDao" />
	<%
		int num = Integer.parseInt(request.getParameter("num"));
		addrDo ado = adao.getOneAddr(num);
	
	
	%>
	
	<table border="1" >
		<tr height="60" align="center">
			<td width="100"> 이름 </td>
			<td width="500"> <%= ado.getName() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 전화번호 </td>
			<td width="500"> <%= ado.getTel() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 취미 </td>
			<td width="500"> 
				<%= ado.getHobby() %>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 직업 </td>
			<td width="500"> 
				<%= ado.getJob() %>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 직업 </td>
			<td colspan="2"> 
				<input type="button" value="수정하기" onclick="location.href='addrModify.jsp?num=<%=ado.getNum() %>'">
				<input type="button" value="삭제하기" onclick="location.href='addrDelete.jsp?num=<%=ado.getNum() %>'">
				<input type="button" value="목록보기" onclick="location.href='addrList.jsp?num=<%=ado.getNum() %>'">
			</td>
		</tr>
	</table>
</body>
</html>