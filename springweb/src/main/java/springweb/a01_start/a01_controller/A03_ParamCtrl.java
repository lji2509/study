package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//springweb.a01_start.a01_controller.A03_ParamCtrl
@Controller
public class A03_ParamCtrl {
	@RequestMapping("/gogo3.do")
	//http://localhost:8000/springweb/gogo3.do?name=홍길동
	public String gogo3(@RequestParam("name") String name) {
		System.out.println("요청된 이름 : " + name);
		return "";
	}
	
	@RequestMapping("/gogo4.do")
	public String gogo4(@RequestParam("age") int age) {
		System.out.println("나이 : " + age);
		return "";
	}
	
	//http://localhost:8000/springweb/gogo6.do
	@RequestMapping("/gogo6.do")
	public String gogo6() {
		return "WEB-INF\\views\\a05_gogo.jsp";
	}
	
	//http://localhost:8000/springweb/gogo5.do?num1=25&num2=30&cal=덧셈
	@RequestMapping("/gogo5.do")
	public String gogo5(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("cal") String cal) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("연산자 : " + cal);
		
		return "WEB-INF\\views\\a05_gogo.jsp";
	}
}