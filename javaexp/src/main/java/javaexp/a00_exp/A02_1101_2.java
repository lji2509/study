package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101_2 {

	public static void main(String[] args) {
		//����1
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
//		System.out.print(restMoney+"\t");
		
		if(div.equals("����")) {
			restMoney += money;
		} else {
			restMoney -= money;
		}
		System.out.println(restMoney+"\n");
		
		//����2
		/* �ڹٿ��� ���Ǵ� ��ȣ�� ���� �� �����
		�Ұ�ȣ() : �޼��峪 ������ �Ű������� ����/ȣ���
			Person(String name){}
			Person p = new Person("ȫ�浿");
		�߰�ȣ{} : Ŭ����, ������, �޼���, ����, �ݺ���
			class Person{}
			�ڹٿ����� �迭���� �����͸� �Ѳ����� �Է°� �Ҵ�� ���
			String[] array = {"���", "�ٳ���", "����"};
		���ȣ[] : �迭�� �����ϰ�, index���� �����͸� ���� ȣ���� ��
			String[] array = null;
			array = new String[3];
			array = new String[]{"���", "�ٳ���", "����"};		
		*/
		
		//����3
			int num1;
			//int num1=24; //�����ϰ� �ٽ� ������������ �����ϰ� ���� �̸����� ����� �����߻�
			//������ �� ȭ�鿡�� ó������ �ʰ� ��ü �������� ����Ǵ� ��� �߻�
			//duplicate local variable
			num1=24; //������ ������ �������� ������ ������ �߻����� �ʴ´�.
		
	}
}
