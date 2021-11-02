package javaexp.a01_start;

public class A07_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//# 반복문의 기본 형식
		//for(초기값선언; 반복할조건; 증감연산자) {
		//	반복할 내용
		//	}
		for(int cnt=1; cnt<=10; cnt++) {
			System.out.println("카운트 : " + cnt);
		}
	
		System.out.println("# 10 ~ 20 #");
		for(int cnt=10; cnt<=20; cnt++) {
			System.out.println("카운트 : " + cnt);
		}
	
		System.out.println("# 30 ~ 50 #");
		for(int cnt=30; cnt<=50; cnt++) {
			System.out.println("카운트 : " + cnt);
		}
	
		for(int cnt=100; cnt>=90; cnt--) {
			if(cnt==90) {
				System.out.print(cnt);				
			} else {
				System.out.print(cnt + ", ");
			}
		}
	}
}
