package javaexp.a02_middle;

public class A06_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3" + 1/0); //에러가 발생하면 더 이상 수행할 수 없게 된다.
		//에러가 나더라도 해당 에러에 대한 표시를 햊고 정상 프로세스를 진행할 수 있게 하는 것 ==> 예외처리
		} catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		System.out.println("4");
		System.out.println("5");
	}

}
