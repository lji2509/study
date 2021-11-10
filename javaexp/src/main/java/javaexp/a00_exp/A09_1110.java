package javaexp.a00_exp;

public class A09_1110 {

	//과제1
	/*
	- p 태그는 본문 글자 생성하는 태그로 <p>본문내용</p> 형식으로 사용한다.
		align속성을 이용하여 왼쪽, 가운데, 오른쪽 정렬을 할 수 있다.
	- hr 태그는 다른 태그 내부에 삽입되어 처리되지 않는다.
		주로 수평선을 입력해서 처리할 때 활용되나, hr은 수평선이기 때문에 프로그래밍적으로 줄바꿈 기능을 포함하고 있다.
	- br 태그는 다른 글자 태그 내부에 삽입하여 줄 바꾸기 기능을 수행한다.
		html에서는 코드로 줄바꾸어지지 않기 때문에, 명시적으로 br태그나 태그 자체에서 줄바꿈 기능을 포함한 태그를 수행하여야 한다.
	- a 태그는 다른 웹 페이지나 웹 페이지 내부의 특정 위치로 이동할 때 사용한다.
		href 속성으로 이동할 페이지를 입력하여 이동할 수 있다.
	*/
	
	//과제2
	/*
	<body>
		<h2 align="center">JAVA</h2>
		<hr/>
		<p align="center">객체 지향 프로그래밍 언어로서 보안성이 뛰어나며 컴파일한 코드는 다른 운영 체제에서 사용할 수 있도록 클래스(class)로 제공된다. <br>
		객체 지향 언어인 C++ 언어의 객체 지향적인 장점을 살리면서 분산 환경을 지원하며 더욱 효율적이다.</p>
		
		<h2 align="center">JSP</h2>
		<hr/>
		<p align="center">HTML내에 자바 코드를 삽입하여 웹 서버에서 동적으로 웹 페이지를 생성하여 웹 브라우저에 돌려주는 서버 사이드 스크립트 언어이다. <br>
		Java EE 스펙 중 일부로 웹 애플리케이션 서버에서 동작한다.</p>
		</h2>
		
		<h2 align="center">SPRING</h2>
		<hr/>
		<p align="center">자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크이다. <br>
		대한민국 전자정부 표준프레임워크의 기반 기술로 사용되고 있다.
		</h2>
		
	</body>
	*/
	
	//과제3
	/*
	a 태그는 <a href="이동할페이지">출력내용</a> 형식으로 사용한다.
	이동할 페이지에는 페이지의 상대경로, 절대경로 등을 입력하고, 출력내용에 적은 글을 누르면 해당 페이지로 넘어간다.
	*/
	
	//과제4
	/*
	하이퍼링크란, 사용자의 선택에 따라 특정 정보로 이동하는 조직된 문서이며 하이퍼텍스트라고도 한다.
	절대적 주소란, C:/Users/user/git/repository/javaexp/src/main/webapp/test.html 와 같이 해당 html 파일의 주소를 전부 적어주어야한다.
		그러나 C:/Users/user/git/repository/javaexp/src/main/webapp 는 로컬서버의 절대경로로 정해져있기 때문에,
		href에 입력할 때에는 프로젝트명과 해당 파일에 가기 위한 폴더 경로, 파일명만 적어주면 된다. ex)javaexp/test.html
		프로그램은 javaexp/src/main/webapp에 있는 폴더와 파일만을 탐색하기 때문에, javaexp만 적어주어도 무방하다.
	상대적 주소란, 현재 자신의 작업하고 있는 파일의 위치를 기준으로 경로를 설정하는 것이다.
		../ 는 상위폴더로, ./ 는 현재폴더를 가리킨다.
		예를 들어, javaexp폴더 안에 a02_htmlStart 폴더와 a03_basicTag 폴더가 있고, 현재 a02_htmlStart폴더에서 작업 중일 때,
		../a03_basicTag/파일명.html 로 적으면, a03_basicTag폴더에 있는 파일과 연결할 수 있다.
	*/
	
	//과제5
	/*
	<body>
		<a href="/javaexp/a01_html/a03_basicTag/a08_show.html">a08_show</a> : 절대경로를 이용하여 내부페이지로 이동이 가능하다.
	 
	 	<p align="center"> <a href="/javaexp/a01_html/index.html">index</a></p> : 절대경로를 이용하여 내부페이지로 이동이 가능하다. p 태그를 이용하여 하이퍼텍스트 바깥에 텍스트 추가가 가능하며, p 태그의 align 속성으로 정렬도 가능하다.
	 
	 	<a href="https://www.naver.com/">네이버</a><br> : 웹사이트의 주소를 절대경로로 이용할 수 있다.
 	</body>
	*/
	
	//과제6
	/*
	<body>
		<a href="a08_show.html">상대경로1(a08_show.html)</a><br> : 현재 폴더에 있는 파일 가져오기
	 	<a href="../start.html">상대경로2(start.html)</a><br> : 상위 폴더에 있는 파일 가져오기
	 	<a href="../a02_htmlStart/a01_start.html">상대경로3(start.html)a><br> : 상위 폴더의 다른 폴더에 있는 파일 가져오기
	 	<a href="../../index.html">상대경로4(index.html)</a><br> : 상위 폴더의 상위 폴더의 파일 가져오기
	 	<a href="./a01_com/a01_com.html">상대경로5(a01_com.html)</a> : 현재 폴더의 하위 폴더의 파일 가져오기
	 </body>
	*/
	
	//과제7
	/*
		<body>
		<h2>frondend</h2>
		 	<ol type="a" >
		 		<li>CSS</li>
		 		<li>자바스크립트</li>
		 		<li>HTML</li>
		 	</ol>
		 	
		 	<h2>backend</h2>
		 	<ul type="circle">
		 		<li>JSP</li>
		 		<li>JAVA</li>
		 		<li>SPRING</li>
		 	</ul>
	</body>
	*/
	
	public static void main(String[] args) {
		int num[] = new int[10];
		int max=0, min=100;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100+1);
			System.out.println("num" + (i+1) + " 값 : " + num[i]);
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i] > max)
				max = num[i];
			if(num[i] < min) 
				min = num[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}

/*
1. html에 있어서 p, hr, br, a의 의미를 기술하세요.
2. h2와 p, hr과 속성 align, hr를 이용해서 위키백과사전을 검색해서 java,jsp,spring를 출력하세요.
3. a의 기본 속성과 사용방법을 기술하세요.
4. hyperlink란 무엇을 의미하는지 기술하고, 오늘 연습한 상대적 주소와 절대적 주소의 의미를 각각 1개씩 예제를 통해서 설명하세요.
5. 절대적 주소호출 패턴 3가지를 예제를 통해서 만드세요
6. 상대적 주소호출 패턴 5가지를 예제를 통해서 만드세요
7. 목록 태그를 이용하여, frontend 과목과 backend 과목을 리스트하여 출력하세요.
8. 10개 정수형 데이터가 들어가는 배열을 만들고, 임의로 데이터값(1~100)을 할당하고, 이 배열 데이터 중 가장 큰 데이터와 가장 작은 데이터를 출력하세요.
*/