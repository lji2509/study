package javaexp.a00_exp;

public class A01_1029 {

	public static void main(String[] args) {
		/*
		1. �ڹ��� �⺻ ���� ����� �Ҵ��� ���� �Ʒ��� ������ �����ϰ� ����ϼ���.
			�̸�	����	���
		2. ������ ��Ģ�����ڿ� ������ ������ Ȱ���Ͽ� �Ʒ��� ���� ������  ó���ϼ���.
			1) ������ 3������  5���� ���� ���� �� ����
			2) 20���� ���� 3������ �����̰� �����ϰ� ���� ������ ���� ������
			3) �� �ܾ� 100000���� ����� 3000 2ȸ �Ĵ� 7000, ���ĺ� 3000�� �� ������
		3. ��ǻ�� ������ 1000000�̻��̸� �� �� �ܴ� ������  ó���ϱ�� �ߴ�.
			�ش� ���α׷��� ���˴��� ���Ͽ� ó���ϰ� ����ϼ���.
		4. �ݺ����� �̿��Ͽ� 15~45���� ����ϰ�, 10���� discount 0���� ����ϼ���.
		5. �ڹ��� heap������ stack������ ���Ͽ� ��ü�� �޸� ��� ����� ������ ���� ����ϼ���.
		 */
		
		System.out.println("����1");
		
		String name="ȫ�浿", hobby="��󸶺���";
		int age=24;
		System.out.println("�̸��� " + name + "�̰�, ��̴� " + hobby + "�̸�, ���̴� " + age + "�� �Դϴ�.");
		
		System.out.println();
		
		System.out.println("����2-1");
		
		int bread=5, gom=3;
		System.out.println("������ " + gom + "������ ���� ���� �� ������ " + (gom*bread) + "�� �Դϴ�.");
		
		System.out.println();
		
		System.out.println("����2-2");
		int bread1=20, gom1=3;
		System.out.println("������ " +gom1 + "������ �����ϰ� ���� ������ " + (bread1/gom1) + "�� �̰�, ���� �������� " + (bread1%gom1) + "�� �Դϴ�.");
		
		
		System.out.println();
		
		System.out.println("����2-3");
		int tot=100000, bus=3000, food=7000, snack=3000;
		int sum = 100000 - (bus * 2) - food - snack;
		System.out.println("�� �ܾ� " + tot + "������ �����, �Ĵ�, ���ĺ� �����ϰ� ���� �ݾ��� " + sum + "�� �Դϴ�.");
		
		System.out.println();
		
		System.out.println("����3");
		int computer=1320000;
		System.out.print("��ǻ�� ������ " + computer + "���̸�, ");
		if(computer >= 1000000) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println();
		
		System.out.println("����4");
		System.out.println("# 15 ~ 45 #");
		for(int i=15; i<=45; i++) {
			if(i==45) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println("# 10 ~ 0 #");
		for(int i=10; i>=0; i--) {
			if(i==0) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		
		System.out.println();
		
		System.out.println("����5");
		test t1 = new test();
		test t2 = new test();
		test t3 = new test();
		System.out.println("t1�� heap ������ " + t1 + " �Դϴ�.");
		System.out.println("t2�� heap ������ " + t2 + " �Դϴ�.");
		System.out.println("t3�� heap ������ " + t3 + " �Դϴ�.");
//		��ü�� heap������ ��ü�� �����ϰ� stack������ ��ü�� �ּҰ��� �����Ѵ�.
//		primitive�����ʹ� stack������ �ٷ� �����͸� �Ҵ��Ѵ�.
//		new test() : ��ü�� ������ �ϸ� heap������ ��ü�� ������ �Ǿ� ���������.
//		�� heap������ �ּҰ��� t1�� �Ҵ�Ǿ�����.
//		t1�� ���� �ּҰ��� stack������ �Ҵ�Ǿ�����.
		
//		�������� ctrl + / �ϸ� ���� �ּ� ����		
	}

}
class test {}
