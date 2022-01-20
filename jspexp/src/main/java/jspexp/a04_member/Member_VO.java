package jspexp.a04_member;

public class Member_VO {
	private String id;
	private String pw;
	private String name;
	private String auth;
	private int point;
	public Member_VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member_VO(String id, String pw, String name, String auth, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.auth = auth;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
