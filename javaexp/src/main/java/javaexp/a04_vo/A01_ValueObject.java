package javaexp.a04_vo;

public class A01_ValueObject {

	public static void main(String[] args) {
		/*
		# VO
		1. java에서 객체의 속성값이 있는 객체를 입력과 호출을 할 수 있게 처리하는 것을 말한다.
			주로 객체의 필드값을 read할 때 사용되는 개념이나, 혼용해서 입력/수정/삭제/호출 등 여러가지 개념으로 활용될 때가 많다.
		2. 기본적인 접근 제어 구조
			1) 필드는 private로 설정
				직접적인 외부 호출을 방지한다.
			2) 생성자와 메서드는 public으로 설정
				생성자를 통해서 필드값을 초기화 처리
				getXXX() : 호출하는 메서드를 통해서 필드값을 호출
				setXXX() : 저장하는 메서드를 통해서 필드값을 저장
			3) 읽기와 쓰기가 분리된 메서드를 통해 필드값을 변경하며, 데이터를 접근제어를 통해 효과적인 처리를 한다.
		*/
		
		A02_Person p1 = new A02_Person("홍길동", 25, "서울");
		p1.setAge(29);
		System.out.println("이름 : " + p1.getName());
		System.out.println("사는곳 : " + p1.getLoc());
		System.out.println("나이 : " + p1.getAge());
		
		A03_Hobby h1 = new A03_Hobby("드라마보기", 14500, "평일 저녁");
		h1.setTime("주말 낮");
		System.out.println("취미 : " + h1.getHobby());
		System.out.println("가격 : " + h1.getPrice());
		System.out.println("시간 : " + h1.getTime());
		
		A04_Screen s1 = new A04_Screen("곡성", 9000, 25);
		s1.setCnt(30);
		System.out.println("영화 제목 : " + s1.getName());
		System.out.println("영화 가격 : " + s1.getPrice());
		System.out.println("관람객 수 : " + s1.getCnt());
	}

}
