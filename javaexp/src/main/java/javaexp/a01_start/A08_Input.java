package javaexp.a01_start;

import java.util.Scanner;

public class A08_Input {

	public static void main(String[] args) {
	/*
	 # 자바의 입렉데이터 처리방식
	 1. Scanner 활용
	 2. 기본 코드
	 	Scanner sc = new Scanner(System.in);
	 	Scanner : 입력을 처리해주는 객체(내장된 클래스 import 필요)
	 	System.in : 자바에서 console창에 입력되는 내용을 stream형식으로 받아 처리하는 기본 객체인 InputStream
	 	sc.nextLine() : enter키 입력시까지 데이터를 받아들인다.
	 	sc.nextInt() : 정수형 데이터를 입력받는다.
	 	sc.nextDouble(): 실수형 데이터를 입력받는다.
	 */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("입력한 이름은 " + name + " 입니다.");
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
	}

}
