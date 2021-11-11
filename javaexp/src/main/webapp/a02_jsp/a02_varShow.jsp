<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css"> 
		td{text-align:center;} /* 전체 body에 대한 설정 옵션 : 문자열 정렬 중앙 처리*/
	</style>
</head>
<%
	String name="홍길동";
	int age=24;
	String loc="서울";
%>

<h2 align="center">회원 정보</h2>
<table align="center" width="30%" border="2">
	<col width="30%"> <!-- col : 컬럼의 비율 지정 -->
	<col width="70%">
	<tr><th>이름</th><td><%=name %></td></tr>
	<tr><th>나이</th><td><%=age %></td></tr>
	<tr><th>사는곳</th><td><%=loc %></td></tr>
</table>

<h2 align="center">테이블 예제</h2>
<table align="center" border="1" width="30%">
	<tr><th>이름</th><th>나이</th><th>사는곳</th></tr>
	<tr><td><%=name %></td><td><%=age %></td><td><%=loc %></td></tr>

</table>

<body>

</body>
</html>