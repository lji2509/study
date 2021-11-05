package javaexp.a00_exp;

public class A05_1104 {
	//과제1
	/*
	생성자는 객체를 생성할 때 값을 받아들여 생성자에 정의한 연산을 실행하고, 필드에 값을 할당한다.
	메서드는 반복문, 조건문 등 프로세스 동작에 관한 기능이나 출력을 하기 위한 행위를 정의하는 것이다.
	*/
	
	//과제4
	/*
	생성자 오버로딩은 매개변수의 데이터타입, 매개변수의 갯수, 매개변수의 순서를 다르게 해서 여러 개 선언하여 사용하는 것이다.
	메소드 오버로딩도 생성자 오버로딩과 같이 매개변수를 다르게 하고, 메소드의 이름도 같아야한다. 

	class Prod {
		String pname;
		int price;
		
		Prod(){}
		
		Prod(String pname) {
			this.pname = pname;
		}
		
		Prod(String pname, int price) {
			this.pname = pname;
			this.price = price;
		}
		
		생성자는 위와 같이 매개변수가 없는 기본 생성자, String을 받는 생성자, String과 int를 받는 생성자 등 매개변수에 따라 여러 생성자를 사용할 수 있다.
		
		위 예제와 같은 경우에는
		Prod p1 = new Prod();
		Prod p2 = new Prod("사과");
		Prod p3 = new Prod("딸기", 5000);
		와 같이 사용할 수 있다.
		
		String getName() {
			return "사과";
		}
		
		String getName(String name) {
			this.name = name;
			return name;
		}
		
		메소드는 위와 같이 메소드 이름을 같게하고, 매개변수만 다르게 하여 필요에 따라 사용할 수 있다.
		Prod p = new Prod();
		p.getName(); 을 하면 위 메소드가 실행되어 "사과"가 리턴되고, p.getName("딸기"); 를 하면 아래 메소드가 실행되어 "딸기"가 리턴된다.
	*/
	
	//과제5
	/*
	static 변수는 클래스에 종속되어 있는 변수이고, 일반변수는 객체에 종속되어 있는 변수이다.
	따라서 static 변수는 클래스에 종속되어 있는 변수이기 때문에 공유메모리에 값이 할당되어 객체를 여러 개 생성하여 값을 지정해도 결국 모든 객체가 같은 값을 가지게된다.
	일반 변수는 객체마다 다른 값을 가진다.
	*/
	
	public static void main(String[] args) {
		//과제3
		int tot;
		ElProduct ep = new ElProduct("전자레인지", 140000);
		tot = ep.buy();
		System.out.println("1개 구입했을 때 가격 : " + tot + "원");
		tot = ep.buy2(4);
		System.out.println(ep.cnt + "개 구입했을 때 가격 : " + tot + "원");
		tot = ep.buy3(10, 0.1);
		System.out.println("할인율 " + ep.dis + "%, " + ep.cnt + "개 구입 : " + tot + "원");
		
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
	
	int buy() {
		return price*1;
	}
	
	int buy2(int cnt) {
		this.cnt = cnt;
		return price*cnt;
	}
	int buy3(int cnt, double dis) {
		this.cnt = cnt;
		this.dis = (int)(dis*100);
		return (int)(price - price * dis);
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