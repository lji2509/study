package javaexp.a01_start;

import java.util.Scanner;

public class A08_Input {

	public static void main(String[] args) {
	/*
	 # �ڹ��� �Է������� ó�����
	 1. Scanner Ȱ��
	 2. �⺻ �ڵ�
	 	Scanner sc = new Scanner(System.in);
	 	Scanner : �Է��� ó�����ִ� ��ü(����� Ŭ���� import �ʿ�)
	 	System.in : �ڹٿ��� consoleâ�� �ԷµǴ� ������ stream�������� �޾� ó���ϴ� �⺻ ��ü�� InputStream
	 	sc.nextLine() : enterŰ �Է½ñ��� �����͸� �޾Ƶ��δ�.
	 	sc.nextInt() : ������ �����͸� �Է¹޴´�.
	 	sc.nextDouble(): �Ǽ��� �����͸� �Է¹޴´�.
	 */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("�Է��� �̸��� " + name + " �Դϴ�.");
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		System.out.println("�����Ը� �Է��ϼ���.");
		double weight = sc.nextDouble();
		System.out.println("���� : " + age);
		System.out.println("������ : " + weight);
	}

}
