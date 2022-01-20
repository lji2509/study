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

</script>
</head>
<body>
<%--
1. 서버단위 에러의 처리 방법을 기술하세요.
	1) 에러페이지 생성
	2) web.xml에서 에러코드와 에러클래스를 지정 및 해당 에러가 나왔을 때 로딩될 페이지 지정

2. session scope 4가지 범위를 설정하고, 
				이 범위에 따른 페이지 별로 데이터를 확인하세요.
	--> 확인 완료
 --%>
<%
	//page
	pageContext.setAttribute("pageVar", "홍길동(page)");
	
	//request
	request.setAttribute("reqVar", "신길동(request)");
	request.getRequestDispatcher("a25_requestPage.jsp").forward(request, response);
	
	//session
	session.setAttribute("sessVar","오길동(session)");
	
	//application
	application.setAttribute("appVar", "하길동(application)");
%>
</body>
</html>