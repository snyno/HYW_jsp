package addrBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class addrDao {
	
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

	//새로운 주소 데이터 DB에 저장 메소드
	public void insertAddr(addrDo ado) {
		System.out.println("insertAddr() 처리 시작!");
		connect_cp();
		//SQL 처리
		String sql = "insert into address (name, tel, hobby, job)" + "values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ado.getName());
			pstmt.setString(2, ado.getTel());
			pstmt.setString(3, ado.getHobby());
			pstmt.setString(4, ado.getJob());
			
			pstmt.executeUpdate();
			
			System.out.println("insertAddr() 처리 완료!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	

		disConnect();
		
	}
	
	//전체 데이터 가져오기
	public ArrayList<addrDo> getAllAddr() {
		System.out.println("getAllAddr() 처리 시작 !!");
		connect_cp();
		//return 데이터
		ArrayList<addrDo> aList = new ArrayList<>();
		
		//SQL 시작
		String sql  = "select * from address";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				addrDo ado = new addrDo();
				ado.setNum(rs.getInt(1));
				ado.setName(rs.getString(2));
				ado.setTel(rs.getString(3));
				ado.setHobby(rs.getString(4));
				ado.setJob(rs.getString(5));
				
				aList.add(ado);
			}
			System.out.println("getAllList() 처리 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		disConnect();
		return aList;
	}
	
	//하나의 주소록 가져오기
	public addrDo getOneAddr(int num) {
		System.out.println("getOneAddr() 처리 시작 !!");
		connect_cp();
		
		//SQL
		addrDo ado = new addrDo();
		String sql = "select * from address where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ado.setNum(rs.getInt(1));
				ado.setName(rs.getString(2));
				ado.setTel(rs.getString(3));
				ado.setHobby(rs.getString(4));
				ado.setJob(rs.getString(5));
			}
			System.out.println("getOneAddr() 처리 완료!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		disConnect();
		return ado;
	}
	
	
	//수정된 데이터 저장하기
	public void modifyAddr(addrDo ado) {
		System.out.println("modifyAddr() 처리 시작");
		connect_cp();
		
		//SQL 처리시작
		String sql = "update address set name=?, tel=?, hobby=?, job=? where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ado.getName());
			pstmt.setString(2, ado.getTel());
			pstmt.setString(3, ado.getHobby());
			pstmt.setString(4, ado.getJob());
			pstmt.setInt(5, ado.getNum());
			
			pstmt.executeUpdate();
			
			System.out.println("modifyAddr() 처리 완료!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		disConnect();
	}
	
	//선택된 데이터 삭제하기 
	public void deleteAddr() {
		
	}
}

