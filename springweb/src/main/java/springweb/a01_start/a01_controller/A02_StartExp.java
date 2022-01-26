package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A02_StartExp {
	
	@RequestMapping("/start2.do")
	public String start2(@RequestParam("name") String name, Model d) {
		d.addAttribute("m1", "모델명 : " + name);
		
		return "WEB-INF\\views\\a02_secondView.jsp";
	}
	

}
