package javaexp.a02_middle;

public class A24_Exp {

	public static void main(String[] args) {
		Car5 c = new Car5("산타페", 40, 50);
		c.setDriver(new Driver("홍길동", 31, "서울"));
		c.driving();
		int speed = c.speedUp(30);
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
		speed = c.speedDown(15);
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
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
		System.out.println("기사 지정");
		div.show();
	}
	
	void driving() {
		if(div != null) {
			System.out.println(type + " 차 탑승하다.");
			System.out.println("기사는 " + div.name + "이다.");
		} else {
			System.out.println("기사가 지정되지 않았습니다.");
		}
	}
	
	int speedUp(int speed) {
		System.out.println("속도가 올랐습니다.");
		return this.speed += speed;
	}
	
	int speedDown(int speed) {
		System.out.println("속도가 내려갔습니다.");
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
		System.out.println("기사의 이름 : " + name);
		System.out.println("기사의 나이 : " + age);
		System.out.println("기사의 사는 곳 : " + address);
	}
}


