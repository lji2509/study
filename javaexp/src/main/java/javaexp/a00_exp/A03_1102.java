package javaexp.a00_exp;

public class A03_1102 {
	//과제1
	/*
	void는 메서드를 사용할 때, 리턴값이 없는 경우 사용하는 리턴유형이다.
		1. 콘솔창에 출력만 하고자 할 때
			void greeting() {
				Sysout.out.println("안녕하세요");
			}
		2. 매개변수를 통해서 객체에 저장하고자 할 때
			ex) 사람의 귀는 음성정보를 받아서 뇌에 전달한다.
			객체의 외부의 데이터를 받아서 필드에 전달할 때, 주로 리턴값이 필요없다.
			void setName(String name) {
				this.name = name ; 
			}
		3. 기능 프로세스만 처리할 때, 리턴값이 없는 경우
			ex) 사람이 어떤 계획을 하거나 생각을 할 때는 외부에 입력도, 리턴도 하지 않지만 추후에 행동에 영향을 미칠 판단을 하게 된다.
			void setCalculator()
				//필드에 있는 데이터를 연산처리하여 필드에 데이터를 할당처리
				sum = num1 + num2;
	*/
	
	//과제2
	/*
	1) 데이터가 외부에서 입력되는 형태를 말하고, 외부에서도 이에 맞게 입력하여야 한다.
	2) 메서드를 통해서 데이터의 입력이 없을 때
		void call() {}
	3) 데이터의 입력이 하나만 있을 때, 해당 타입에 따라서 호출이 가능하다.
		void setName(String name) {} setName("홍길동");
		void setAge(int age) {} setAge(25);
	4) 데이터가 여러개인 경우 해당 유형과 순서에 맞게 선언하여야 한다.
		void setPerson(String name, int age, String loc) {}
			setPerson("홍길동", 25, "서울 강남");
	*/
	
	//과제3
	static void members(String id, String pw, String name, int point) {
		System.out.println(id + "\t" + pw + "\t" + name + "\t" + point);
	}
	
