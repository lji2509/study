package javaexp.a02_middle;

public class A15_ClassExp {

	public static void main(String[] args) {
//		Book12 b1 = new Book12();
//		Book12 b2 = new Book12();
//		Book12 b3 = new Book12();
		Book12[] b = new Book12[3];
		
		for(int i=0; i<b.length; i++) {
			b[i] = new Book12();
		}
	
		b[0].name = "ȫ�浿";
		b[0].price = 14000;
		b[1].name = "�������";
		b[1].price = 23000;
		b[2].name = "�̼���";
		b[2].price = 16000;
		
		for(int i=0; i<3; i++) {
			System.out.println("å �̸� : " +b[i].name+"\t���� : "+b[i].price+"��");
		}
		
		Book12 b1 = new Book12("�����", 10000);
		System.out.println("å �̸� : " + b1.name + "\t���� : " + b1.price + "��");
		
		Book12 a[] = new Book12[3];
		a[0] = new Book12("������", 20000);
		a[1] = new Book12("�豸", 15000);
		a[2] = new Book12("�念��", 19000);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("å �̸� : " + a[i].name + "\t���� : " + a[i].price + "��");			
		}
		
		
		
//		b1.name = "ȫ�浿";
//		b1.price = 14000;
//		b2.name = "�������";
//		b2.price = 23000;
//		b3.name = "�̼���";
//		b3.price = 16000;
//		
//		System.out.println("å �̸� : " +b1.name+", ���� : " +b1.price+"��");
//		System.out.println("å �̸� : " +b2.name+", ���� : " +b2.price+"��");
//		System.out.println("å �̸� : " +b3.name+", ���� : " +b3.price+"��");
		
	}

}
class Book12 {
	String name;
	int price;
	
	Book12(){}
	
	Book12(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
