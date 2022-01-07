package javaexp.a08_db;
//javaexp.a08_db.A03_DatabaseDao
//import javaexp.a04_vo.Dept

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.Emp2;
import javaexp.a04_vo.Emp3;
import javaexp.a04_vo.Emp5;
import javaexp.a04_vo.EmpSch;
import javaexp.a04_vo.Max;

public class A05_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공");
	}
	public void deptList() {
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM DEPT2";
			rs = stmt.executeQuery(sql);
			int rowNum=1;
			while(rs.next()) {
				System.out.print("행: "+rowNum+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); //select을 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("에러 : "+e.getMessage());
				}
			}
		}
	}

	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT *\r\n"
					+ "		FROM EMP2 e \r\n"
					+ "		WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
					+ "		AND job LIKE '%"+sch.getJob()+"%'\r\n"
					+ "		and sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal()+"\r\n"
					+ "		AND deptno ="+sch.getDeptno();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			closeRsc();
		}
		return list;
	}
	
	//등록처리
	public void insertEmp(Emp ins) {
		String sql = "INSERT INTO emp2 VALUES ("+ins.getEmpno()+",'"+ins.getEname()+"','"+ins.getJob()+"',"+ins.getMgr()+", sysdate,"+ins.getSal()+","+ins.getComm()+","+ins.getDeptno()+")";
		try {
			setConn();
			//자동커밋방지
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			//자원해제
			stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//예외시 rollback 처리
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}
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
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("에러 : "+e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A05_DatabaseDao dao = new A05_DatabaseDao();
		dao.deptList();
	}
}
