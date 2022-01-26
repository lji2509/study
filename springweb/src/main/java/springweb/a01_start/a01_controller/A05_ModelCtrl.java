package springweb.a01_start.a01_controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.vo.*;

//springweb.a01_start.a01_controller.A05_ModelCtrl

@Controller
public class A05_ModelCtrl {
	
	@RequestMapping("/modelExp1.do")
	public String modelExp1(Model d) {
		//# model 처리
		//1. view단에 전달할 핵심 데이터로 문자열, 객체를 통해서 전달 가능하다.
		//2. .addAttribute("모델명", "설정값") 형식으로 처리한다.
		d.addAttribute("var1","변수1"); //뷰단에서 호출 ${var1}
		d.addAttribute("var2",30); //${var2} ${var2+20}
		d.addAttribute("obj1",new Person("홍길동", 25, "서울"));
		//${obj1.name} ${obj1.age} ${obj.loc}
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("마길동",30,"인천"));
		plist.add(new Person("오길동",29,"대구"));
		plist.add(new Person("하길동",26,"부산"));
		d.addAttribute("list1",plist);
		// <c:forEach var="p01" items="${list1}" >
		return "WEB-INF\\views\\a05_modelexp1.jsp";
	}
	
	@RequestMapping("/modelExp2.do")
	public String modelExp2(Model d) {
		d.addAttribute("pname","사과");
		d.addAttribute("price",3000);
		d.addAttribute("cnt",2);
		d.addAttribute("player", new Player("홍길동", 0.321));
		
		return "WEB-INF\\views\\a06_modelexp2.jsp";
	}
}
