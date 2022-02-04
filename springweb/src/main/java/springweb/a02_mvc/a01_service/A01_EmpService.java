package springweb.a02_mvc.a01_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_EmpDao;
import springweb.vo.Emp;

@Service
public class A01_EmpService {
	//A01_EmpDao 인터페이스로 선언한 내용을 상속한 실제 객체가 컨테이너에서 생성되어 있을 때 사용
	@Autowired
	private A01_EmpDao dao;
	
	public ArrayList<Emp> getEmpList(Emp sch) {
		//controller	empList.do
		//요청값으로 초기화면일 때, null을 ""으로 처리
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		
		dao.getCount(10);
		dao.getJobCount("A");		
		
		System.out.println("데이터건수(dept-emp) : " + dao.getDeptEmp().size());
		System.out.println("데이터건수(emp-salgrade) : " + dao.getEmpSalgrade().size());
		
		return dao.getEmpList(sch);
	}
	
	public ArrayList<Emp> getEmpList2(int empno) {
		return dao.getEmpList2(empno);
	}
	
	public ArrayList<String> getEnames(int deptno) {
		System.out.println("데이터 건수 : " + dao.getEnames(deptno).size());
		return dao.getEnames(deptno);
	}
	
	public ArrayList<Integer> getEmpnos(String job) {
		System.out.println("데이터 건수 : " + dao.getEmpnos(job));
		return dao.getEmpnos(job);
	}
}
