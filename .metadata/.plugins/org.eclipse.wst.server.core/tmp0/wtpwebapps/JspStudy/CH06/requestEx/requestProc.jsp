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
		request.setCharacterEncoding("utf-8");	//한글 안깨지게!!	
	%>
	<h2> requestProc.jsp </h2>
	<hr>
	<p> username : <%=request.getParameter("username") %></p>
	<p> job : <%=request.getParameter("job") %></p>
	<p> hobby : <%-- <%= request.getParameter("hobby") %> --%>
				<%
					String hobby[] = request.getParameterValues("hobby");
					for(int i = 0; i<hobby.length;i++){
				%>
						<%=hobby[i]%> &nbsp &nbsp
				<%
					}
				%>
	</p>
	
	<table border="1" >
			<tr height="60" align="center">
				<td width="100"> 이름 </td>
				<td width="200"> <%= request.getParameter("username") %> </td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 직업 </td>
				<td width="200"> <%= request.getParameter("job") %> </td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 취미 </td>
				<td width="200"> 
					<%
						String arr[] = request.getParameterValues("hobby");
						for(int i = 0; i<arr.length;i++){
							out.print(arr[i]);
						}
					%>
				</td>
			</tr>
			<tr height="60" align="center">
				<td colspan="2"> 
					<input type="submit" value="확인">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
</body>
</html>