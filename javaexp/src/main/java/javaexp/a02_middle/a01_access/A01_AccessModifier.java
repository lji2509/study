package javaexp.a02_middle.a01_access;

import javaexp.a02_middle.a02_access.Person;

public class A01_AccessModifier {

	public static void main(String[] args) {
		//1. 같은 패키지에 있는 클래스는 자유롭게 호출이 가능하다.
		Product p1 = new Product();
		System.out.println("pirce는 같은 패키지에서 접근 가능 : " + p1.price);
//		System.out.println("name은 private라서 접근 불가능 : " + p1.name);
		//2. 다른 패키지에 있는 클래스는 접근제어자가 public이어야 하고, 외부 패키지인 경우에는 import를 하여야 한다.
		Person ps = new Person();
		System.out.println("# 외부에 있는 패키지의 필드 접근 #");
		//System.out.println("name : " + ps.name); private 이기에 해당 클래스에서만 사용 가능
		//System.out.println("age : " + ps.age); default는 같은 패키지에서 호출 가능
		System.out.println("loc : " + ps.loc); //public는 외부 패키지에서 접근 가능

		
	}

}
/*
# 접근 제어자
1. 접근의 범위를 지정하여 클래스, 생성자, 메서드, 필드에 접근을 제어할 수 있는 키워드를 붙여서 처리하는 것을 말한다.
2. 접근제어자는 일반적으로 아래와 같다.
	1) private : 외부 클래스에서 접근 못하게 처리, 같은 클래스 내에서만 사용 가능
	2) default : 선언되지 않은 경우, 패키지 내에서만 접근 가능
	3) protected : 같은 패키지 내 또는 상속관계의 외부 패키지까지 접근 가능
	4) public : 모두 접근 가능

*/