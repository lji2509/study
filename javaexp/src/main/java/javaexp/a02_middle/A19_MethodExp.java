package javaexp.a02_middle;

public class A19_MethodExp {

	public static void main(String[] args) {
		Screen sc = new Screen("�", 9000);
		int tot = sc.buy(53);
		System.out.println("�� ��� : " + tot);
		
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
		System.out.println("# ��ȭ ���� #");
		System.out.println("��ȭ�� : " + title);
		System.out.println("����� : " + price);
		System.out.println("��������� : " + cnt);
		
		return cnt*price;
	}
}
