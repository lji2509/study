package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101_2 {
	//�⺻���� byte, short, char, int, long, double, boolean
	static byte getByte() {
		return 25;
	}
	static short getShort() {
		return 35;
	}
	static char getChar() {
		return 'A';
	}
	static int getInt() {
		return 10000;
	}
	static long getlong() {
		return 4225L;
	}
	static float getfloat() {
		return 342.25F;
	}
	static double getDouble() {
		return 2433.22;
	}
	static boolean getBoolean() {
		return true;
	}


	public static void main(String[] args) {
	
		//����1
		int restMoney = 100000;
		String date = null;
		String div = null;
		String content = null;
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��¥�� �Է��ϼ���(MM/DD) : ");
		date = sc.nextLine();
		System.out.println("�������ⱸ��(����/����) : " );
		div = sc.nextLine();
		System.out.println("������ �Է� : ");
		content = sc.nextLine();
		System.out.println("�ݾ��� �Է� : ");
		money = sc.nextInt();
		System.out.println("#ó�� ���#");
		System.out.println("��¥\t����\t����\t�ݾ�\t�ܾ�");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
//		System.out.print(restMoney+"\t");
		
		if(div.equals("����")) {
			restMoney += money;
		} else {
			restMoney -= money;
		}
		System.out.println(restMoney+"\n");
		
		//����2
		/* �ڹٿ��� ���Ǵ� ��ȣ�� ���� �� �����
		�Ұ�ȣ() : �޼��峪 ������ �Ű������� ����/ȣ���
			Person(String name){}
			Person p = new Person("ȫ�浿");
		�߰�ȣ{} : Ŭ����, ������, �޼���, ����, �ݺ���
			class Person{}
			�ڹٿ����� �迭���� �����͸� �Ѳ����� �Է°� �Ҵ�� ���
			String[] array = {"���", "�ٳ���", "����"};
		���ȣ[] : �迭�� �����ϰ�, index���� �����͸� ���� ȣ���� ��
			String[] array = null;
			array = new String[3];
			array = new String[]{"���", "�ٳ���", "����"};		
		*/
		
		//����3
			int num1;
			//int num1=24; //�����ϰ� �ٽ� ������������ �����ϰ� ���� �̸����� ����� �����߻�
			//������ �� ȭ�鿡�� ó������ �ʰ� ��ü �������� ����Ǵ� ��� �߻�
			//duplicate local variable
			num1=24; //������ ������ �������� ������ ������ �߻����� �ʴ´�.
			
		//����4
			String[] array = null;
			String array2[] = new String[3];
			array = new String[] {"���", "����", "�ٳ���"};
			array2[0] = "ȫ�浿";
			array2[1] = "��浿";
			array2[2] = "�ű浿";
			String array3[] = {"������", "����", "����"};
			
		//����5
			String[] singers = {"�̹���", "MSG���ʺ�", "������"};
			String[] musics = {"��ȣ��","�ٶ󸸺���","�߾����������� �̺��� ����"};
			System.out.println(singers[0] + " : " + musics[0]);
			System.out.println(singers[1] + " : " + musics[1]);
			System.out.println(singers[2] + " : " + musics[2]);
			
		//����6
			int no = 1;
			no++;
			no += 3;
			System.out.println("���� no�� ������ : " + no);
			
		//����7
			//�ʱ⿡ �迭�� ũ�Ⱑ �����Ǿ��µ�
			int[] array4 = new int[3];
//			array4[2]=25; // �迭�� ũ��(array.length)�� 3������, index�� 0, 1, 2������ �Ҵ��� �����ϴ�. index3�� �迭�� ũ�Ⱑ 4�� �� �����ϴ�.
			
		//����8
			System.out.println("�޼��� ȣ�� : " + getByte());
			System.out.println("�޼��� ȣ�� : " + getBoolean());
			System.out.println("�޼��� ȣ�� : " + getChar());
			

			
		//����9
//			class ����Ŭ���� {
//				�������
//			}
//			class ����Ŭ���� extends ����Ŭ���� {
//				
//			
//			}
	}
}
