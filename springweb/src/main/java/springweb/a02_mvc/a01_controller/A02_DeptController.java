package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a01_service.A02_DeptService;
import springweb.vo.Dept;

@Controller
public class A02_DeptController {
	
	@Autowired
	private A02_DeptService sv;

	@RequestMapping("/deptName.do")
	public String deptName(String dname, Model d) {
		d.addAttribute("deptlist", sv.getDeptName(dname));
		return "";
	}
	
	@RequestMapping("/dept2List.do")
	public String dept2List(Model d) {
		d.addAttribute("deptlist2", sv.getDpet2List());
		return "";
	}
	
	@GetMapping("/deptList.do")
	public String deptList(Dept sch, Model d) {
		d.addAttribute("dlist", sv.getDeptList(sch));
		return "WEB-INF\\views\\a02_mvc\\a02_deptList.jsp";
	}
	
	@RequestMapping("/insertDept.do")
	public String insertDept(Dept ins, Model d) {
		d.addAttribute("proc", "등록완료");
		sv.insertDept(ins);
		return "WEB-INF\\views\\a02_mvc\\a02_deptList.jsp";
	}
}
