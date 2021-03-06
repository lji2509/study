package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a02_mvc.a01_service.A01_EmpService;
import springweb.vo.Emp;

@Controller
public class A01_EmpController {
	
	@Autowired
	private A01_EmpService service;
	
	@RequestMapping("/empList.do")
	public String empList(Emp sch, Model d) {
		//service 객체에서 넘겨온 ArrayList<Emp>객체를 emplist라는 이름으로 모델 데이터 선언하여, ${emplist}로 뷰단에서 쓸 수 있게 해놓는다.
		//service.getEmpList(sch)
		//요청값을 vo를 통해서 DB에 전달하고, 전달된 내용의 결과를 다시 객체로 받아서 모델명 emplist 설정을 한다.
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
	
	@RequestMapping("/empList3.do")
	public String empList3(Model d) {
		d.addAttribute("emplist", service.getEmplist3());
		return "";
	}
	
	@RequestMapping("/insertEmp.do")
	public String inserEmp(Emp ins, Model d) {
		d.addAttribute("proc", "등록완료");
		System.out.println("날짜 : " + ins.getHiredateS());
		service.insertEmp(ins);
		//service
		return "WEB-INF\\views\\a02_mvc\\a01_empList.jsp"; //등록 후 처리해야 할 화면 호출
	}
	
	@RequestMapping("/emp.do")
	public String getEmpno(int empno, Model d) {
		System.out.println("상세 empno : " + empno);
		d.addAttribute("emp", service.getEmp(empno));
		return "WEB-INF\\views\\a02_mvc\\a02_empDetail.jsp";
	}
	
	@RequestMapping("/uptEmp.do")
	public String uptEmp(Emp upt, Model d) {
		d.addAttribute("proc", "수정완료");
		service.uptEmp(upt);
		//수정된 내용을 기준으로 상세화면에서 다시 확인하여야 하기에 아래와 같은 형식으로 forward 처리한다.
		return "forward:/emp.do";
	}
	
	@RequestMapping("delEmp.do")
	public String delEmp(@RequestParam("empno") int empno, Model d) {
		d.addAttribute("proc", "삭제되었습니다.");
		service.delEmp(empno);
		return "WEB-INF\\views\\a02_mvc\\a02_empDetail.jsp";
	}
}

