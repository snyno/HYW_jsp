<%@page import="addrBook.addrDo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 전체 주소록 보기 (addrList.jsp) </h2>
<hr>

<table width="800" border="1">
	<tr align="center">
		<td width="150"> 번호 </td>
		<td width="150"> 이름 </td>
		<td width="150"> 전화번호 </td>
		<td width="150"> 취미 </td>
		<td width="150"> 직업 </td>
	</tr>
	<jsp:useBean id="adao" class="addrBook.addrDao" />
	<%
		ArrayList<addrDo> aList = adao.getAllAddr();
		for(int i = 0; i<aList.size(); i++){
			addrDo ado = aList.get(i);
		
	%>
		<tr align="center" height="50">
			<td width="150"> <%= ado.getNum() %> </td>
			<td width="150"> 
				<a href="addrInfo.jsp?num=<%=ado.getNum()%>"> <%= ado.getName() %></a>  
			</td>
			<td width="150"> <%= ado.getTel() %> </td>
			<td width="150"> <%= ado.getHobby() %> </td>
			<td width="150"> <%= ado.getJob() %> </td>
		</tr>
	<%
		}
	%>
</table>

</body>
</html>