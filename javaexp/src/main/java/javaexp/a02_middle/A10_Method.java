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
		return (int)45.24;
	}
	
	public static void main(String[] args) {
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