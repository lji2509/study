package javaexp.a06_object.vo;

public class Product {
	//1. 필드로 물건명 선언
	private String name;
	private int price;
	//2. 생성자로 필드값 할당
	public Product(String name) {
		this.name = name;
	}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//3. 메서드로 필드값 출력
	//	접근제어자 개념으로 필드는 바로 직접적으로 읽기/쓰기를 못하게 한다.
	//	기능메서드를 통해서 읽기/쓰기는 나누어서 처리한다.
	//	ex) TV의 채널변경은 리모컨이나 특정한 인터페이스로만 가능하지, 
	//		직접적으로 내부 안에 변경 처리를 하지 못하게 한다.
	public void buy() {
		System.out.println("물건 : " + name);
	}
	public void buy2(){
		System.out.println("구매 정보");
		System.out.println("물건명 : " + name);
		System.out.println("가격 : " + price);
	}
}
