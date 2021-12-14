<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	학생명 : <%=request.getParameter("name") %><br>
	학년 : <%=request.getParameter("grade") %><br>
	남여 : <%=request.getParameter("gender") %><br>
</body>
</html>