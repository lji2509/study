package javaexp.a02_middle;

public class A04_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book();
		//��������.�ʵ�� = �������Ҵ�
		b1.title = "�ڹ� ����";
		b1.price = 28000;
		
		Book b2 = new Book();
		b2.title = "jsp ����";
		b2.price = 30000;
		
		System.out.println("# b1 ��ü�� ������");
		System.out.println(b1.title + " : " + b1.price);
		System.out.println("# b2 ��ü�� ������");
		System.out.println(b2.title + " : " + b2.price);
	}

}

class Book {
	String title; // ��ü�� �Ҵ��� �� �ִ� �����͸� �����ϴ� �� ==> �ʵ�
	int price;
	Book(){} //�������� �ʴ��� ����� �� �ִ� ������
}