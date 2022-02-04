package springweb.vo;

public class EmpSalgrade {
	private int empno;
	private String ename;
	private int sal;
	private String grade;
	public EmpSalgrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpSalgrade(int empno, String ename, int sal, String grade) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.grade = grade;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
