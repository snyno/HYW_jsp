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
		Cookie[] cookies = request.getCookies();
		String id = "";
		if(cookies != null) {
			for(int i=0; i< cookies.length; i++){
				if(cookies[i].getName().equals("id")){
					id = cookies[i].getValue();
					break;
				}
			}
		}
		
	%>
	<h2> cookieMain.jsp </h2>
	<form action="cookieProc.jsp" method="post">
		<table border="1" >
			<tr height="60" align="center">
				<td width="100"> 아이디 </td>
				<td width="200"> 
					<input type="text" name="id" value="<%=id%>">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 패스워드 </td>
				<td width="200"> 
					<input type="text" name="password">
				</td>
			</tr>
			
			<tr height="60" align="center">
				<td colspan="2"> 
					아이디 저장 :	<input type="checkbox" name="save" value="1">
				</td>
			</tr>
			<tr height="60" align="center">
				<td colspan="2"> 
					<input type="submit" value="확인">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form> 
</body>
</html>