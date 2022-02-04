package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.DeptEmp;
import springweb.vo.Emp;
import springweb.vo.Emp2;
import springweb.vo.EmpSalgrade;

@Repository
public interface A01_EmpDao {
	//public abstract 내부적으로 설정이 된다.
	public ArrayList<Emp> getEmpList(Emp sch);
	public int getCount(int deptno);
	public int getJobCount(String job);
	public ArrayList<Emp> getEmpList2(int empno);
	public ArrayList<Emp> getStaticsEmp(String div);
	public ArrayList<String> getEnames(int deptno);
	public ArrayList<Integer> getEmpnos(String job);
	public ArrayList<DeptEmp> getDeptEmp();
	public ArrayList<EmpSalgrade> getEmpSalgrade();
	public ArrayList<Emp2> getEmpList2();
}