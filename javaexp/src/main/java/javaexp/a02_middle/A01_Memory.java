package javaexp.a02_middle;

import java.util.Scanner;

public class A01_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person();
		Person p02 = new Person();
		//Person��ü�� heap������ ����Ǵµ�, stack���������� �ش� ��ü�� �ּҸ� ����
		System.out.println("p1��ü�� heap���� �ּ� : " + p01);
		System.out.println("p2��ü�� heap���� �ּ� : " + p02);
		
		Scanner scan = new Scanner(System.in);

		
		String str = scan.nextLine();
		System.out.println(" " + str);
	}

}
class Person{} //Person Ŭ���� ����
