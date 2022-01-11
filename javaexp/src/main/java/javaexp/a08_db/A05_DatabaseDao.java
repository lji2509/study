package javaexp.a08_db;
//javaexp.a08_db.A03_DatabaseDao
//import javaexp.a04_vo.Dept

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.EmpSch;

public class A05_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
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
	
	//등록처리
	public void insertEmpPre(Emp ins) {
		String sql = "INSERT INTO emp2 VALUES (?,?,?,?,?,?,?,?)";
		try {
			setConn();
			//자동커밋방지
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ins.getEmpno());
			pstmt.setString(2, ins.getEname());
			pstmt.setString(3, ins.getJob());
			pstmt.setInt(4, ins.getMgr());
			pstmt.setString(5, ins.getHiredateS());
			pstmt.setDouble(6, ins.getSal());
			pstmt.setDouble(7, ins.getComm());
			pstmt.setInt(8, ins.getDeptno());
			pstmt.executeUpdate();
			con.commit();
			//자원해제
			pstmt.close(); con.close();
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
	
	public void updateEmp2(Emp upt) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "		update emp2\r\n"
					+ "			SET ename = '"+upt.getEname()+"',\r\n"
					+ "				job = '"+upt.getJob()+"',\r\n"
					+ "				sal = "+upt.getSal()+",\r\n"
					+ "				hiredate = to_date('"+upt.getHiredateS()+"', 'YYYYMMDD'),\r\n"
					+ "				deptno = "+upt.getDeptno()+"\r\n"
					+ "			where empno = "+upt.getEmpno();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB관련 예외 : " + e.getMessage());
			closeRsc();
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		}
	}
	
	public void updateEmp2Pre(Emp upt) {
		try {
			System.out.println("#pstmt 수정#");
			setConn();
			con.setAutoCommit(false);
			String sql = "		update emp2\r\n"
					+ "			SET ename = ?,\r\n"
					+ "				job = ?,\r\n"
					+ "				sal = ?,\r\n"
					+ "				hiredate = to_date(?, 'YYYYMMDD'),\r\n"
					+ "				deptno = ?\r\n"
					+ "			where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  upt.getEname());
			pstmt.setString(2,  upt.getJob());
			pstmt.setDouble(3,  upt.getSal());
			pstmt.setString(4,  upt.getHiredateS());
			pstmt.setInt(5,  upt.getDeptno());
			pstmt.setInt(6,  upt.getEmpno());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB관련 예외 : " + e.getMessage());
			closeRsc();
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		}
	}
	public void deleteEmp2(int empno) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "DELETE \r\n"
					+ "FROM emp2\r\n"
					+ "WHERE empno="+empno;
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB관련 예외 : " + e.getMessage());
			closeRsc();
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		}
	}
	public void updateDept2(Dept upt) {
		String sql = "UPDATE dept2\r\n"
				+ "SET dname = '"+upt.getDname()+"',\r\n"
				+ "	loc = '"+upt.getLoc()+"'\r\n"
				+ "WHERE deptno = " + upt.getDeptno();
		try {
			setConn();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("예외 : " + e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp upt = new Emp("홍길동(수정)","대리",3500,"20220110",10,7521);
		A05_DatabaseDao dao = new A05_DatabaseDao();
		dao.updateEmp2Pre(upt);
		Dept dupt = new Dept("홍길동","서울",20);
		dao.updateDept2(dupt);
		dao.deleteEmp2(7499);
		Emp ins = new Emp(7000, "홍길동", "사원", 7566, "2022-01-10", 2400, 200, 30);
		dao.insertEmpPre(ins);
	}
}
