<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> loginForm.jsp (빈즈 이용)</h2>
	<form action="loginProc.jsp" method="post" >
		<table border="1" >
			<tr height="60" align="center">
				<td width="100"> 이름 </td>
				<td width="200"> <input type="text" name="userid"> </td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> PW </td>
				<td width="200"> <input type="text" name="userpassword"> </td>
			</tr>
			<tr height="60" align="center">
				<td colspan="2"> 
					<input type="reset" value="취소">
					<input type="submit" value="확인">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>