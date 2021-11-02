package javaexp.a02_middle;

public class A12_MethodProcess {
	/*
	#�޼����� ��� ���μ��� ó��
	1. �޼���� �Է°��� ���� ���ǹ��̳� �ݺ����� �̿��Ͽ� ���ϴ� ������� ���μ����� ó���ϸ�,
		����, ���, ���� ó���� �� �ִ�.
		ex) ���Ǳ⿡ �ݾ��� �Է��ϰ� ������ ���� �� �ش��ϴ� ������ ������, �ܾ׵� ó���Ͽ� ������ ���� ���� �޼���� ��� ���μ����� �߰�ȣ{}���� ó���Ѵ�.
	*/
	static int calcuTot(int cnt) {
		System.out.println("�ֹ��� ����� ���� : " + cnt);
		int price = 2500;
		System.out.println("����� �ܰ� : " + price);
		
		return price*cnt;
	}
	
	static int appleTot(int cnt) {
		int applePrice = 2000;
		System.out.println("������ ����� ���� : " + cnt);
		System.out.println("����� �ܰ� : " + applePrice);
		
		return applePrice*cnt;
	}
	
	static int productTot(String name, int price, int cnt) {
		System.out.print(name + "\t");
		System.out.print(price + "\t");
		System.out.print(cnt + "\t");
		System.out.print(price*cnt + "\n");
		
		return price*cnt;
	}
	
	static int gugudan(int dan, int gob) {
		System.out.println(dan + " * " + gob + " = " + (dan*gob));
		return dan * gob;
	}
	
	public static void main(String[] args) {
		int gobtot = 0;
		gobtot += gugudan(3, 4);
		gobtot += gugudan(2, 5);
		gobtot += gugudan(4, 6);
		
		System.out.println("�� �� : " + gobtot);
		
		int tot = 0;
		System.out.println("#���� ���� ����#");
		tot+=productTot("���",3000,2);
		tot+=productTot("�ٳ���",4000,3);
		tot+=productTot("������",2000,5);
		System.out.println("�Ѻ�� : " + tot + "��");
		
		int appleMoney = appleTot(4);
		System.out.println("�� ��� : " + appleMoney);
		
		int toMoney = calcuTot(3);
		System.out.println("�� ��� : " + toMoney);
		
	}

}
