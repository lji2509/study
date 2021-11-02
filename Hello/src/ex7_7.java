class Outer1 {
	static class Inner {
		int iv = 200;
	}
}

public class ex7_7 {
	public static void main(String[] args) {
		Outer1.Inner in = new Outer1.Inner();

		
		System.out.println(in.iv);
	}

}
