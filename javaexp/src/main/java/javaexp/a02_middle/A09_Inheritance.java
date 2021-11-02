package javaexp.a02_middle;

public class A09_Inheritance {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(45);
		
		Bus1 b = new Bus1(7);
		
		Truck t = new Truck(314);
		
		Bus1[] c = new Bus1[3];
		
		System.out.println("속도는 " + v.speed + "km이고, 승객인원수는 " + b.cnt + "명이고, 무게는 " + t.weight + "kg 입니다.");
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
