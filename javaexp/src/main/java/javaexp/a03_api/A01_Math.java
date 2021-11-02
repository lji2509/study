package javaexp.a03_api;

public class A01_Math {

	public static void main(String[] args) {
		/*
		# Math api 클래스
		1. 수학적인 데이터를 처리해주는 api내부 클래스
		2. 메서드가 static으로 지원하여, 겍체를 생성하지 않고도 바로 사용 가능
		*/
		System.out.println("Math.floor(28.75) : " + Math.floor(28.75)); //소숫점 이하의 값 내림
		System.out.println("Math.ceil(25.263) : " + Math.ceil(25.263)); //소숫점 이하의 값 올림
		System.out.println("Math.round(25.62) : " + Math.round(25.62)); //반올림하여 정수값을 만듬
		System.out.println("Math.round(25.22) : " + Math.round(25.22)); //반올림하여 정수값을 만듬
		System.out.println("Math.floor(25.75) : " + (int)Math.floor(25.75));
		//Math.floor(), Math.ceil()은 리턴값이 실수이기에 정수값으로 처리하기 위해서는 casting 필요
		/*
		3. Math.random() : 0.0 <= Math.random() < 1.0 사이 임의의 실수 리턴
		*/
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() : " + Math.random()*10);
		System.out.println("Math.random() : " + (int)(Math.random()*10)); //0~9
		System.out.println("Math.random() : " + (int)(Math.random()*10+1)); //1~10 
		System.out.println("Math.random() : " + (int)(Math.random()*6+1)); //1~6
		
		int team1 = (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1);
		System.out.println("팀1이 나온 주사위 : " + team1);
		System.out.println("팀2이 나온 주사위 : " + team2);
		
		if(team1>team2) {
			System.out.println("팀1 우승");
		} else if(team1<team2) {
			System.out.println("팀2 우승");
		} else {
			System.out.println("무승부");
		}
		
		// (int)(Math.random()*경우의 수+시작번호)
		
		int a = (int)(Math.random()*2+1);
		System.out.println("1 또는 2 : " + a);
		int b = (int)(Math.random()*5+1);
		System.out.println("1~5사이의 임의의 값 : " + b);
		int c = (int)(Math.random()*3);
		if(c==0) {
			System.out.println("가위");
		} else if(c==1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		
	}

}
