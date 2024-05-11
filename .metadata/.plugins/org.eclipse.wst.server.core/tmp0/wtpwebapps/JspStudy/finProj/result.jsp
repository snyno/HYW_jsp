<%@page import="finProj_flight.findResultDo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
th{
	text-align: center!important;
}
tr {
	display: flex;
}
td {
	display: flex;
    justify-content: space-evenly;
    align-items: center;
}
td > img {
	height:15px;
}
.navbar-brand {
	padding-top: 1rem!important;
    padding-bottom: 1rem!important;
}
.navbar-brand .input-group-text{
    font-size: 1.25rem!important;
    line-height: 2!important;
    color: #ffffff!important;
    background-color: transparent!important;
}
.navbar-brand .input-group {
	margin : 0;
}
.navbar-brand input.form-control {
    text-align: center;
        width: 120px!important;
}
.form-control:disabled, .form-control[readonly] {
    background-color: #ffffff!important;
    color:#0d6efd!important;
    opacity: 1;
}

</style>
</head>
<body>
	<div class="container" style="margin-bottom : 200px">
		<%@ include file="nav.jsp" %>
		<jsp:useBean id="rdo" class="finProj_flight.findResultDo">
			<jsp:setProperty name="rdo" property="*"/>
		</jsp:useBean>
		<jsp:useBean id="rdao" class="finProj_flight.findResultDao" />
		<%@ include file="find.jsp" %>
		<%
			String sort = (String)session.getAttribute("sort");
		%>
		<div class="fw-bolder fs-3" style="display: flex;justify-content: space-between;align-items: flex-end;margin-bottom:20px">[ 출국편 ]
		</div>
		<table border="1" class="table table-hover">
			<thead>
				<tr>
					<th width="20%" scope="col"> 항공사 </th>
					<th width="20%" scope="col"> 편명 </th>
					<th width="20%" scope="col"> 출발 </th>
					<th width="20%" scope="col"> 도착 </th>
					<th width="20%" scope="col"> 비행시간 </th>
				</tr>
			</thead>
			<tbody>
<%
		ArrayList<findResultDo> aList = rdao.getFlights(rdo.getCountryfrom().toUpperCase(),rdo.getCountryto().toUpperCase(),rdo.getDatefrom(),sort);
		ArrayList<findResultDo> bList = rdao.getFlights(rdo.getCountryto().toUpperCase(),rdo.getCountryfrom().toUpperCase(), rdo.getDateto(),sort);
		for(int i = 0; i< aList.size(); i++) {
			findResultDo rTemp = aList.get(i);
			String imgurl = "";
			if (rTemp.getAirline().equals("ASIANA")){
				imgurl = "assets/asianaair.png";
			} else if (rTemp.getAirline().equals("KOREANAIR")){
				imgurl = "assets/koreanair.png";
			} else if (rTemp.getAirline().equals("JEJUAIR")){
				imgurl = "assets/jejuair.png";
			} else if (rTemp.getAirline().equals("CEBUAIR")){
				imgurl = "assets/cebuair.png";
			} else if (rTemp.getAirline().equals("PHILIPPINE")){
				imgurl = "assets/philippineair.png";
			}
%>
			<tr height="60" align="center" onclick="location.href='flightInfo.jsp?flightno=<%=rTemp.getFlightno()%>&flightdate=<%= rTemp.getFlightdate() %>'">
				<td width="20%"> <img src="<%=imgurl %>"> <%= rTemp.getAirline() %></td>
				<td width="20%"> <%=rTemp.getFlightairline() %> <%=rTemp.getFlightno() %> </td>
				<td width="20%"> <%= rTemp.getFlightfrom() %></td>
				<td width="20%"> <%= rTemp.getFlightto() %> </td>
				<td width="20%"> 
				<%=rTemp.getFlightdate() %> <br> <%= rTemp.getTakeofftime() %> ~ <%=rTemp.getLandingtime() %> </td>
				
			</tr>
			
		<%
		}
	%></tbody></table>
	
	<br><br><br>
		<div class="fw-bolder fs-3" style="display: flex;justify-content: space-between;align-items: flex-end;margin-bottom:20px">[ 귀국편 ]
		</div>
		<table border="1" class="table table-hover">
			<thead>
				<tr>
					<th width="20%" scope="col"> 항공사 </th>
					<th width="20%" scope="col"> 편명 </th>
					<th width="20%" scope="col"> 출발 </th>
					<th width="20%" scope="col"> 도착 </th>
					<th width="20%" scope="col"> 비행시간 </th>
				</tr>
			</thead>
			<tbody>
