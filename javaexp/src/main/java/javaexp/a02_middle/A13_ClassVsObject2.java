package javaexp.a02_middle;

public class A13_ClassVsObject2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(30,25);
		c1.plus();
		c1.minus();
		c1.mulit();
		c1.devide();
		Calculator c2 = new Calculator(50,5);
		c2.plus();
		c2.minus();
		c2.mulit();
		c2.devide();
	}

}

/*
# 클래스와 객체 그리고 구성요소
1. 클래스는 객체를 만들기 위한 도면 역할
2. 클래스의 구성요소
	1) 객체의 핵심 데이터를 저장하는 field
	2) 객체의 초기 데이터를 할당하는 생성자
	3) 객체의 각 기능적인 처리를 하는 메서드
*/

class Calculator {
	int num1;
	int num2;
	
	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void plus() {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	void minus() {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	void mulit() {
		System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
	}
	void devide() {
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
}
