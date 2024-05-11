package finProj_counrty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class countryDao {
	String id = "root";
	String password = "111111";
	String url = "jdbc:mysql://localhost:3306/jspdb_3315?characterEncoding=utf-8";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void connect() {
		//1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
		//2. DB 연결
			conn = DriverManager.getConnection(url,id,password);
			//System.out.println("MySQL 연결 성공 !!");
			
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
	
	public ArrayList<countryDo> getCountrys() {
		//System.out.println("getAllRegister() 처리시작 !!");
		connect();
		
		//sql 처리
		ArrayList<countryDo> aList = new ArrayList<>();
		
		//3. SQL문 완성
		String sql = "select * from country";
		try {
			pstmt = conn.prepareStatement(sql);

			//4. SQL문 실행(전송)
			rs = pstmt.executeQuery();
			int i = 1;
			while(rs.next()) {
				countryDo rdo = new countryDo();
				rdo.setCountrycode(rs.getString(1));
				rdo.setCountryname_en(rs.getString(2));
				rdo.setCountryname_kr(rs.getString(3));
				
				aList.add(rdo);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		disConnect();
		return aList;
		
	}
}
