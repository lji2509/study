package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101 {

	public static void main(String[] args) {
		/*
		1. �⺻ �Է� ���� �ڵ带 ����ϰ�, ����θ� ��������
		 ���� �ܾ��� 100000�� �� ��, ��¥, �������ⱸ��, ����, �ݾ� �Է¹޾�
		 ��¥, �������ⱸ��, ����, �ݾ�, ó�����ܾ��� ����ϼ���.
		2. �ڹٿ��� ���Ǵ� ��ȣ�� ������ ����ϰ�, ������� �����ϼ���.
		3. ������ �ߺ� ���� ����, ��Ÿ���� ���� ����� ó�� ����� ����ϼ���.
		4. �迭�� ����� �Ҵ� ������ ����ϼ���.
		5. �迭�� �����ϴ� ���� 3��, �뷡�� 3���� �����Ͽ� ����ϼ���.
		6. ���������ڿ��� Ȯ���� �������Կ����ڶ� �������� ������ ���ؼ� ����ϼ���.
		7. �迭�� ũ�⸦ �Ѿ index�� �����Ѵٴ� ���� � ������� ����ϼ���.
		8. primitive data Ÿ��(�⺻������ ����)���� ���ϵǴ� �޼��带 ����ϰ�, ���� �ڵ带 �����ϼ���.
		9. ����� �⺻������ ����ϼ���.
		*/
		
		System.out.println("����1");
		int tot = 100000;
		Scanner scan = new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���.(YY/DD/MM �������� �Է��ϼ���.)");
		String date = scan.nextLine();
		System.out.println("�������ⱸ���� �Է��ϼ���.(\"����\" �Ǵ� \"����\" ���� �Է��ϼ���)");
		String d = scan.nextLine();
		System.out.println("������ �Է��ϼ���.");
		String text = scan.nextLine();
		System.out.println("�ݾ��� �Է��ϼ���.");
		int price = scan.nextInt();
		System.out.println("��¥\t�������ⱸ��\t����\t�ݾ�\tó���ıݾ�");
		if(d == "����") {
			System.out.println(date+"\t"+d+"\t"+text+"\t"+price+"\t"+(tot-price));
			} else if(d == "����"){
				System.out.println(date+"\t"+d+"\t"+text+"\t"+price+"\t"+(tot+price));
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		System.out.println();
		System.out.println("����2");
		System.out.println("�ڹٿ��� ����ϴ� ��ȣ���� [](���ȣ), {}(�߰�ȣ), ()(�Ұ�ȣ)�� �ִ�."
				+ "[]�� �ַ� �迭�� �ε����κ����� ȣ���� �� ����ϸ�, "
				+ "{}�� �߰�ȣ, Ŭ������, ������, �޼��忡 ������ �����ϰ�, ����, �ݺ������� �ַ� Ȱ���ϸ�,"
				+ "()�� �Ű������� �Է�ó���� �� ����Ѵ�.");
		
		System.out.println();
		System.out.println("����3");
		System.out.println("������ �ߺ� ���� �� 'duplicate local variales'�̶�� ������ �߻��Ѵ�."
				+ "�������� ���� ������ ����Ǿ� �߻��� �����̹Ƿ� �������� �������ָ� �ȴ�.");
		
		System.out.println();
		System.out.println("����4");
		System.out.println("�迭�� ������ '������Ÿ��[] �迭��' �Ǵ� '������Ÿ�� �迭��[]���� ������ �����ϴ�.\n"
				+ "'������Ÿ��[] ������ = new ������Ÿ��[����]'�� �迭�� �����ϸ�, "
				+ "'������Ÿ��[] ������ = {��1, ��2, ��3..}' �Ǵ� '������ = new ������Ÿ��[]{��1, ��2, ��3}' �� ������� ���� �ٷ� �����Ͽ� �迭 ������ �����ϴ�.\n"
				+ "��, 'String strArray[] = null'���� �迭�� �ʱ�ȭ�� �����ϴ�.");
		
		System.out.println();
		System.out.println("����5");
		String[] artist = {"Ʈ���̽�", "�����̰�", "�������"};
		String[] song = {"More & More", "Dun  Dun Dance", "D-D-Dance"};
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + ". �����ϴ� ������ " + artist[i] + "�̰�, �����ϴ� �뷡�� " + song[i] + "�Դϴ�.");
		}
		
		System.out.println();
		System.out.println("����6");
		System.out.println("�������Կ����ڶ� 'sum = sum + 2'�� ���� �����Ͽ� �����ϴ� ������ 'sum +=2'�� ���� ����ȭ��Ų ���̴�.");
		
		System.out.println();
		System.out.println("����7");
		System.out.println("�迭�� 'int[] age = new int[3]'�� ���� 3���� �����Ͽ� ���� �Ҵ����� ��, 'int age[3]'�� ���� �ε����� �ʰ��� �迭�� ȣ���� �� �����Ƿ� ������ �߻��Ѵ�."
				+ "�迭���� �ε����� 0���� �����ϱ� ������ 3���� �����Ͽ��� ���� 'int age[0]'���� 'int age[2]'������ ȣ���� �� �ִ�.");
		
		System.out.println();		
		System.out.println("����8");
		System.out.println("������ 'byte, short, int, long, char'�� �ְ�, �Ǽ��� 'float, double', boolean�� 'treu, flase'�� �ִ�");

//		static int getEmpno(int bun) {
//			return bun;
//		}
//		
//		static String getEname(String name) {
//			return name;
//		}
//		
//		static double getWeight(double weight) {
//			return weight;
//		}
//		
//		public static void main(String[] args) {
//			
//			System.out.println("�����ȣ�� " + getEmpno(8) + "�Դϴ�.");
//			System.out.println("����� �̸��� " + getEname("ȫ�浿") + "�Դϴ�.");
//			System.out.println("�����Դ� " + getWeight(57.4) + "�Դϴ�.");
//		}

		System.out.println();
		System.out.println("����9");
		System.out.println("����� extends�� �̿��Ͽ� ������� ����Ŭ���� Father�� �Ӽ��� ����Ŭ������ Son�� ����ϰ� ������ 'class Son extends Father{}'�� �̿��Ͽ� ����Ŭ������ �Ӽ��� ����Ŭ������ ����� �� �ִ�.");
	}

}
