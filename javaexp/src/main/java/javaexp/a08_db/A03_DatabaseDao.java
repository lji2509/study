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

public class A03_DatabaseDao {
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
			String sql = "SELECT * FROM DEPT";
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
	/*
	 1. Dept(deptno, dname, loc) VO 생성
	 2. 리턴할 기능 메서드 선언 
	 3. 매개변수 처리
	 	select*from dept where loc like '%'||'A'||'%';
	 4. while() 처리할 VO생성하고 ArrayList에 담기
	 5. main()에서 출력하기
	 */
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> deptlist = new ArrayList<Dept>();
		
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT  * \r\n"
					+ "FROM dept \r\n"
					+ "WHERE loc like '%'||'A'||'%'";
			rs = stmt.executeQuery(sql);
			int rowNum=1;
			while(rs.next()) {
				System.out.print("행: "+rowNum+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); //select을 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n");
				
				deptlist.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
				
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
		return deptlist;
	}
	public ArrayList<Emp2> getEmpList2(int deptno){
		ArrayList<Emp2> list = new ArrayList<Emp2>();
		String sql = "SELECT  empno no, ename name, job, deptno\r\n"
				+ "				FROM emp \r\n"
				+ "				WHERE deptno=\"+deptno";
		return list;
	}
	/*
	 ex) 직책을 기준으로 부서명, 사원이름, 직책명, 급여를 검색하여 출력
	  	-VO작성, 동적sql작성
	  	- 고급자(메서드정의까지)
	 */
	public ArrayList<Emp3> getJobList(String job){
		ArrayList<Emp3> joblist = new ArrayList<Emp3>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT dname, ename, job, sal  \r\n"
					+ "FROM emp, dept\r\n"
					+ "WHERE emp.deptno = dept.deptno\r\n"
					+ "AND job like '%'||'"+job+"'||'%'";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				joblist.add(new Emp3(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
				
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
		return joblist;
	}
	/*
	 	SELECT *
		FROM EMP e 
		WHERE ename LIKE '%%'
		AND job LIKE '%%'
		and sal BETWEEN 1000 AND 3000
		AND deptno =10;
		/*
		 # 위와 같이 매개변수로 처리할 데이터가 많을 때
		 1. 매개변수를 나열하든지
		 2. 위 매개변수를 객체로 VO를 만들고, 그 VO로 매개변수를 전송할게 한다
		 Class EmpSch{
		 	private String ename;
		 	private String job;
		 	private int fr_sal;
		 	private int to_sal;
		 	private int deptno;
		 }
	 */
	//ArrayList<Emp> : select * 를 통해서 결과를 받을 데이터를 VO(한 행)단위를 모아서 동적배열을 선언하여 처리될 부분
	//getEmpListSch(EmpSch sch) : 의 EmpSch sch는 아래 sql문에 들어갈 where 조건문의 데이터를 처리하기 위해 속성을 지정하여 전달하는 개체 선언 부분
	//	ex) + "	WHERE ename LIKE '%" + sch.getEname() + "%'\r\n"
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "		FROM EMP e \r\n"
				+ "		WHERE ename LIKE '%"+sch.getEname()+"%'\r\n"
				+ "		AND job LIKE '%"+sch.getJob()+"%'\r\n"
				+ "		and sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal()+"\r\n"
				+ "		AND deptno ="+sch.getDeptno();
		return list;
	}
	
	public ArrayList<Emp5> getEmpList5(int sal) {
		ArrayList<Emp5> list = new ArrayList<Emp5>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT ename, grade, sal\r\n"
					+ "FROM emp e, SALGRADE s \r\n"
					+ "WHERE e.sal BETWEEN s.LOSAL AND s.HISAL\r\n"
					+ "AND sal = " + sal;
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp5(rs.getString(1), rs.getInt(2), rs.getInt(3)));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Max> getMaxList(int quarter) {
		ArrayList<Max> mlist = new ArrayList<Max>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT to_char(hiredate,'q') quarter, max(sal) max\r\n"
					+ "FROM emp\r\n"
					+ "GROUP BY to_char(hiredate,'q')\r\n"
					+ "HAVING to_char(hiredate,'q') = " + quarter;
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				mlist.add(new Max(rs.getInt(1), rs.getInt(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mlist;
	}
	
	public ArrayList<Emp> getEmpList(int empno) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT *\r\n"
					+ "FROM emp\r\n"
					+ "WHERE empno=" + empno;
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8)));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
		ArrayList<Dept> dlist = dao.deptList("A");
		System.out.println("# 화면 출력 내용 #");
		for(Dept d:dlist) {
			System.out.println(d.getDeptno()+"\t"+d.getDname()+"\t"+d.getLoc());
		}
		ArrayList<Emp3> jlist = dao.getJobList("MAN");
		System.out.println("# 화면 출력 내용 #");
		for(Emp3 j:jlist) {
			System.out.println(j.getDname()+"\t"+j.getEname()+"\t"+j.getJob()+"\t"+j.getSal());
		}		
		
		ArrayList<Emp5> elist = dao.getEmpList5(1500);
		for(Emp5 e:elist) {
			System.out.println(e.getEname() + "\t" + e.getGrade() + "\t" + e.getSal());
		}
		
		ArrayList<Max> mlist = dao.getMaxList(1);
		for(Max m:mlist) {
			System.out.println(m.getQuarter() + "\t" + m.getMax());
		}
		
		ArrayList<Emp> list = dao.getEmpList(7369);
		for(Emp e:list) {
			System.out.println(e.getEmpno() + "\t" + e.getEname());
		}
	}
	/*
	 jsp 로딩
	 1. import VO, ArrayList, dao
	 2. table 화면 구성
	 	데이터 list 구문 tr 부분 반복처리..
	 * */
}
