<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="${path}/a00_com/a00_com.css">
<style>

</style>
<script type="text/javascript" 
  src="${path}/a00_com/jquery-3.6.0.js"></script>
<script type="text/javascript">
<%--
# jstl을 통한 객체의 property 값 변경
1. 객체의 호출
	request.setAttribute("p1", new Person("홍길동",25,"서울신림"));
	${p1.name}
2. jstl를 통해서 필드값의 변경
	<c:set var="p2" value="${p1}" scope="sesseion"/>
		Person p2 = p1; session.setAttribute("p2", p1);
	1) property를 통해서 변경
		<c:set target="p2" property="name" value="마길동"/>
			p2.setName("마길동");
		${p2.name} : 기존에 홍길동에서 마길동으로 변경되어 해당 propery를 확인할 수 있다.

 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<%
	request.setAttribute("p1", new Person("홍길동",25,"서울신림동"));
	%>
	<h3>jstl을 통한 객체의 변경</h3>
	<table>
		<tr><th>이름</th><td>${p1.name }</td></tr>
		<tr><th>나이</th><td>${p1.age }</td></tr>
		<tr><th>사는곳</th><td>${p1.loc }</td></tr>
	</table>
	<c:set var="p2" value="${p1}" scope="session"/>
	<c:set target="${p2}" property="name" value="마길동"/>
	<table>
		<tr><th>이름</th><td>${p2.name }</td></tr>
		<tr><th>나이</th><td>${p2.age }</td></tr>
		<tr><th>사는곳</th><td>${p2.loc }</td></tr>
	</table>
	
	<%
	request.setAttribute("prod1", new Product("사과",3000,2));	
	%>
	<table>
		<tr><th>물건명</th><td>${prod1.name }</td></tr>
		<tr><th>가격</th><td>${prod1.price }</td></tr>
		<tr><th>갯수</th><td>${prod1.cnt }</td></tr>
	</table>
	<c:set var="prod2" value="${prod1 }" scope="session"/>
	<c:set target="${prod2 }" property="name" value="딸기"/>
	<c:set target="${prod2 }" property="price" value="5000"/>
	<c:set target="${prod2 }" property="cnt" value="4"/>
	<table>
		<tr><th>물건명</th><td>${prod2.name }</td></tr>
		<tr><th>가격</th><td>${prod2.price }</td></tr>
		<tr><th>갯수</th><td>${prod2.cnt }</td></tr>
	</table>
	
</body>
</html>