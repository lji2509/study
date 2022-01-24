<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a04_member.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8" /> 
<%
	Member_VO m = (Member_VO)session.getAttribute("mem");
	if(m==null) { //로그인된 session이 없으면 로그인페이지로 이동하게 처리한다.
%>
	<script>alert("로그인이 필요합니다."); location.href="a01_login.jsp";</script>
<%
	}
%>