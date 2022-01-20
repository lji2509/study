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
 
 
--%>
//
	$(document).ready(function(){
		
	});
	
	function selpage() {
		$("form").submit();
	}
</script>
</head>
<%
	String sel = request.getParameter("sel");
	if(sel != null) {
%>		
	<jsp:forward page="<%=sel %>"/>
<%	
	//response.sendRedirect(sel);
	//서버안에서 이동할 페이지로 이동하게 처리
	/*
	# 서버단안에서 처리하여 분기 페이지를 가는 경우
	1. 서버단에서 java 프로그램에 의해서만 데이터가 나오는 경우
	2. 그 데이터 기준으로 분기 페이지를 처리하는 경우를 말한다.
		ex) 요청값, DB처리결과, 서버단 안에서 로직 처리
	*/
	}
%>
<body>
	<h3>쇼핑몰 페이지 이동</h3>
	<form>
		<table>
			<tr><td>
				<select name="sel" onchange="selpage()">
					<option value="">이동할 페이지 선택</option>
					<option value="a17_login.jsp">로그인</option>
					<option value="a18_admin.jsp">관리자</option>
					<option value="a19_cloth.jsp">의류</option>
					<option value="a20_ele.jsp">전자제품</option>
				</select>
			</td></tr>
		</table>
	</form>
</body>
</html>