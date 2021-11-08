package javaexp.a02_middle;

public class A22_ObjectVsObject {

	public static void main(String[] args) {
		SmartMan s = new SmartMan("홍길동");
//		Phone p = new Phone("삼성");
//		s.buyPhone(p));
		s.buyPhone(new Phone("삼성"));
		s.showInfo();
		
	}

}

/* ex)사람이 소유한 폰을 1:1관계로 설정하여 처리
	1. (이름, 폰) 클래스 선언
	2. 객체 생성 SmartMan = new SmartMan("홍길동");
	3. 메서드를 통해서 외부에 객체가 생성되어 매개변수로 할당되고, 이것이 필드(Phone p1)에 할당된다.
		s.buyPhone(new Phone("삼성전자"));
	4. s.showInfo(); 를 통해서 현재 정보 출력
*/

class SmartMan {
	Phone p1;
	String name;
	
	SmartMan(String name) {
		this.name = name;
	}
	
	void buyPhone(Phone p) {
		this.p1 = p;
		System.out.println(name + " 핸드폰을 구입했습니다.");
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		if(p1 != null) { //p1이 heap영역에 객체가 생성되어 있을 때
			System.out.println("가지고 있는 핸드폰");
			p1.show();
		} else {
			System.out.println("구매한 핸드폰이 없습니다.");
		}
		
	}
}

class Phone {
	String make;
	
	Phone(String make) {
		this.make = make;
	}
	
	void show() {
		System.out.println("핸드폰 제조사 : " + make);
	}
}