	//과제4
	static void score(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + sum/3);
		
	}
	
	//과제5
	static double avg(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, sum, avg);
		return avg;
	}
	
	//과제6
	static void gugudan(int dan) {
		System.out.println("# " + dan + "단 #");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	public static void main(String[] args) {
		//과제3
		System.out.println("#회원 등록 내역#");
		System.out.println("ID\tPW\t이름\t포인트");
		members("a123", "1234", "홍길동", 3500);
		members("b234", "5678", "김길동", 5000);
		
		System.out.println();
		
		//과제4
		int sum = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		score("홍길동",94,75,80);
		score("김길동",84,60,79);
		
		System.out.println();
		
		//과제5
		double avg = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		avg += avg("홍길동",94,70,80);
		avg += avg("김길동",80,65,94);
		avg += avg("이길동",88,92,83);
		System.out.printf("전체 총점 : %.2f점\n", avg);
		System.out.printf("전체 평균 : %.2f점\n", avg/3.0);
		
		System.out.println();
		
		//과제6
		gugudan(4);
		
		System.out.println();
		
		//과제7
		System.out.println("1~8 : " + (int)(Math.random()*8+1));
		System.out.println("5~10 : " + (int)(Math.random()*6+5));
		System.out.println("0~100 : " + (int)(Math.random()*101));
		System.out.println("1~12 : " + (int)(Math.random()*12+1));
		
		System.out.println();
		
		//과제8
		System.out.println("학생1 : " + (int)(Math.random()*100+1) + "점");
		System.out.println("학생2 : " + (int)(Math.random()*100+1) + "점");
		System.out.println("학생3 : " + (int)(Math.random()*100+1) + "점");
		
		System.out.println();
		
		//과제9
		int team1_1 = (int)(Math.random()*6+1);
		int team1_2 = (int)(Math.random()*6+1);
		int team2_1 = (int)(Math.random()*6+1);
		int team2_2 = (int)(Math.random()*6+1);
		
		System.out.println("team1의 주사위 눈 : " + team1_1 + ", " + team1_2);
		System.out.println("team2의 주사위 눈 : " + team2_1 + ", " + team2_2);
		System.out.println("team1의 주사위 합 : " + (team1_1 + team1_2));
		System.out.println("team2의 주사위 합 : " + (team2_1 + team2_2));
		
		if((team1_1 + team1_2) > (team2_1 + team2_2)) {
			System.out.println("team1 승리");
		} else if((team1_1 + team1_2) < (team2_1 + team2_2)) {
			System.out.println("team2 승리");
		} else {
			System.out.println("무승부");
		}
		
		System.out.println();
		
		//과제10 1회~10회 진행하여 승리횟수 많은 사람이 승리
		int team3Cnt = 0, team4Cnt = 0, cnt = 0;
		
		for(int i=1; i<=10; i++) {
			int team3_1 = (int)(Math.random()*6+1);
			int team3_2 = (int)(Math.random()*6+1);
			int team4_1 = (int)(Math.random()*6+1);
			int team4_2 = (int)(Math.random()*6+1);
			System.out.println(i +". team3의 주사위 눈 : " + team3_1 + ", " + team3_2);
			System.out.println(i +". team4의 주사위 눈 : " + team4_1 + ", " + team4_2);
			System.out.println("team3의 주사위 합 : " + (team3_1 + team3_2));
			System.out.println("team4의 주사위 합 : " + (team4_1 + team4_2));
			
			if((team3_1 + team3_2) > (team4_1 + team4_2)) {
				System.out.println("team3 승리");
				team3Cnt++;
			} else if((team3_1 + team3_2) < (team4_1 + team4_2)) {
				System.out.println("team4 승리");
				team4Cnt++;
			} else {
				System.out.println("무승부");
				cnt++;
			}
		}
		System.out.println("team3 승리 횟수 : " + team3Cnt);
		System.out.println("team4 승리 횟수 : " + team4Cnt);
		System.out.println("무승부 횟수 : " + cnt);
		
		System.out.println();
		
		//과제10 2번씩 총 10번 던져 눈금을 모두 더해 승리한 사람 구하기
		int fri1Tot = 0, fri2Tot = 0;
		System.out.println("횟수\t친구1\t친구2");
		for(int i=1; i<=10; i++) {
			int friend1 = (int)(Math.random()*11+2);
			int friend2 = (int)(Math.random()*11+2);
			System.out.print(i+"\t");
			System.out.print(friend1+"\t");
			System.out.print(friend2+"\n");
			fri1Tot+=friend1;
			fri2Tot+=friend2;
		}
		System.out.println("#현재 총점#");
		System.out.print("친구1 : " + fri1Tot + "\t");
		System.out.print("친구2 : " + fri2Tot + "\t");
		
		if(fri1Tot>fri2Tot) {
			System.out.println("친구1의 승");
		} else if(fri1Tot<fri2Tot) {
			System.out.println("친구2의 승");
		} else {
			System.out.println("무승부");
		}
		
	}

}
/*
1. 메서드의 void는 어떠한 경우에 쓰이는지 기술하고, 각각의 예제를 간단하게 만드세요.
2. 메서드의 매개변수에 따른 데이터를 처리한다. 매개변수를 처리하는 3가지 유형을 기술하세요.
3. 회원등록, 아이디, 패스워드, 이름, 포인트의 매개변수를 선언하고, 저장된 내용을 출력처리하는 메서드를 기술하세요.
4. 기능 메서드로 학생의 이름과 국어, 영어, 수학 점수를 매개변수로 입력받아 아래의 형식으로 출력하세요.
		이름		국어	영어	수학	총점	평균
		김미나	90	80	70	##	##
5. 평균값을 실수로 리턴해주어, 학생 3명의 전체 총계와 평균을 처리하는 프로그램을 만드세요.
		신영희	90	90	75	##	##
		오윤석	90	85	75	##	##
		전체 총점 : @@
		전체 평균 : @@
6. 반복문 기본형식을 이용하여 입력받은 매개변수의 단수를 출력하는 기능 메서드를 선언하고 호출 처리하세요.
7. 아래의 랜덤 범위를 처리하세요.
		1) 1~8,		2) 5~10,	3) 0~100,	4) 1~12
8. 학생 3명의 국어점수를 임의로 출력하게 하세요.
		학생1 : @@, 학생2 : @@, 학생3 : @@
9. 모두의 마블과 같이 두 친구과 게임을 했을 때, 주사위 두개를 던져 이긴 팀을 출력하세요.
10. 위 모두의 마블을 반복문을 이용해서 10회 했을 때, 최종 우승자를 출력하세요.
*/
 