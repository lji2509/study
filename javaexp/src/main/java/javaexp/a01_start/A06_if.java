package javaexp.a01_start;

public class A06_if {

	public static void main(String[] args) {
		/*
		#조건문
		1. if(비교연산자) 
		 */
		int inputPoint = 80;
		System.out.println("입력한 점수 : " + inputPoint);
		if(inputPoint>=70) {
			System.out.println("통과!!");
		}
		System.out.println("처리 끝!!");
		/*
		2. if(비교연산자) {
			비교여난자가 true일 때 처리할 부분
		} else {
			비교연산자가 true가 아닐 때 처리할 부분
		}
		 */
		int age = 25;
		System.out.println("입력한 나이 : " + age);
		if(age>=18) {
			System.out.println("성인입니다!");
		} else {
			System.out.println("미성년입니다!");
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
		System.out.println(sale + " 할인되었고, 할인 금액은 " + (int)totprice + "원이고, 총 가격은 " + (int)tot + "원 입니다.");
	
	} 

}
