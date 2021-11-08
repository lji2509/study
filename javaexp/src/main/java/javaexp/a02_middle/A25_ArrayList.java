package javaexp.a02_middle;

import java.util.ArrayList;

public class A25_ArrayList {

	public static void main(String[] args) {
		/*
		# �����迭�� ó���ϴ� ���� ArrayList Collections
		1. �迭�� ���������Ϳ��� ������ü�� �ʱ⿡ ũ�Ⱑ �������� �������� ���Ѵ�.
		2. �ڹٿ����� Collection ������ ���������� List �������̽��� ��ӹ��� ArrayList��ü�� ���� �����迭�� �����ϰ� �ִ�.
		3. ��ü ����
			ArrayList list = new ArrayList();
		4. �����޼���
			.add("�߰�������");
			.set(index, "�����ҵ�����");
			.get(index); : �ش� ������ ��������
			.size() : ArrayList�� �Ҵ�� ������ �Ǽ� ��������
		5. �Ҵ��� ������ ������ �⺻������ Object ������ ��ü�� �����ϰ� �ִ�.
			ArrayList<������������ü>
		*/
		
		ArrayList list = new ArrayList();
		
		//�߰� ó��
		list.add("���");
		list.add("�ٳ���");
		list.add("����");
		list.add("���");
		
		//���� ũ�� Ȯ��
		System.out.println(list.size());
		
		//�������� ����
		list.set(0,  "������");
		list.set(3,  "����");
		
		//�� �����͸� index���� Ȯ��
		System.out.println("1��° ������ : " + list.get(0));
		System.out.println("2��° ������ : " + list.get(1));
		System.out.println("3��° ������ : " + list.get(2));
		System.out.println("4��° ������ : " + list.get(3));
		
		ArrayList food = new ArrayList();
		
		food.add("��â");
		food.add("ġŲ");
		food.add("�ʹ�");
		
		for(int i=0; i<food.size(); i++) {
			System.out.println("�����ϴ� ����" + (i+1) + ": " + food.get(i));
		}
		
	}

}
