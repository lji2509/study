package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.Juliet;
import a01_diexp.vo.Worker;

public class DIExp_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DI(의존성 주입)을 위한 연습 환경 만들기
		String path = "a01_diexp\\di07.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		//컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Juliet j1 = ctx.getBean("j1", Juliet.class);
		j1.replyCall();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.showInfo();
		
		ctx.close();
	}

}
