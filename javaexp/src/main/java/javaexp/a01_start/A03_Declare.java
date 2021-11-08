package javaexp.a01_start;

public class A03_Declare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 #선언
		 데이터유형 사용할이름;
		 */
		int num01; //정수형데이터 사용, 이름 num01 명명
		// 변수명 = 할당할 데이터
		num01 = 25; // num01이라는 변수에 25 할당
		System.out.println(num01); // num01에 할당된 데이터 출력
		System.out.println("num01에 할당된 데이터는 " + num01 + "입니다");
	
		int price = 3000;
		int cnt = 3;
		
		System.out.println("사과의 가격은 " + price + "원이고, 구매한 갯수는 " + cnt + "개 입니다.");
		//산술연산자와 그 결과를 대입 연산자를 통해 결과를 할당하여 처리
		int tot = price * cnt;
		System.out.println("총 비용은 " + tot + "원 입니다.");
		
		String name = "홍길동";
		System.out.println("이름 : " + name);
		
	}

}
