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
# useBean을 활용한 요청값 자동 저장 기능
1. query String으로 오는 요청값을 useBean의 property를 활용하면 자동으로 reqeust.getParameter("") 설정없이 바로 객체에 할당될 수 있다.
2. ?name=@@@&age=@@&loc=@@ 와 같이 요청값이 전달 될 때
3. VO객체를 만들고, 기능메서드로 setName, setAge, setLoc를 설정하면
4. jsp:useBean 객체 생성하고,
	<jsp:useBean property="*"/> 설정하면 ,객체에 요청값이 저장되어
5. 저장된 요청값을 getXXX() 메서드를 통해서 사용할 수 있다.
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<%--
	a27_useBean_param.jsp?name=홍길동&age=25&loc=서울
	 --%>
	<jsp:useBean id="p1" class="jspexp.z01_vo.Person"/>
	<jsp:setProperty property="*" name="p1"/>
	<%-- property 요청값을 property에 맞게 자동으로 저장 처리 --%>
	<h3>자동 요청값 처리</h3>
	<form>
		<table>
			<tr><th>물건명</th><td><input type="text" name="name"/></td></tr>
			<tr><th>가격</th><td><input type="text" name="price"/></td></tr>
			<tr><th>갯수</th><td><input type="text" name="cnt"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="물건등록"/></td></tr>
		</table>
	</form>
	
	<table>
		<tr><td>${p1.name}</td></tr>
		<tr><td>${p1.age}</td></tr>
		<tr><td>${p1.loc}</td></tr>
	</table>
	<jsp:useBean id="prod" class="jspexp.z01_vo.Product"/>
	<jsp:setProperty property="*" name="prod"/>
	<table>
		<tr><td>${prod.name }</td></tr>
		<tr><td>${prod.price }</td></tr>
		<tr><td>${prod.cnt }</td></tr>
	</table>
</body>
</html>