package springweb.a02_mvc.a01_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A02_DeptDao;
import springweb.vo.Dept;

@Service
public class A02_DeptService {
	@Autowired
	private A02_DeptDao dao;
	
	public int getCount(int deptno) {
		return dao.getCount(deptno);
	}
	
	public ArrayList<Dept> getDeptList(String dname) {
		if(dname==null) dname="";
		return dao.getDeptList(dname);
	}
}
