package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		//����1
			/*
			Ŭ������ ���� ��ü�� ���� ���赵 ������ �Ѵ�.
			�ڵ�� ���� Ŭ������ ������ �ܰ������ ����Ǹ�, �� ������ �� Ŭ������
			main()�� �ִ� Ŭ�������� �������� �ش� Ŭ������ new ������()���·� ȣ���Ͽ� �޸𸮿� �ε��� �� �ִ�.
			Ŭ������ �������� = new ������();
			�ϳ��� ����� Ŭ�������� �������� ��ü�� ������ �� �ְ�, �̷��� ������ ��ü�� heap������ �޸𸮸� �����,
			���������� ���ؼ� stack������ heap������ �ּҰ��� �����Ͽ� ó���ȴ�.
			*/
		
		//����2
			/*
			��ü�� ������ �Ǹ� heap������ �޸𸮸� ����� ������ �ϰ�, �� heap������ �ּҰ��� stack������ ���������� �����Ѵ�.
			�ϳ��� Ŭ������ ���ؼ� ������� ���� ��ü���� ���� �ٸ� heap������ ����Ǳ⿡ �ٸ� �ּҰ��� ������.
			Person p1 = new Person();
			Person p2 = new Person();
			new Person() : �������� ��ü�� ����, p1, p2 ���������� �������� �ּҰ��� ���ÿ����� �����Ѵ�. 
				ex) �������� ���� å�� �ִ� ��(�������� ��ü�� ����), �� å�� �ִ� ���� �ܸ��⸦ ���� �˻��ؼ� �� ��ġ�� ����(���ÿ����� �������� ��ġ ����)
			*/
		
		//����3
			/*
			class Person {
			
			 }
			 1. Ŭ������ �����Ͽ��� ���������� Person(){} ����� �����ڰ� default�� ������ �ȴ�.
			 	�׷���, main() �޼��带 ���ؼ� Person p1 = new Person(); ���� Ŭ������ �����ڸ� ȣ���� �� �ִ�.
			 2. default�����ڴ� �����ڰ� �߰� �ڵ��� ���� �����ڸ� ������ �� �������.
			 	�� ���� ������ �����ڰ� ���� ���� �ش� ��ü�� �����ڸ� ���ؼ� ������ �ǰ� ȣ���� �����ϴ�.
			 	ex) main() �޼���
			 	Person p1 = new Person(); �� ���� �ڵ��� ���, �����ڸ� �������� ���� ���� ������ �߻����� ������
			 	���� ���� �����ڸ� �Ű������� �ִ� �����ڸ� �������� �� ������ �߻��Ѵ�.
			 	�����ϴ� ���� default �����ڴ� �������.
			 3. ������ �Ű������� ���� �����ڵ� �������� ����ϰ� ������, �߰��Ͽ� default�����ڿ� ����� ���� �Ű������� ���� �����ڸ� �����ϸ� �ȴ�.
				class Person {
					Person(){}
					Person(String name){}
				}
			*/
		
		//����4
			/*
			Class Person {
				String name;
				int age;
				Person(String name, int age) {
					this.name = name;
					this.age = age;
				}
				this��� ���� ��ü�� �����Ǿ��� ��, ���������� ���� ȣ��� �� ��ü�� ��Ī�Ѵ�.
				this.�ʵ�, this.�޼���(), this() ���� ��ü�� ����� �����ڸ� ȣ���Ѵ�.
				�ܺο����� ���������� ȣ���Ͽ� ��������.����� ó��������, ��ü������ this�� ���� ������ �� ��ü�� ��Ī�Ѵ�.
				�ڹٿ����� ���� �����Ӱ� this��� Ű���带 �������� �ʾƵ� �ʵ峪 �޼��带 ��Ī������,
				��ü�������� ���α׷����� �ݵ�� �����Ͽ��� �ϴ� ��찡 ����.
			}
			Person p1 = new Person("ȫ�浿", 25);
			p1.name;
			p1.show();
			*/
			
		//����5
			/*
			Class Person {
				Person(){System.out.println("������1");}
				Person(){System.out.println("������2");}
				Person(String name){}
				Person(int name){}
				Person(String name, int age){}
			}
			1. �����ڴ� �����ε���Ģ�� ���ؼ� ���� ���� �ϳ��� Ŭ�������� ������ �� �ִ�.
			2. �����ε���Ģ�� �ִ� �ٺ����� ������ �ܺο��� ȣ���� ��, �ٸ��� �ĺ��Ͽ� ȣ���� �����ϱ� �����̴�.
			3. �����ڵ� �޼��嵵 �̸��� ������ �Ű������� �ٸ��� �ٸ� ������, �ٸ� �޼���� �ĺ��� �� �ֱ� ������ ������ �����ϴ�.
				Person p1 = new Person(); : 69, 70���� �� �� ����Ǿ� ������ �ش� �����ڷ� ������ ȣ������ ������ �� �� ���� ������ �ϳ��� �����ؾ� ������ �߻����� �ʴ´�.
				Person p2 = new Person("ȫ�浿"); : 71���ο� �ִ� �����ڸ� ȣ���ϴ� ���� ����ϱ� ������ ���� �̸��̶� ������ �� �� �ִ�. 
				Person p3 = new Person(25); : 72������ ȣ���ϴ°��� ��Ȯ�ϱ⿡ ������ �����ϴ�.
			4. ��������� �����ڳ� �޼���� �ĺ��� �����ϰ� �Ű������� ����Ǹ� ������ �����ϰ� �̰��� �����ε��̶�� �ϴµ�, 
				�Ϲ������� �Ű������� ����, �Ű������� ����������, �Ű������� ���� ������ ���� �ٸ� ������/�޼��带 ������ �� �ִ� ���� ���Ѵ�.
			*/
		
		//����6
		Computer com = new Computer("intel", "i5-1044F", 8, 256);
		com.showInfo();
		
		System.out.println();
		
		//����7
		com.cpuChange("������ 5600x");
		
		System.out.println();
		
		//����8
		int ram = com.ramUpgrade();
		System.out.println("RAM�� " + ram + "GB�� ���׷��̵� �Ǿ����ϴ�.");
		
		System.out.println();
		
		//����9
		AirPlane[] air = new AirPlane[2];
		
		air[0] = new AirPlane("�ƽþƳ�", 120, 45);
		air[1] = new AirPlane("�����װ�", 180, 60);
		
		System.out.println("�װ���\t�ӵ�\tž�°���");
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
		
		//����10
		System.out.println("no\t�����\t������\t�°���");
		
		Bus01 b[] = new Bus01[3];
		
		b[0] = new Bus01(1, "���", "����", 6);
		b[1]= new Bus01(2, "����", "��ȭ", 5);
		b[2] = new Bus01(3, "���", "�սʸ�", 7);
		
		b[0].loadPerson(4);
		b[1].loadPerson(6);
		b[2].loadPerson(5);
	}

}
//����6
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
		System.out.println("������ : " + make);
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("HDD : " + hdd);
	}
	
