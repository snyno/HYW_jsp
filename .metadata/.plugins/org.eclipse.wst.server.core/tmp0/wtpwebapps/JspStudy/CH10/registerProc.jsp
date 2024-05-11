<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	%>

	<h2> registerProc.jsp </h2>
	<hr>
	<p> name : <%= name %></p>
	<p> email : <%= email%></p>
	
	<hr>
	
	<%
		//JDBC를 이용한 DB 연동
		String id = "root";
		String password = "111111";
		String url = "jdbc:mysql://localhost:3306/jspdb_3315?characterEncoding=utf-8";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. DB 연결
			conn = DriverManager.getConnection(url,id,password);
			
			//3. SQL문 완성
			String sql = "insert into register values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,email);
			
			//4. SQL 실행
			pstmt.executeUpdate();
			
			//5. 연결 해제
			conn.close();
			
			out.println("insert 문 처리 완료");
			
		} catch(Exception e){
			e.printStackTrace();
		}
	%>
	
	
	<h2> 등록된 이벤트 전체 목록 </h2>
	<hr>
	<%
		try{
			//2. DB 연결
			conn = DriverManager.getConnection(url,id, password);
			
			//3. SQL문 완성
			String sql = "select * from register";
			pstmt = conn.prepareStatement(sql);
			
			//4. SQL문 실행(전송)
			rs = pstmt.executeQuery();
			int i = 1;
			while(rs.next()){
				out.println( i + " : name -> " + rs.getString(1) + 
						", email : " + rs.getString(2) + "<br>");
				i++;
			}
			conn.close();
			pstmt.close();
			rs.close();
			out.println("select 문 처리 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>

