package javaexp.a01_start;

public class A06_if {

	public static void main(String[] args) {
		/*
		#���ǹ�
		1. if(�񱳿�����) 
		 */
		int inputPoint = 80;
		System.out.println("�Է��� ���� : " + inputPoint);
		if(inputPoint>=70) {
			System.out.println("���!!");
		}
		System.out.println("ó�� ��!!");
		/*
		2. if(�񱳿�����) {
			�񱳿����ڰ� true�� �� ó���� �κ�
		} else {
			�񱳿����ڰ� true�� �ƴ� �� ó���� �κ�
		}
		 */
		int age = 25;
		System.out.println("�Է��� ���� : " + age);
		if(age>=18) {
			System.out.println("�����Դϴ�!");
		} else {
			System.out.println("�̼����Դϴ�!");
		}
		
		int price=3000, cnt=4; 
		double tot=price*cnt, totprice=0;
		String sale;
		
		if(tot>=10000) {
			totprice = tot * 0.1;
			tot = tot-(tot*0.1);
			sale = "10%";
		} else {
			totprice = tot * 0.1;
			tot = tot-(tot*0.05);
			sale = "5%";
		}
		System.out.println(sale + " ���εǾ���, ���� �ݾ��� " + (int)totprice + "���̰�, �� ������ " + (int)tot + "�� �Դϴ�.");
	
	} 

}
