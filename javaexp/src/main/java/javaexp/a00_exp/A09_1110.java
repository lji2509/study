package javaexp.a00_exp;

import java.util.ArrayList;

public class A09_1110 {

	//과제1
	/*
	p: 문단을 의미하며 화면에서 문단을 처리할 때 사용된다.
		align속성을 지원하여 문단의 왼쪽, 오른쪽, 중앙 정렬을 처리할 수 있다.
	hr : 수평선을 처리하는 역할을 한다.
		화면단위로 수평선의 경계를 처리하고 구분되는 내용을 확인할 수 있다.
	br : 기본적으로 태그없이는 공백(2칸이상)이나 줄바꿈을 웹화면에서 지원하지 않는다.
		br태그를 통해서 명시적으로 줄바꿈 처리를 할 수 있다.
	a : anchor로 하이퍼링크로 특정한 페이지를 호출할 수 있게 한다.
		외부사이트, 내부사이트(상대경로/절대경로)를 통해서 하이퍼텍스트를 호출할 수 있다.
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
	형식 :  <a href="이동할페이지">출력내용</a> 
	속성 : href - 이동페이지를 지정한 속성
	*/
	
	//과제4
	/*
	하이퍼텍스트 : 특정한 문서가 다른 문서로 이동되어서 확인 가능한 형식의 문서를 말한다.
	하이퍼링크 : 하이퍼텍스트가 이동할 때, 연결된 내용을 전달할 수 있게 된 것을 말한다.
	# 상대경로 : 현재 로딩되는 페이지를 기준으로 경로를 설정
		<a href="call.html">현재 폴더에 파일이 있을 때</a>
	# 절대경로 : 서버의 특정 위치를 경로의 기준으로 설정하는 것을 말한다.
		웹 서버의 경우 root 경로 즉, 프로젝트 기준으로 javaexp\src\main\webapp 를 말하는데,
		이는 서버가 기동되었을 때, http://localhost:7080/javaexp/ 의 경로를 말한다.
			http://localhost:7080는 생략이 가능하다.
			<a href="/javaexp/index.html"> 서버의 최상위 경로에 index.html</a>
	*/
	
	//과제5
	/*
	<body>
		<a href="/javaexp/a01_html/a03_basicTag/a08_show.html">a08_show</a> : 절대경로를 이용하여 내부페이지로 이동이 가능하다.
	 
	 	<p align="center"> <a href="/javaexp/a01_html/index.html">index</a></p> : 절대경로를 이용하여 내부페이지로 이동이 가능하다. p 태그를 이용하여 하이퍼텍스트 바깥에 텍스트 추가가 가능하며, p 태그의 align 속성으로 정렬도 가능하다.
	 
	 	<a href="https://www.naver.com/">네이버</a><br> : 웹사이트의 주소로 외부페이지로 이동이 가능하다.
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
		 	<ol type="a" > : 순서O, type="A|a|I|i|1(디폴트)"
		 		<li>CSS</li>
		 		<li>자바스크립트</li>
		 		<li>HTML</li>
		 	</ol>
		 	
		 	<h2>backend</h2>
		 	<ul type="circle"> : 순서X, type="cirle|disc(디폴트)|square"
		 		<li>JSP</li>
		 		<li>JAVA</li>
		 		<li>SPRING</li>
		 	</ul>
	</body>
	*/
	
	public static void main(String[] args) {
		
		//과제8
		ArrayList<Integer> ranList = new ArrayList<Integer>();
		for(int cnt=1; cnt<=10; cnt++) {
			int ran = (int)(Math.random()*100+1);
			ranList.add(ran);
			System.out.print(ran+"\t");
		}
		System.out.println();
		int max1=0;
		int min1=100;
		
		for(int idx=0; idx<ranList.size(); idx++) {
			int data = ranList.get(idx);
			if(data > max1) {
				max1 = ranList.get(idx);
			}
			if(data < min1) {
				min1 = ranList.get(idx);
			}
		}
		System.out.println("최대값 : " + max1);
		System.out.println("최소값 : " + min1);
		
		
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