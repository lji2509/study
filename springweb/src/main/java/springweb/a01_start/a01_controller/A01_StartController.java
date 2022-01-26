package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//springweb.a01_start.a01_controller.A01_StartController
@Controller
public class A01_StartController {
	//http://localhost:8000/springweb/start.do
	@RequestMapping("/start.do")
	public String start() {
		return "WEB-INF\\views\\a01_springStart.jsp";
	}
	
	
	//http://localhost:8000/springweb
	//추가되는 주소 /gogo.do를 통해서 호출된다.
	//url 호출 - http://localhost:8000/springweb/gogo.do
	@RequestMapping("/gogo.do")
	public String gogo() {
		return "WEB-INF\\views\\a03_show.jsp";
		//return ""; //view단 호출 부분 view의 소스(jsp)의 기준경로인 springweb\src\main\webapp 이후의 경로와 파일명을 적어준다.
	}
}
