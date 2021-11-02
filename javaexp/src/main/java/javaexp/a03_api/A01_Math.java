package javaexp.a03_api;

public class A01_Math {

	public static void main(String[] args) {
		/*
		# Math api Ŭ����
		1. �������� �����͸� ó�����ִ� api���� Ŭ����
		2. �޼��尡 static���� �����Ͽ�, ��ü�� �������� �ʰ� �ٷ� ��� ����
		*/
		System.out.println("Math.floor(28.75) : " + Math.floor(28.75)); //�Ҽ��� ������ �� ����
		System.out.println("Math.ceil(25.263) : " + Math.ceil(25.263)); //�Ҽ��� ������ �� �ø�
		System.out.println("Math.round(25.62) : " + Math.round(25.62)); //�ݿø��Ͽ� �������� ����
		System.out.println("Math.round(25.22) : " + Math.round(25.22)); //�ݿø��Ͽ� �������� ����
		System.out.println("Math.floor(25.75) : " + (int)Math.floor(25.75));
		//Math.floor(), Math.ceil()�� ���ϰ��� �Ǽ��̱⿡ ���������� ó���ϱ� ���ؼ��� casting �ʿ�
		/*
		3. Math.random() : 0.0 <= Math.random() < 1.0 ���� ������ �Ǽ� ����
		*/
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() : " + Math.random()*10);
		System.out.println("Math.random() : " + (int)(Math.random()*10)); //0~9
		System.out.println("Math.random() : " + (int)(Math.random()*10+1)); //1~10 
		System.out.println("Math.random() : " + (int)(Math.random()*6+1)); //1~6
		
		int team1 = (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1);
		System.out.println("��1�� ���� �ֻ��� : " + team1);
		System.out.println("��2�� ���� �ֻ��� : " + team2);
		
		if(team1>team2) {
			System.out.println("��1 ���");
		} else if(team1<team2) {
			System.out.println("��2 ���");
		} else {
			System.out.println("���º�");
		}
		
		// (int)(Math.random()*����� ��+���۹�ȣ)
		
		int a = (int)(Math.random()*2+1);
		System.out.println("1 �Ǵ� 2 : " + a);
		int b = (int)(Math.random()*5+1);
		System.out.println("1~5������ ������ �� : " + b);
		int c = (int)(Math.random()*3);
		if(c==0) {
			System.out.println("����");
		} else if(c==1) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
		
		
	}

}
