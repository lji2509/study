package springweb.a02_mvc.a01_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A02_DeptDao;
import springweb.vo.Dept;
import springweb.vo.Dept2;

@Service
public class A02_DeptService {
	@Autowired
	private A02_DeptDao dao;
	
	public int getCount(int deptno) {
		return dao.getCount(deptno);
	}
	
	public ArrayList<Dept> getDeptName(String dname) {
		if(dname==null) dname="";
		return dao.getDeptName(dname);
	}
	
	public ArrayList<Dept2> getDpet2List() {
		System.out.println(dao.getDept2List());
		return dao.getDept2List();
	}
	public ArrayList<Dept> getDeptList(Dept sch) {
		//sch.getDname() 초기화면에서는 null
		if(sch.getDname()==null) sch.setDname("");
		if(sch.getLoc()==null) sch.setLoc("");
		return dao.getDeptList(sch);
	}
	public void insertDept(Dept ins) {
		dao.insertDept(ins);
	}
}
