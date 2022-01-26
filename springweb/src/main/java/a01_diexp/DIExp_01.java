package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.Duck;
import a01_diexp.vo.Fruit;

public class DIExp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DI(의존성 주입)을 위한 연습 환경 만들기
		String path = "a01_diexp\\di01.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		//컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		//xml에 선언한 id/name명을 가져온다.
		Fruit f1 = ctx.getBean("f1", Fruit.class);
		System.out.println("#생성된 객체의 속성 호출#");
		System.out.println(f1.getName()); 
		System.out.println(f1.getPrice()); 
		System.out.println(f1.getProdLoc()); 
		
		Duck d1 = ctx.getBean("d1", Duck.class);
		System.out.println("종류 : " + d1.getKind());
		System.out.println("색상 : " + d1.getColor());
		
		ctx.close();
		
		
	}

}
