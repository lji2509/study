package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101_2 {

	public static void main(String[] args) {
		int restMoney = 100000;
		String date = null;
		String div = null;
		String content = null;
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��¥�� �Է��ϼ���(MM/DD) : ");
		date = sc.nextLine();
		System.out.println("�������ⱸ��(����/����) : " );
		div = sc.nextLine();
		System.out.println("������ �Է� : ");
		content = sc.nextLine();
		System.out.println("�ݾ��� �Է� : ");
		money = sc.nextInt();
		System.out.println("#ó�� ���#");
		System.out.println("��¥\t����\t����\t�ݾ�\t�ܾ�");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
	}
}
