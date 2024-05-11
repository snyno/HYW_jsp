<%@page import="java.util.ArrayList, address.addrBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="aDao" class="address.addrDao" scope="application" />
	<% //전체 주소데이터를 갖고있는 ArrayList 주소 가져오기 (DAO 메소드 이용)
		ArrayList<addrBean> v = aDao.getAllAddr();
	%>
	<h2> 전체 주소록 보기</h2>
	<hr>
	<a href="addrForm.jsp">주소록 추가</a>
	<table border="1" >
		<tr height="60" align="center">
			<td width="100"> 아이디 </td>
			<td width="100"> 이름 </td>
			<td width="100"> 전화번호 </td>
			<td width="100"> 이메일 </td>
		</tr>

		<%
			for(int i = 0; i<v.size();i++){
				addrBean abean = v.get(i);
		%>
				<tr height="60" align="center">
					<td width="100"> <%=abean.getId() %> </td>
					<td width="100"> <%=abean.getName() %> </td>
					<td width="100"> <%=abean.getTel() %> </td>
					<td width="100"> <%=abean.getEmail() %> </td>
				</tr>
		<%
			}
		%>
	</table>
	
</body>
</html>


