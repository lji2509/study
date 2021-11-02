package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101_2 {
	//기본유형 byte, short, char, int, long, double, boolean
	static byte getByte() {
		return 25;
	}
	static short getShort() {
		return 35;
	}
	static char getChar() {
		return 'A';
	}
	static int getInt() {
		return 10000;
	}
	static long getlong() {
		return 4225L;
	}
	static float getfloat() {
		return 342.25F;
	}
	static double getDouble() {
		return 2433.22;
	}
	static boolean getBoolean() {
		return true;
	}


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
			
		//과제4
			String[] array = null;
			String array2[] = new String[3];
			array = new String[] {"사과", "딸기", "바나나"};
			array2[0] = "홍길동";
			array2[1] = "김길동";
			array2[2] = "신길동";
			String array3[] = {"오렌지", "수박", "딸기"};
			
		//과제5
			String[] singers = {"이무진", "MSG워너비", "정동하"};
			String[] musics = {"신호등","바라만본다","추억은만남보다 이별에 남아"};
			System.out.println(singers[0] + " : " + musics[0]);
			System.out.println(singers[1] + " : " + musics[1]);
			System.out.println(singers[2] + " : " + musics[2]);
			
		//과제6
			int no = 1;
			no++;
			no += 3;
			System.out.println("현재 no의 데이터 : " + no);
			
		//과제7
			//초기에 배열의 크기가 지정되었는데
			int[] array4 = new int[3];
//			array4[2]=25; // 배열의 크기(array.length)는 3이지만, index는 0, 1, 2까지만 할당이 가능하다. index3은 배열의 크기가 4일 때 가능하다.
			
		//과제8
			System.out.println("메서드 호출 : " + getByte());
			System.out.println("메서드 호출 : " + getBoolean());
			System.out.println("메서드 호출 : " + getChar());
			

			
		//과제9
//			class 상위클래스 {
//				구성요소
//			}
//			class 하위클래스 extends 상위클래스 {
//				
//			
//			}
	}
}
