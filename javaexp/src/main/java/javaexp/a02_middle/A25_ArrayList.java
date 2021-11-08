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
			.set(index, "변경할데이터");
			.get(index); : 해당 데이터 가져오기
			.size() : ArrayList에 할당된 데이터 건수 가져오기
		5. 할당할 데이터 유형을 기본적으로 Object 형태의 객체가 지원하고 있다.
			ArrayList<데이터유형객체>
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
