package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101 {

	public static void main(String[] args) {
		/*
		1. 기본 입력 형식 코드를 기술하고, 가계부를 기준으로
		 현재 잔액이 100000원 일 때, 날짜, 수입지출구분, 내용, 금액 입력받아
		 날짜, 수입지출구분, 내용, 금액, 처리후잔액을 출력하세요.
		2. 자바에서 사용되는 괄호의 종류를 기술하고, 사용방법을 정리하세요.
		3. 변수명 중복 선언 사용시, 나타나는 에러 내용과 처리 방법을 기술하세요.
		4. 배열의 선언과 할당 유형을 기술하세요.
		5. 배열로 좋아하는 가수 3명, 노래명 3개를 선언하여 출력하세요.
		6. 증감연산자에서 확장한 증감대입연산자란 무엇인지 예제를 통해서 기술하세요.
		7. 배열은 크기를 넘어서 index를 선언한다는 말이 어떤 경우인지 기술하세요.
		8. primitive data 타입(기본데이터 유형)으로 리턴되는 메서드를 기술하고, 실제 코드를 나열하세요.
		9. 상속의 기본형식을 기술하세요.
		*/
		
		System.out.println("과제1");
		int tot = 100000;
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.(YY/DD/MM 형식으로 입력하세요.)");
		String date = scan.nextLine();
		System.out.println("수입지출구분을 입력하세요.(\"지출\" 또는 \"수입\" 으로 입력하세요)");
		String d = scan.nextLine();
		System.out.println("내용을 입력하세요.");
		String text = scan.nextLine();
		System.out.println("금액을 입력하세요.");
		int price = scan.nextInt();
		System.out.println("날짜\t수입지출구분\t내용\t금액\t처리후금액");
		if(d.equals("지출")) {
			System.out.println(date+"\t"+d+"\t"+text+"\t"+price+"\t"+(tot-price));
			} else if(d.equals("수입")){
				System.out.println(date+"\t"+d+"\t"+text+"\t"+price+"\t"+(tot+price));
			} else {
				System.out.println("다시 입력하세요.");
			}
		
		System.out.println();
		System.out.println("과제2");
		System.out.println("자바에서 사용하는 괄호에는 [](대괄호), {}(중괄호), ()(소괄호)가 있다."
				+ "[]는 주로 배열의 인덱스부분으로 호출할 때 사용하며, "
				+ "{}는 중괄호, 클래스명, 생성자, 메서드에 범위를 지정하고, 조건, 반복문에서 주로 활용하며,"
				+ "()는 매개변수를 입력처리할 때 사용한다.");
		
		System.out.println();
		System.out.println("과제3");
		System.out.println("변수명 중복 선언 시 'duplicate local variales'이라는 에러가 발생한다."
				+ "변수명이 같은 변수가 선언되어 발생한 에러이므로 변수명을 변경해주면 된다.");
		
		System.out.println();
		System.out.println("과제4");
		System.out.println("배열의 선언은 '데이터타입[] 배열명' 또는 '데이터타입 배열명[]으로 선언이 가능하다.\n"
				+ "'데이터타입[] 변수명 = new 데이터타입[길이]'로 배열을 생성하며, "
				+ "'데이터타입[] 변수명 = {값1, 값2, 값3..}' 또는 '변수명 = new 데이터타입[]{값1, 값2, 값3}' 의 방식으로 값을 바로 선언하여 배열 생성도 가능하다.\n"
				+ "또, 'String strArray[] = null'으로 배열의 초기화도 가능하다.");
		
		System.out.println();
		System.out.println("과제5");
		String[] artist = {"트와이스", "오마이걸", "아이즈원"};
		String[] song = {"More & More", "Dun  Dun Dance", "D-D-Dance"};
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + ". 좋아하는 가수는 " + artist[i] + "이고, 좋아하는 노래는 " + song[i] + "입니다.");
		}
		
		System.out.println();
		System.out.println("과제6");
		System.out.println("증감대입연산자란 'sum = sum + 2'와 같이 증감하여 대입하는 연산을 'sum +=2'와 같이 간소화시킨 것이다.");
		
		System.out.println();
		System.out.println("과제7");
		System.out.println("배열이 'int[] age = new int[3]'과 같이 3개를 선언하여 값을 할당했을 때, 'int age[3]'과 같이 인덱스를 초과한 배열은 호출할 수 없으므로 에러가 발생한다."
				+ "배열에서 인덱스는 0부터 시작하기 때문에 3개를 선언하였을 때는 'int age[0]'부터 'int age[2]'까지만 호출할 수 있다.");
		
		System.out.println();		
		System.out.println("과제8");
		System.out.println("정수형 'byte, short, int, long, char'가 있고, 실수형 'float, double', boolean형 'treu, flase'가 있다");

//		static int getEmpno(int bun) {
//			return bun;
//		}
//		
//		static String getEname(String name) {
//			return name;
//		}
//		
//		static double getWeight(double weight) {
//			return weight;
//		}
//		
//		public static void main(String[] args) {
//			
//			System.out.println("사원번호는 " + getEmpno(8) + "입니다.");
//			System.out.println("사원의 이름은 " + getEname("홍길동") + "입니다.");
//			System.out.println("몸무게는 " + getWeight(57.4) + "입니다.");
//		}

		System.out.println();
		System.out.println("과제9");
		System.out.println("상속은 extends를 이용하여 예를들어 상위클래스 Father의 속성을 하위클래스인 Son이 사용하고 싶을때 'class Son extends Father{}'을 이용하여 상위클래스의 속성을 하위클래스가 사용할 수 있다.");
	}

}
