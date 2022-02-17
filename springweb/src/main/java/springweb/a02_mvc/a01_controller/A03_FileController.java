package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a02_mvc.a01_service.A03_FileService;

@Controller
public class A03_FileController {

	@Autowired
	private A03_FileService service;
	
	//http://localhost:8000/springweb/upload.do
	@GetMapping("/upload.do")
	public String uploadFrm(Model d) {
		d.addAttribute("flist", service.getFileList());
		return "WEB-INF\\views\\a02_mvc\\a03_fileUploadFrm.jsp";
	}
	
	@PostMapping("/upload.do")
	public String upload(@RequestParam("title") String title, @RequestParam("report") MultipartFile report, Model d) {
		System.out.println("내용 : " + title);
		System.out.println("파일명 : " + report.getOriginalFilename());
		d.addAttribute("msg", service.uploadFile(report));
		d.addAttribute("upFile", report.getOriginalFilename());
		d.addAttribute("flist", service.getFileList());
		//현재 등록된 파일 리스트 가져온다.
		return "WEB-INF\\views\\a02_mvc\\a03_fileUploadFrm.jsp";
	}
}
