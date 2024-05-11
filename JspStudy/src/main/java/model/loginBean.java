package model;

public class loginBean {
	//멤버변수
	private String userid;
	private String userpassword;
	
	//db 연동
	final String db_userid = "hong";
	final String db_password = "111111";
	
	public boolean checkUser() {
		if(db_userid.equals(userid) && db_password.equals(userpassword)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//멤버 메소드
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
