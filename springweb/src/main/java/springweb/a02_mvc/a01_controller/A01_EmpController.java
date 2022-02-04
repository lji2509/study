package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a01_service.A01_EmpService;
import springweb.vo.Emp;

@Controller
public class A01_EmpController {
	
	@Autowired
	private A01_EmpService service;
	
	@RequestMapping("/empList.do")
	public String empList(Emp sch, Model d) {
		//service 객체에서 넘겨온 ArrayList<Emp>객체를 emplist라는 이름으로 모델 데이터 선언하여, ${emplist}로 뷰단에서 쓸 수 있게 해놓는다.
		d.addAttribute("emplist", service.getEmpList(sch));
		return "WEB-INF\\views\\a02_mvc\\a01_empList.jsp";
	}
	
	@RequestMapping("/empList2.do")
	public String empList2(int empno, Model d) {
		d.addAttribute("emplist2", service.getEmpList2(empno));
		return "WEB-INF\\views\\a02_mvc\\a02_empList2.jsp";
	}
	
	@RequestMapping("/empNames.do")
	public String empNames(int deptno, Model d) {
		d.addAttribute("emplist", service.getEnames(deptno));
		return "";
	}
	
	@RequestMapping("/empNo.do")
	public String empNo(String job, Model d) {
		d.addAttribute("emplist", service.getEmpnos(job));
		return "";
	}
}
