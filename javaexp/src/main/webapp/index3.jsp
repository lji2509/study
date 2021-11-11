<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//자바 프로그래밍 영역 frontend 화면에 전달되지 않는다
	String name = "홍길동";
	//<============================== WAS 컨테이너 =================================><==네트워크==><==브라우저화면==>
	//jsp ==> @@@.java ==> @@@.class ==> 결과 html파일 만들기 ==> client에게 html파일 전달 ==> 브라우저를 통해서 html 받기
%>
	<%--jsp의 주석처리(frontend화면에 전달되지 않는다) --%>
	
	<h2><%=name %></h2>
</body>
</html>