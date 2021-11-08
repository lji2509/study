package javaexp.a00_exp;

public class A05_1104 {
	//과제1
	/*
	1)객체 생성시
	생성자를 통한 데이터처리는 객체 생성시 한번만 처리할 수 있다.
	ex) Person p1 = new Person("홍길동", 25, "서울");
		p1 = new Person("신길동", 27, "부산"); //heap영역에 다른 객체가 생성이 되기에 같은 객체라고 할 수 없다.
	메서드는 계속 2번이상 호출하여 같은 객체에 데이터 변경이 가능하다.
		p1.setName("신길동");
		p1.setAge(24);
		p1.setAge(23);
	2) 리턴값 처리
		생성자는 리턴값이 없다. 주로 매개변수를 통해서 필드의 초기화를 위해서 선언하는 경우가 많다.
		메서드는 리턴값이 있다. 외부에서 호출한 데이터를 return형식으로 처리해준다.
	3) 공통
		매개변수를 통해서 데이터 처리
		오버로딩 : 매개변수의 갯수, 타입, 타입이 다른 순서
	 
	생성자는 객체를 생성할 때 값을 받아들여 생성자에 정의한 연산을 실행하고, 필드에 값을 할당한다.
	메서드는 반복문, 조건문 등 프로세스 동작에 관한 기능이나 출력을 하기 위한 행위를 정의하는 것이다.
	*/
	
	//과제4
	/*
	같은 이름을 생성자와 메서드를 정의할 수 있는 원칙이 있는데, 호출하는 곳에서 식별이 가능할 때를 말한다.
	일반적으로 매개변수의 갯수, 데이터유형, 다른 데이터유형의 순서 처리로 가능한 것을 말한다.
		void buy(){}
		void buy(int no){} 갯수
		void buy(double discount){} 데이터유형
		void buy(int no, double discount){}
		void buy(double discount, int no){} 순서
	*/
	
	//과제5
	/*
	class Build {
		String owner; //일반변수
		String loc; //일반변수 : 각 객체가 가지고 있는 메모리 영역
		static int drawPay; //static변수 : 객체가 생성되더라도 공유할 수 있는 메모리 영역
		Build(String owner, String loc) {
			this.owner = owner;
			this.loc = loc;
		}
	}
	main()
	Build b1 = new Build("홍길동", "서울");
	Build b2 = new Build("김길동", "부산");
	Build b3 = new Build("신길동", "제주");
	b1.owner;
	b1.derawPay = 100000; //하나의 객체에 static변수를 변경하면, 다른 객체에도 영향을 미치기 때문에 참조변수가 아니라 클래스변수라고 하기도 한다.
							Building.drawPay형식으로 객체생성 없이도 사용할 수 있다.
	b2.owner;
	b3.owner;
	b1.drawPay, b2.drawPay, b3.drawPay 모두가 데이터가 동일하게 처리된다.
	*/
	
	public static void main(String[] args) {
		//과제2
		Pencil p1 = new Pencil("HB", 800);
		p1.showInfo();
		System.out.println("리턴값 : " + p1.getKind());
		Pencil p2 = new Pencil("4B", 850);
		p2.showInfo();
		System.out.println("리턴값 : " + p2.getKind());
		
		System.out.println();
		
		//과제3
		int tot;
		ElProduct ep = new ElProduct("전자레인지", 140000);
		tot = ep.buy();
		System.out.println(tot + "원");
		tot = ep.buy(4);
		System.out.println(tot + "원");
//		tot = ep.buy(10, 0.1);
		System.out.println(ep.buy(10, 0.1) + "원");
		
		System.out.println();
		
		//과제6
		Friend f[] = new Friend[3];
		
		f[0] = new Friend("영희", 50000);
		f[1] = new Friend("민희", 40000);
		f[2] = new Friend("숙희", 60000);
		
		f[0].tot(20000);
		f[1].tot(15000);
		f[2].tot(25000);
		
		f[0].tot(-4000);
		f[1].tot(-8000);
		f[2].tot(-5000);
	}

}
//과제3
class ElProduct {
	String name;
	int price, cnt;
	int dis;
	
	ElProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//오버로딩
	int buy() {
		System.out.println("1개 구입했을 때 가격 : ");
		return price*1;
	}
	
	int buy(int cnt) {
		System.out.println(cnt + "개 구입했을 때 가격 : ");
		return price*cnt;
	}
	int buy(int cnt, double dis) {
		this.dis = (int)(dis*100);
		System.out.println("할인율 " + this.dis + "%, " + cnt + "개 구입 : ");
		int tot = price * cnt;
		return (int)(tot - tot * dis);
	}
}

//과제6
class Friend {
	static int totPrice;
	int price;
	String name;
	
	Friend(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void tot(int price) {
		if(price > 0) {
			this.price -= price;
			totPrice += price;
			System.out.println(name + "(공유통장에)입금 : " + price + "원");
			System.out.println(name + "(본인통장)남은 금액 : " + this.price + "원");			
			System.out.println("모인금액 : " + totPrice + "원");
		} else if(price < 0) {
			this.price += -(price);
			totPrice -= -(price);
			System.out.println(name + "(공유통장에서)출금 : " + price + "원");
			System.out.println(name + "(본인통장)남은 금액 : " + this.price + "원");			
			System.out.println("모인금액 : " + totPrice + "원");
		}
		
	}
}

//과제2
class Pencil {
	String kind;
	int price;
	
	Pencil(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
	
	String getKind() {
		return kind;
	}
	
	int getPrice() {
		return price;
	}
	
	void showInfo() {
		System.out.println("# 연필의 정보 #");
		System.out.println("종류 : " + kind);
		System.out.println("가격 : " + price);
	}
}


/*
1. 생성자와 메서드의 차이점을 기술하세요.
2. 생성자와 메서드 연습이 필요한 분들 아래 내용 필드 정하시고, 리턴값이 있는 메서드를 선언하고 객체를 만들어 호출해보세요.
		연필, 노트, 화장품, 기차, 컵, 집, 도서관
3. ElProduct(전자제품) 클래스를 선언하고, 필드는 전자제품명, 가격을 선언, 생성자로 전자제품명과 가격
	메서드는 buy1() : 하나 구매했을 때, 총 비용 리턴, buy2(갯수) : 갯수에 맞는 총 비용 리턴
	buy3(갯수, 할인율) : 갯수와 할인율을 입력받아 총 비용을 리턴하여 출력 처리하세요.
4. 생성자와 메소드의 오버로딩이란 무엇인지 예제를 통해서 기술하세요.
5. static 변수와 일반변수의 차이점을 오늘 진행한 예제와 함께 기술하세요.
6. static 변수를 활용하여 Friedn필드로 전 친구들의 공유 금액(static-내년에 함께 여름휴가 갈 돈), 이름, 본인용돈을 선언하고, 생성자로 이름 설정, 용돈과 친구와 내년에 갈 여행 경비를 입금처리하고 변경하여, 친구3명을 데이터를 변경처리하세요.
*/