package a02_aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

//컨테이너에서 사용할 수행 시간 측정 프로파일러 advice
//a02_aop.advice.Profiler
public class Profiler {
	public Object trace(ProceedingJoinPoint jointPoint) {
		Object obj = null;
		//1. 수행 정보 출력
		String signatureStr = jointPoint.getSignature().toShortString();
		System.out.println(signatureStr + "시작!");
		//	1) 처리하는 수행의 부하를 파악하는 시작/마지막시간 check
		long start = System.currentTimeMillis();
		
		try {
			obj = jointPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("수행시 예외 발생 : " + e.getMessage());
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + "종료");
			System.out.println("수행시간 : " + (end-start) + "밀리 세컨드(millis)");
		}
		return obj;
	}

}
