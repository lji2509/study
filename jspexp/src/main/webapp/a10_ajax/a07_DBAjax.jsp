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
			$.ajax({
				url:"${path}/ajaxMvc04.do"
			});
		});
		
		$("h4").click(function() {
			var name = $("[name=name]").val();
			$.ajax({
				url:"${path}/mvcAjax05",
				data:"name="+name
			});
		});
		
		$("h3").click(function() {
			$.ajax({
				url:"${path}/ajaxMvc04.do",
				data:"prodname=사과"
			});
		});
		
		$("h3").click(function(){
			var pname = $("[name=pname]").val();
			var price = $("[name=price]").val();
			var cnt = $("[name=cnt]").val();
			$.ajax({
				url:"${path}/ajaxMvc04.do",
				data:"pname="+pname+"&price="+price+"&cnt="+cnt,
				success:function(data) {
					alert(data);
					var prod = data;
					alert(prod.pname); //객체의 속성을 출력
				}
			});
		});
		
		$("h5").click(function() {
			var sname = $("[name=sname]").val();
			var kor = $("[name=kor]").val();
			var eng = $("[name=eng]").val();
			var math = $("[name=math]").val();
			$.ajax({
				url:"${path}/mvcAjax05",
				data:"sname="+sname+"&kor="+kor+"&eng="+eng+"&math="+math,
				success:function(data){
					alert(data);
				}
			});
		})
	});
</script>
</head>
<body>
	<h5>요청값 서버에 전달</h5>
	이름 : <input type="text" name="sname"/><br>
	국어 : <input type="text" name="kor"/><br>
	영어 : <input type="text" name="eng"/><br>
	수학 : <input type="text" name="math"/><br>
	
	<h3>사원정보 ajax</h3>
	물건명 : <input type="text" name="pname"/><br>
	가격 : <input type="text" name="price"/><br>
	갯수 : <input type="text" name="cnt"/><br>
	<h4>ajax 콜</h4>
	이름 : <input type="text" name="name"/>
	<table>
		<tr><th></th></tr>
		<tr><td>내용</td></tr>
	</table>
</body>
</html>