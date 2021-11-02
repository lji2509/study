package javaexp.a02_middle;

public class A08_Inheritance {

	public static void main(String[] args) {
		Father f1 = new Father();
		System.out.println("아버지 객체 : " + f1.runningskill);
		Son s1 = new Son();
		System.out.println("#아들 객체#");
		System.out.println(s1.runningskill);
		System.out.println(s1.swimminskill);
		Daughter d1 = new Daughter();
		System.out.println("#딸 객체#");
		System.out.println(d1.runningskill);
		System.out.println(d1.jumpskill);
		
		
	}

}

//상속의 객체간의 서로 연관관계를 만들어 효율적으로 코드를 처리하기 위해 사용
//1. 상속의 기초 기능은 상위 클래스의 내용을 하위 클래스각 바로 사용할 수 있다.
class Father {
	String runningskill = "달리기를 잘한다.";	
}
class Son extends Father {
	String swimminskill = "수영을 잘한다.";
}
class Daughter extends Father {
	String jumpskill = "번지점프를 잘한다.";
}