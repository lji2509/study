package javaexp.a00_exp;

import java.util.Scanner;

public class A06_1105 {
	//과제1
	/*
	컴파일과정(코드==>기계어로 변경, ctrl+s 저장) javac Person.java ==> Person.class
	실행과정(main()메서드가 있는 클래스에서 호출할 때) java Person ==> memory에 로딩과 내부적인 코딩 내용이 수행
	*/
	
	//과제2
	/*
	Sysout.out.println("마지막에 줄바꿈 출력");
	Sysout.out.print("줄바꿈 없는 출력");
	Sysout.out.println("사과\t바나나\t"); \t: 데이터와 데이터 사이에 고정 크기로 설정된 탭간격
	Sysout.out.print("안녕\n하세요\n반갑습니다.\n"); \n: 데이터와 데이터 사이에 줄바꿈 처리
	*/
	
	//과제5
	/*
	class 클래스명 {
		//종속된 구성 요소들을 탭간격을 이용하여 하위 계층이라는 것을 표시한다.
		  
		데이터타입 필드명;
		
		클래스명(){}; //생성자
		
		리턴타입 메서드명(필요시 매개변수) {
			//탭간격으로 하위 계층 표시
			
			조건문
			if(data.equals("홍길동")) {
				System.out.println("관리자");
			cf)문자열1.equals(문자열2) : 문자열1과 문자열2가 동일한지를 나타내는 기능메서드
			== : 주소값 비교로 내용 비교와 차이가 있는 경우 발생
			
			반복문
			...
		}
	클래스, 메서드, 생성자, 조건, 반복문 사용 시 계층을 탭 간격을 사용하여 구분하면 가독성이 좋아지고, 에러를 찾기 쉬워진다.
	코드는 {}단위로 계층적으로 코딩하며, 시작과 끝에 주의해야 한다.
	시작과 끝을 먼저 만들고, 필요에 따라 사이에 커서를 위치시킨 후에 enter키로 입력하여 코드 처리를 하면 에러를 줄일 수 있다.
	*/
	
	//과제9
	//소괄호() -> 단항연산자(++, --) -> 산술연산자(곱셈,나눗셈->덧셈,뺄셈) -> 비교연산자 -> 논리연산자 -> 비트논리연산자 -> 삼항연산자 -> 대입연산자
	
	//과제11
	/*
	break : 반복문을 종료처리하고 빠져나온다.
	continue : if문과 함께 반복처리시 해당 step이후는 처리하지 않고, 다음 반복단계를 수행한다.
	*/
	
	public static void main(String[] args) {
		//과제3, 과제4
		String name;
		int kor, eng, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt();
		sum = kor+eng+math;
		avg = sum/3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+(int)avg);
		
		System.out.println();
		
		//과제6
		//기본 데이터유형에는 정수형(byte, short, *int, long, char), 실수형(float, *double), boolean(true, false)가 있다.
		byte a = 127;
		short b = 9999;
		int c = 10000;
		long d = 54000;
		char e = 'A';
		float f = 2.2f;
		double g = 14.567;
		boolean h = true;
		boolean i = false;
		
		System.out.println("byte : " + a);
		System.out.println("short : " + b);
		System.out.println("int : " + c);
		System.out.println("long : " + d);
		System.out.println("char : " + e);
		System.out.println("float : " + f);
		System.out.println("double : " + g);
		System.out.println("boolean : " + h);
		System.out.println("boolean : " + i);
		
		System.out.println();
		
		//과제7
		/*
		타입캐스팅이란, 쉽게 말해 형변환이다.
		같은 데이터 타입을 할당하지 않고, 큰 데이터타입을 작은 데이터타입에 할당할 때 데이터 타입을 동일하게 하기 위해 사용한다.
		작은 데이터타입을 큰 데이터타입으로 할당할 때는 데이터의 손실이 없기 때문에 캐스팅을 할 필요가 없지만,
		큰 데이터타입을 작은 데이터타입으로 할당할 때는 데이터의 손실이 발생하여 캐스팅을 통해 강제로 데이터타입을 변환시켜주어야 한다.
		*/
		int a1 = 45;
		double a2 = a1;
		System.out.println("작은 데이터타입 ==> 큰 데이터타입 : " + a2);
		double b1 = 43.74;
//		int b2 = b1; //큰 데이터타입을 작은 데이터유형에 할당하려고 했기 때문에 에러 발생
		int b2 = (int)b1; //캐스팅을 통해 b1의 데이터타입을 강제로 int로 변환시켜 할당
		System.out.println("큰 데이터타입 ==> 작은 데이터타입 : " + b2);
		
		System.out.println();
		
