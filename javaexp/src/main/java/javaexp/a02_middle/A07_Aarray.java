package javaexp.a02_middle;

import java.util.Scanner;

public class A07_Aarray {

	public static void main(String[] args) {
		/*
		 # �迭�̶�?
		 	1. ���� Ÿ���� �����͸� ���ӵ� ������ �����ϴ� �ڷᱸ��
			[1000]	[2000]	[3000]	[4000]
			  0		  2		  3		  4
			�迭�� �̸� numbers
			numbers[0]		 	
			numbers[1]		 	
			numbers[2]		 	
			numbers[3]		 	
			numbers[4]		 	
		 	2. �� ������ ���� ��ġ�� �ε���(0���� ����) �ο��� ����
		 # �迭�� ����
		 	1. �ߺ��� ���� ���� ���̱����� ���
		 	2. �ݺ��� �̿��� ��ҵ��� ���� ó��
		 		ex)
		 		int sum = score1;
		 		sum += score2;
		 		sum += score3;
		 		int ave = sum/30;
		 		int sum = 0;
		 		for(int idx=0; idx<30; idx++) {
		 			sum+ = score[idx];
		 		}
		 		int avg = sum/30;
		*/
		//# �迭 ����
		//1. �迭�� ����ϱ� ���� �켱 �迭 ������ �����Ͽ��� �Ѵ�.
		//		Ÿ��[] ����, Ÿ�� ����[]
		int[] intArray;
		double dblArray[];
		//2. �迭 ������ ���� ���� - �迭 �����Ǳ� �� null �ʱ�ȭ ����
		String strArray[] = null;
		//heap������ ��ü�� ��������� �ʴ� ��Ȳ�̶� �迭�� index�� ����ϸ� ���� �߻�
		//3. �� ������� �迭 �����ϴ� ���
		// 1) ���� ����� ���ÿ� �� ��� ����
		//		������Ÿ��[] ���� = {��1, ��2, ��3..};
		int[] prices = {3000,4000,5000};
		// 2) ���� ���� �� �� ��� ����
		//		���� = new Ÿ��[]{��, ��2, ��3..};
		intArray = new int[] {10,20,30};
		//4. new �����ڷ� ���� �Ҵ���� �ʴ� �迭 ����(��ü ����)
		// 1) �迭 ������ ���� ������ ���� ����
		// 2) ���� ������ ������ �迭�� �̸� �����ϰ� ���� ���
		//		Ÿ��[] ���� = new Ÿ��[����];
		double heights[] = new double[3];
		//	���� ���￡ heigths, �������� �Ǽ��� 3�� �� �� �ִ� �迭�� ��ü ����
		//5. �迭�� ����
		// 1) �迭�� ������ �� �ִ� ��ü �׸��
		// 2) �迭�� ���� : �迭����.length
		// 3) �迭�� ���̴� �б� ����
		System.out.println("heigths�� ���� : " + heights.length);
		//6. �迭�� index�� �����Ͽ� ȣ���ϰų� �����͸� ������ �� �ִ�.
		//		�迭��[index��ȣ] : index��ȣ�� 0���� ����
		heights[0] = 30.7;
		heights[1] = 40.7;
		heights[2] = 50.7;
		System.out.println("�� ��° �迭�� ������ : " + heights[1]);
		//	ũ�� �̻��� �迭�� ȣ���ϸ� ���� �߻�
		
		String names[] = {"ȫ�浿", "���缮", "��ȣ��"};
		int kors[] = {30, 80, 55};
		
		for(int i=0; i<3; i++) {
			System.out.println("�̸��� " + names[i] + "�̰�, ���������� " + kors[i] + "�� �Դϴ�.");
		}
		
		Scanner  sc = new Scanner(System.in);
		String name[] = new String[3];
		int kor[] = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + "�� �̸��� �Է��ϼ���.");
			name[i] = sc.nextLine();
		}
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + "�� ���������� �Է��ϼ���.");
			kor[i] = sc.nextInt();
			
			}
		for(int i=0; i<3; i++) {
			System.out.println("�̸��� " + name[i] + "�̰�, ���������� " + kor[i] + "�� �Դϴ�.");
		}
	}

}
