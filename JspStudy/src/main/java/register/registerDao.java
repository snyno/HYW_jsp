package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class registerDao {
	//JDBC를 이용한 DB 연동
	String id = "root";
	String password = "111111";
	String url = "jdbc:mysql://localhost:3306/jspdb_3315?characterEncoding=utf-8";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//커넥션 풀을 이용하여 디비 연결 메소드
	public void connect_cp() {
		try {
			Context initctx = new InitialContext();
			
			//Context.xml 접근
			Context envctx = (Context) initctx.lookup("java:/comp/env");
			
			//커넥션 풀에 접근 (커넥션 1개 얻기 위해)
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			
			//커넥션을 하나 빌려오기
			conn = ds.getConnection();
			
			System.out.println("**커넥션 풀**을 이용하여 디비 연결 성공!!");
		} catch (Exception e) {
			
		}
		
	}
	
	public void connect() {
		//1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
		//2. DB 연결
			conn = DriverManager.getConnection(url,id,password);
			System.out.println("MySQL 연결 성공 !!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disConnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertRegister(registerDo rdo) {
		System.out.println("insertRegister() --> ");
//		connect();
		connect_cp();
		
		//sql
		//3. SQL문 완성
		String sql = "insert into register values(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,rdo.getName());
			pstmt.setString(2,rdo.getEmail());
			
			//4. SQL 실행
			pstmt.executeUpdate();
			
			System.out.println("insertRegister() 처리완료!");
			
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
		
		
		disConnect( );
	}
	
	
	public ArrayList<registerDo> getAllRegister() {
		System.out.println("getAllRegister() 처리시작 !!");
//		connect();
		connect_cp();
		
		//sql 처리
		ArrayList<registerDo> aList = new ArrayList<>();
		
		//3. SQL문 완성
		String sql = "select * from register";
		try {
			pstmt = conn.prepareStatement(sql);

			//4. SQL문 실행(전송)
			rs = pstmt.executeQuery();
			int i = 1;
			while(rs.next()) {
				registerDo rdo = new registerDo();
				rdo.setName(rs.getString(1));
				rdo.setEmail(rs.getString(2));
				
				aList.add(rdo);
				i++;
			}
			System.out.println("getAllRegister() 처리 완료!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		disConnect();
		return aList;
		
	}
}
