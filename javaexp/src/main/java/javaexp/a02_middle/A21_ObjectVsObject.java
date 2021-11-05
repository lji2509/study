package javaexp.a02_middle;

public class A21_ObjectVsObject {
/*
#��ü�� ��ü 1:1 ����
1. Ŭ���� ���ο� �ܺο� �ִ� Ŭ������ �����Ͽ� Ȱ���� �� �ִ�.
2. �̰��� ��ü�� �Ǿ��� ��, ��ü�� ��ü�� �������踦 �����Ͽ� ����� �� ó���� �Ǵ� �κ��̴�.
3. ���� ��� ������ ���� ������ �ϳ� ���� ��, ���ΰ��迡 �ִ� ��/��, ����� ������ �ִ� �ڵ���

*/
	public static void main(String[] args) {
		//������ ��ü ����
		Fruit f1 = new Fruit("���", 3000);
		//��Ʈ ��ü ����
		Mart m1 = new Mart("�ູ��Ʈ");
		//��Ʈ�� ������ ��ü �Ҵ�
		m1.buyProduct(f1);
		//������ �������� ���
		m1.showInfo();
	}
}

class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {
		System.out.println("������ �̸� : " + name);
		System.out.println("������ ���� : " + price);
	}
}

class Mart {
	String name; //��Ʈ�� �̸�
	Fruit fu; //��Ʈ���� �Ǹ��ϴ� ������ ��ü
	
	Mart(String name) {
		this.name = name;
	}
	
	void buyProduct(Fruit fu) { //Fruit fu = new Fruit("���", 3000);
		System.out.println("���Ǳ���");
		this.fu = fu; //�ᱹ, �� ��ü�� ������ �ִ� �ʵ忡 ��ü�� �Ҵ�ȴ�.
	}
	
	void showInfo() {
		System.out.println("��Ʈ�� �̸� :" + name);
		System.out.println("Fruit��ü �Ҵ� ���� : " + (fu!=null));
		//���� buyProduct()�� ���ؼ� ��ü�� �Ҵ�� ���ο� ���� Fruit��ü�� ���ó��
		//���࿡ heap������ ��ü�� �������� �ʴ� ��Ȳ�� �ش� ��ü�� �ʵ带 ȣ���ϸ� nullpointerException��� rutime������ �߻��ϱ� ������ ������ ���ǹ� Ȯ�� �� ó���Ѵ�.
		if(fu!=null) {
			System.out.println("������ ������ " + fu.name);
		} else {
			System.out.println("��Ʈ���� Fruit�� �������� ����");
		}
	}
}
