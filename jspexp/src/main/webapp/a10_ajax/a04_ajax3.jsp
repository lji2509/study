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
		$("h3").click(function() {
			var xhr = new XMLHttpRequest();
			xhr.open("get","${path}/ajaxMvc02.do",true);
			xhr.send();
			xhr.onreadystatechange = function() {
				if(xhr.readyState==4 && xhr.status==200) {
					var p = JSON.parse(xhr.responseText);
					$("td").eq(0).text(p.pname);
					$("td").eq(1).text(p.price);
					$("td").eq(2).text(p.cnt);
				}
			};
		});
	});
</script>
</head>
<body>
	<h3>제목</h3>
	<table>
		<tr><th>물건명</th><th>가격</th><th>갯수</th></tr>
		<tr><td></td><td></td><td></td></tr>
	</table>
</body>
</html>