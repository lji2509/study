<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Product"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Product p1 = new Product("사과",2000,2);
	Product p2 = new Product("바나나",4000,3);
	Product p3 = new Product("딸기",12000,3);
	int tot = p1.getPrice()*p1.getCnt() + p2.getPrice()*p2.getCnt() + p3.getPrice()*p3.getCnt();
%>
	<table border>
		<tr><th>물건명</th><th>가격</th><th>갯수</th><th>계</th></tr>
		<tr><td><%=p1.getName() %></td>
			<td><%=p1.getPrice() %></td>
			<td><%=p1.getCnt() %></td>
			<td><%=p1.getPrice()*p1.getCnt() %></td></tr>
		<tr><td><%=p2.getName() %></td>
			<td><%=p2.getPrice() %></td>
			<td><%=p2.getCnt() %></td>
			<td><%=p2.getPrice()*p2.getCnt() %></td></tr>
		<tr><td><%=p3.getName() %></td>
			<td><%=p3.getPrice() %></td>
			<td><%=p3.getCnt() %></td>
			<td><%=p3.getPrice()*p3.getCnt() %></td></tr>
		<tr><td colspan="3">총계</td><td><%=tot %></td></tr>
	</table>
</body>
</html>