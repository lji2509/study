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
	<jsp:useBean id="d" class="jspexp.z01_vo.Dept" scope="page"/>
	<jsp:useBean id="e" class="jspexp.z01_vo.Emp" scope="session"/>
	<jsp:setProperty property="dname" name="d" value="사원"/> 
	<%e.setEname("홍길동"); %>
	<table>
		<tr><th>부서명</th><th>사원명</th></tr>
		<tr><td><jsp:getProperty property="dname" name="d"/></td><td><%=e.getEname() %></td></tr>
	</table>
	<h3 onclick="location.href='a22_showBean.jsp'">세션범위확인 클릭</h3>
</body>
</html>