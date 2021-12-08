<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{background-color:yellow;} /* css 적용 */
</style>
<script type="text/javascript">
	function callFun(obj){
		alert("함수호출 : " + obj.align);
		//obj : DOM - html태그를 객체화하여 사용
		obj.align="right";
		//var obj = document.querySelectorAll("h2")[1]; 화면에서 2번째 DOM객체
	}
</script>
</head>
<body>
	<!-- 1. html 코드 출력 -->
	<h1 align="center">안녕하세요!!</h1>
	<!-- 2. css 적용 배경색상 지정 -->
	<h2 align="center">안녕하세요!!(css)</h2>
	<!-- 3. js의 함수호출
			on이벤트명 = "이벤트핸들러함수" 
	-->
	<%--
		{name : 'himan'} : 매개변수로 js에 쓰이는 객체{속성 : 속성값}
		callFun(this) : 클릭한 h2객체를 전송
	--%>
	<h2 align="center" onclick="callFun({name : 'himan', age:25})"> 클릭하겠습니다!!(js) </h2>
	<h2 align="center" onclick="callFun(this)"> 클릭하겠습니다!!(js) </h2>
	<%--
	<태그 on이벤트명 = "이벤트함수(this)"
		1. on이벤트명 : 해당 대상 태그에 이벤트를 발생했을 때,
			ex) onclick="" : 클릭하는 이벤트를 호출했을 때
		2. "이벤트함수(this)" : javascript영역에 선언된 이벤트함수를 호출하고 this라는 키워드에 의해서 h2 객체를 매개변수로 넘긴다.
	 --%>
	 <!-- 4. java코드의 삽입 
	 		1) 변수만 할당 및 출력
	 		2) 객체의 할당과 출력
	 -->
	 <%
	 //jsp에서 자바의 코드가 들어갈 수 있는 범위 : scriptlet
	 String name = "홍길동";
	 int age = 25;
	 //jsp에서 자바코드는 서버에서 혼합된 최종 html을 만들어서 전달하기에 보이지 않는다.
	 %>
	 <%--
	 <%=출력변수%> : jsp에서 자바변수가 화면에 출력할 수 있는 형식(expression)
	 --%>
	  <h3>이름:<%=name %></h3>
	  <h3>나이:<%=age %></h3>
	  
	  <%
	  String pname = "사과";
	  int pprice = 3000;
	  int pcnt = 3;
	  %>
	  <h3>물건이름 : <%=pname %></h3>
	  <h3>물건가격 : <%=pprice %></h3>
	  <h3>물건갯수 : <%=pcnt %></h3>
</body>
</html>