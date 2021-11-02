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
# Ŭ������ ��ü �׸��� �������
1. Ŭ������ ��ü�� ����� ���� ���� ����
2. Ŭ������ �������
	1) ��ü�� �ٽ� �����͸� �����ϴ� field
	2) ��ü�� �ʱ� �����͸� �Ҵ��ϴ� ������
	3) ��ü�� �� ������� ó���� �ϴ� �޼���
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
