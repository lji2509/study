package javaexp.a02_middle;

public class A08_Inheritance {

	public static void main(String[] args) {
		Father f1 = new Father();
		System.out.println("�ƹ��� ��ü : " + f1.runningskill);
		Son s1 = new Son();
		System.out.println("#�Ƶ� ��ü#");
		System.out.println(s1.runningskill);
		System.out.println(s1.swimminskill);
		Daughter d1 = new Daughter();
		System.out.println("#�� ��ü#");
		System.out.println(d1.runningskill);
		System.out.println(d1.jumpskill);
		
		
	}

}

//����� ��ü���� ���� �������踦 ����� ȿ�������� �ڵ带 ó���ϱ� ���� ���
//1. ����� ���� ����� ���� Ŭ������ ������ ���� Ŭ������ �ٷ� ����� �� �ִ�.
class Father {
	String runningskill = "�޸��⸦ ���Ѵ�.";	
}
class Son extends Father {
	String swimminskill = "������ ���Ѵ�.";
}
class Daughter extends Father {
	String jumpskill = "���������� ���Ѵ�.";
}