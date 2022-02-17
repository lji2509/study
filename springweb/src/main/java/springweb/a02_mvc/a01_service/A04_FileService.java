package springweb.a02_mvc.a01_service;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class A04_FileService {
	
	@Value("${upload}")
	private String upload;
	
	public String uploadFile(MultipartFile mf) {
		String fname = mf.getOriginalFilename();
		File file = new File(upload+fname);
		
		String msg = "";
		
		try {
			mf.transferTo(file);
			msg = "업로드 성공";
		} catch (Exception e) {
			msg = "에러 : " + e.getMessage();
		}
		return msg;
	}
}
