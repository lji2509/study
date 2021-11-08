package javaexp.a02_middle;

public class A02_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array; //배열의 선언
		array = new int[3]; //배열의 객체 생성 : 정수형 3개
		array[0] = 25;
		array[1] = 30;
		array[2] = 40;
		System.out.println("배열에 할당한 데이터 : " + array[0]);
		System.out.println("배열에 할당한 데이터 : " + array[1]);
		System.out.println("배열에 할당한 데이터 : " + array[2]);
		
		
		int point[] = new int[3];
		point[0] = 50;
		point[1] = 80;
		point[2] = 75;
		
		System.out.println("국어 점수 : " + point[0] + "점");
		System.out.println("수학 점수 : " + point[1] + "점");
		System.out.println("영어 점수 : " + point[2] + "점");
		
	}

}
