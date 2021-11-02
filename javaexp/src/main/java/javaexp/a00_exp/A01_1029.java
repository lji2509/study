package javaexp.a00_exp;

public class A01_1029 {

	public static void main(String[] args) {
		/*
		1. 자바의 기본 변수 선언과 할당을 통해 아래의 변수를 선언하고 출력하세요.
			이름	나이	취미
		2. 변수와 사칙연산자와 나머지 연산을 활용하여 아래와 같은 내용을  처리하세요.
			1) 곰돌이 3마리가  5개씩 빵을 먹은 총 갯수
			2) 20개의 빵을 3마리의 곰돌이가 동일하게 먹은 갯수와 남은 나머지
			3) 총 잔액 100000에서 교통비 3000 2회 식대 7000, 간식비 3000을 뺀 나머지
		3. 컴퓨터 가격이 1000000이상이면 고가 그 외는 저가로  처리하기로 했다.
			해당 프로그램을 조검누에 의하여 처리하고 출력하세요.
		4. 반복문을 이용하여 15~45까지 출력하고, 10부터 discount 0까지 출력하세요.
		5. 자바의 heap영역과 stack영역에 대하여 객체의 메모리 사용 방법을 예제를 통해 기술하세요.
		 */
		
		System.out.println("과제1");
		
		String name="홍길동", hobby="드라마보기";
		int age=24;
		System.out.println("이름은 " + name + "이고, 취미는 " + hobby + "이며, 나이는 " + age + "세 입니다.");
		
		System.out.println();
		
		System.out.println("과제2-1");
		
		int bread=5, gom=3;
		System.out.println("곰돌이 " + gom + "마리가 먹은 빵의 총 갯수는 " + (gom*bread) + "개 입니다.");
		
		System.out.println();
		
		System.out.println("과제2-2");
		int bread1=20, gom1=3;
		System.out.println("곰돌이 " +gom1 + "마리가 동일하게 먹은 갯수는 " + (bread1/gom1) + "개 이고, 남은 나머지는 " + (bread1%gom1) + "개 입니다.");
		
		
		System.out.println();
		
		System.out.println("과제2-3");
		int tot=100000, bus=3000, food=7000, snack=3000;
		int sum = 100000 - (bus * 2) - food - snack;
		System.out.println("총 잔액 " + tot + "원에서 교통비, 식대, 간식비 지출하고 남은 금액은 " + sum + "원 입니다.");
		
		System.out.println();
		
		System.out.println("과제3");
		int computer=1320000;
		System.out.print("컴퓨터 가격은 " + computer + "원이며, ");
		if(computer >= 1000000) {
			System.out.println("고가입니다.");
		} else {
			System.out.println("저가입니다.");
		}
		
		System.out.println();
		
		System.out.println("과제4");
		System.out.println("# 15 ~ 45 #");
		for(int i=15; i<=45; i++) {
			if(i==45) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println("# 10 ~ 0 #");
		for(int i=10; i>=0; i--) {
			if(i==0) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		
		System.out.println();
		
		System.out.println("과제5");
		test t1 = new test();
		test t2 = new test();
		test t3 = new test();
		System.out.println("t1의 heap 영역은 " + t1 + " 입니다.");
		System.out.println("t2의 heap 영역은 " + t2 + " 입니다.");
		System.out.println("t3의 heap 영역은 " + t3 + " 입니다.");
//		객체는 heap영역에 객체를 생성하고 stack영역에 객체의 주소값을 저장한다.
//		primitive데이터는 stack영역에 바로 데이터를 할당한다.
//		new test() : 객체를 생성을 하면 heap영역에 객체가 생성이 되어 만들어진다.
//		이 heap영역의 주소값을 t1에 할당되어진다.
//		t1을 통한 주소값은 stack영역에 할당되어진다.
		
//		블럭씌워서 ctrl + / 하면 단일 주석 설정		
	}

}
class test {}
