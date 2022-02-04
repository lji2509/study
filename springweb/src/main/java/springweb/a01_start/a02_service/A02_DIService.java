package springweb.a01_start.a02_service;

import org.springframework.stereotype.Service;

@Service
public class A02_DIService {
	public String show() {
		System.out.println("서비스 객체 메서드 호출");
		return "서비스 객체 메서드 호출";
	}
}
