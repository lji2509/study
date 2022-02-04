package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;
import springweb.vo.DeptSal;


@Repository
public interface A02_DeptDao {
	public int getCount(int deptno);
	public ArrayList<Dept> getDeptList(String dname);
	public DeptSal getDeptSal(int deptno);
}
