package javaexp.a00_exp;

import java.util.Scanner;

public class A06_1105 {
	//����1
	/*
	�����ϰ���(�ڵ�==>����� ����, ctrl+s ����) javac Person.java ==> Person.class
	�������(main()�޼��尡 �ִ� Ŭ�������� ȣ���� ��) java Person ==> memory�� �ε��� �������� �ڵ� ������ ����
	*/
	
	//����2
	/*
	Sysout.out.println("�������� �ٹٲ� ���");
	Sysout.out.print("�ٹٲ� ���� ���");
	Sysout.out.println("���\t�ٳ���\t"); \t: �����Ϳ� ������ ���̿� ���� ũ��� ������ �ǰ���
	Sysout.out.print("�ȳ�\n�ϼ���\n�ݰ����ϴ�.\n"); \n: �����Ϳ� ������ ���̿� �ٹٲ� ó��
	*/
	
	//����5
	/*
	class Ŭ������ {
		//���ӵ� ���� ��ҵ��� �ǰ����� �̿��Ͽ� ���� �����̶�� ���� ǥ���Ѵ�.
		  
		������Ÿ�� �ʵ��;
		
		Ŭ������(){}; //������
		
		����Ÿ�� �޼����(�ʿ�� �Ű�����) {
			//�ǰ������� ���� ���� ǥ��
			
			���ǹ�
			if(data.equals("ȫ�浿")) {
				System.out.println("������");
			cf)���ڿ�1.equals(���ڿ�2) : ���ڿ�1�� ���ڿ�2�� ���������� ��Ÿ���� ��ɸ޼���
			== : �ּҰ� �񱳷� ���� �񱳿� ���̰� �ִ� ��� �߻�
			
			�ݺ���
			...
		}
	Ŭ����, �޼���, ������, ����, �ݺ��� ��� �� ������ �� ������ ����Ͽ� �����ϸ� �������� ��������, ������ ã�� ��������.
	�ڵ�� {}������ ���������� �ڵ��ϸ�, ���۰� ���� �����ؾ� �Ѵ�.
	���۰� ���� ���� �����, �ʿ信 ���� ���̿� Ŀ���� ��ġ��Ų �Ŀ� enterŰ�� �Է��Ͽ� �ڵ� ó���� �ϸ� ������ ���� �� �ִ�.
	*/
	
	//����9
	//�Ұ�ȣ() -> ���׿�����(++, --) -> ���������(����,������->����,����) -> �񱳿����� -> �������� -> ��Ʈ�������� -> ���׿����� -> ���Կ�����
	
	//����11
	/*
	break : �ݺ����� ����ó���ϰ� �������´�.
	continue : if���� �Բ� �ݺ�ó���� �ش� step���Ĵ� ó������ �ʰ�, ���� �ݺ��ܰ踦 �����Ѵ�.
	*/
	
	public static void main(String[] args) {
		//����3, ����4
		String name;
		int kor, eng, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.nextLine();
		System.out.println("���������� �Է��ϼ���.");
		kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		math = sc.nextInt();
		sum = kor+eng+math;
		avg = sum/3.0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+(int)avg);
		
		System.out.println();
		
		//����6
		//�⺻ �������������� ������(byte, short, *int, long, char), �Ǽ���(float, *double), boolean(true, false)�� �ִ�.
		byte a = 127;
		short b = 9999;
		int c = 10000;
		long d = 54000;
		char e = 'A';
		float f = 2.2f;
		double g = 14.567;
		boolean h = true;
		boolean i = false;
		
		System.out.println("byte : " + a);
		System.out.println("short : " + b);
		System.out.println("int : " + c);
		System.out.println("long : " + d);
		System.out.println("char : " + e);
		System.out.println("float : " + f);
		System.out.println("double : " + g);
		System.out.println("boolean : " + h);
		System.out.println("boolean : " + i);
		
		System.out.println();
		
		//����7
		/*
		Ÿ��ĳ�����̶�, ���� ���� ����ȯ�̴�.
		���� ������ Ÿ���� �Ҵ����� �ʰ�, ū ������Ÿ���� ���� ������Ÿ�Կ� �Ҵ��� �� ������ Ÿ���� �����ϰ� �ϱ� ���� ����Ѵ�.
		���� ������Ÿ���� ū ������Ÿ������ �Ҵ��� ���� �������� �ս��� ���� ������ ĳ������ �� �ʿ䰡 ������,
		ū ������Ÿ���� ���� ������Ÿ������ �Ҵ��� ���� �������� �ս��� �߻��Ͽ� ĳ������ ���� ������ ������Ÿ���� ��ȯ�����־�� �Ѵ�.
		*/
		int a1 = 45;
		double a2 = a1;
		System.out.println("���� ������Ÿ�� ==> ū ������Ÿ�� : " + a2);
		double b1 = 43.74;
//		int b2 = b1; //ū ������Ÿ���� ���� ������������ �Ҵ��Ϸ��� �߱� ������ ���� �߻�
		int b2 = (int)b1; //ĳ������ ���� b1�� ������Ÿ���� ������ int�� ��ȯ���� �Ҵ�
		System.out.println("ū ������Ÿ�� ==> ���� ������Ÿ�� : " + b2);
		
