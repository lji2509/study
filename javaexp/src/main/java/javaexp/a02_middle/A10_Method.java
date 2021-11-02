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
		return (int)45.24;
	}
	
	public static void main(String[] args) {
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