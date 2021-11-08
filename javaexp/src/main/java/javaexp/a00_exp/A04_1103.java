package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		//과제1
			/*
			클래스는 실제 객체를 만들 설계도 역할을 한다.
			코드로 만들 클래스는 컴파일 단계까지만 진행되며, 이 컴파일 된 클래스는
			main()가 있는 클래스에서 실행으로 해당 클래스를 new 생성자()형태로 호출하여 메모리에 로딩할 수 있다.
			클래스명 참조변수 = new 생성자();
			하나의 선언된 클래스에서 여러개의 객체를 생성할 수 있고, 이렇게 생성된 객체는 heap영역에 메모리를 만들고,
			참조변수에 의해서 stack영역에 heap영역의 주소값을 저장하여 처리된다.
			*/
		
		//과제2
			/*
			객체는 생성이 되면 heap영역에 메모리를 만들어 생성을 하고, 이 heap영역의 주소값을 stack영역에 참조변수로 저장한다.
			하나의 클래스를 통해서 만들어진 여러 객체들을 각각 다른 heap영역에 저장되기에 다른 주소값을 가진다.
			Person p1 = new Person();
			Person p2 = new Person();
			new Person() : 힙영역에 객체가 생성, p1, p2 참조변수로 힙엽역의 주소값을 스택영역에 저장한다. 
				ex) 도서관에 실제 책이 있는 것(힙영역에 객체가 생성), 이 책이 있는 곳을 단말기를 통해 검색해서 그 위치를 저장(스택영역에 힙영역의 위치 저장)
			*/
		
		//과제3
			/*
			class Person {
			
			 }
			 1. 클래스만 선언하여도 내부적으로 Person(){} 모양의 생성자가 default로 선언이 된다.
			 	그래서, main() 메서드를 통해서 Person p1 = new Person(); 으로 클래스의 생성자를 호출할 수 있다.
			 2. default생성자는 개발자가 추가 코딩을 통해 생성자를 선언할 때 사라진다.
			 	이 때는 선언한 생성자가 있을 때만 해당 객체가 생성자를 통해서 생성이 되고 호출이 가능하다.
			 	ex) main() 메서드
			 	Person p1 = new Person(); 와 같은 코드의 경우, 생성자를 선언하지 않을 때는 에러가 발생하지 않지만
			 	위와 같이 생성자를 매개변수가 있는 생성자를 선언했을 때 에러가 발생한다.
			 	선언하는 순간 default 생성자는 사라진다.
			 3. 기존에 매개변수가 없는 생성자도 에러없이 사용하고 싶으면, 추가하여 default생성자와 모양이 같은 매개변수가 없는 생성자를 선언하면 된다.
				class Person {
					Person(){}
					Person(String name){}
				}
			*/
		
		//과제4
			/*
			Class Person {
				String name;
				int age;
				Person(String name, int age) {
					this.name = name;
					this.age = age;
				}
				this라는 것은 객체가 생성되었을 때, 내부적으로 현재 호출된 이 객체를 지칭한다.
				this.필드, this.메서드(), this() 현재 객체의 선언된 생성자를 호출한다.
				외부에서는 참조변수로 호출하여 참조변수.멤버로 처리하지만, 객체에서는 this로 현재 생성된 이 객체를 지칭한다.
				자바에서는 조금 여유롭게 this라는 키워드를 선언하지 않아도 필드나 메서드를 지칭하지만,
				객체지향적인 프로그램에서 반드시 선언하여야 하는 경우가 많다.
			}
			Person p1 = new Person("홍길동", 25);
			p1.name;
			p1.show();
			*/
			
		//과제5
			/*
			Class Person {
				Person(){System.out.println("생성자1");}
				Person(){System.out.println("생성자2");}
				Person(String name){}
				Person(int name){}
				Person(String name, int age){}
			}
			1. 생성자는 오버로딩규칙에 의해서 여러 개를 하나의 클래스에서 선언할 수 있다.
			2. 오버로딩규칙이 있는 근본적인 이유는 외부에서 호출할 때, 다르게 식별하여 호출이 가능하기 때문이다.
			3. 생성자도 메서드도 이름이 같지만 매개변수가 다르면 다른 생성자, 다른 메서드로 식별할 수 있기 때문에 선언이 가능하다.
				Person p1 = new Person(); : 69, 70라인 둘 다 선언되어 있으면 해당 생성자로 무엇을 호출할지 구분을 할 수 없기 때문에 하나는 삭제해야 에러가 발생하지 않는다.
				Person p2 = new Person("홍길동"); : 71라인에 있는 생성자를 호출하는 것이 명백하기 때문에 같은 이름이라도 선언을 할 수 있다. 
				Person p3 = new Person(25); : 72라인을 호출하는것이 명확하기에 선언이 가능하다.
			4. 결론적으로 생성자나 메서드는 식별이 가능하게 매개변수가 선언되면 선언이 가능하고 이것을 오버로딩이라고 하는데, 
				일반적으로 매개변수의 갯수, 매개변수의 데이터유형, 매개변수의 선언 순서에 따라서 다른 생성자/메서드를 선언할 수 있는 것을 말한다.
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
		air[1].accConut(-20);
		
		System.out.println();
		
		//과제10
		System.out.println("no\t출발지\t도착지\t승객수");
		
		Bus01 b[] = new Bus01[3];
		
		b[0] = new Bus01(1, "잠실", "강남", 6);
		b[1]= new Bus01(2, "수유", "혜화", 5);
		b[2] = new Bus01(3, "용산", "왕십리", 7);
		
		b[0].loadPerson(4);
		b[1].loadPerson(6);
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
		if(loadCnt>0) {
			System.out.println("비행기에 탑승하다."); 
		} else if(loadCnt<0) {
			System.out.println("비행기에서 하차하다.");
		} else {
			System.out.println("비행기에 있습니다.(승하차인원 없음)");
		}
		this.loadCnt += loadCnt;
		System.out.println(make + " 변경인원 : " +loadCnt);
		System.out.println(make + " 현재인원 : " +this.loadCnt);
		
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
		System.out.println("# " + start + "~" + stop + " 노선 " +no + "번 버스 승차 정보 #");
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