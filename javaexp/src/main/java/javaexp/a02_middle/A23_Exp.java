package javaexp.a02_middle;

public class A23_Exp {
	public static void main(String[] args) {
		Com12 c = new Com12("LG");
		c.setMouse(new Mouse("blue"));
		c.showInfo();
		
	}

}

class Com12 {
	String company;
	Mouse m;

	Com12(String company) {
		this.company = company;
	}
	
	void setMouse(Mouse m) {
		this.m = m;
		System.out.println("���콺 ����");
	}
	
	void showInfo() {
		System.out.println("������ : " + company);
		if(m != null) {
			m.show();
		} else {
			System.out.println("���콺�� �������� �ʾҽ��ϴ�.");
		}
		
	}
}

class Mouse {
	String color;
	
	Mouse(String color) {
		this.color = color;
	}
	
	void show() {
		System.out.println("���콺 ���� : " + color);
	}

}