package javaexp.a02_middle;

public class A15_ClassExp {

	public static void main(String[] args) {
//		Book12 b1 = new Book12();
//		Book12 b2 = new Book12();
//		Book12 b3 = new Book12();
		Book12[] b = new Book12[3];
		
		for(int i=0; i<b.length; i++) {
			b[i] = new Book12();
		}
	
		b[0].name = "홍길동";
		b[0].price = 14000;
		b[1].name = "세종대왕";
		b[1].price = 23000;
		b[2].name = "이순신";
		b[2].price = 16000;
		
		for(int i=0; i<3; i++) {
			System.out.println("책 이름 : " +b[i].name+"\t가격 : "+b[i].price+"원");
		}
		
		Book12 b1 = new Book12("장발장", 10000);
		System.out.println("책 이름 : " + b1.name + "\t가격 : " + b1.price + "원");
		
		Book12 a[] = new Book12[3];
		a[0] = new Book12("유관순", 20000);
		a[1] = new Book12("김구", 15000);
		a[2] = new Book12("장영실", 19000);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("책 이름 : " + a[i].name + "\t가격 : " + a[i].price + "원");			
		}
		
		
		
//		b1.name = "홍길동";
//		b1.price = 14000;
//		b2.name = "세종대왕";
//		b2.price = 23000;
//		b3.name = "이순신";
//		b3.price = 16000;
//		
//		System.out.println("책 이름 : " +b1.name+", 가격 : " +b1.price+"원");
//		System.out.println("책 이름 : " +b2.name+", 가격 : " +b2.price+"원");
//		System.out.println("책 이름 : " +b3.name+", 가격 : " +b3.price+"원");
		
	}

}
class Book12 {
	String name;
	int price;
	
	Book12(){}
	
	Book12(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
