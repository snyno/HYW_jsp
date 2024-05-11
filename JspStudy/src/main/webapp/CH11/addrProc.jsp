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
		request.setCharacterEncoding("UTF-8");
	%>
	
	<jsp:useBean id="ado" class="addrBook.addrDo">
		<jsp:setProperty name="ado" property="*"/>
	</jsp:useBean> 
	
	<!-- ArrayList에 저장하기 위해 DAO 사용 -->
	<jsp:useBean id="adao" class="addrBook.addrDao" />
	
	<%
		//체크박스의 여러 데이터를 하나의 스트링으로 만들어서 저장
		String[] job = request.getParameterValues("job");
		String jobText = "";
		for (int i = 0; i<job.length; i++){
			jobText += job[i] + " ";
		}
		
		ado.setJob(jobText);
		
		/* out.println("name : " + ado.getName());
		out.println("job : " + ado.getJob()); */
		
		//입력받은 주소 데이터 dao 이용하여 Db에 저장
		adao.insertAddr(ado);
	%>
	<h2> addrProc.jsp (입력데이터 저장) </h2>
	<hr>
	<a href="addrList.jsp"> 전체 주소록 보기 </a>
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
	</table>
	
</body>
</html>

