package springweb.a01_start.a02_service;

import org.springframework.stereotype.Service;

@Service
public class A08_DIService {
	public String call8() {
		System.out.println("call8() 호출!");
		return "안녕하세요 autowiring 연습(출력)";
	}
}
