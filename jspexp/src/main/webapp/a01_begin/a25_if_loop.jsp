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
# jstl을 활용한 반복문 처리
1. 기본 형식
	<c:if test="${조건식}">
		해당 조건식이 true일 때 처리할 내용
	</c:if>
	<c:choose>
		<c:when test="${조건1}">조건1일때</c:when>
		<c:when test="${조건2}">조건1이 아니고, 조건2 일때</c:when>
		<c:otherwise>위에 나열된 조건이 아닐 때</c:otherwise>
	</c:choose>
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>조건문과 반복문</h3>
	<c:set var="age" value="25"/>
	<c:set var="point" value="80"/>
	<table>
		<tr><th>jstl의 활용</th></tr>
		<tr><td>나이 : ${age}, 결과 : 
			<c:if test="${age<18}">미</c:if>인증
		</td></tr>
		<tr><td>점수 : ${point}, 등급 : 
			<c:choose>
				<c:when test="${point>=90}">A등급</c:when>
				<c:when test="${point>=80}">B등급</c:when>
				<c:when test="${point>=70}">C등급</c:when>
				<c:when test="${point>=60}">D등급</c:when>
				<c:when test="${point>=00}">F등급</c:when>
				<c:otherwise>등급의 범위는 숫자로 0이상 입니다.</c:otherwise>
			</c:choose>
	</table>
	<c:set var="price" value="5000"/>
	<c:set var="cnt" value="4"/>
	<c:set var="tot" value="${price*cnt}"/>
	<table>
		<tr><th>가격</th><th>갯수</th><th>총계</th><th>등급</th></tr>
		<tr>
			<td>${price}</td>
			<td>${cnt}</td>
			<td>${tot}</td>
			<td>
				<c:choose>
					<c:when test="${tot>=100000}">MVP</c:when>
					<c:when test="${tot>=50000}">VIM</c:when>
					<c:when test="${tot>=0}">일반고객</c:when>
					<c:otherwise>숫자로 다시 입력해주세요.</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</table>
	<form method="post">
		<table>
			<%--요청값에 의한 el 태그 : ${param.price} --%>
			<tr><th>가격</th><td><input type="text" name="price" value="${param.price}"/></td></tr>
			<tr><th>갯수</th><td><input type="text" name="cnt" value="${param.cnt}"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="계산"/></td></tr>
			<tr><th>결과</th>
				<td>
					<%--not empty param.price : 공백이 아니거나 입력값이 있을 때 처리 --%>
					<c:if test="${not empty param.price && not empty param.cnt}">	
						<c:set var="tot" value="${param.price*param.cnt}"/>
						총계 : ${tot}, 등급 : 
						<c:choose>
							<c:when test="${tot>=100000}">MVP</c:when>
							<c:when test="${tot>=50000}">VIP</c:when>
							<c:when test="${tot>0}">일반고객</c:when>
							<c:otherwise>입력범위는 숫자로 0이상입니다.</c:otherwise>
						</c:choose>
					</c:if>
				</td></tr>
		</table>
	</form>
</body>
</html>