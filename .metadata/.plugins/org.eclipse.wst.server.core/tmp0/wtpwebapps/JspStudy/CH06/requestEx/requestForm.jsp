<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> requestForm.jsp (사용자 입력)</h2>
	<form action="requestProc.jsp" method="post" >
		<table border="1" >
			<tr height="60" align="center">
				<td width="100"> 이름 </td>
				<td width="200"> <input type="text" name="username"> </td>
				</tr>
			<tr height="60" align="center">
				<td width="100"> 직업 </td>
				<td width="200"> 
					<select name="job"> 
						<option> Engineer </option>
						<option> Student </option>
						<option> Fighter </option>
					</select>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 취미 </td>
				<td width="200"> 
					<input type="checkbox" name="hobby" value="swimming"> 수영
					<input type="checkbox" name="hobby" value="basketball"> 농구
					<input type="checkbox" name="hobby" value="movie"> 영화
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