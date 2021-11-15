package javaexp.a00_exp;

import java.util.Scanner;

public class A11_1112 {
	//과제1
	/*
	form의 속성 
		action : 전송 위치
			서버에 전송할 자원의 위치, 일반적으로 jsp파일이나, 서버단에서 application으로 처리하는 프로그램 호출
		methode : 전송 방식
			get : 주소에 데이터를 직접 입력해 전달
			post : 별도의 방법을 사용해 데이터를 해당 주소로 전달
			
	<body>
		<form action="test.jsp">
			검색내용 : 
			<input type="text" name="search"/>
			<input type="submit" value="검색"/>
		</form>
	</body>
	
	<!-- test.jsp -->
	<body>
	검색내용 : ${param.search}
	</body>
	*/
	
	//과제2
	/*
	type의 속성
		text : 기본 입력창으로, 텍스트를 입력할 수 있는 창이다.
		password : 패스워드를 입력할 수 있는 창으로, 입력한 패스워드는 ••••식으로 숨겨서 표시된다.
		file : 파일첨부 
			선택된 파일명을 전송한다.
		checkbox : 체크박스를 생성하여 체크할 수 있으며, 다중체크가 가능하다. (서버에 전달되는 값은 check된 값, 동일한 이름으로 요청 key를 넘긴다.
			ck=사과&ck=바나나&ck=딸기
		radio : 라디오버튼을 생성하며, 같은 이름의 라디오버튼을 생성하면 중복선택이 불가능하다. (서버에 전달되는 값도 단일 데이터)
		submit : 입력받은 데이터를 서버로 전송한다.
		button : 버튼
			value="버튼1" value값으로 된 내용이 화면에 버튼의 레이블로 보인다.
		<textarea>
		textarea : 줄바꿈이 있는 긴 문자열을 입력할 수 있다.
		<textarea>n
	 */
	
	//과제3
	/*
	<body>
		<form action="test.jsp">
			<h2 align="center">회원가입</h2>
			<table align="center" border style="border-collapse:collapse;">
				<tr><th>아이디</th><td><input type="text" name="id"/></td></tr>
				<tr><th>패스워드</th><td><input type="password" name="pw"/></td></tr>
				<tr><th>이름</th><td><input type="text" name="name"/></td></tr>
				<tr><th>성별</th><td><input type="radio" name="sex" value="남"/>남
									<input type="radio" name="sex" value="여"/>여</td></tr>
				<tr><th>주소</th><td><input type="text" name="address"/></td></tr>
				<tr><th>포인트</th><td><input type="text" name="point"/></td></tr>
				<tr><th colspan="2"><input type="submit" value="회원가입"/></th></tr>
			</table>
		</form>
	</body>
	
	<!-- test.jsp -->
	<body>
		아이디 : ${param.id} <br>
		패스워드 : ${param.pw} <br>
		이름 : ${param.name} <br>
		성별 : ${param.sex} <br>
		주소 : ${param.address} <br>
		포인트 : ${param.point}
	</body>
	 */
	
	//과제4
	/*
	1) 기본형식 
		<script>
			//javascript시작 경고창으로 출력
			alert("출력할 내용");
			
			//f12콘솔창에서 출력
			console.log("출력할 내용");
		</script>
	
	2) 사용예제
		<head>
			<script>
				alert("안녕하세요");
				console.log("안녕하세요(console)");
			</script>
		</head>
	 */
	
	//과제5
	/*
	<head>
		<script>
			function Login() {
				alert("로그인 페이지 이동")
			}
		</script>
	</head>
	<body>
		<h3 onclick="Login()">여기를 클릭하세요.</h3>
	</body>
	*/
	
	//과제6
	/*
	css : 파일명.css 형식으로 별도의 파일 생성 후, 스타일시트를 작성한다.
		작성 후 html파일에서 link 태그의 href 속성을 사용해 작업한 css파일을 불러온다.
	javascript : 파일명.js 형식으로 별도의 파일 생성 후, 자바스크립트를 작성한다.
		작성 후 html파일에서 script 태그의 src 속성에 파일 경로를 입력해 html페이지로 불러온다.
	*/
	
