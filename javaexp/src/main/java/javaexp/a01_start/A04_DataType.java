package javaexp.a01_start;

public class A04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 정수형과 실수형의 데이터처리
		//2. char 유형의 변경
		
		int num1 = 25;
		double num2 = 30.45;
		System.out.println("정수형 데이터 : " + num1);
		System.out.println("실수형 데이터 : " + num2);

		char ch1 = 'A'; //홑따옴표로 문자 하나를 할당
		System.out.println("문자형 데이터 : " + ch1);
		// char ==> char[](문자열) ==> String 문자열객체 사용
		
		int code1 = 66;
		char ch2 = (char)code1; // int형의 값을 char로 변경
		System.out.println("문자 : " + ch2);
		
		String name = "홍길동";
		int kor = 60, eng = 85, mat = 95, sum = kor+eng+mat;
		double avg = sum/3.0;
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		int papp = 3000, capp = 2;
		int pban = 4000, cban = 3;
		int pstr = 12000, cstr = 5;
		int tot = (papp*capp) + (pban*cban) + (pstr*cstr);
		double avg1 = tot / capp+cban+cstr;
		System.out.println("사과의 가격은 " + papp + "원이고, 사과의 갯수는 " + capp + "개 입니다.");
		System.out.println("바나나의 가격은 " + pban + "원이고, 바나나의 갯수는 " + cban + "개 입니다.");
		System.out.println("딸기의 가격은 " + pstr + "원이고, 딸기의 갯수는 " + cstr + "개 입니다.");
		System.out.println("총 가격은 " + tot + "원이고, 평균은 " + avg1 + "원 입니다.");
		
		
	}

}
