package javaexp.a00_exp;

public class A03_1102 {
	//����1
	/*
	void�� ���ϰ��� ���� �޼��带 ����� �� ���� ���������̴�.
	
		static void show() {
		System.out.println("void�� ���ϰ��� ����.");
		} 
		
	���� ���� �޼ҵ带 �����ϰ� mian() �κп���
	
		show(); 
		
	�� �̿��Ͽ� ���ϰ� ���� show �޼ҵ带 ����� �� �ִ�.
	�� ���������� show �޼ҵ��� System.out.println ���� "void�� ���ϰ��� ����."�� ��µȴ�.
	*/
	
	//����2
	/*
	�Ű������� ó���ϴ� 3���� �������� 3������ �ִ�. 
	1.�Ű������� ������ ����
		static �������� �޼ҵ��̸�(�Ű��������� �Ű������̸�)
		���� �Ű����� �������� String, int, double... ���� �� �� ������, ������ �Ű����� ������ ������ �´� �Ű������� �����Ͽ��� �Ѵ�.	
	2.�Ű������� ����
		static �������� �޼ҵ��̸�(�Ű���������1 �Ű������̸�1, �Ű���������2 �Ű������̸�2...)
		�̷��� �������� �Ű������� ������ �� ������, ������ �Ű������� ������ �°� �Ű������� �����Ͽ��� �Ѵ�.
	3.�Ű������� ������ ������ ���� ����
		static �������� �޼ҵ��̸�(int num, String str)
		�Ű������� (int num, String str)�� �������� ��, �Ű������� (5, "ȫ�浿)�� ���� ������������ �´� ������ �Ű������� �����Ͽ��� �Ѵ�.
		("ȫ�浿", 5)�� �Ű������� ������ �� ����.
	*/
	
	//����3
	static void members(String member, String id, String pw, String name, int point) {
		System.out.println(member + "\t" + id + "\t" + pw + "\t" + name + "\t" + point);
	}
	
	//����4
	static int score(String name, int kor, int eng, int math) {
		System.out.print(name + "\t" + kor + "\t" + eng + "\t" + math + "\t");
		
		return kor+eng+math;
	}
	
	//����5
	static double avg(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, sum, avg);
		return avg;
	}
	
	//����6
	static void gugudan(int dan) {
		System.out.println("# " + dan + "�� #");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	public static void main(String[] args) {
		//����3
		System.out.println("ȸ�����\tID\tPW\t�̸�\t����Ʈ");
		members("1", "a123", "1234", "ȫ�浿", 3500);
		members("2", "b234", "5678", "��浿", 5000);
		
		System.out.println();
		
		//����4
		int sum = 0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		sum = score("ȫ�浿",94,75,80);
		System.out.println(sum + "\t" + (sum/3));
		sum = score("��浿",84,60,79);
		System.out.println(sum + "\t" + (sum/3));
		
		System.out.println();
		
		//����5
		double avg = 0, totAvg = 0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		avg = avg("ȫ�浿",94,70,80);
		totAvg += avg;
		avg = avg("��浿",80,65,94);
		totAvg += avg;
		avg = avg("�̱浿",88,92,83);
		totAvg += avg;
		System.out.printf("��ü ���� : %.2f��\n", totAvg);
		System.out.printf("��ü ��� : %.2f��\n", totAvg/3.0);
		
		System.out.println();
		
		//����6
		gugudan(4);
		
		System.out.println();
		
		//����7
		System.out.println("1~8 : " + (int)(Math.random()*8+1));
		System.out.println("5~10 : " + (int)(Math.random()*6+5));
		System.out.println("0~100 : " + (int)(Math.random()*101));
		System.out.println("1~12 : " + (int)(Math.random()*12+1));
		
		System.out.println();
		
		//����8
		System.out.println("�л�1 : " + (int)(Math.random()*100+1) + "��");
		System.out.println("�л�2 : " + (int)(Math.random()*100+1) + "��");
		System.out.println("�л�3 : " + (int)(Math.random()*100+1) + "��");
		
		System.out.println();
		
		//����9
		int team1 = (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1);
		
		System.out.println("team1�� �ֻ��� �� : " + team1);
		System.out.println("team2�� �ֻ��� �� : " + team2);
		
		if(team1 > team2) {
			System.out.println("team1 �¸�");
		} else if(team1 < team2) {
			System.out.println("team2 �¸�");
		} else {
			System.out.println("���º�");
		}
		
		System.out.println();
		
		//����10
		int team3Cnt = 0, team4Cnt = 0, cnt = 0;
		
		for(int i=1; i<=10; i++) {
			int team3 = (int)(Math.random()*6+1);
			int team4 = (int)(Math.random()*6+1);
			
			System.out.println(i +". team1�� �ֻ��� �� : " + team3);
			System.out.println(i +". team2�� �ֻ��� �� : " + team4);
			
			if(team3 > team4) {
				System.out.println("team3 �¸�");
				team3Cnt++;
			} else if(team3 < team4) {
				System.out.println("team4 �¸�");
				team4Cnt++;
			} else {
				System.out.println("���º�");
				cnt++;
			}
		}
		System.out.println("team3 �¸� Ƚ�� : " + team3Cnt);
		System.out.println("team4 �¸� Ƚ�� : " + team4Cnt);
		System.out.println("���º� Ƚ�� : " + cnt);
		
		
	}

}
/*
1. �޼����� void�� ��� ��쿡 ���̴��� ����ϰ�, ������ ������ �����ϰ� ���弼��.
2. �޼����� �Ű������� ���� �����͸� ó���Ѵ�. �Ű������� ó���ϴ� 3���� ������ ����ϼ���.
3. ȸ�����, ���̵�, �н�����, �̸�, ����Ʈ�� �Ű������� �����ϰ�, ����� ������ ���ó���ϴ� �޼��带 ����ϼ���.
4. ��� �޼���� �л��� �̸��� ����, ����, ���� ������ �Ű������� �Է¹޾� �Ʒ��� �������� ����ϼ���.
		�̸�		����	����	����	����	���
		��̳�	90	80	70	##	##
5. ��հ��� �Ǽ��� �������־�, �л� 3���� ��ü �Ѱ�� ����� ó���ϴ� ���α׷��� ���弼��.
		�ſ���	90	90	75	##	##
		������	90	85	75	##	##
		��ü ���� : @@
		��ü ��� : @@
6. �ݺ��� �⺻������ �̿��Ͽ� �Է¹��� �Ű������� �ܼ��� ����ϴ� ��� �޼��带 �����ϰ� ȣ�� ó���ϼ���.
7. �Ʒ��� ���� ������ ó���ϼ���.
		1) 1~8,		2) 5~10,	3) 0~100,	4) 1~12
8. �л� 3���� ���������� ���Ƿ� ����ϰ� �ϼ���.
		�л�1 : @@, �л�2 : @@, �л�3 : @@
9. ����� ����� ���� �� ģ���� ������ ���� ��, �ֻ��� �ΰ��� ���� �̱� ���� ����ϼ���.
10. �� ����� ������ �ݺ����� �̿��ؼ� 10ȸ ���� ��, ���� ����ڸ� ����ϼ���.
*/
 