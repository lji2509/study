package javaexp.a02_middle;

public class A17_ClassExp {

	public static void main(String[] args) {
		
		System.out.println("no\t�����\t������\t�°���");
		
		Bus01 b[] = new Bus01[3];
		
		b[0] = new Bus01(1, "���", "����", 6);
		b[1]= new Bus01(2, "����", "��ȭ", 5);
		b[2] = new Bus01(3, "���", "�սʸ�", 7);
		
		System.out.println();
		
		b[0].loadPerson(4);
		b[0].loadPerson(5);
		b[0].loadPerson(2);
		
	}

}

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
		System.out.println("ž���� �°� �� : " + count);
		System.out.println("�� ž�°� �� : " + cnt);
	}
}