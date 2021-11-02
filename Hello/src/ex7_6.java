class Outer {
	class Inner {
		int iv = 100;
	}
}

public class ex7_6 {
	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		System.out.println(in.iv);
		
	}

}
