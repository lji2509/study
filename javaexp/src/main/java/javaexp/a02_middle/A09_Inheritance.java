package javaexp.a02_middle;

public class A09_Inheritance {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(45);
		
		Bus1 b = new Bus1(7);
		
		Truck t = new Truck(314);
		
		Bus1[] c = new Bus1[3];
		
		System.out.println("�ӵ��� " + v.speed + "km�̰�, �°��ο����� " + b.cnt + "���̰�, ���Դ� " + t.weight + "kg �Դϴ�.");
	}

}

class Vehicle {
	int speed;
	
	Vehicle() {}
	
	Vehicle(int speed) {
		this.speed = speed;
	}
}

class Bus1 extends Vehicle {
	int cnt;
	Bus1(int cnt) {
		this.cnt = cnt;
	}
}

class Truck extends Vehicle {
	int weight;
	
	Truck(int weight) {
		this.weight = weight;
	}
}
