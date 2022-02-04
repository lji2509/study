package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Juliet;
import a01_diexp.vo3.Romeo;
import a01_diexp.vo3.Product;

public class DIExp_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DI(의존성 주입)을 위한 연습 환경 만들기
		String path = "a01_diexp\\di10.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		//컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Product p1 = ctx.getBean("product", Product.class);
		System.out.println("객체생성 : " + p1);
		
		Romeo r1 = ctx.getBean("r1", Romeo.class);
		r1.callJuliet();
		
		Juliet j1 = ctx.getBean("j1", Juliet.class);
		j1.replyCall();
		
		ctx.close();
	}

}
