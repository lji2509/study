package javaexp.a01_start;

public class A04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �������� �Ǽ����� ������ó��
		//2. char ������ ����
		
		int num1 = 25;
		double num2 = 30.45;
		System.out.println("������ ������ : " + num1);
		System.out.println("�Ǽ��� ������ : " + num2);

		char ch1 = 'A'; //Ȭ����ǥ�� ���� �ϳ��� �Ҵ�
		System.out.println("������ ������ : " + ch1);
		// char ==> char[](���ڿ�) ==> String ���ڿ���ü ���
		
		int code1 = 66;
		char ch2 = (char)code1; // int���� ���� char�� ����
		System.out.println("���� : " + ch2);
		
		String name = "ȫ�浿";
		int kor = 60, eng = 85, mat = 95, sum = kor+eng+mat;
		double avg = sum/3.0;
		System.out.println("�л� �̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		int papp = 3000, capp = 2;
		int pban = 4000, cban = 3;
		int pstr = 12000, cstr = 5;
		int tot = (papp*capp) + (pban*cban) + (pstr*cstr);
		double avg1 = tot / capp+cban+cstr;
		System.out.println("����� ������ " + papp + "���̰�, ����� ������ " + capp + "�� �Դϴ�.");
		System.out.println("�ٳ����� ������ " + pban + "���̰�, �ٳ����� ������ " + cban + "�� �Դϴ�.");
		System.out.println("������ ������ " + pstr + "���̰�, ������ ������ " + cstr + "�� �Դϴ�.");
		System.out.println("�� ������ " + tot + "���̰�, ����� " + avg1 + "�� �Դϴ�.");
		
		
	}

}
