package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		//과제1
			/*
			클래스는 실제 객체 지향적인 자바 프로그램은 근간되는 Object를 만들기 위한 설계도 역할로, 클래스는 소스코드 그 자체로는 binary파일(기계언어)까지만 만들어진다.
			실행을 하려면 main()메소드가 있는 곳에서 호출하여야 하고, 클래스를 통해 생성자로 만들어진 것을 객체라고 한다.	
			즉, 클래스를 만들고 실행하면 객체가 생성된다.
			*/
		
		//과제2
			/*
			객체가 생성되면 새로운 heap영역에 이 객체가 사용하는 메모리가 할당되고, 그 heap영역의 메모리의 주소값을 참조변수에 할당하여 stack영역에 저장된다.
			Person03 p01 = new Person03(); 를 통해서 객체를 생성했을 때,
			new Person03을 통하여 heap 영역이 할당되고, 참조변수 p01는 heap영역의 메모리 주소를 stack영역에 참조명으로 할당한다.
			*/
		
		//과제3
			/*
			클래스는 모두 기본적인 생성자를 포함하는데, 이것을 default 생성자라고 한다.
			생성자는 클래스명과 동일하며, 개발자가 정의하여 생성자를 선언할 수 있다.
			개발자가 생성자를 정의하지 않으면 가장 기본적인 실행자인 default 생성자가 실행된다.
				ex) 클래스 Person()을 실행할 때, 개발자가 정의한 생성자가 없으면 Person(){} 가 자동적으로 실행된다.
			코드에 의해 선언된 생성자가 있는 순간, 기존의 default 생성자는 사라진다.
			*/
		
		//과제4
			/*
			매개변수가 있는 생성자는 일반적으로 필드값을 초기화시킬 때 주로 사용한다.
			필드값을 초기화할 때, 매개변수와 필드명이 같은 경우에 구분하기 위해서
			this.필드명 = 매개변수명; 형식으로 매개변수로 넘어온 데이터를 필드명에 할당한다.
			*/
		
		//과제5
			/*
			생성자는 여러 생성자를 매개변수가 다르면 선언이 가능하다.
			예를 들어 Person의 생성자를 생성할 때,
			Person(String name, int age); Person(String name, double wieght);
			위와같이 생성자를 만들 때 매개변수의 타입이나 갯수가 다르면 여러 생성자를 만들 수 있다.
			*/
		
		//과제6
		Computer com = new Computer("intel", "i5-1044F", 8, 256);
		com.showInfo();
		
		System.out.println();
		
		//과제7
		com.cpuChange("라이젠 5600x");
		
		System.out.println();
		
		//과제8
		int ram = com.ramUpgrade();
		System.out.println("RAM이 " + ram + "GB로 업그레이드 되었습니다.");
		
		System.out.println();
		
		//과제9
		AirPlane[] air = new AirPlane[2];
		
		air[0] = new AirPlane("아시아나", 120, 45);
		air[1] = new AirPlane("대한항공", 180, 60);
		
		System.out.println("항공사\t속도\t탑승객수");
		for(int i=0; i<air.length; i++) {
			System.out.println(air[i].make + "\t" + air[i].speed + "\t" + air[i].loadCnt);
		}
		
		air[0].speedUp(40);
		air[1].speedUp(30);
		
		air[0].speedDown(20);
		air[1].speedDown(50);
		
		air[0].accConut(30);
		air[1].accConut(20);
		
		System.out.println();
		
		//과제10
		System.out.println("no\t출발지\t도착지\t승객수");
		
		Bus01 b[] = new Bus01[3];
		
		b[0] = new Bus01(1, "잠실", "강남", 6);
		b[1]= new Bus01(2, "수유", "혜화", 5);
		b[2] = new Bus01(3, "용산", "왕십리", 7);
		
		b[0].loadPerson(4);
		b[1].loadPerson(8);
		b[2].loadPerson(5);
	}

}
//과제6
class Computer {
	String make, cpu;
	int ram, hdd;

