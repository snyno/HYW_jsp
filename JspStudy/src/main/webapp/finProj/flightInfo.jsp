<%@page import="finProj_flight.findResultDo"%>
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
<jsp:useBean id="adao" class="finProj_flight.findResultDao" />
	<%
		String flightno = (String)request.getParameter("flightno");
		String flightdate = (String)request.getParameter("flightdate");
		findResultDo ado = adao.selectedflight(flightno, flightdate);
	%>
	
	<table border="1" >
		<tr height="60" align="center">
			<td width="100"> 항공사 </td>
			<td width="500"> <%= ado.getAirline() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 항공편명 </td>
			<td width="500" id="flightno"> <%= ado.getFlightairline() %> <%=ado.getFlightno() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 출발지 </td>
			<td width="500"> <%= ado.getFlightfrom().toUpperCase() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 도착지 </td>
			<td width="500"> <%= ado.getFlightto().toUpperCase() %> </td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 운행 날짜 </td>
			<td width="500" id="flightdate"> 
				<%= flightdate %>
			</td>
		</tr>
		<tr height="60" align="center">
			<td width="100"> 비행시간 </td>
			<td width="500"> 
				<%= ado.getTakeofftime() %> ~ <%= ado.getLandingtime() %>
			</td>
		</tr>
		<tr height="60" align="center">
			<td colspan="2"> 
				<input type="button" value="선택하기" onclick="location.href='selectflight.jsp?flightno=<%=flightno%>&flightdate=<%= flightdate%>&flightairline=<%=ado.getFlightairline() %>'">
				<input type="button" value="목록보기" onclick="window.history.back()">
			</td>
		</tr>
	</table>
</body>
</html>