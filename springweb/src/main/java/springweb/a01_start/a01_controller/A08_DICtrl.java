package springweb.a01_start.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a01_start.a02_service.A08_DIService;

@Controller
public class A08_DICtrl {

	@Autowired
	private A08_DIService sv;
	
	@GetMapping("/call8.do")
	public String call8(Model d) {
		d.addAttribute("call8",sv.call8());
		return "WEB-INF\\views\\a08_diexp.jsp";
	}
}