		//과제8
		/*
		비교연산자(>=, <=, >, <, ==, !=)는 특정한 데이터를 비교연산자를 이용해서 true, false와 같은 boolean 값을 반환한다.
		논리연산자(&&, ||)는 두개의 비교연산식을 비교하여 &&는 두개의 비교연산식이 모두 참이면 true, 그 외는 false를 반환하고,
			||는 두개의 비교연산식이 모두 거짓이면 false를 반환하고, 그 외에는 true를 반환한다.
		*/
		int c1 = 83;
		if(c1 >= 80 && c1 < 90) {
			System.out.println("B");
		}
		
		System.out.println();
		
		//과제10
		for(int j=15; j<=50; j++) {
			if(j%3 != 0) {
				System.out.print(j + " ");
			} else {
				System.out.print("@ ");
			}
		}
		System.out.println();
		
		System.out.println();
		
		//과제12
		String[] name1 = {"홍길동", "김길동", "이길동"};
		int[] no = {1, 2, 3};
		String[] position = {"과장", "대리", "사원"};
		
		System.out.println("이름\t사원번호\t직급");
		for(int n=0; n<name1.length; n++) {
			System.out.println(name1[n]+"\t"+no[n]+"\t"+position[n]);
		}
		
		System.out.println();
		
		//과제13
		String form[] = {"◆", "♠", "♣", "♥"};
		String bunho[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		Card[] card = new Card[52];

		int cidx=0;
		
		for(int idx=0; idx<form.length; idx++) {
//			System.out.print(form[idx]);
		
			for(int jdx=0; jdx<bunho.length; jdx++) {
//				System.out.print(cidx+1 + ")" + form[idx] + bunho[jdx] + ", ");
				card[cidx] = new Card(bunho[jdx], form[idx]);
				cidx++;
			}
//			System.out.println();
		}
		for(int idx=0; idx<card.length; idx++) {
			System.out.print(idx+1 + ")");
			card[idx].show();
			if(idx==card.length-1) {
				System.out.println();
			} else {
				System.out.print(", ");				
			}
		}
				
		System.out.println();
		
		//과제14
		House house = new House("아파트");
		house.setPerson(new Person("홍길동"));
		house.showInfo();
	}

}

//과제13
class Card {
	String bunho;
	String form;
	
	Card(String bunho, String form) {
		this.bunho = bunho;
		this.form = form;
	}
	
	void show() {
		System.out.print(form + bunho);
//		System.out.println("카드 번호 : " + bunho);
//		System.out.println("카드 모양 : " + form);
	}
}

//과제14
class House {
	Person p;
	String form;
	
	House(String form) {
		this.form = form;
	}
	
	void setPerson(Person p) {
		this.p = p;
		System.out.println("집을 구매했습니다.");
	}
	
	void showInfo() {
		if(p != null) {
			System.out.println("구매자 : " + p.name);
			System.out.println("구매한 집 : " + form);
		} else {
			System.out.println("구매한 집이 없습니다.");
		}
	}
}

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}

/*
1. java컴파일과 실행과정을 Person.java를 기준으로 기술하세요.
2. 기본 출력 형태를 기술하고, 특수문자를 통한 기능처리를 하세요.
3. 변수를 지정하여, 아래와 같은 형식을 출력하세요.
	이름		국어	영어	수학	총점	평균	: 각 내용을 탭각격 설정
	홍길동	70	80	90	240	80
4. 위 출력을 Scanner객체를 통해서 데이터를 입력받아 출력하세요.
5. 계층적 블럭설정을 통해 클래스를 작성하려고 한다. 아래 내용을 포함시켜 클래스를 작성해보세요.
	클래스명, 필드명, 생성자명, 메서드명, 조건문, 반복문
6. 기본 데이터유형의 종류를 기술하고, 각 기본 데이터 유형에 데이터를 할당하여 출력하세요.
7. 타입 캐스팅이 무엇인지 기술하고, 해당 예제를 통해 출력하세요.
8. 비교연산자와 논리연산자의 차이를 기술하고, 예제로 점수가 80이상 90미만인 데이터를 B학점으로 표기하는 처리를 하세요.
9. 연산자의 우선순위를 기술하세요.
10. 15~50까지 출력하되, 3의 배수는 @표시로 출력하세요.
11. break문과 continue문의 차이를 기술하세요.
12. 사원명, 사원번호, 직책을 배열 3개로 만들어 3명의 정보를 출력하세요.
13. 카드번호와 카드모양이 필드로 있는 클래스를 선언하고, 생성자를 선언/할당하고, show()를 통해서 해당 카드번호와 모양을 출력하세요.
14. House와 Person을 1:1로 객체를 관계를 만들어 필드와 메서드를 임의로 만들어 출력처리하세요.

*/