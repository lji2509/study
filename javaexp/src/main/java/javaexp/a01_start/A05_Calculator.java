package javaexp.a01_start;

public class A05_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# ������
		1. �����͸� ó���Ͽ� ����� �����ϴ� ���� ���Ѵ�.
		 ������ : ���꿡 ���Ǵ� ǥ�ó� ��ȣ(+, -, *, /, %, =, <=, ++)
		 �ǿ����� : ���� ����� �Ǵ� ������(���ͷ�, ����)
			30, 40, 50 ==> ���ͷ� ������
		  	int num1 = 25;
		  	num1 = 30;
		  ����� : �����ڿ� �ǿ����ڸ� �̿��Ͽ� ������ ������ ����ϴ� ��
			int num1 = 30 + 25;
		# �ڹ��� Ȱ�� �����ڵ�
		1. ���������(��Ģ�����¿� ������ ������)
			1) ����
				+, -, *, /, %
			2) ��������ڸ� ó���ϸ� int�� �̻󿡼� �Ҵ��Ͽ� ó���� �� �ִ�.
				byte num1 = 25;
				byte num2 = 30;
				byte num3 = num1+num2; (x)
				int num4 = num1+num2; (o)
			3) �������� ������� �Ҽ������ϰ� �Ƿ���, �ǿ����ڰ� ��� �ϳ��� �Ǽ��̾�� �Ѵ�.
			�ƴϸ�, ����ȯ�� ó���Ͽ��� �Ѵ�.
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
		
		System.out.println("������ 1 ���� �� ���� : " + gom1);
		System.out.println("������ 2 ���� �� ���� : " + gom2);
		System.out.println("�Ѱ� : " + (gom1+gom2));
		
		int mon=1000000, bus=5000, fod=7000;
		
		System.out.println("��ü�ݾ� : " +  mon + "��, �Һ�ݾ� : " + (bus+fod) + "��, ���ܾ� : " + (mon-(bus+fod)) + "��");
	}

}
