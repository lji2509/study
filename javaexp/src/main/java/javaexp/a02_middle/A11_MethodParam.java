package javaexp.a02_middle;

public class A11_MethodParam {
	/*
	# �Ű�����
	1. �޼��峪 �����ڿ��� ���޵Ǿ�� �����͸� �޾� ó���� �� ���Ǵ� �Ұ�ȣ() �ȿ� ����� ����
	2. �Ű������� ������ ����
		1) ����� ������ ������ �°� �����͸� �����Ͽ��� �Ѵ�.
			ex) ���Ǳ⿡ ���� �Էµǰ� ó��������, �ش� �Է°����� ���丸 �Է��Ͽ����Ѵ�.
				�����̳� �ٸ� �������δ� �Է��� ���� �ʴ´�.
	*/
	static void callString(String str) {
		System.out.println("���ڿ� ������ �Ű����� : " + str);
	}
	
	static void callInt(int num1) {
		System.out.println("�Է��� ���� : " + num1);
	}
	
	static void name(String name) {
		System.out.println("�̸��� " + name + " �Դϴ�.");
	}
	
	static void age(int age) {
		System.out.println("���̴� " + age + "�� �Դϴ�.");
	}
	
	static void weight(double weight) {
		System.out.println("�����Դ� " + weight + "kg �Դϴ�.");
	}
	/*
	3. �Ű������� ����
		1) �Ű������� ȣ���� ��, �ѹ��� �������� �����͸� �Է��� �� �ִ�.
			�� ��, "�Ű�����1, �Ű�����2, �Ű�����3" ���·� �����͸� �����ϰ�, �ش� ������ �°� �����͸� �����ϸ� �ȴ�.
			ex) ���Ǳ⿡ ���� �Է��ϰ�, ��ȣ�� �����ϴ� 2���� �Է�ó���� �ϴ� ��찡 �ִ�.
				�̷��� 1�� �̻��� �Է� ������ ó���� �� Ȱ��
	*/
	static void inputAutoMachine(int money, String menu) {
		System.out.println("#���Ǳ� �Է� ó��#");
		System.out.println("�Է��� �ݾ� : " + money);
		System.out.println("������ �޴� : " + menu);
	}
	
	static void student(String name, int kor, int eng, int math) {
		System.out.println("�л��� �̸��� " + name + "�̰�, ���������� " + kor + "��, ���������� " + eng + "��, ���������� " + math + "�� �Դϴ�.");
	}
	/*
	4. �Ű������� ������������ ���� ����
	*/
	static void buyProd(String pname, int price) {
		System.out.println("#���� ����#");
		System.out.println("������ ���� : " + pname);
		System.out.println("������ ���� : " + price);
	}
	
	static void inputArray(String[] names) {
		System.out.println("#�Ű������� �迭�� �Է�#");
		System.out.println("�迭�� ���� : " + names.length);
		System.out.println("�迭�� ù��° ������ : " + names[0]);
	}
	
	public static void main(String[] args) {
		String[] innames = {"ȫ�浿", "��浿", "���浿"};
		inputArray(innames);
		
		buyProd("���",3000);
//		buyProd(3000,"���"); //����� ������ �°� �����͸� ȣ���ؾ� �Ѵ�.
		
		student("ȫ�浿",74,85,93);
		
		inputAutoMachine(1000,"Ŀ��");
		inputAutoMachine(2000,"���̴�");
		
		name("ȫ�浿");
		age(24);
		weight(54.2);
	}

}

class Person12 {
	String getName() {
		return "ȫ�浿";
	}
	
	void call() {
		System.out.println("�ȳ�");
	}
}
