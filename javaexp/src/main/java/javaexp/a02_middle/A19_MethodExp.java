package javaexp.a02_middle;

public class A19_MethodExp {

	public static void main(String[] args) {
		Screen sc = new Screen("곡성", 9000);
		int tot = sc.buy(53);
		System.out.println("총 비용 : " + tot);
		
	}

}

class Screen {
	String title;
	int price, cnt;

	Screen(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	int buy(int cnt) {
		this.cnt = cnt;
		System.out.println("# 영화 구매 #");
		System.out.println("영화명 : " + title);
		System.out.println("입장료 : " + price);
		System.out.println("입장관객수 : " + cnt);
		
		return cnt*price;
	}
}
