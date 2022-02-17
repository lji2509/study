package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a01_service.A03_SalgradeService;

@Controller
public class A03_SalgradeController {
	
	@Autowired
	private A03_SalgradeService sv;
	
	@RequestMapping("/salList.do")
	public String salList(Model d) {
		d.addAttribute("deptlist", sv.getSalList());
		return "";
	}
	

}
