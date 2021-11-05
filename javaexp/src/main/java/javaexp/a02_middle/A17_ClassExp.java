package javaexp.a02_middle;

public class A17_ClassExp {
/*
# �޼��� ���ϰ� ó���� �����ε� ó��
1. ��ü�� ����� �޼��带 ó���� �� ���ϰ��� �ִ�.
	�� ���ϰ��� �ش� �޼��忡�� ȣ���ϴ� ������ �����͸� �����ϴ� ���� ���Ѵ�.
2. ��ü�� ���, �����ڸ� ���ؼ� �ʵ尪�� �����͸� �Ҵ��ϰ� ���� �Ҵ��� �ʵ尪�� ��ɸ޼��忡 ���ؼ� ȣ���Ͽ� �����Ͽ� ����� �� �ִ�.
3. ���� ���� �Ű������� ���� �����Ͱ��� �ʱ�ȭ �� ���� �ʵ尪�� ������ ���ļ� �����ϴ� ó��
*/
	public static void main(String[] args) {
		Prod p1 = new Prod();
		String name = p1.getName();
		System.out.println("���ϵ� �� : " + name);
		Prod p2 = new Prod("����");
		String fpname = p2.getname();
		System.out.println("������ �Է� ��, �޼��� ���� �� : " + fpname );
		
		Prod p3 = new Prod("���",3000);
		int lastPrice = p3.disCount(0.2);
		System.out.println("���� �ݾ� : " + lastPrice + "��");
	}
}

class Prod {
	String pname;
	Prod(){}
	int price;
	
	Prod(String pname) {
		this.pname = pname;
	}
	
	Prod(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	
	//��ϵ� ���صǴ� ������ ��ɸ޼����� �Ű������� ���� ���εǾ� ���ε� ���� �����ϴ� ó��
	int disCount(double dis) {
		System.out.println("���� ��ǰ ����");
		System.out.println("���Ǹ� : " + pname);
		System.out.println("���� : " + price);
		//1.0 ==> 100%, 0.1 ==>10%
		System.out.println("������ : " + (int)(dis*100) + "%");
		int disPrice = (int)(price - price * dis);
		return disPrice;
	}
	
	//disCount��� �̸��� ����������, �Ű������� ������ ������ �ٸ��⿡ ������ �����ϴ�.
	/*	1. �̸��� �����ϴ��� �Ű������� ����
		2. �Ű������� ������ ����
		3. �ټ��� �Ű������� �ٸ� ������ ������ ������ ó��
		# �ܺο��� �޼��� ȣ�� ��, �ĺ��� �� �ִ� �Ű������͸� ������ �� ���� �޼����̸����� ������ �����ϴ�.
	*/
	
	int disCount(double dis, String grade) {
		return 0;
	}
	
	String getName() {
		return "���";
	}
	
	String getname() {
		return pname;
	}
}