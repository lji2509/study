package jspexp.a03_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jspexp.z01_vo.Salgrade;

public class Salgrade_dao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("에러: "+e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con =DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공");
	}
	
	public ArrayList<Salgrade> SalgradeList() {
		ArrayList<Salgrade> list = new ArrayList<Salgrade>();
		String sql = "SELECT *\r\n"
				+ "FROM salgrade\r\n";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Salgrade s = new Salgrade();
				s.setGrade(rs.getInt("grade"));
				s.setLosal(rs.getInt("losal"));
				s.setHisal(rs.getInt("hisal"));
				list.add(s);
			}
			
		} catch (SQLException e) {
			closeRsc();
		}
		
		
		return list;
	}
	
	public void closeRsc() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : "+e.getMessage());
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : "+e.getMessage());
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : "+e.getMessage());
			}
		}
	}
	public ArrayList<Salgrade> SalgradeList(int grade) {
		ArrayList<Salgrade> list = new ArrayList<Salgrade>();
		String sql = "SELECT *\r\n"
				+ "FROM salgrade\r\n"
				+ "WHERE grade=?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, grade);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Salgrade s = new Salgrade();
				s.setGrade(rs.getInt("grade"));
				s.setLosal(rs.getInt("losal"));
				s.setHisal(rs.getInt("hisal"));
				list.add(s);
			}
			
		} catch (SQLException e) {
			closeRsc();
		}
		
		
		return list;
	}

	public static void main(String[] args) {
		Salgrade_dao dao = new Salgrade_dao();
		for(Salgrade s:dao.SalgradeList()) {
			System.out.println(s.getGrade() + "\t" + s.getLosal() + "\t" + s.getHisal());
		}
	}
}
