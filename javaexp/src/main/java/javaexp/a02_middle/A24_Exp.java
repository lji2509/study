package javaexp.a02_middle;

public class A24_Exp {

	public static void main(String[] args) {
		Car5 c = new Car5("��Ÿ��", 40, 50);
		c.setDriver(new Driver("ȫ�浿", 31, "����"));
		c.driving();
		int speed = c.speedUp(30);
		System.out.println("���� �ӵ��� " + speed + "km/h �Դϴ�.");
		speed = c.speedDown(15);
		System.out.println("���� �ӵ��� " + speed + "km/h �Դϴ�.");
	}

}

class Car5 {
	String type;
	Driver div;
	int speed, displacement;
	
	Car5(String type, int speed, int displacement) {
		this.type = type;
		this.speed = speed;
		this.displacement = displacement;
	}
	
	void setDriver(Driver div) {
		this.div = div;
		System.out.println("��� ����");
		div.show();
	}
	
	void driving() {
		if(div != null) {
			System.out.println(type + " �� ž���ϴ�.");
			System.out.println("���� " + div.name + "�̴�.");
		} else {
			System.out.println("��簡 �������� �ʾҽ��ϴ�.");
		}
	}
	
	int speedUp(int speed) {
		System.out.println("�ӵ��� �ö����ϴ�.");
		return this.speed += speed;
	}
	
	int speedDown(int speed) {
		System.out.println("�ӵ��� ���������ϴ�.");
		return this.speed -= speed;
	}
	
}

class Driver {
	String name, address;
	int age;
	
	Driver(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void show() {
		System.out.println("����� �̸� : " + name);
		System.out.println("����� ���� : " + age);
		System.out.println("����� ��� �� : " + address);
	}
}


