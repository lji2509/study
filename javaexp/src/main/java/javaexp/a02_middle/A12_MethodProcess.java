package javaexp.a02_middle;

public class A12_MethodProcess {
	/*
	#메서드의 기능 프로세스 처리
	1. 메서드는 입력값을 통해 조건문이나 반복문을 이용하여 원하는 결과값을 프로세스로 처리하며,
		저장, 출력, 리턴 처리할 수 있다.
		ex) 자판기에 금액을 입력하고 선택을 했을 때 해당하는 물건이 나오고, 잔액도 처리하여 나오는 경우와 같이 메서드는 기능 프로세스를 중괄호{}에서 처리한다.
	*/
	static int calcuTot(int cnt) {
		System.out.println("주문한 김밥의 갯수 : " + cnt);
		int price = 2500;
		System.out.println("김밥의 단가 : " + price);
		
		return price*cnt;
	}
	
	static int appleTot(int cnt) {
		int applePrice = 2000;
		System.out.println("구매할 사과의 갯수 : " + cnt);
		System.out.println("사과의 단가 : " + applePrice);
		
		return applePrice*cnt;
	}
	
	static int productTot(String name, int price, int cnt) {
		System.out.print(name + "\t");
		System.out.print(price + "\t");
		System.out.print(cnt + "\t");
		System.out.print(price*cnt + "\n");
		
		return price*cnt;
	}
	
	static int gugudan(int dan, int gob) {
		System.out.println(dan + " * " + gob + " = " + (dan*gob));
		return dan * gob;
	}
	
	public static void main(String[] args) {
		int gobtot = 0;
		gobtot += gugudan(3, 4);
		gobtot += gugudan(2, 5);
		gobtot += gugudan(4, 6);
		
		System.out.println("총 합 : " + gobtot);
		
		int tot = 0;
		System.out.println("#물건 구매 내역#");
		tot+=productTot("사과",3000,2);
		tot+=productTot("바나나",4000,3);
		tot+=productTot("오렌지",2000,5);
		System.out.println("총비용 : " + tot + "원");
		
		int appleMoney = appleTot(4);
		System.out.println("총 비용 : " + appleMoney);
		
		int toMoney = calcuTot(3);
		System.out.println("총 비용 : " + toMoney);
		
	}

}
