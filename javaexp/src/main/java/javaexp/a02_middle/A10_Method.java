package javaexp.a02_middle;

public class A10_Method {
	//static은 객체 생성없이 사용할 수 있는 공유메모리 영역의 속성을 사용할 때 선언되는 키워드
	//1. 메서드의 구성요소
	//	1) 리턴유형
	//	2) 매개변수
	//	3) 기능 프로세스 처리
	//	4) 리턴값
	
	static String getName(String name) {
		name = name + "님^^";
		return name;
	}
	
	//1. 리턴유형은 해당 메서드를 통해서 리턴하는 값의 유형을 선언하는 것으로 리턴값에 할당할 수 있는 유형으로 선언

	static int getNum() { 
		return 15;
	}
	
	static double getWeight() {
		return 30.5;
	}
	
	
	static int getEmpno(int bun) {
		return bun;
	}
	
	static String getEname(String name) {
		return name;
	}
	
	static double getWeight(double weight) {
		return weight;
	}
	
	static double getChangeType() {
		double num1 = 25; //promote(작은 데이터가 큰 데이터유형에 할당)
		return 35;
	}
	
	static int getChangeTepe2() {
		int num2 = (int)42.24; //casting(큰 데이터를 작은 데이터유형에 할당)
//		int num3 = 42.24; //에러 발생
		return (int)45.24;
	}
	
	static int getInt2() {
		//해당 변수명을 선언하여 데이터를 리턴하는 경우가 많다.
		int num1 = 25;
		num1+=3;
		return num1;
	}
	
//	리턴값이 없는 경우
//		1. 입력값을 통해서 저장
//		2. 프로세스 처리
//		3. 화면 출력 처리
//		==> 리턴유형 void 마지막 라인에 return 삭제
	
	static void show() {
		System.out.println("출력하는 처리(리턴값 필요없음)");
	}
	
	static void show2(int num1) {
		int sum = 30;
		sum += num1;
		System.out.println("메서드에 입력된 값 : " + num1);
		System.out.println("총합계 : " +sum);
	}

	static void method1() {
		System.out.println("반갑습니다.");
	}
	
	static void method2(String name) {
		System.out.println(name + "님 안녕하세요.");
	}
	
	static int[] getArray() {
		int[] a = {100,200,300};
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = getArray();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);			
		}
		
		method1();
		method2("홍길동");
		
		show();
		show2(25);
		show2(10);
		
		
		String name1 = getName("신길동");
		System.out.println("메서드 처리후 결과값 : " + name1);
		System.out.println("메서드 처리후 결과값 : " + getName("심혜명"));
		System.out.println(getNum()+30);
		System.out.println(getWeight());
		
		System.out.println("사원번호는 " + getEmpno(8) + "입니다.");
		System.out.println("사원의 이름은 " + getEname("홍길동") + "입니다.");
		System.out.println("몸무게는 " + getWeight(57.4) + "입니다.");
	}

}