	//과제7
	/*
	1) 상대주소 : 현재 로딩되는 페이지를 기준으로 경로를 설정한다.
		<a href="call.html">현재 폴더에 파일이 있을 때</a>
		<a href="../start.html">상위 폴더에 파일이 있을 때</a>
		<a href="./a01_com/a01_com.html">하위 폴더에 파일이 있을 때</a> 
	2) 절대주소 : 서버의 특정 위치를 경로의 기준으로 설정하는 것을 말한다.
		웹 서버의 경우 root 경로 즉, 프로젝트 기준으로 javaexp\src\main\webapp 를 말하는데,
		이는 서버가 기동되었을 때, http://localhost:7080/javaexp/ 의 경로를 말한다.
			http://localhost:7080는 생략이 가능하다.
			<a href="/javaexp/index.html">서버의 최상위 경로에 index.html</a>
			<a href="/javaexp/a01_html/a03_basicTag/a08_show.html">서버 최상위 경로에서 a01_html폴더 아래 a03_basicTag폴더 아래 a08.show.html</a>
	 */
	
	//과제8
	/*
	<body>
	<%
		ArrayList<Product> list = new ArrayList<Product>();
	
		list.add(new Product("HDD", 34000, 2));
		list.add(new Product("SDD", 62000, 2));
		list.add(new Product("CPU", 124000, 1));
		list.add(new Product("RAM", 51000, 2));
		
		int tot = list.get(0).getPrice() * list.get(0).getCnt() + list.get(1).getPrice() * list.get(1).getCnt() + list.get(2).getPrice() * list.get(2).getCnt() + list.get(3).getPrice() * list.get(3).getCnt();
	%>
	
		<h2 align="center">구매할 컴퓨터 부품목록</h2>
		<table align="center" border style="border-collapse:collapse;" width="50%">
			<col width="20%"> <col width="25%"> <col width="10%"> <col width="25%"> <col width="25%">
			<tr><th>이름</th><th>가격</th><th>갯수</th><th>합계</th><th>총계</th></tr>
			<tr><td><%=list.get(0).getName() %></td><td><%=list.get(0).getPrice() %></td><td><%=list.get(0).getCnt() %></td><td><%=list.get(0).getPrice() * list.get(0).getCnt() %></td><td rowspan="4"><%=tot %></td></tr>
			<tr><td><%=list.get(1).getName() %></td><td><%=list.get(1).getPrice() %></td><td><%=list.get(1).getCnt() %></td><td><%=list.get(1).getPrice() * list.get(1).getCnt() %></td></tr>
			<tr><td><%=list.get(2).getName() %></td><td><%=list.get(2).getPrice() %></td><td><%=list.get(2).getCnt() %></td><td><%=list.get(2).getPrice() * list.get(2).getCnt() %></td></tr>
			<tr><td><%=list.get(3).getName() %></td><td><%=list.get(3).getPrice() %></td><td><%=list.get(3).getCnt() %></td><td><%=list.get(3).getPrice() * list.get(3).getCnt() %></td></tr>
		</table>
	</body>
	 */
	public static void main(String[] args) {
		//과제9
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("그만하시려면 Q(q), 계속하시려면 아무거나 입력하세요.");
			String stop = sc.nextLine();
			
			if(stop.equalsIgnoreCase("Q")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			int i = (int)(Math.random()*9+1);
			int j = (int)(Math.random()*9+1);
			
			System.out.print(i + " X " + j + " = ");
			int answer = sc.nextInt();
			
			if(answer == (i*j)) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("오답입니다!");
			}
			System.out.println();
			sc.nextLine();
		}
		
	}

}

/*
1. form태그의 속성을 기술하고, 검색내용 : [		][검색] ==> 검색을 클릭 시, 새로운페이지(jsp)에서 검색내용을 출력하세요.
2. input태그의 type에 따른 여러가지 형식을 확인할 수 있다. type의 속성값을 기술하고, 해당 속성값에 따른 특징을 기술하세요.
3. form객체의 하위 요소객체와 속성을 활용하여 table로 선언된 화면에서 회원가입화면을 만들고, 가입된 내용을 출력 처리하세요.
	회원가입내용 : 아이디, 패스워드, 이름, 성별, 주소, 포인트
4. javascript의 기본출력형식을 기술하고, 하나의 화면에 출력하세요.
5. h3를 클릭시, 경고문구로 로그인 페이지 이동이라고 출력되게 처리하세요.
6. css와 javascript의 외부 파일 호출방식을 기술하세요.
7. link, img등에 사용되는 상대주소/절대주소의 개념을 예제와 함께 간단하게 기술하세요.
8. java와 테이블을 이용하여, 구매할 컴퓨터 부품목록을 리스트하는 처리를 하세요.
9. 랜덤에 의해 만들어진 구구단을 Scanner 입력값에 의해 맞추면 정답/틀리면 오답을 출력하세요.

*/