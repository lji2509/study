package javaexp.a01_start;

public class A03_Declare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 #����
		 ���������� ������̸�;
		 */
		int num01; //������������ ���, �̸� num01 ���
		// ������ = �Ҵ��� ������
		num01 = 25; // num01�̶�� ������ 25 �Ҵ�
		System.out.println(num01); // num01�� �Ҵ�� ������ ���
		System.out.println("num01�� �Ҵ�� �����ʹ� " + num01 + "�Դϴ�");
	
		int price = 3000;
		int cnt = 3;
		
		System.out.println("����� ������ " + price + "���̰�, ������ ������ " + cnt + "�� �Դϴ�.");
		//��������ڿ� �� ����� ���� �����ڸ� ���� ����� �Ҵ��Ͽ� ó��
		int tot = price * cnt;
		System.out.println("�� ����� " + tot + "�� �Դϴ�.");
		
		String name = "ȫ�浿";
		System.out.println("�̸� : " + name);
		
	}

}
