package a02_aop.vo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;


/*
# 공통 모듈(로그 처리)
1. 대상 객체에 대한 클래스명, 메서드, 시작과 종료시간으로 출력 처리한다.
*/
public class A01_Loggin implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invoke) throws Throwable {
		//1. 어느 시점의 메서드를 호출하는지를 가져온다.
		//	pointcut 메서드 호출기능
		String methodname = invoke.getMethod().getName();
		//2. Stopwatch를 통해서 해당 메서드의 시작시간, 종료시간, 수행시간을 기록하게 해준다.
		StopWatch sw = new StopWatch();
		//	시작 시간 check
		sw.start();
		//3. pointcut 메서드 호출
		System.out.println("메서드 로그 정보 : " + methodname + " 호출 시작");
		Object obj = invoke.proceed();
		//	종료 시간 check
		sw.stop();
		System.out.println("메서드 로그 정보 : " + methodname + " 호출 종료");
		System.out.println("메서드 로그 정보 소요시간 : " + sw.getTotalTimeSeconds() + "초");
		return obj;
	}
}
