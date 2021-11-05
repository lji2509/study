package javaexp.a00_exp;

public class A05_1104 {
	//����1
	/*
	�����ڴ� ��ü�� ������ �� ���� �޾Ƶ鿩 �����ڿ� ������ ������ �����ϰ�, �ʵ忡 ���� �Ҵ��Ѵ�.
	�޼���� �ݺ���, ���ǹ� �� ���μ��� ���ۿ� ���� ����̳� ����� �ϱ� ���� ������ �����ϴ� ���̴�.
	*/
	
	//����4
	/*
	������ �����ε��� �Ű������� ������Ÿ��, �Ű������� ����, �Ű������� ������ �ٸ��� �ؼ� ���� �� �����Ͽ� ����ϴ� ���̴�.
	�޼ҵ� �����ε��� ������ �����ε��� ���� �Ű������� �ٸ��� �ϰ�, �޼ҵ��� �̸��� ���ƾ��Ѵ�. 

	class Prod {
		String pname;
		int price;
		
		Prod(){}
		
		Prod(String pname) {
			this.pname = pname;
		}
		
		Prod(String pname, int price) {
			this.pname = pname;
			this.price = price;
		}
		
		�����ڴ� ���� ���� �Ű������� ���� �⺻ ������, String�� �޴� ������, String�� int�� �޴� ������ �� �Ű������� ���� ���� �����ڸ� ����� �� �ִ�.
		
		�� ������ ���� ��쿡��
		Prod p1 = new Prod();
		Prod p2 = new Prod("���");
		Prod p3 = new Prod("����", 5000);
		�� ���� ����� �� �ִ�.
		
		String getName() {
			return "���";
		}
		
		String getName(String name) {
			this.name = name;
			return name;
		}
		
		�޼ҵ�� ���� ���� �޼ҵ� �̸��� �����ϰ�, �Ű������� �ٸ��� �Ͽ� �ʿ信 ���� ����� �� �ִ�.
		Prod p = new Prod();
		p.getName(); �� �ϸ� �� �޼ҵ尡 ����Ǿ� "���"�� ���ϵǰ�, p.getName("����"); �� �ϸ� �Ʒ� �޼ҵ尡 ����Ǿ� "����"�� ���ϵȴ�.
	*/
	
	//����5
	/*
	static ������ Ŭ������ ���ӵǾ� �ִ� �����̰�, �Ϲݺ����� ��ü�� ���ӵǾ� �ִ� �����̴�.
	���� static ������ Ŭ������ ���ӵǾ� �ִ� �����̱� ������ �����޸𸮿� ���� �Ҵ�Ǿ� ��ü�� ���� �� �����Ͽ� ���� �����ص� �ᱹ ��� ��ü�� ���� ���� �����Եȴ�.
	�Ϲ� ������ ��ü���� �ٸ� ���� ������.
	*/
	
	public static void main(String[] args) {
		//����3
		int tot;
		ElProduct ep = new ElProduct("���ڷ�����", 140000);
		tot = ep.buy();
		System.out.println("1�� �������� �� ���� : " + tot + "��");
		tot = ep.buy2(4);
		System.out.println(ep.cnt + "�� �������� �� ���� : " + tot + "��");
		tot = ep.buy3(10, 0.1);
		System.out.println("������ " + ep.dis + "%, " + ep.cnt + "�� ���� : " + tot + "��");
		
		System.out.println();
		
		//����6
		Friend f[] = new Friend[3];
		
		f[0] = new Friend("����", 50000);
		f[1] = new Friend("����", 40000);
		f[2] = new Friend("����", 60000);
		
		f[0].tot(20000);
		f[1].tot(15000);
		f[2].tot(25000);
		
		f[0].tot(-4000);
		f[1].tot(-8000);
		f[2].tot(-5000);
	}

}
//����3
class ElProduct {
	String name;
	int price, cnt;
	int dis;
	
	ElProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	int buy() {
		return price*1;
	}
	
	int buy2(int cnt) {
		this.cnt = cnt;
		return price*cnt;
	}
	int buy3(int cnt, double dis) {
		this.cnt = cnt;
		this.dis = (int)(dis*100);
		return (int)(price - price * dis);
	}
}

//����6
class Friend {
	static int totPrice;
	int price;
	String name;
	
	Friend(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void tot(int price) {
		if(price > 0) {
			this.price -= price;
			totPrice += price;
			System.out.println(name + "(�������忡)�Ա� : " + price + "��");
			System.out.println(name + "(��������)���� �ݾ� : " + this.price + "��");			
			System.out.println("���αݾ� : " + totPrice + "��");
		} else if(price < 0) {
			this.price += -(price);
			totPrice -= -(price);
			System.out.println(name + "(�������忡��)��� : " + price + "��");
			System.out.println(name + "(��������)���� �ݾ� : " + this.price + "��");			
			System.out.println("���αݾ� : " + totPrice + "��");
		}
		
	}
}


/*
1. �����ڿ� �޼����� �������� ����ϼ���.
2. �����ڿ� �޼��� ������ �ʿ��� �е� �Ʒ� ���� �ʵ� ���Ͻð�, ���ϰ��� �ִ� �޼��带 �����ϰ� ��ü�� ����� ȣ���غ�����.
		����, ��Ʈ, ȭ��ǰ, ����, ��, ��, ������
3. ElProduct(������ǰ) Ŭ������ �����ϰ�, �ʵ�� ������ǰ��, ������ ����, �����ڷ� ������ǰ��� ����
	�޼���� buy1() : �ϳ� �������� ��, �� ��� ����, buy2(����) : ������ �´� �� ��� ����
	buy3(����, ������) : ������ �������� �Է¹޾� �� ����� �����Ͽ� ��� ó���ϼ���.
4. �����ڿ� �޼ҵ��� �����ε��̶� �������� ������ ���ؼ� ����ϼ���.
5. static ������ �Ϲݺ����� �������� ���� ������ ������ �Բ� ����ϼ���.
6. static ������ Ȱ���Ͽ� Friedn�ʵ�� �� ģ������ ���� �ݾ�(static-���⿡ �Բ� �����ް� �� ��), �̸�, ���ο뵷�� �����ϰ�, �����ڷ� �̸� ����, �뵷�� ģ���� ���⿡ �� ���� ��� �Ա�ó���ϰ� �����Ͽ�, ģ��3���� �����͸� ����ó���ϼ���.
*/