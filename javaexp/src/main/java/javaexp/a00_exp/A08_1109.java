package javaexp.a00_exp;
/*
//과제1, 과제3
	# 화면의 구성요소
	1) 화면 전체 구성요소
		<!DOCTYPE html> : html태그와 속성을 선언한 dtd파일을 지정. html5통일
		<html> : html의 최상위 구성요소
			<head> : body를 위한 처리의 기본적인 정보를 설정할 내용 기술
				<meta charset = "utf-8"/>
				<title></title>
			</head>
			<body> : 실제화면에 나타날 내용 구성
				<h1 align="center">안녕하세요</h1>
				<aaa>안녕</aaa> (X) dtd파일에 선언된 내용이 아님
			</body>
		</html>
	2) 태그 자체에 대한 구성요소
		<태그명 속성="속성값">표현할 내용</태그명>
		전체 내용을 elements라고 요소라고 한다.
		각각의 속성과 표현할 내용으로 구성되어 있다.
		ex) <h1 align="center">안녕하세요(중앙정렬)</h1>
	
//과제2
	html 태그 주석
		<!-- 주석--> : 중간에 태그들이 들어가거나 특수문자가 들어가면 에러 발생
	css 주석
		<style>
		/* 주석처리 */
/*
		</style>
		<script>
*/
			//자바스크립트 주석
			/* 다중 라인 주석 */
		
/*
		</script>
			<%--
			jsp 주석
			--%>

//과제4
	<style>
		선택자{속성:속성값; 속성2:속성2값;}
		: body에 있는 특정 태그나 id, 클래스 등을 선택해서 속성과 속성값을 설정한다.
		h1{
			color:yellow; 
			background:navy;
		}
	</style>
	<body>
		<h1>색상과 배경색상</h1>
	</body>
	
//과제6
	<script>
		alert("안녕하세요");
	</script>

//과제8
	웹서버 : css, htm, javascript, 이미지 등 frontedn프로그램을 처리할 수 있는 서버를 말한다.
		network를 통하여 웹 서비스를 지원할 수 있다.
	웹애플리케이션서버 : frontend단 프로그램에 덧붙여 java를 컴파일하고, 컴파일된 자바코드와 위 내용을 혼합하여 웹 서비스를 지원할 수 있다.
		주로 db처리나 java를 통한 backend단 프로그램을 처리해야 하는 경우에 활용된다.
*/
		

public class A08_1109 {

	public static void main(String[] args) {
		int num[] = new int[3];
		int max = 0;
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100+1);
			System.out.println("num[" + i + "] : " + num[i]);
		}
		for(int n=0; n<num.length; n++) {
				if(num[n] > max)
					max = num[n];
		}
		System.out.println("max : " + max);
	}
	/* 알고리즘
		프로그램이나 문제가 발생할 때, 효과적인 해결과제를 순차적으로 나열하고 해당내용을 처리하는 것을 말하는데, 프로그래밍에서 길러야할 중요한 내용이다.
		프로그램에서는 수행되는 속도와 메모리를 계산하여 최적의 방법을 마련하는 것을 목표로 하고 있다.
	*/
	
}

/*
1. 태그의 구성요소를 예제를 통해서 기술하세요.
2. html에서 사용하는 주석 처리 방법을 기술하세요.
3. html의 최상위 기본 구조와 관련된 태그들의 의미를 기술하세요.
4. 내부스타일 선언에 있어서 기본 형식을 기술하세요.
5. 외부스타일의 선언하는 기본 형식을 기술하고,
	javaexp\src\main\webapp\a01_html 폴드 하위
	a00_exp폴드를 만들어, z01_style.css파일에 h2의 배경색상과 글자색상을 지정하고, a01_styleOuter.html를 만들어 해당 css파일을 호출하여 화면에서 출력되게 하세요.
6. javascript의 내부 코드로 "안녕하세요"를 javascript의 경고창(alert())으로 출력하세요
7. 외부 js파일을 javaexp\src\main\webapp\a01_html\a00_exp에
	z02_style.js 파일로 생성하고, a02_scriptOuter.html을 만들어 호출하게 하세요.
8. 웹서버와 웹어플리케이션 서버의 차이점을 기술하세요.
9. 다이나믹웹 프로젝트를 하나 만들어 index.html을 eclipse하위에 src\main\webapp 경로에 만들어, tomcat을 통해 실행되게 처리하세요.
10. 위 프로젝트 생성과정을 ppt로 작성하여, 결과물을 제출하세요.
11. 3개의 랜덤한 변수 중에서 최대값 찾는 알고리즘
*/