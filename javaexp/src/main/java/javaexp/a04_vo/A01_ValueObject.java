package javaexp.a04_vo;

public class A01_ValueObject {

	public static void main(String[] args) {
		/*
		# VO
		1. java���� ��ü�� �Ӽ����� �ִ� ��ü�� �Է°� ȣ���� �� �� �ְ� ó���ϴ� ���� ���Ѵ�.
			�ַ� ��ü�� �ʵ尪�� read�� �� ���Ǵ� �����̳�, ȥ���ؼ� �Է�/����/����/ȣ�� �� �������� �������� Ȱ��� ���� ����.
		2. �⺻���� ���� ���� ����
			1) �ʵ�� private�� ����
				�������� �ܺ� ȣ���� �����Ѵ�.
			2) �����ڿ� �޼���� public���� ����
				�����ڸ� ���ؼ� �ʵ尪�� �ʱ�ȭ ó��
				getXXX() : ȣ���ϴ� �޼��带 ���ؼ� �ʵ尪�� ȣ��
				setXXX() : �����ϴ� �޼��带 ���ؼ� �ʵ尪�� ����
			3) �б�� ���Ⱑ �и��� �޼��带 ���� �ʵ尪�� �����ϸ�, �����͸� ������� ���� ȿ������ ó���� �Ѵ�.
		*/
		
		A02_Person p1 = new A02_Person("ȫ�浿", 25, "����");
		p1.setAge(29);
		System.out.println("�̸� : " + p1.getName());
		System.out.println("��°� : " + p1.getLoc());
		System.out.println("���� : " + p1.getAge());
		
		A03_Hobby h1 = new A03_Hobby("��󸶺���", 14500, "���� ����");
		h1.setTime("�ָ� ��");
		System.out.println("��� : " + h1.getHobby());
		System.out.println("���� : " + h1.getPrice());
		System.out.println("�ð� : " + h1.getTime());
		
		A04_Screen s1 = new A04_Screen("�", 9000, 25);
		s1.setCnt(30);
		System.out.println("��ȭ ���� : " + s1.getName());
		System.out.println("��ȭ ���� : " + s1.getPrice());
		System.out.println("������ �� : " + s1.getCnt());
	}

}
