package javaexp.a02_middle;

public class A03_ClassVsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ������ ���������� = new �����ڸ�();
		//Ŭ������ �������� �ϳ��� ��ü�� ���������.
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		//�ϳ��� Ŭ������ ���� ���� ��ü ���� ����
		//heap�������� ��ü�� ��ġ�� ���������� ���� �ٸ��� ��Ÿ����.
		//��������(��ġ��)�� stack������ �Ҵ�Ǿ� �ִ�.
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	
	}

}

//Food Ŭ���� ����
class Food {
	
}
