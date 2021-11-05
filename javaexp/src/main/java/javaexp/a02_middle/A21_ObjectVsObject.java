package javaexp.a02_middle;

public class A21_ObjectVsObject {
/*
#��ü�� ��ü 1:1 ����
1. Ŭ���� ���ο� �ܺο� �ִ� Ŭ������ �����Ͽ� Ȱ���� �� �ִ�.
2. �̰��� ��ü�� �Ǿ��� ��, ��ü�� ��ü�� �������踦 �����Ͽ� ����� �� ó���� �Ǵ� �κ��̴�.
3. ���� ��� ������ ���� ������ �ϳ� ���� ��, ���ΰ��迡 �ִ� ��/��, ����� ������ �ִ� �ڵ���

*/
	public static void main(String[] args) {
		Fruit f1 = new Fruit("���", 3000);
		Mart m1 = new Mart("�ູ��Ʈ");
		m1.buyProduct(f1);
		System.out.println(m1.fu.name);
		
	}
}

class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class Mart {
	String name; //��Ʈ�� �̸�
	Fruit fu; //��Ʈ���� �Ǹ��ϴ� ������ ��ü
	
	Mart(String name) {
		this.name = name;
	}
	void buyProduct(Fruit fu) {
		this.fu = fu;
	}
}
