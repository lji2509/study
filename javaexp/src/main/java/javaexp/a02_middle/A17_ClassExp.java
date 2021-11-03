package javaexp.a02_middle;

public class A17_ClassExp {

	public static void main(String[] args) {
		
		System.out.println("no\tÃâ¹ßÁö\tµµÂøÁö\t½Â°´¼ö");
		
		Bus01 b[] = new Bus01[3];
		
		b[0] = new Bus01(1, "Àá½Ç", "°­³²", 6);
		b[1]= new Bus01(2, "¼öÀ¯", "ÇıÈ­", 5);
		b[2] = new Bus01(3, "¿ë»ê", "¿Õ½Ê¸®", 7);
		
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
		System.out.println("Å¾½ÂÇÑ ½Â°´ ¼ö : " + count);
		System.out.println("ÃÑ Å¾½Â°´ ¼ö : " + cnt);
	}
}