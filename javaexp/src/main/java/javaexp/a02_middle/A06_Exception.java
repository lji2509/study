package javaexp.a02_middle;

public class A06_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3" + 1/0); //������ �߻��ϸ� �� �̻� ������ �� ���� �ȴ�.
		//������ ������ �ش� ������ ���� ǥ�ø� �Y�� ���� ���μ����� ������ �� �ְ� �ϴ� �� ==> ����ó��
		} catch(Exception e) {
			System.out.println("���� ó�� : " + e.getMessage());
		}
		System.out.println("4");
		System.out.println("5");
	}

}
