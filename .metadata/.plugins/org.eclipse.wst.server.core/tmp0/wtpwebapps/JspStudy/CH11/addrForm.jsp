<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 주소록 입력 (addrForm.jsp) </h2>
	<form action="addrProc.jsp" method="post" >
		<table border="1" >
			<tr height="60" align="center">
				<td width="100"> 이름 </td>
				<td width="500"> <input type="text" name="name"> </td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 전화번호 </td>
				<td width="500"> <input type="text" name="tel"> </td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 취미 </td>
				<td width="500"> 
					<!--<input type="text" name="hobby">-->
					<select name = "hobby">
						<option value="테니스">테니스</option>
						<option value="수영">수영</option>
						<option value="독서">독서</option>
						<option value="그림">그림</option>
						<option value="사진">사진</option>
						<option value="피아노">피아노</option>
						<option value="승마">승마</option>
					</select> 
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="100"> 직업 </td>
				<td width="500"> 
					<!-- <input type="text" name="job"> --> 
					<input type="checkbox" name="job" value="웹 백엔드"> 웹 백엔드
					<input type="checkbox" name="job" value="웹 프런트"> 웹 프런트
					<input type="checkbox" name="job" value="웹 퍼블리싱"> 웹 퍼블리싱
					<input type="checkbox" name="job" value="클라우드"> 클라우드
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

