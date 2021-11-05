package javaexp.a02_middle;

public class A20_Static {

	public static void main(String[] args) {
		Buiding63.drawPay = 300000; //��ü�� ���ӵ� ������ �ƴϰ�, Ŭ������ ���ӵ� ���� Ŭ������.����
		Buiding63 b1 = new Buiding63("����", "ȫ�浿");
		Buiding63 b2 = new Buiding63("�λ�", "��浿");
		Buiding63 b3 = new Buiding63("���ֵ�", "���浿");
//		b3.drawPay = 3000000; //Ư���� ��ü�� static������ �����͸� �����ϸ�, ��� ��ü�� ������ ���� ������ ������ Ȯ�� ����
		System.out.println(b3.drawPay + "\t" + b3.loc);
		System.out.println(b2.drawPay + "\t" + b2.loc);
		System.out.println(b1.drawPay + "\t" + b1.loc);
		
		Couple c1 = new Couple("ö��","����");		
		c1.money = 100000;
		c1.cpMoney += 30000;
		
		Couple c2 = new Couple("����","����");
		c2.money = 150000;
		c2.cpMoney += 30000;
		
		System.out.println("c1�� ����");
		System.out.println("�̸� : " + c1.name);
		System.out.println("������ �ݾ� : " + c1.money);
		System.out.println("Ŀ�ð����� �ݾ� : " + c1.cpMoney);
		
		System.out.println("21�� ����");
		System.out.println("�̸� : " + c2.name);
		System.out.println("������ �ݾ� : " + c2.money);
		System.out.println("Ŀ�ð����� �ݾ� : " + c2.cpMoney);

	}
/*
# static
1. �Ϲݸ��(�ʵ�, �޼���)�� �� ��ü���� �ٸ� �޸� ����� ������ �� �ִ�. 
	������ �ִ� ������ҿ� �ٸ� �޸𸮷� ���� ������ �� �ִ�.
2. �ϳ��� Ŭ�����κ��� ��������� ��ü���� new�� ���� �����Ǵ� ��� ��ü���� ������ �����޸� ������ ����ϰ��� �� ��, static�� �ٿ��� ����� �� �ִ�.
	ex) ����(��ü)�� ���� ����������� �����ǵ���(Ŭ����)�� ����(static)�� �����ϰ� ����ǰ� �� �� ���
3. static������ ��ü�� �����ϱ⿡ ��ü �������� Ŭ������ .static���������� ����� �� �ִ�.
4. Ŭ�����κ��� ��������� ��� ��ü���� Ư���� ����(static)�� ��쿡 ������ �ʿ���Ͽ�, ������ �� �ִ� �޸𸮸� ���� ��쿡 ������ �տ� static�� �ٿ��ش�.
5. static�޼���� �����޼���� �ַ� static������ �����͸� �Է��ϰų� ������ �� ����Ѵ�.
	cf) �Ϲ� �޼���� static����, �Ϲݺ����� ���� ����� �� ������ static�޼���� static������ Ȱ���� �� �ִ� ������ ���� ����ϴ� ���̴�.
	Ŭ������.static�޼���();

*/
	
}
class Buiding63 {
	String loc;
	String owner;
	static int drawPay;
	Buiding63(String loc, String owner) {
		this.loc = loc;
		this.owner = owner;
	}
}

class Couple {
	String name, sex;
	int money;
	static int cpMoney;
	
	Couple(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
}