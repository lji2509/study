package javaexp.a02_middle.a01_access;

import javaexp.a02_middle.a02_access.Person;

public class A01_AccessModifier {

	public static void main(String[] args) {
		//1. ���� ��Ű���� �ִ� Ŭ������ �����Ӱ� ȣ���� �����ϴ�.
		Product p1 = new Product();
		System.out.println("pirce�� ���� ��Ű������ ���� ���� : " + p1.price);
//		System.out.println("name�� private�� ���� �Ұ��� : " + p1.name);
		//2. �ٸ� ��Ű���� �ִ� Ŭ������ ���������ڰ� public�̾�� �ϰ�, �ܺ� ��Ű���� ��쿡�� import�� �Ͽ��� �Ѵ�.
		Person ps = new Person();
		System.out.println("# �ܺο� �ִ� ��Ű���� �ʵ� ���� #");
		//System.out.println("name : " + ps.name); private �̱⿡ �ش� Ŭ���������� ��� ����
		//System.out.println("age : " + ps.age); default�� ���� ��Ű������ ȣ�� ����
		System.out.println("loc : " + ps.loc); //public�� �ܺ� ��Ű������ ���� ����

		
	}

}
/*
# ���� ������
1. ������ ������ �����Ͽ� Ŭ����, ������, �޼���, �ʵ忡 ������ ������ �� �ִ� Ű���带 �ٿ��� ó���ϴ� ���� ���Ѵ�.
2. ���������ڴ� �Ϲ������� �Ʒ��� ����.
	1) private : �ܺ� Ŭ�������� ���� ���ϰ� ó��, ���� Ŭ���� �������� ��� ����
	2) default : ������� ���� ���, ��Ű�� �������� ���� ����
	3) protected : ���� ��Ű�� �� �Ǵ� ��Ӱ����� �ܺ� ��Ű������ ���� ����
	4) public : ��� ���� ����

*/