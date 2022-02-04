package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a01_service.A02_DeptService;

@Controller
public class A02_DeptController {
	
	@Autowired
	private A02_DeptService sv;
	
	@RequestMapping("/deptList.do")
	public String deptList(String dname, Model d) {
		d.addAttribute("deptlist", sv.getDeptList(dname));
		return "WEB-INF\\views\\a02_mvc\\a02_deptList.jsp";
	}
}
