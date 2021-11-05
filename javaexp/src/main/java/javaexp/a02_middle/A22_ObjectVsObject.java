package javaexp.a02_middle;

public class A22_ObjectVsObject {

	public static void main(String[] args) {
		SmartMan s = new SmartMan("ȫ�浿");
//		Phone p = new Phone("�Ｚ");
//		s.buyPhone(p));
		s.buyPhone(new Phone("�Ｚ"));
		s.showInfo();
		
	}

}

/* ex)����� ������ ���� 1:1����� �����Ͽ� ó��
	1. (�̸�, ��) Ŭ���� ����
	2. ��ü ���� SmartMan = new SmartMan("ȫ�浿");
	3. �޼��带 ���ؼ� �ܺο� ��ü�� �����Ǿ� �Ű������� �Ҵ�ǰ�, �̰��� �ʵ�(Phone p1)�� �Ҵ�ȴ�.
		s.buyPhone(new Phone("�Ｚ����"));
	4. s.showInfo(); �� ���ؼ� ���� ���� ���
*/

class SmartMan {
	Phone p1;
	String name;
	
	SmartMan(String name) {
		this.name = name;
	}
	
	void buyPhone(Phone p) {
		this.p1 = p;
		System.out.println(name + " �ڵ����� �����߽��ϴ�.");
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
		if(p1 != null) { //p1�� heap������ ��ü�� �����Ǿ� ���� ��
			System.out.println("������ �ִ� �ڵ���");
			p1.show();
		} else {
			System.out.println("������ �ڵ����� �����ϴ�.");
		}
		
	}
}

class Phone {
	String make;
	
	Phone(String make) {
		this.make = make;
	}
	
	void show() {
		System.out.println("�ڵ��� ������ : " + make);
	}
}