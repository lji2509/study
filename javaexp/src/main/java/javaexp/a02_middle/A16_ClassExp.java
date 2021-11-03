package javaexp.a02_middle;

public class A16_ClassExp {

	public static void main(String[] args) {
		
		Car c = new Car("��Ÿ��", 50, 1);
		
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
		System.out.println(kind + "�� ���� �ӵ��� " + speed + "km/h �Դϴ�.");
	}
	
	void speedUp() {
		speed += 10;
		currentSpeed();
	}
	
	void loadPerson(int cnt) {
		loadCnt+=cnt; //������ �ִ� �ο����� �����Ͽ� �Ҵ�ó��
		System.out.println("��� ž���� �ο� : " + cnt);
		System.out.println("�� ž�� �ο� : " + loadCnt);
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