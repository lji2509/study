package javaexp.a02_middle;

public class A16_ClassExp {

	public static void main(String[] args) {
		
		Car c = new Car("산타페", 50, 1);
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();

		c.loadPerson(2);
		c.loadPerson(1);
		c.loadPerson(1);
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		c.breakCar();
	}

}

class Car{
	String kind;
	int speed;
	int loadCnt;
	
	Car() {}
	
	Car(String kind, int speed, int loadCnt) {
		this.kind = kind;
		this.speed = speed;
		this.loadCnt = loadCnt;
	}
	
	void currentSpeed() {
		System.out.println(kind + "의 현재 속도는 " + speed + "km/h 입니다.");
	}
	
	void speedUp() {
		speed += 10;
		currentSpeed();
	}
	
	void loadPerson(int cnt) {
		loadCnt+=cnt; //기존에 있는 인원에서 누적하여 할당처리
		System.out.println("방금 탑승한 인원 : " + cnt);
		System.out.println("총 탑승 인원 : " + loadCnt);
	}
	
	void speedDown() {
		speed -= 5;
		currentSpeed();
	}
	
	void breakCar() {
		speed = 0;
		currentSpeed();
		}
}