		System.out.println();
		
		//����8
		/*
		�񱳿�����(>=, <=, >, <, ==, !=)�� Ư���� �����͸� �񱳿����ڸ� �̿��ؼ� true, false�� ���� boolean ���� ��ȯ�Ѵ�.
		��������(&&, ||)�� �ΰ��� �񱳿������ ���Ͽ� &&�� �ΰ��� �񱳿������ ��� ���̸� true, �� �ܴ� false�� ��ȯ�ϰ�,
			||�� �ΰ��� �񱳿������ ��� �����̸� false�� ��ȯ�ϰ�, �� �ܿ��� true�� ��ȯ�Ѵ�.
		*/
		int c1 = 83;
		if(c1 >= 80 && c1 < 90) {
			System.out.println("B");
		}
		
		System.out.println();
		
		//����10
		for(int j=15; j<=50; j++) {
			if(j%3 != 0) {
				System.out.print(j + " ");
			} else {
				System.out.print("@ ");
			}
		}
		System.out.println();
		
		System.out.println();
		
		//����12
		String[] name1 = {"ȫ�浿", "��浿", "�̱浿"};
		int[] no = {1, 2, 3};
		String[] position = {"����", "�븮", "���"};
		
		System.out.println("�̸�\t�����ȣ\t����");
		for(int n=0; n<name1.length; n++) {
			System.out.println(name1[n]+"\t"+no[n]+"\t"+position[n]);
		}
		
		System.out.println();
		
		//����13
		String form[] = {"��", "��", "��", "��"};
		String bunho[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		Card[] card = new Card[52];

		int cidx=0;
		
		for(int idx=0; idx<form.length; idx++) {
//			System.out.print(form[idx]);
		
			for(int jdx=0; jdx<bunho.length; jdx++) {
//				System.out.print(cidx+1 + ")" + form[idx] + bunho[jdx] + ", ");
				card[cidx] = new Card(bunho[jdx], form[idx]);
				cidx++;
			}
//			System.out.println();
		}
		for(int idx=0; idx<card.length; idx++) {
			System.out.print(idx+1 + ")");
			card[idx].show();
			if(idx==card.length-1) {
				System.out.println();
			} else {
				System.out.print(", ");				
			}
		}
				
		System.out.println();
		
		//����14
		House house = new House("����Ʈ");
		house.setPerson(new Person("ȫ�浿"));
		house.showInfo();
	}

}

//����13
class Card {
	String bunho;
	String form;
	
	Card(String bunho, String form) {
		this.bunho = bunho;
		this.form = form;
	}
	
	void show() {
		System.out.print(form + bunho);
//		System.out.println("ī�� ��ȣ : " + bunho);
//		System.out.println("ī�� ��� : " + form);
	}
}

//����14
class House {
	Person p;
	String form;
	
	House(String form) {
		this.form = form;
	}
	
	void setPerson(Person p) {
		this.p = p;
		System.out.println("���� �����߽��ϴ�.");
	}
	
	void showInfo() {
		if(p != null) {
			System.out.println("������ : " + p.name);
			System.out.println("������ �� : " + form);
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
}

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}

/*
1. java�����ϰ� ��������� Person.java�� �������� ����ϼ���.
2. �⺻ ��� ���¸� ����ϰ�, Ư�����ڸ� ���� ���ó���� �ϼ���.
3. ������ �����Ͽ�, �Ʒ��� ���� ������ ����ϼ���.
	�̸�		����	����	����	����	���	: �� ������ �ǰ��� ����
	ȫ�浿	70	80	90	240	80
4. �� ����� Scanner��ü�� ���ؼ� �����͸� �Է¹޾� ����ϼ���.
5. ������ �������� ���� Ŭ������ �ۼ��Ϸ��� �Ѵ�. �Ʒ� ������ ���Խ��� Ŭ������ �ۼ��غ�����.
	Ŭ������, �ʵ��, �����ڸ�, �޼����, ���ǹ�, �ݺ���
6. �⺻ ������������ ������ ����ϰ�, �� �⺻ ������ ������ �����͸� �Ҵ��Ͽ� ����ϼ���.
7. Ÿ�� ĳ������ �������� ����ϰ�, �ش� ������ ���� ����ϼ���.
8. �񱳿����ڿ� ���������� ���̸� ����ϰ�, ������ ������ 80�̻� 90�̸��� �����͸� B�������� ǥ���ϴ� ó���� �ϼ���.
9. �������� �켱������ ����ϼ���.
10. 15~50���� ����ϵ�, 3�� ����� @ǥ�÷� ����ϼ���.
11. break���� continue���� ���̸� ����ϼ���.
12. �����, �����ȣ, ��å�� �迭 3���� ����� 3���� ������ ����ϼ���.
13. ī���ȣ�� ī������ �ʵ�� �ִ� Ŭ������ �����ϰ�, �����ڸ� ����/�Ҵ��ϰ�, show()�� ���ؼ� �ش� ī���ȣ�� ����� ����ϼ���.
14. House�� Person�� 1:1�� ��ü�� ���踦 ����� �ʵ�� �޼��带 ���Ƿ� ����� ���ó���ϼ���.

*/