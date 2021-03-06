package javaexp.a02_middle;

public class A11_MethodParam {
	/*
	# 매개변수
	1. 메서드나 생성자에서 전달되어온 데이터를 받아 처리할 때 사용되는 소괄호() 안에 선언된 변수
	2. 매개변수의 데이터 유형
		1) 선언된 데이터 유형에 맞게 데이터를 전달하여야 한다.
			ex) 자판기에 지폐만 입력되게 처리했으면, 해당 입력가능한 지페만 입력하여야한다.
				동전이나 다른 수단으로는 입력이 되지 않는다.
	*/
	static void callString(String str) {
		System.out.println("문자열 데이터 매개변수 : " + str);
	}
	
	static void callInt(int num1) {
		System.out.println("입력한 숫자 : " + num1);
	}
	
	static void name(String name) {
		System.out.println("이름은 " + name + " 입니다.");
	}
	
	static void age(int age) {
		System.out.println("나이는 " + age + "세 입니다.");
	}
	
	static void weight(double weight) {
		System.out.println("몸무게는 " + weight + "kg 입니다.");
	}
	/*
	3. 매개변수의 갯수
		1) 매개변수를 호출할 때, 한번에 여러가지 데이터를 입력할 수 있다.
			이 때, "매개변수1, 매개변수2, 매개변수3" 형태로 데이터를 선언하고, 해당 갯수에 맞게 데이터를 전달하면 된다.
			ex) 자판기에 지폐를 입력하고, 번호를 선택하는 2가지 입력처리를 하는 경우가 있다.
				이렇게 1개 이상의 입력 정보를 처리할 때 활용
	*/
	static void inputAutoMachine(int money, String menu) {
		System.out.println("#자판기 입력 처리#");
		System.out.println("입력한 금액 : " + money);
		System.out.println("선택한 메뉴 : " + menu);
	}
	
	static void student(String name, int kor, int eng, int math) {
		System.out.println("학생의 이름은 " + name + "이고, 국어점수는 " + kor + "점, 영어점수는 " + eng + "점, 수학점수는 " + math + "점 입니다.");
	}
	/*
	4. 매개변수의 데이터유형에 따른 순서
	*/
	static void buyProd(String pname, int price) {
		System.out.println("#구매 정보#");
		System.out.println("구매한 물건 : " + pname);
		System.out.println("구매한 가격 : " + price);
	}
	
	static void inputArray(String[] names) {
		System.out.println("#매개변수로 배열을 입력#");
		System.out.println("배열의 갯수 : " + names.length);
		System.out.println("배열의 첫번째 데이터 : " + names[0]);
	}
	
	public static void main(String[] args) {
		String[] innames = {"홍길동", "김길동", "마길동"};
		inputArray(innames);
		
		buyProd("사과",3000);
//		buyProd(3000,"사과"); //선언된 순서에 맞게 데이터를 호출해야 한다.
		
		student("홍길동",74,85,93);
		
		inputAutoMachine(1000,"커피");
		inputAutoMachine(2000,"사이다");
		
		name("홍길동");
		age(24);
		weight(54.2);
	}

}

class Person12 {
	String getName() {
		return "홍길동";
	}
	
	void call() {
		System.out.println("안녕");
	}
}
