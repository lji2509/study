package javaexp.a00_exp;

public class A03_1102 {
	//����1
	/*
	void�� �޼��带 ����� ��, ���ϰ��� ���� ��� ����ϴ� ���������̴�.
		1. �ܼ�â�� ��¸� �ϰ��� �� ��
			void greeting() {
				Sysout.out.println("�ȳ��ϼ���");
			}
		2. �Ű������� ���ؼ� ��ü�� �����ϰ��� �� ��
			ex) ����� �ʹ� ���������� �޾Ƽ� ���� �����Ѵ�.
			��ü�� �ܺ��� �����͸� �޾Ƽ� �ʵ忡 ������ ��, �ַ� ���ϰ��� �ʿ����.
			void setName(String name) {
				this.name = name ; 
			}
		3. ��� ���μ����� ó���� ��, ���ϰ��� ���� ���
			ex) ����� � ��ȹ�� �ϰų� ������ �� ���� �ܺο� �Էµ�, ���ϵ� ���� ������ ���Ŀ� �ൿ�� ������ ��ĥ �Ǵ��� �ϰ� �ȴ�.
			void setCalculator()
				//�ʵ忡 �ִ� �����͸� ����ó���Ͽ� �ʵ忡 �����͸� �Ҵ�ó��
				sum = num1 + num2;
	*/
	
	//����2
	/*
	1) �����Ͱ� �ܺο��� �ԷµǴ� ���¸� ���ϰ�, �ܺο����� �̿� �°� �Է��Ͽ��� �Ѵ�.
	2) �޼��带 ���ؼ� �������� �Է��� ���� ��
		void call() {}
	3) �������� �Է��� �ϳ��� ���� ��, �ش� Ÿ�Կ� ���� ȣ���� �����ϴ�.
		void setName(String name) {} setName("ȫ�浿");
		void setAge(int age) {} setAge(25);
	4) �����Ͱ� �������� ��� �ش� ������ ������ �°� �����Ͽ��� �Ѵ�.
		void setPerson(String name, int age, String loc) {}
			setPerson("ȫ�浿", 25, "���� ����");
	*/
	
	//����3
	static void members(String id, String pw, String name, int point) {
		System.out.println(id + "\t" + pw + "\t" + name + "\t" + point);
	}
	
	//����4
	static void score(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + sum/3);
		
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
		System.out.println("#ȸ�� ��� ����#");
		System.out.println("ID\tPW\t�̸�\t����Ʈ");
		members("a123", "1234", "ȫ�浿", 3500);
		members("b234", "5678", "��浿", 5000);
		
		System.out.println();
		
		//����4
		int sum = 0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		score("ȫ�浿",94,75,80);
		score("��浿",84,60,79);
		
		System.out.println();
		
		//����5
		double avg = 0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		avg += avg("ȫ�浿",94,70,80);
		avg += avg("��浿",80,65,94);
		avg += avg("�̱浿",88,92,83);
		System.out.printf("��ü ���� : %.2f��\n", avg);
		System.out.printf("��ü ��� : %.2f��\n", avg/3.0);
		
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
		int team1_1 = (int)(Math.random()*6+1);
		int team1_2 = (int)(Math.random()*6+1);
		int team2_1 = (int)(Math.random()*6+1);
		int team2_2 = (int)(Math.random()*6+1);
		
		System.out.println("team1�� �ֻ��� �� : " + team1_1 + ", " + team1_2);
		System.out.println("team2�� �ֻ��� �� : " + team2_1 + ", " + team2_2);
		System.out.println("team1�� �ֻ��� �� : " + (team1_1 + team1_2));
		System.out.println("team2�� �ֻ��� �� : " + (team2_1 + team2_2));
		
		if((team1_1 + team1_2) > (team2_1 + team2_2)) {
			System.out.println("team1 �¸�");
		} else if((team1_1 + team1_2) < (team2_1 + team2_2)) {
			System.out.println("team2 �¸�");
		} else {
			System.out.println("���º�");
		}
		
		System.out.println();
		
		//����10 1ȸ~10ȸ �����Ͽ� �¸�Ƚ�� ���� ����� �¸�
		int team3Cnt = 0, team4Cnt = 0, cnt = 0;
		
		for(int i=1; i<=10; i++) {
			int team3_1 = (int)(Math.random()*6+1);
			int team3_2 = (int)(Math.random()*6+1);
			int team4_1 = (int)(Math.random()*6+1);
			int team4_2 = (int)(Math.random()*6+1);
			System.out.println(i +". team3�� �ֻ��� �� : " + team3_1 + ", " + team3_2);
			System.out.println(i +". team4�� �ֻ��� �� : " + team4_1 + ", " + team4_2);
			System.out.println("team3�� �ֻ��� �� : " + (team3_1 + team3_2));
			System.out.println("team4�� �ֻ��� �� : " + (team4_1 + team4_2));
			
			if((team3_1 + team3_2) > (team4_1 + team4_2)) {
				System.out.println("team3 �¸�");
				team3Cnt++;
			} else if((team3_1 + team3_2) < (team4_1 + team4_2)) {
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
		
		System.out.println();
		
		//����10 2���� �� 10�� ���� ������ ��� ���� �¸��� ��� ���ϱ�
		int fri1Tot = 0, fri2Tot = 0;
		System.out.println("Ƚ��\tģ��1\tģ��2");
		for(int i=1; i<=10; i++) {
			int friend1 = (int)(Math.random()*11+2);
			int friend2 = (int)(Math.random()*11+2);
			System.out.print(i+"\t");
			System.out.print(friend1+"\t");
			System.out.print(friend2+"\n");
			fri1Tot+=friend1;
			fri2Tot+=friend2;
		}
		System.out.println("#���� ����#");
		System.out.print("ģ��1 : " + fri1Tot + "\t");
		System.out.print("ģ��2 : " + fri2Tot + "\t");
		
		if(fri1Tot>fri2Tot) {
			System.out.println("ģ��1�� ��");
		} else if(fri1Tot<fri2Tot) {
			System.out.println("ģ��2�� ��");
		} else {
			System.out.println("���º�");
		}
		
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
 