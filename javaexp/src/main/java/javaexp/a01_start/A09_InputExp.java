package javaexp.a01_start;

import java.util.Scanner;

public class A09_InputExp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����ϴ� ������ �Է��ϼ���.");
		String fruit = scan.nextLine();
		System.out.println("�Էµ� ���ϸ� : " + fruit);
		
		System.out.println("������ ������ �Է��ϼ���.");
		int price = scan.nextInt();
		System.out.println("������ ������ �Է��ϼ���.");
		int count = scan.nextInt();
		
		System.out.println("�� ����� " + (price * count) + "�� �Դϴ�.");		
	}

}
