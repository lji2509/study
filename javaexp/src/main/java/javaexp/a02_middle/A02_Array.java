package javaexp.a02_middle;

public class A02_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array; //�迭�� ����
		array = new int[3]; //�迭�� ��ü ���� : ������ 3��
		array[0] = 25;
		array[1] = 30;
		array[2] = 40;
		System.out.println("�迭�� �Ҵ��� ������ : " + array[0]);
		System.out.println("�迭�� �Ҵ��� ������ : " + array[1]);
		System.out.println("�迭�� �Ҵ��� ������ : " + array[2]);
		
		
		int point[] = new int[3];
		point[0] = 50;
		point[1] = 80;
		point[2] = 75;
		
		System.out.println("���� ���� : " + point[0] + "��");
		System.out.println("���� ���� : " + point[1] + "��");
		System.out.println("���� ���� : " + point[2] + "��");
		
	}

}
