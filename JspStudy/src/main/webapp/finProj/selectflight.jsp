<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rdo" class="finProj_flight.findResultDo">
	<jsp:setProperty name="rdo" property="*"/>
</jsp:useBean>
<jsp:useBean id="rdao" class="finProj_flight.findResultDao" />
<%
String flightno = (String)request.getParameter("flightno");
String flightdate = (String)request.getParameter("flightdate");
String flightairline = (String)request.getParameter("flightairline");

String countryfrom = (String) session.getAttribute("countryfrom");
String countryto = (String) session.getAttribute("countryto");
String datefrom = (String) session.getAttribute("datefrom");
String dateto = (String) session.getAttribute("dateto");
String sort = (String) session.getAttribute("sort");


if(flightdate.equals(datefrom)){
	Cookie cookie1 = new Cookie("goflightno", flightno);
	Cookie cookie2 = new Cookie("goflightdate", flightdate);
	Cookie cookie3 = new Cookie("goflightairline", flightairline);
	//2. 쿠키 유효기간 설정
	cookie1.setMaxAge(60*30); //30분
	cookie2.setMaxAge(60*30); //30분
	cookie3.setMaxAge(60*30); //30분
	//3. 쿠키를 클라이언트에 전송
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);
} else if(flightdate.equals(dateto)) {
	Cookie cookie1 = new Cookie("backflightno", flightno);
	Cookie cookie2 = new Cookie("backflightdate", flightdate);
	Cookie cookie3 = new Cookie("backflightairline", flightairline);
	//2. 쿠키 유효기간 설정
	cookie1.setMaxAge(60*30); //30분
	cookie2.setMaxAge(60*30); //30분
	cookie3.setMaxAge(60*30); //30분
	//3. 쿠키를 클라이언트에 전송
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);
}
%>
<jsp:forward page="result.jsp">
	<jsp:param name="countryfrom" value="<%=countryfrom.toUpperCase()%>"/>
	<jsp:param name="countryto" value="<%=countryto.toUpperCase()%>"/>
	<jsp:param name="datefrom" value="<%=datefrom%>"/>
	<jsp:param name="dateto" value="<%=dateto%>"/>
	<jsp:param name="sort" value="<%=sort%>"/>
</jsp:forward>

</body>
</html>