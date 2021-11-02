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
		
		System.out.println("날짜를 입력하세요(MM/DD) : ");
		date = sc.nextLine();
		System.out.println("수입지출구분(수입/지출) : " );
		div = sc.nextLine();
		System.out.println("내역을 입력 : ");
		content = sc.nextLine();
		System.out.println("금액을 입력 : ");
		money = sc.nextInt();
		System.out.println("#처리 결과#");
		System.out.println("날짜\t구분\t내용\t금액\t잔액");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
	}
}
