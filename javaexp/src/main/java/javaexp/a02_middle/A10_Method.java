package javaexp.a02_middle;

public class A10_Method {
	//static�� ��ü �������� ����� �� �ִ� �����޸� ������ �Ӽ��� ����� �� ����Ǵ� Ű����
	//1. �޼����� �������
	//	1) ��������
	//	2) �Ű�����
	//	3) ��� ���μ��� ó��
	//	4) ���ϰ�
	
	static String getName(String name) {
		name = name + "��^^";
		return name;
	}
	
	//1. ���������� �ش� �޼��带 ���ؼ� �����ϴ� ���� ������ �����ϴ� ������ ���ϰ��� �Ҵ��� �� �ִ� �������� ����

	static int getNum() { 
		return 15;
	}
	
	static double getWeight() {
		return 30.5;
	}
	
	
	static int getEmpno(int bun) {
		return bun;
	}
	
	static String getEname(String name) {
		return name;
	}
	
	static double getWeight(double weight) {
		return weight;
	}
	
	static double getChangeType() {
		double num1 = 25; //promote(���� �����Ͱ� ū ������������ �Ҵ�)
		return 35;
	}
	
	static int getChangeTepe2() {
		int num2 = (int)42.24; //casting(ū �����͸� ���� ������������ �Ҵ�)
//		int num3 = 42.24; //���� �߻�
		return (int)45.24;
	}
	
	static int getInt2() {
		//�ش� �������� �����Ͽ� �����͸� �����ϴ� ��찡 ����.
		int num1 = 25;
		num1+=3;
		return num1;
	}
	
//	���ϰ��� ���� ���
//		1. �Է°��� ���ؼ� ����
//		2. ���μ��� ó��
//		3. ȭ�� ��� ó��
//		==> �������� void ������ ���ο� return ����
	
	static void show() {
		System.out.println("����ϴ� ó��(���ϰ� �ʿ����)");
	}
	
	static void show2(int num1) {
		int sum = 30;
		sum += num1;
		System.out.println("�޼��忡 �Էµ� �� : " + num1);
		System.out.println("���հ� : " +sum);
	}

	static void method1() {
		System.out.println("�ݰ����ϴ�.");
	}
	
	static void method2(String name) {
		System.out.println(name + "�� �ȳ��ϼ���.");
	}
	
	static int[] getArray() {
		int[] a = {100,200,300};
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = getArray();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);			
		}
		
		method1();
		method2("ȫ�浿");
		
		show();
		show2(25);
		show2(10);
		
		
		String name1 = getName("�ű浿");
		System.out.println("�޼��� ó���� ����� : " + name1);
		System.out.println("�޼��� ó���� ����� : " + getName("������"));
		System.out.println(getNum()+30);
		System.out.println(getWeight());
		
		System.out.println("�����ȣ�� " + getEmpno(8) + "�Դϴ�.");
		System.out.println("����� �̸��� " + getEname("ȫ�浿") + "�Դϴ�.");
		System.out.println("�����Դ� " + getWeight(57.4) + "�Դϴ�.");
	}

}