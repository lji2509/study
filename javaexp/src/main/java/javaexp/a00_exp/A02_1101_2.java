package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101_2 {

	public static void main(String[] args) {
		//과제1
		int restMoney = 100000;
		String date = null;
		String div = null;
		String content = null;
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요(MM/DD) : ");
		date = sc.nextLine();
		System.out.println("수입지출구분(수입/지출) : " );
		div = sc.nextLine();
		System.out.println("내역을 입력 : ");
		content = sc.nextLine();
		System.out.println("금액을 입력 : ");
		money = sc.nextInt();
		System.out.println("#처리 결과#");
		System.out.println("날짜\t구분\t내용\t금액\t잔액");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
//		System.out.print(restMoney+"\t");
		
		if(div.equals("수입")) {
			restMoney += money;
		} else {
			restMoney -= money;
		}
		System.out.println(restMoney+"\n");
		
		//과제2
		/* 자바에서 사용되는 괄호의 종류 및 사용방법
		소괄호() : 메서드나 생성의 매개변수를 선언/호출시
			Person(String name){}
			Person p = new Person("홍길동");
		중괄호{} : 클래스, 생성자, 메서드, 조건, 반복문
			class Person{}
			자바에서만 배열에서 데이터를 한꺼번에 입력과 할당시 사용
			String[] array = {"사과", "바나나", "딸기"};
		대괄호[] : 배열을 선언하고, index별로 데이터를 저장 호출할 때
			String[] array = null;
			array = new String[3];
			array = new String[]{"사과", "바나나", "딸기"};		
		*/
		
		//과제3
			int num1;
			//int num1=24; //선언하고 다시 데이터유형을 선언하고 같은 이름으로 선언시 오류발생
			//라인이 한 화면에서 처리되지 않고 전체 페이지가 변경되는 경우 발생
			//duplicate local variable
			num1=24; //데이터 유형을 선언하지 않으면 에러가 발생하지 않는다.
		
	}
}
