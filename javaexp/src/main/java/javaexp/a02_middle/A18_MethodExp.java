package javaexp.a02_middle;

public class A18_MethodExp {

	public static void main(String[] args) {
		Music2 m = new Music2("������Ÿ��");
		String name = m.getMname();
		System.out.println(name);
		
	}

}

class Music2 {
	String name;
	
	Music2() {}
	
	Music2(String name) {
		this.name = name;
	}
	
	String getMname() {
		return name;
	}
}