package jspexp.a04_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Member_DAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 예외:" + e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott", "tiger");
		System.out.println("DB 접속 성공!!");
	}
	
	void closeRsc() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public Member_VO MemberList(String id, String pw) {
		Member_VO m = null;
		try {
			setConn();
			String sql = "SELECT * FROM MEMBER where id = ? and pass = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.executeQuery();
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				m = new Member_VO(rs.getString("id"), rs.getString("pass"), 
						rs.getString("name"), rs.getString("auth"),
						rs.getInt("point"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			closeRsc();
		}
		return m;
	}
	public Member_VO getMember(String id) {
		Member_VO m = null;
		try {
			setConn();
			String sql = "SELECT * FROM MEMBER where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeQuery();
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				m = new Member_VO(rs.getString("id"), rs.getString("pass"), 
						rs.getString("name"), rs.getString("auth"),
						rs.getInt("point"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			closeRsc();
		}
		return m;
	}

	public void MemberIns(Member_VO ins) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "insert into member values(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ins.getId());
			pstmt.setString(2, ins.getPw());
			pstmt.setString(3, ins.getName());
			pstmt.setString(4, ins.getAuth());
			pstmt.setInt(5, ins.getPoint());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			closeRsc();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println("등록 처리 완료");
		}
	}

	public void MemberUpt(Member_VO upt) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "update member set pass=?, name=?, auth=?, point=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, upt.getPw());
			pstmt.setString(2, upt.getName());
			pstmt.setString(3, upt.getAuth());
			pstmt.setInt(4, upt.getPoint());
			pstmt.setString(5, upt.getId());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			closeRsc();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println("등록 처리 완료");
		}
	}

	public void MemberDel(String id) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "delete from member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			closeRsc();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println("등록 처리 완료");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_DAO dao = new Member_DAO();
		dao.MemberIns(new Member_VO("himan33", "8888", "오길동", "관리자", 1000));

	}

}
