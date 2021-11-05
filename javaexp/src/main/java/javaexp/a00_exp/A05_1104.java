package javaexp.a00_exp;

public class A05_1104 {
	//����1
	/*
	1)��ü ������
	�����ڸ� ���� ������ó���� ��ü ������ �ѹ��� ó���� �� �ִ�.
	ex) Person p1 = new Person("ȫ�浿", 25, "����");
		p1 = new Person("�ű浿", 27, "�λ�"); //heap������ �ٸ� ��ü�� ������ �Ǳ⿡ ���� ��ü��� �� �� ����.
	�޼���� ��� 2���̻� ȣ���Ͽ� ���� ��ü�� ������ ������ �����ϴ�.
		p1.setName("�ű浿");
		p1.setAge(24);
		p1.setAge(23);
	2) ���ϰ� ó��
		�����ڴ� ���ϰ��� ����. �ַ� �Ű������� ���ؼ� �ʵ��� �ʱ�ȭ�� ���ؼ� �����ϴ� ��찡 ����.
		�޼���� ���ϰ��� �ִ�. �ܺο��� ȣ���� �����͸� return�������� ó�����ش�.
	3) ����
		�Ű������� ���ؼ� ������ ó��
		�����ε� : �Ű������� ����, Ÿ��, Ÿ���� �ٸ� ����
	 
	�����ڴ� ��ü�� ������ �� ���� �޾Ƶ鿩 �����ڿ� ������ ������ �����ϰ�, �ʵ忡 ���� �Ҵ��Ѵ�.
	�޼���� �ݺ���, ���ǹ� �� ���μ��� ���ۿ� ���� ����̳� ����� �ϱ� ���� ������ �����ϴ� ���̴�.
	*/
	
	//����4
	/*
	���� �̸��� �����ڿ� �޼��带 ������ �� �ִ� ��Ģ�� �ִµ�, ȣ���ϴ� ������ �ĺ��� ������ ���� ���Ѵ�.
	�Ϲ������� �Ű������� ����, ����������, �ٸ� ������������ ���� ó���� ������ ���� ���Ѵ�.
		void buy(){}
		void buy(int no){} ����
		void buy(double discount){} ����������
		void buy(int no, double discount){}
		void buy(double discount, int no){} ����
	*/
	
	//����5
	/*
	class Build {
		String owner; //�Ϲݺ���
		String loc; //�Ϲݺ��� : �� ��ü�� ������ �ִ� �޸� ����
		static int drawPay; //static���� : ��ü�� �����Ǵ��� ������ �� �ִ� �޸� ����
		Build(String owner, String loc) {
			this.owner = owner;
			this.loc = loc;
		}
	}
	main()
	Build b1 = new Build("ȫ�浿", "����");
	Build b2 = new Build("��浿", "�λ�");
	Build b3 = new Build("�ű浿", "����");
	b1.owner;
	b1.derawPay = 100000; //�ϳ��� ��ü�� static������ �����ϸ�, �ٸ� ��ü���� ������ ��ġ�� ������ ���������� �ƴ϶� Ŭ����������� �ϱ⵵ �Ѵ�.
							Building.drawPay�������� ��ü���� ���̵� ����� �� �ִ�.
	b2.owner;
	b3.owner;
	b1.drawPay, b2.drawPay, b3.drawPay ��ΰ� �����Ͱ� �����ϰ� ó���ȴ�.
	*/
	
	public static void main(String[] args) {
		//����2
		Pencil p1 = new Pencil("HB", 800);
		p1.showInfo();
		System.out.println("���ϰ� : " + p1.getKind());
		Pencil p2 = new Pencil("4B", 850);
		p2.showInfo();
		System.out.println("���ϰ� : " + p2.getKind());
		
		System.out.println();
		
		//����3
		int tot;
		ElProduct ep = new ElProduct("���ڷ�����", 140000);
		tot = ep.buy();
		System.out.println(tot + "��");
		tot = ep.buy(4);
		System.out.println(tot + "��");
//		tot = ep.buy(10, 0.1);
		System.out.println(ep.buy(10, 0.1) + "��");
		
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
	
	//�����ε�
	int buy() {
		System.out.println("1�� �������� �� ���� : ");
		return price*1;
	}
	
	int buy(int cnt) {
		System.out.println(cnt + "�� �������� �� ���� : ");
		return price*cnt;
	}
	int buy(int cnt, double dis) {
		this.dis = (int)(dis*100);
		System.out.println("������ " + this.dis + "%, " + cnt + "�� ���� : ");
		int tot = price * cnt;
		return (int)(tot - tot * dis);
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

//����2
class Pencil {
	String kind;
	int price;
	
	Pencil(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
	
	String getKind() {
		return kind;
	}
	
	int getPrice() {
		return price;
	}
	
	void showInfo() {
		System.out.println("# ������ ���� #");
		System.out.println("���� : " + kind);
		System.out.println("���� : " + price);
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