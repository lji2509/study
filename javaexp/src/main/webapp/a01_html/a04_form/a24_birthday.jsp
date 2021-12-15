<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>생일 : <%=request.getParameter("date") %></h3>
	<h3>생일파티시간 : <%=request.getParameter("time") %></h3>
	<h3>장소 : <%=request.getParameter("place") %></h3>
</body>
</html>