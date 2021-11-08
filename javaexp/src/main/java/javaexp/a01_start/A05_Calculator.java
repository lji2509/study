package javaexp.a01_start;

public class A05_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 연산자
		1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 연산자 : 연산에 사용되는 표시나 기호(+, -, *, /, %, =, <=, ++)
		 피연산자 : 연산 대상이 되는 데이터(리터럴, 변수)
			30, 40, 50 ==> 리터럴 데이터
		  	int num1 = 25;
		  	num1 = 30;
		  연산식 : 연산자와 피연산자를 이용하여 연산의 과정을 기술하는 것
			int num1 = 30 + 25;
		# 자바의 활용 연산자듣
		1. 산술연산자(사칙연산좌와 나머지 연산자)
			1) 종류
				+, -, *, /, %
			2) 산술연산자를 처리하면 int형 이상에서 할당하여 처리할 수 있다.
				byte num1 = 25;
				byte num2 = 30;
				byte num3 = num1+num2; (x)
				int num4 = num1+num2; (o)
			3) 나눗셈의 결과값이 소숫점이하가 되려면, 피연산자가 적어도 하나는 실수이어야 한다.
			아니면, 형변환을 처리하여야 한다.
				10/3 = 3
				10/3.0 = 3.333
				10/(double)3 = 3.333
		 */
		int num1 = 25;
		int num2 = 5;
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		
		int brd=5, fru=3;
		int gom1=brd+fru, gom2=brd+fru;
		
		System.out.println("곰돌이 1 먹은 총 음식 : " + gom1);
		System.out.println("곰돌이 2 먹은 총 음식 : " + gom2);
		System.out.println("총계 : " + (gom1+gom2));
		
		int mon=1000000, bus=5000, fod=7000;
		
		System.out.println("전체금액 : " +  mon + "원, 소비금액 : " + (bus+fod) + "원, 현잔액 : " + (mon-(bus+fod)) + "원");
	}

}
