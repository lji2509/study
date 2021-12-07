<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{background-color:pink;}
</style>
<script type="text/javascript">
	function callFun(obj) {
		obj.align="center";
		obj.style.background="green";
		obj.innerText="글자변경";
	}
</script>
</head>
<body>
	<h2 align="center">반갑습니다.</h2>
	<h1 onclick="callFun(this)">클릭하세요</h1>
</body>
</html>