	Computer(String make, String cpu, int ram, int hdd) {
		this.make = make;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	void showInfo() {
		System.out.println("제조사 : " + make);
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("HDD : " + hdd);
	}
	
//과제7
	void cpuChange(String cpu) {
		System.out.println(this.cpu + "가 " + cpu + "로 변경되었습니다.");
		this.cpu = cpu;
	}
	
//과제8
	int ramUpgrade() {
		return ram *= 2;
	}
}

//과제9
class AirPlane {
	String make;
	int speed, loadCnt;
	
	AirPlane(String make, int speed, int loadCnt) {
		this.make = make;
		this.speed = speed;
		this.loadCnt = loadCnt;
	}
	
	void speedUp(int speed) {
		this.speed += speed;
		System.out.println(make + " 속도가 증가하여 현재 속도는 " + this.speed + "km/h 입니다.");
	}
	
	void speedDown(int speed) {
		this.speed -= speed;
		System.out.println(make + " 속도가 감소하여 현재 속도는 " + this.speed + "km/h 입니다.");
	}
	
	void accConut(int loadCnt) {
		this.loadCnt += loadCnt;
		System.out.println(make + " 총 탑승객 수는 " + this.loadCnt + "명 입니다.");
	}
}

//과제10
class Bus01 {
	int no, cnt;
	String start, stop;
	
	Bus01(){}
	
	Bus01(int no, String start, String stop, int cnt) {
		this.no = no;
		this.start = start;
		this.stop = stop;
		this.cnt = cnt;
		System.out.println(no+"\t"+start+"\t"+stop+"\t"+cnt);
	}
	
	void loadPerson(int count) {
		cnt += count;
		System.out.println(no + "번 버스 탑승한 승객 수 : " + count);
		System.out.println(no + "번 버스 현재 탑승객 수 : " + cnt);
	}
}

/*
1. 클래스와 객체의 관계를 기술하세요.
2. 자바의 메모리 중 stack과 heap영역이 있는데, 객체가 이 메모리를 어떻게 활용하는지를 클래스, 객체선언을 통해서 설명하세요.
3. 클래스를 통해서 선언할 생성자 중에 default 생성자라는 개념이 있다. 이것을 언제 사용되고, 소멸이 되는지 기술하세요.
4. 생성자를 통해서 필드를 초기화할 때, this를 사용하는 이유를 기술하세요.
5. 생성자를 여러 개 선언할 수 있다. 이렇게 여러 개의 생성자를 선언할 수 있는 규칙이 무엇인지 기술하세요.
6. 컴퓨터 클래스를 선언하고, 컴퓨터의 속성(제조사, cpu, ram, hdd)를 필드로 선언하여 생성자를 통해 할당하고, showInfo()기능 메서드를 통해 출력하세요.
7. 위 클래스에서 cpu를 교체하는 메서드를 선언하여, 변경이 되게 처리하세요.
8. 위 클래스에서 ram의 기능을 두배나 향상하여 데이터를 리턴하는 메서드를 선언하여 호출하세요.
9. AirPlane 클래스를 선언하여 제작사, 현재속도, 탑승객수를 필드로 선언하고 
	초기값을 생성자를 통해서 생성하고, 메서드로 현재속도를 올리는 처리, 현재속도를 내리는 처리를 하고, 탑승객수는 매개변수를 통해서 탑승객의 인원 수를 입력받아서 누적처리되게 하세요.
	(비행기 두 개가 탑승객을 태우고, 속도를 올리고, 속도는 내리고, 탑승객에 내리는 처리를 하세요.)
10. Bus 클래스를 만들고 필드로 버스번호, 노선의 출발지, 노선의 종착지, 승객수 생성자를 통해서 초기화하고 loadPerson을 통해서 매개변수의 승객수만큼 탑승
*/