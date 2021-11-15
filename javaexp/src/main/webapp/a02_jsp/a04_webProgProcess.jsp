<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
#웹 프로그램의 프로세스
1. 웹 프로그램은 client와 server단으로 구분되어 network상 원격으로 웹 서비스를 제공하는 서버와의 관계 속에서 처리되는 프로그램이다.
	client ==========> server
			<========= 
	1) 기본 처리 프로세스
		- url에 서버가 있는 주소의 특정한 페이지를 호출
			http://www.gogle.com/show
			==> http:/192.168.23.0:7080/show.jsp : 고정아이피로 웹서버를 통해 클라이언트에 전달되기 전에, 개발자가 확인하기 위해 현재 pc에서 처리결과를 확인할 때 사용한다.
		- 해당 페이지에서 전달되는 html문자열을 브라우저로 가져와서 html문자열에 있는 태그들을 랜더링(cf h1경우 크기가 큰 문자)하여 화면에 출력한다.
	2) 각 언어들의 처리시점과 처리방법
		html/css : 클라이언트에서 브라우저를 통해서 랜더링
		javascript : 클라이언트의 브라우저를 통해서 컴파일되고, 실행처리
		java(jsp) : 서버단에서 서버컨테이너 안에서 컴파일되고, 실행된다.
			요청값을 받은 처리, DB서버에 접속해서 DB데이터를 객체로 변환해서 메모리에 올렸다가 jsp를 통해서 중간중간에 데이터를 html태그와 함께 표현<%=%>해서, 최종적으로 html페이지를 만들어 클라이언트에서 전달한다.
			jsp안에는 html태그, css, javascript, java가 다 포함되어 있다.
	3) 간단하게 프로세스를 알 수 있는 실습 예제
		- 초기 화면 구성 id/pass을 입력하는 로그인 화면
		- submit를 통해서 요청값이 있으면 script를 통해서 로그인 표시
		- login된 요청값을 내용에 따라서 로그인 성공/실패 여부를 html로 표시
 --%>
 	<h1>로그인</h1>
 	<form action="a05_show.jsp">
 		아이디 : <input type="text" name="id" value=""/><br>
 		패스워드 : <input type="password" name="pass" value=""/><br>
 		<input type="button" value="로그인" onclick="login()"/></br>
 	</form>
 	
 	<script>
 		//javascript로 id와 pass값을 입력했을 때, 서버를 호출하고 그렇지 않을 때는 전송이 안되게 처리
 		//1. DOM : document object model : 화면에 있는 태그를 객체로 인식하여 처리하는 object
 		//		DOM 객체는 순서별로 실행이 되기에 html코드 이후 코딩하여야 한다.
 		function login() {
 		//2. DOM객체의 인식 방법[속성==속성값]
 		//3. 해당 객체가 가지고 있는 속성.value를 통해서 입력한 값을 확인할 수 있다.
 		//f12로 해당 변수명이나 타이핑에 문제가 있는지 확인
 		
 			//input의 id로 되어 있는 요소객체를 지칭, 메모리에 로딩
 			//var : variable의 약자로 자바스크립트는 초기에 데이터유형을 선언하지 않고, 모든 유형의 데이터 타입을 받을 수 있게 선언할 때 사용하는 keyword
	 		var idObj = document.querySelector("[name=id]");
	 		//var idObjValue = document.querySelector("[name=id]").value;
	 		var passObj = document.querySelector("[name=pass]");
	 		//name이 아이디인 곳에 입력한 데이터를 속성으로 가져온다.

	 		console.log("입력한 아이디 : " + idObj.vlaue);
	 		//console.log("입력한 아이디 : " + idObjValue);
	 		//idObj.vlaue : 입력한 값을 확인
	 		if(idObj.value=="") {
	 			alert("아이디를 입력하세요");
	 			return; //더이상 프로세스를 진행하지 못하게 처리
	 		}
	 		console.log("입력한 패스워드 : " + passObj.vlaue);		
	 		if(passObj.value=="") {
	 			alert("패스워드를 입력하세요");
	 			return;
	 		}
	 		
	 		//모든 입력 요소객체를 계층구조로 포함하고 있는 form 요소객체를 선언
	 		var frmObj = document.querySelector("form");
	 		//해당 요소객체의 기능메서드를 통해서 지정한 서버의 자원(a05_show.jsp)를 호출
	 		frmObj.submit();
	 		
 		}
 		
 	</script>
</body>
</html>