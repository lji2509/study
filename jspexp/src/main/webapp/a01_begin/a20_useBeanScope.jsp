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
 
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>useBean scope 범위</h3>
	<%--p1(범위-page) p2(범위-session) --%>
	<table>
		<tr><th>사람의 이름</th><td>${p1.name }</td></tr>
		<%--p1.getName()을 el의 property 형식으로 처리 --%>
		<tr><th>물건명</th><td>${p2.name }</td></tr>
		<%--p2.getName()을 el의 property 형식으로 처리 --%>
	</table>
</body>
</html>