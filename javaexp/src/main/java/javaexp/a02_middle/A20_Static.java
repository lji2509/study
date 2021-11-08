package javaexp.a02_middle;

public class A20_Static {

	public static void main(String[] args) {
		Buiding63.drawPay = 300000; //객체에 종속된 변수가 아니고, 클래스에 종속된 변수 클래스명.변수
		Buiding63 b1 = new Buiding63("서울", "홍길동");
		Buiding63 b2 = new Buiding63("부산", "김길동");
		Buiding63 b3 = new Buiding63("제주도", "마길동");
//		b3.drawPay = 3000000; //특정한 객체에 static변수를 데이터를 설정하면, 모든 객체에 영향을 미쳐 동일한 데이터 확인 가능
		System.out.println(b3.drawPay + "\t" + b3.loc);
		System.out.println(b2.drawPay + "\t" + b2.loc);
		System.out.println(b1.drawPay + "\t" + b1.loc);
		
		Couple c1 = new Couple("철수","남자");		
		c1.money = 100000;
		c1.cpMoney += 30000;
		
		Couple c2 = new Couple("영희","여자");
		c2.money = 150000;
		c2.cpMoney += 30000;
		
		System.out.println("c1의 정보");
		System.out.println("이름 : " + c1.name);
		System.out.println("수중의 금액 : " + c1.money);
		System.out.println("커플계좌의 금액 : " + c1.cpMoney);
		
		System.out.println("21의 정보");
		System.out.println("이름 : " + c2.name);
		System.out.println("수중의 금액 : " + c2.money);
		System.out.println("커플계좌의 금액 : " + c2.cpMoney);

	}
/*
# static
1. 일반멤버(필드, 메서드)를 각 객체마다 다른 메모리 기능을 수행할 수 있다. 
	가지고 있는 구성요소에 다른 메모리로 각각 수행할 수 있다.
2. 하나의 클래스로부터 만들어지는 객체들이 new를 통해 생성되는 모든 객체들이 가지는 공유메모리 영역을 사용하고자 할 때, static을 붙여서 사용할 수 있다.
	ex) 빌딩(객체)가 많이 만들어지더라도 빌딩의도면(클래스)의 가격(static)은 동일하게 적용되게 할 때 사용
3. static변수는 객체가 공유하기에 객체 생성없이 클래스명 .static변수명으로 사용할 수 있다.
4. 클래스로부터 만들어지는 모든 객체들이 특정한 변수(static)인 경우에 공유를 필요로하여, 공유할 수 있는 메모리를 만들 경우에 변수명 앞에 static을 붙여준다.
5. static메서드는 공유메서드로 주로 static변수의 데이터를 입력하거나 리턴할 때 사용한다.
	cf) 일반 메서드는 static변수, 일반변수를 같이 사용할 수 있지만 static메서드는 static변수만 활용할 수 있는 영역을 만들어서 사용하는 것이다.
	클래스명.static메서드();

*/
	
}
class Buiding63 {
	String loc;
	String owner;
	static int drawPay;
	Buiding63(String loc, String owner) {
		this.loc = loc;
		this.owner = owner;
	}
}

class Couple {
	String name, sex;
	int money;
	static int cpMoney;
	
	Couple(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
}