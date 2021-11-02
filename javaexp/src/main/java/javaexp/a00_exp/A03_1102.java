package javaexp.a00_exp;

public class A03_1102 {
	//과제1
	/*
	void는 리턴값이 없는 메서드를 사용할 때 쓰는 리턴유형이다.
	
		static void show() {
		System.out.println("void는 리턴값이 없다.");
		} 
		
	위와 같이 메소드를 선언하고 mian() 부분에서
	
		show(); 
		
	를 이용하여 리턴값 없이 show 메소드를 사용할 수 있다.
	위 예제에서는 show 메소드의 System.out.println 으로 "void는 리턴값이 없다."가 출력된다.
	*/
	
	//과제2
	/*
	매개변수를 처리하는 3가지 유형에는 3가지가 있다. 
	1.매개변수의 데이터 유형
		static 리턴유형 메소드이름(매개변수유형 매개변수이름)
		에서 매개변수 유형에는 String, int, double... 등이 올 수 있으며, 선언한 매개변수 데이터 유형에 맞는 매개변수를 전달하여야 한다.	
	2.매개변수의 갯수
		static 리턴유형 메소드이름(매개변수유형1 매개변수이름1, 매개변수유형2 매개변수이름2...)
		이렇게 여러개의 매개변수를 전달할 수 있으며, 선언한 매개변수의 갯수에 맞게 매개변수를 전달하여야 한다.
	3.매개변수의 데이터 유형에 따른 순서
		static 리턴유형 메소드이름(int num, String str)
		매개변수를 (int num, String str)로 선언했을 때, 매개변수는 (5, "홍길동)과 같이 데이터유형에 맞는 순서로 매개변수를 전달하여야 한다.
		("홍길동", 5)로 매개변수를 전달할 수 없다.
	*/
	
	//과제3
	static void members(String member, String id, String pw, String name, int point) {
		System.out.println(member + "\t" + id + "\t" + pw + "\t" + name + "\t" + point);
	}
	
	//과제4
	static int score(String name, int kor, int eng, int math) {
		System.out.print(name + "\t" + kor + "\t" + eng + "\t" + math + "\t");
		
		return kor+eng+math;
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
		System.out.println("회원등록\tID\tPW\t이름\t포인트");
		members("1", "a123", "1234", "홍길동", 3500);
		members("2", "b234", "5678", "김길동", 5000);
		
		System.out.println();
		
		//과제4
		int sum = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		sum = score("홍길동",94,75,80);
		System.out.println(sum + "\t" + (sum/3));
		sum = score("김길동",84,60,79);
		System.out.println(sum + "\t" + (sum/3));
		
		System.out.println();
		
		//과제5
		double avg = 0, totAvg = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		avg = avg("홍길동",94,70,80);
		totAvg += avg;
		avg = avg("김길동",80,65,94);
		totAvg += avg;
		avg = avg("이길동",88,92,83);
		totAvg += avg;
		System.out.printf("전체 총점 : %.2f점\n", totAvg);
		System.out.printf("전체 평균 : %.2f점\n", totAvg/3.0);
		
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
		int team1 = (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1);
		
		System.out.println("team1의 주사위 눈 : " + team1);
		System.out.println("team2의 주사위 눈 : " + team2);
		
		if(team1 > team2) {
			System.out.println("team1 승리");
		} else if(team1 < team2) {
			System.out.println("team2 승리");
		} else {
			System.out.println("무승부");
		}
		
		System.out.println();
		
		//과제10
		int team3Cnt = 0, team4Cnt = 0, cnt = 0;
		
		for(int i=1; i<=10; i++) {
			int team3 = (int)(Math.random()*6+1);
			int team4 = (int)(Math.random()*6+1);
			
			System.out.println(i +". team1의 주사위 눈 : " + team3);
			System.out.println(i +". team2의 주사위 눈 : " + team4);
			
			if(team3 > team4) {
				System.out.println("team3 승리");
				team3Cnt++;
			} else if(team3 < team4) {
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
 