//����7
	void cpuChange(String cpu) {
		System.out.println(this.cpu + "�� " + cpu + "�� ����Ǿ����ϴ�.");
		this.cpu = cpu;
	}
	
//����8
	int ramUpgrade() {
		return ram *= 2;
	}
}

//����9
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
		System.out.println(make + " �ӵ��� �����Ͽ� ���� �ӵ��� " + this.speed + "km/h �Դϴ�.");
	}
	
	void speedDown(int speed) {
		this.speed -= speed;
		System.out.println(make + " �ӵ��� �����Ͽ� ���� �ӵ��� " + this.speed + "km/h �Դϴ�.");
	}
	
	void accConut(int loadCnt) {
		if(loadCnt>0) {
			System.out.println("����⿡ ž���ϴ�."); 
		} else if(loadCnt<0) {
			System.out.println("����⿡�� �����ϴ�.");
		} else {
			System.out.println("����⿡ �ֽ��ϴ�.(�������ο� ����)");
		}
		this.loadCnt += loadCnt;
		System.out.println(make + " �����ο� : " +loadCnt);
		System.out.println(make + " �����ο� : " +this.loadCnt);
		
	}
}

//����10
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
		System.out.println("# " + start + "~" + stop + " �뼱 " +no + "�� ���� ���� ���� #");
		cnt += count;
		System.out.println(no + "�� ���� ž���� �°� �� : " + count);
		System.out.println(no + "�� ���� ���� ž�°� �� : " + cnt);
	}
}

/*
1. Ŭ������ ��ü�� ���踦 ����ϼ���.
2. �ڹ��� �޸� �� stack�� heap������ �ִµ�, ��ü�� �� �޸𸮸� ��� Ȱ���ϴ����� Ŭ����, ��ü������ ���ؼ� �����ϼ���.
3. Ŭ������ ���ؼ� ������ ������ �߿� default �����ڶ�� ������ �ִ�. �̰��� ���� ���ǰ�, �Ҹ��� �Ǵ��� ����ϼ���.
4. �����ڸ� ���ؼ� �ʵ带 �ʱ�ȭ�� ��, this�� ����ϴ� ������ ����ϼ���.
5. �����ڸ� ���� �� ������ �� �ִ�. �̷��� ���� ���� �����ڸ� ������ �� �ִ� ��Ģ�� �������� ����ϼ���.
6. ��ǻ�� Ŭ������ �����ϰ�, ��ǻ���� �Ӽ�(������, cpu, ram, hdd)�� �ʵ�� �����Ͽ� �����ڸ� ���� �Ҵ��ϰ�, showInfo()��� �޼��带 ���� ����ϼ���.
7. �� Ŭ�������� cpu�� ��ü�ϴ� �޼��带 �����Ͽ�, ������ �ǰ� ó���ϼ���.
8. �� Ŭ�������� ram�� ����� �ι質 ����Ͽ� �����͸� �����ϴ� �޼��带 �����Ͽ� ȣ���ϼ���.
9. AirPlane Ŭ������ �����Ͽ� ���ۻ�, ����ӵ�, ž�°����� �ʵ�� �����ϰ� 
	�ʱⰪ�� �����ڸ� ���ؼ� �����ϰ�, �޼���� ����ӵ��� �ø��� ó��, ����ӵ��� ������ ó���� �ϰ�, ž�°����� �Ű������� ���ؼ� ž�°��� �ο� ���� �Է¹޾Ƽ� ����ó���ǰ� �ϼ���.
	(����� �� ���� ž�°��� �¿��, �ӵ��� �ø���, �ӵ��� ������, ž�°��� ������ ó���� �ϼ���.)
10. Bus Ŭ������ ����� �ʵ�� ������ȣ, �뼱�� �����, �뼱�� ������, �°��� �����ڸ� ���ؼ� �ʱ�ȭ�ϰ� loadPerson�� ���ؼ� �Ű������� �°�����ŭ ž��
*/