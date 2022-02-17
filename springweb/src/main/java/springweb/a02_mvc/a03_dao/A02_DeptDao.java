package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;
import springweb.vo.Dept2;
import springweb.vo.DeptSal;


@Repository
public interface A02_DeptDao {
	public int getCount(int deptno);
	public ArrayList<Dept> getDeptName(String dname);
	public DeptSal getDeptSal(int deptno);
	public ArrayList<Dept2> getDept2List();
	public ArrayList<Dept> getDeptList(Dept sch);
	public void insertDept(Dept ins);
	public void uptDept(Dept upt);
}
