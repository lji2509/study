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
		$("#btn").click(function() {
			var pname = $("[name=pname]").val();
			var price = $("[name=price]").val();
			var cnt = $("[name=cnt]").val();
			
			$.ajax({
				url : "${path}/ajaxMvc03.do",
				data : "pname="+pname+"&price="+price+"&cnt="+cnt,
				type : "get",
				dataType : "json",
				success : function(data) {
					var p = data;
					$("h3").text("구매한 물건 : " + p.pname + " 총비용 : " + p.sum);
				}
			});
		});
		
	});
</script>
</head>
<body>
	<h3></h3>
	<table>
		<tr><th>물건명</th><td><input type="text" name="pname"/></td></tr>
		<tr><th>가격</th><td><input type="text" name="price"/></td></tr>
		<tr><th>갯수</th><td><input type="text" name="cnt"/></td></tr>
		<tr><td colspan="2"><input type="button" value="구매" id="btn"/></td></tr>
		<tr></tr>
	</table>
</body>
</html>