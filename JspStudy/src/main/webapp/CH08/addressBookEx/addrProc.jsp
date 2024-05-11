<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8");%>
	<jsp:useBean id="aBean" class="address.addrBean">
		<jsp:setProperty name="aBean" property="*" />
	</jsp:useBean>
	
	<jsp:useBean id="aDao" class="address.addrDao" scope="application" />
	<% //aBean을 Dao의 insertAddr()를 이용하여 ArrayList에 저장
		aDao.insertAddr(aBean);
	%>
	<h2> addrProc.jsp </h2>
	<table border="1" >
		<tr height="60" align="center">
			<td width="100"> 아이디 </td>
			<td width="200"> <%= aBean.getId() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 이름 </td>
			<td width="200"> <%= aBean.getName() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 전화번호 </td>
			<td width="200"> <%= aBean.getTel() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> email </td>
			<td width="200"> <%=aBean.getEmail() %> </td>
		</tr>
	</table>
	<a href="addrList.jsp"> 전체 주소록 보기 </a>=
</body>
</html>

