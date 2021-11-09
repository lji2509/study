package javaexp.a02_middle;

import java.util.ArrayList;

public class A25_ArrayList {

	public static void main(String[] args) {
		/*
		# 동적배열을 처리하는 선형 ArrayList Collections
		1. 배열은 정적데이터여서 구조자체가 초기에 크기가 정해지면 변경하지 못한다.
		2. 자바에서는 Collection 하위에 선형구조로 List 인터페이스를 상속받은 ArrayList객체를 통해 동적배열을 지원하고 있다.
		3. 객체 생성
			ArrayList list = new ArrayList();
		4. 지원메서드
			.add("추가데이터");
			.add(index,"추가데이터"); : 해당 위치에 데이터 추가
			.set(index, "변경할데이터");
			.get(index); : 해당 데이터 가져오기
			.size() : ArrayList에 할당된 데이터 건수 가져오기
			.remove(index); : 해당 데이터 삭제
		5. 할당할 데이터 유형을 기본적으로 Object 형태의 객체가 지원하고 있다.
			1) 1단계 : 
				ArrayList<데이터유형객체> : 자바의 상속 구조상 최상위 객체
				ArrayList<String> : Object는 기본적으로 String을 지원한다.
			2) 2단계 : 
				여러가지 데이터 유형 처리
				- 문자열형 데이터 : ArrayList<String>
				- 정수형 데이터 : ArrayList<Integer>
				- 실수형 데이터 : ArrayList<Double>
			3) 3단계 : 
				사용자 정의 객체 유형 처리
				ArrayList<Person>
				ArrayList<Card>
				cf) 데이터베이스 테이블의 데이터는 위와 같은 형식으로 처리하여, 화면에 로딩한다.
		*/
		
		ArrayList list = new ArrayList();
		
		//추가 처리
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		list.add("멜론");
		
		//현재 크기 확인
		System.out.println(list.size());
		
		//데이터의 변경
		list.set(0,  "오렌지");
		list.set(3,  "수박");
		
		//각 데이터를 index별로 확인
		System.out.println("1번째 데이터 : " + list.get(0));
		System.out.println("2번째 데이터 : " + list.get(1));
		System.out.println("3번째 데이터 : " + list.get(2));
		System.out.println("4번째 데이터 : " + list.get(3));
		
		ArrayList food = new ArrayList();
		
		food.add("곱창");
		food.add("치킨");
		food.add("초밥");
		
		for(int i=0; i<food.size(); i++) {
			System.out.println("좋아하는 음식" + (i+1) + ": " + food.get(i));
		}
		
	}

}
