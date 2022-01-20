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
# checkbox의 요청값 특징
1. checkbox 형태는 checked가 된 내용만 요청값을 전달한다.
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>check box(좋아하는 취미)</h3>
	<form>
		<table>
			<tr><th>선택</th><th>취미</th></tr>
			<tr><td><input type="checkbox" name="hobby" value="독서"/></td><td>독서</td></tr>
			<tr><td><input type="checkbox" name="hobby" value="운동"/></td><td>운동</td></tr>
			<tr><td><input type="checkbox" name="hobby" value="여행"/></td><td>여행</td></tr>
			<tr><td><input type="checkbox" name="hobby" value="게임"/></td><td>게임</td></tr>
			<tr><td><input type="checkbox" name="hobby" value="축구"/></td><td>축구</td></tr>
			<tr><td colspan="2"><input type="submit" value="취미등록"/></td></tr>
		</table>
	</form>
	<%
	String[] hobby = request.getParameterValues("hobby");
	if(hobby!=null) {
		for(String ho:hobby) {
	%>
		<h4><%=ho %></h4>
	<%
		}
	}
	%>
	
	<h3>장바구니에 담긴 물건</h3>
	<form>
		<table>
			<tr><th>선택</th><th>물건</th><th>가격</th></tr>
			<tr><td><input  type="checkbox" name="prod" value="2000"/></td><td>사과</td><td>2000원</td></tr>
			<tr><td><input  type="checkbox" name="prod" value="3000"/></td><td>바나나</td><td>3000원</td></tr>
			<tr><td><input  type="checkbox" name="prod" value="4000"/></td><td>딸기</td><td>4000원</td></tr>
			<tr><td colspan="3"><input type="submit" value="계산"/></td></tr>
		</table>
	</form>
	<%
	String[] prods = request.getParameterValues("prod");
	int tot = 0;
	if(prods!=null) {
		for(int i=0; i<prods.length; i++) {
			int prodI = Integer.parseInt(prods[i]);
			tot += prodI;
		}
	}
	%>
	<h3>총 금액 : <%=tot %>원</h3>
</body>
</html>