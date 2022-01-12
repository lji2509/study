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
  src="${path}/a00_com/jquery-3.5.1.js"></script>
<script type="text/javascript">
<%--
 # useBean 활용하기
 1. jsp에서 데이터 저장을 효율적으로 처리하기 위하여 사용되는 태그형 객체이다.
 2. 구성을 위한 처리
 	1) VO 객체 만들기
 	2) <jsp:useBean id="빈의이름" class="패키지명.vo클래스" scope="session범위"/> 로 선언
 		: 선언하는 순간 클래스 참조변수 = new 객체명(); 형식으로 객체가 생성되어 jsp에 포함되게 처리된다.
 		cf) #주의 - 매개변수가 없는 생성자를 꼭 선언하여야 한다.
 3. useBean의 기능
 	1) 객체가 session범위로 생성이 되어, jsp 페이지 안에서 사용할 수 있다.
 	2) 태그형태로 기능메서드를 사용할 수도 있고, script(<%%>, <%=%>)형태로도 사용할 수 있다.
 	3) el태그와 jstl에서도 활용할 수 있다.
 	4) 요청값을 request.getParameter("") 호출 없이도 자동으로 처리할 수 있다.
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>useBean 활용</h3>
	<jsp:useBean id="p1" class="jspexp.z01_vo.Person" scope="page"/>
	<%--page범위로 객체 Person이 생성되어 참조변수 p1을 사용할 수 있게 된 상황 
	
	1. setProperty 기능 메서드로 필드값 저장처리 하기
			property="기능메서드" : 기능메서드의 set/get을 빼고, 소문자로 선언한 부분
		void setName(String name) ==> name
		name : 위에 선언된 useBean의 id값을 설정해준다.
		value : 해당 setName()메서드를 통해 저장될 데이터를 처리한다.
	--%>
	<jsp:setProperty property="name" name="p1" value="홍길동"/>
	<%
		p1.setAge(25); p1.setLoc("서울신림동");
	%>
	<%--p1.setName("홍길동"); --%>
	<table>
		<tr><th>이름</th><td><jsp:getProperty property="name" name="p1"/></td></tr>
		<tr><th>나이</th><td><%=p1.getAge() %></td></tr>
		<tr><th>사는곳</th><td>${p1.loc }</td></tr>
		<%--el태그 : ${참조변수.프로퍼티명} 
			cf) 주의 : 프로퍼티는 절대 필드를 호출하는 것이 아니다.
			프로퍼티(property)는 메서드의 setXXX()/getXXX()에서 메서드명에서 set/get를 삭제하고, 소문자로 변환하여 사용하는 개념이다.
		--%>
		<%--p1.getName()과 동일 --%>
		<%--저장된 내용 가져오기 --%>
	</table> <%--p1(범위-page) p2(범위-session) --%>
	<jsp:useBean id="p2" class="jspexp.z01_vo.Product" scope="session"/>
	<jsp:setProperty property="name" name="p2" value="사과"/>
	<jsp:setProperty property="price" name="p2" value="5000"/>
	<jsp:setProperty property="cnt" name="p2" value="5"/>
	<table>
		<tr><th>물건명</th><th>가격</th><th>갯수</th></tr>
		<tr>
			<td><jsp:getProperty property="name" name="p2"/></td>
			<td><jsp:getProperty property="price" name="p2"/></td>
			<td><jsp:getProperty property="cnt" name="p2"/></td>
		</tr>
	</table>
	<h3 onclick="location.href='a20_useBeanScope.jsp'">useBean의 scope 범위 영향 확인</h3>
</body>
</html>