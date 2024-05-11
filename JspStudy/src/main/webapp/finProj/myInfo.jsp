<%@page import="finProj_flight.findResultDo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<%@ include file="nav.jsp" %>

<jsp:useBean id="adao" class="finProj_flight.findResultDao" />
	<%
		String userid = (String)session.getAttribute("userid");
		findResultDo ado = adao.getmyInfo(userid);
	%>

<div cass="container">
	<div class="container" style="max-width: 700px;margin-bottom:100px;border-radius: 5px;padding: 50px 20px;">
		<p class="text-start fs-1 fw-bold" style="display: flex;justify-content: center; margin-bottom:30px;margin-top:16px">내 정보</p>
		
		<form action="myInfoProc.jsp" method="post">
	<table border="1"  style="width: 100%">
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 아이디 </td>
			<td width="100%"> <%= ado.getUserid() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 비밀번호 </td>
			<td width="100%" id="flightno"> <%=ado.getUserpw()%> </td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 이름 </td>
			<td width="100%"><%=ado.getUsername()%></td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 국가 </td>
			<td width="100%"><%=ado.getUsercountry()%></td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 생일 </td>
			<td width="100%" id="flightdate"> 
				<%=ado.getUserbirth()%>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 이메일 </td>
			<td width="100%"> 
				<%=ado.getUseremail()%>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 전화번호 </td>
			<td width="100%"> 
				<%=ado.getUsertel()%>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529">고객등급</td>
			<td width="100%"> 
				<%= ado.getUsergrade() %>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="40%" style="border-right:1px solid #212529"> 개인정보 활용 동의 </td>
			<td width="100%"> 
				<% 
					String agree="비동의";
					String check = "";
					if(ado.getUseragree().equals("1")){
						agree="동의";
					}
					if(agree.equals("동의")){
						check = "checked";
					}
				%>
				<%=agree %>
			</td>
		</tr>
		</table>
		<div class="d-grid gap-2 col-6 mx-auto" style="margin-top:30px">
			  <button class="btn btn-primary" type="button" onclick="location.href='myInfoModify.jsp'">수정하기</button>
			  <button class="btn btn-outline-primary" type="button" onclick="location.href='main.jsp'">홈으로</button>
			</div>
	
	</form>


</div>
</body>
</html>