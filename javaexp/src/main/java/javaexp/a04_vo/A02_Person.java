package javaexp.a04_vo;

public class A02_Person {
	//�ʵ尪�� private�� �����Ͽ� �ܺ��� �������� ������ ���´�.
	private String name;
	private int age;
	private String loc;

	//�Ű������� ���� ������ �ڵ�����
	public A02_Person() {
		//super() : ����Ŭ������ ������ ȣ��
		super();
	}

	//�ʵ尪�� �ʱ�ȭ�ϴ� ������ �ڵ� ȣ��
	public A02_Person(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	//�ʵ��� ����޼��� setXXX(), ȣ��޼��� getXXX()
	//�б�� ����� �޼��带 �и����� ��ü�� �ʵ带 ��ȣ�Ѵ�.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	

}
