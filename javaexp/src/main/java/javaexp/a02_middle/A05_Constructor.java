package javaexp.a02_middle;

public class A05_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("ȫ�浿");
		//Product(String name)�� �����ڷ� �Ű��������� String�������� �����߱⿡
		//�Է°��� ���� �����ڸ� ����� �� ����.
		//��ü�� ��������.�ʵ������ �Ҵ��Ѵ�.
		//��ü�� ��������.�ʵ������ �����Ͽ� ����� �� �ִ�.
		System.out.println(p1.name);
		
		Bus b = new Bus("167");
		System.out.println(b.bun);

	}

}

//Ŭ���� �������2 : ������
//1. �ַ� �ʵ尪�� �Ű������� �ʱ�ȭ�Ѵ�.
//		�Ű����� : �����ڳ� �޼��忡�� �����͸� �ܺο� ���� ��, �ش� ��������������
//		������ �������� �����͸� �����ؼ�, ���� �����͸� Ȱ���� �� ����ϴ� �����̴�.
class Product {
	String name;
	Product(String name) {
		this.name = name; // �Ű������� �Ѱܿ��� ������� �ʵ���� �����ϱ� ������ �����ϱ� �� this.�ʵ�� �����Ͽ� �Ҵ�
	}
}

class Bus{
	String bun;
	Bus(String bun) {
		this.bun = bun;
	}
}