<%
		for(int i = 0; i< bList.size(); i++) {
			findResultDo rTemp = bList.get(i);
			String imgurl = "";
			if (rTemp.getAirline().equals("ASIANA")){
				imgurl = "assets/asianaair.png";
			} else if (rTemp.getAirline().equals("KOREANAIR")){
				imgurl = "assets/koreanair.png";
			} else if (rTemp.getAirline().equals("JEJUAIR")){
				imgurl = "assets/jejuair.png";
			} else if (rTemp.getAirline().equals("CEBUAIR")){
				imgurl = "assets/cebuair.png";
			} else if (rTemp.getAirline().equals("PHILIPPINE")){
				imgurl = "assets/philippineair.png";
			}
%>
			<tr height="60" align="center" onclick="location.href='flightInfo.jsp?flightno=<%=rTemp.getFlightno()%>&flightdate=<%= rTemp.getFlightdate() %>'">
				<td width="20%"> <img src="<%=imgurl %>"> <%= rTemp.getAirline() %></td>
				<td width="20%"> <%=rTemp.getFlightairline() %> <%=rTemp.getFlightno() %> </td>
				<td width="20%"> <%= rTemp.getFlightfrom() %></td>
				<td width="20%"> <%=rTemp.getFlightto() %> </td>
				<td width="20%"> 
				<%=rTemp.getFlightdate() %> <br> <%=rTemp.getTakeofftime() %> ~ <%=rTemp.getLandingtime() %> </td>
			</tr>
		<%
		}
	%></tbody></table>
	</div>
	<%
		Cookie[] cookies = request.getCookies();
		String goflightno = "";
		String goflightdate = "";
		String goflightairline = "";
		String backflightno = "";
		String backflightdate = "";
		String backflightairline = "";
		
		//if((String)request.getParameter("flightdate") != null){
	//	}
		if (cookies != null) {
			for(int i=0; i< cookies.length; i++){
				if(cookies[i].getName().toString().equals("goflightno")){
					goflightno = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("goflightdate")){
					goflightdate = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("goflightairline")){
					goflightairline = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightno")){
					backflightno = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightdate")){
					backflightdate = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightairline")){
					backflightairline = cookies[i].getValue();
					continue;
				}
			}
		}

		String fdate = (String)request.getParameter("flightdate");
		String fno = (String)request.getParameter("flightno");
		String fline = (String)request.getParameter("flightairline");
		if (fdate != null){
			if (fdate.equals(rdo.getDatefrom())){
				goflightno = fno;
				goflightdate = fdate;
				goflightairline = fline;
			} else if (fdate.equals(rdo.getDateto())){
				backflightno = fno;
				backflightdate = fdate;
				backflightairline = fline;
			}
		} 
		
	%>
	
	<nav class="navbar fixed-bottom navbar-dark bg-primary">
	
	  <div class="container-fluid" style="justify-content: space-evenly!important;">
	    <div class="navbar-brand"> 
	    	<div class="input-group">
			  <span class="input-group-text">출국편</span>
			  <input name="goflightdate" value="<%= goflightdate %>" class="form-control" style="margin:0" type="text" aria-label="Disabled input example" disabled readonly>
			  <input name="goflightairline" value="<%= goflightairline %>" class="form-control" style="margin:0;width:50px!important" type="text" aria-label="Disabled input example" disabled readonly>
			  <input name="goflightno" value="<%= goflightno %>" class="form-control" style="margin:0;width:100px!important" type="text" aria-label="Disabled input example" disabled readonly>
			</div>
	    </div>
	    <div class="navbar-brand"> 
	    	<div class="input-group">
			  <span class="input-group-text">귀국편</span>
			  <input name="backflightdate" value="<%= backflightdate %>" class="form-control" style="margin:0" type="text" aria-label="Disabled input example" disabled readonly>
			  <input name="backflightairline" value="<%= backflightairline %>" class="form-control" style="margin:0;width:50px!important" type="text" aria-label="Disabled input example" disabled readonly>
			  <input name="backflightno" value="<%= backflightno %>" class="form-control" style="margin:0;width:100px!important" type="text" aria-label="Disabled input example" disabled readonly>
			</div>
	    </div>
	    <%
	    	String userid="" ; 
	    	if((String)session.getAttribute("userid") != null) {
	    		userid = (String)session.getAttribute("userid"); 
	    	}
	    	String url= "";
		  	
			if(userid != "") {
				url = "location.href='reservation.jsp'";
			}
			else {
				url = "location.href='loginFormBoot.jsp'";
			}
	    %>
		<input type="submit" class="btn btn-outline-light input-group input-group-lg" style="width:120px;line-height: 2;font-size: 1.25rem;margin:0" onclick="<%=url %>" value="예약하기"></input>
	  </div>
	  
	</nav>
	
</body>
</html>