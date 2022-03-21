package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a02_mvc.a01_service.A04_FileService;

@Controller
public class A04_FileExpController {

	@Autowired
	private A04_FileService service;
	
	//http://localhost:8000/springweb/uploadExp.do
	@GetMapping("/uploadExp.do")
	public String uploadExpFrm() {
		return "WEB-INF\\views\\a02_mvc\\a04_fileUploadFrm.jsp";
	}
	
	@PostMapping("/uploadExp.do")
	public String uploadExp(@RequestParam("title") String title, @RequestParam("report") MultipartFile report, Model d) {
		System.out.println("제목 : " + title);
		System.out.println("첨부파일 : " + report.getOriginalFilename());
		d.addAttribute("msg", service.uploadFile(report));
		return "WEB-INF\\views\\a02_mvc\\a04_fileUploadFrm.jsp";
	}
}
