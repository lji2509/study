
public class test2 {
	
	static int totSum = 0;
	static double totAvg = 0;
	
	static double avg(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		totSum += sum;
		totAvg += avg;
		return totAvg;
	}
	
	public static void main(String[] args) {
		double avg = 0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		avg = avg("ȫ�浿",94,70,80);
		avg = avg("��浿",80,65,94);
		avg = avg("�̱浿",88,92,83);
		System.out.println("��ü ���� : " + totSum + "��");
		System.out.printf("��ü ��� : %.2f��\n", avg/3);
	}

}
