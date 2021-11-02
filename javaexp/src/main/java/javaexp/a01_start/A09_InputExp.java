package javaexp.a01_start;

import java.util.Scanner;

public class A09_InputExp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("좋아하는 과일을 입력하세요.");
		String fruit = scan.nextLine();
		System.out.println("입력된 과일명 : " + fruit);
		
		System.out.println("과일의 가격을 입력하세요.");
		int price = scan.nextInt();
		System.out.println("구매할 갯수를 입력하세요.");
		int count = scan.nextInt();
		
		System.out.println("총 비용은 " + (price * count) + "원 입니다.");		
	}

}
