<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.Product"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<Product> list = new ArrayList<Product>();

	list.add(new Product("HDD", 34000, 2));
	list.add(new Product("SDD", 62000, 2));
	list.add(new Product("CPU", 124000, 1));
	list.add(new Product("RAM", 51000, 2));
	
	int tot = list.get(0).getPrice() * list.get(0).getCnt() + list.get(1).getPrice() * list.get(1).getCnt() + list.get(2).getPrice() * list.get(2).getCnt() + list.get(3).getPrice() * list.get(3).getCnt();
%>

	<h2 align="center">구매할 컴퓨터 부품목록</h2>
	<table align="center" border style="border-collapse:collapse;" width="50%">
		<col width="20%"> <col width="25%"> <col width="10%"> <col width="25%"> <col width="25%">
		<tr><th>이름</th><th>가격</th><th>갯수</th><th>합계</th><th>총계</th></tr>
		<tr><td><%=list.get(0).getName() %></td><td><%=list.get(0).getPrice() %></td><td><%=list.get(0).getCnt() %></td><td><%=list.get(0).getPrice() * list.get(0).getCnt() %></td><td rowspan="4"><%=tot %></td></tr>
		<tr><td><%=list.get(1).getName() %></td><td><%=list.get(1).getPrice() %></td><td><%=list.get(1).getCnt() %></td><td><%=list.get(1).getPrice() * list.get(1).getCnt() %></td></tr>
		<tr><td><%=list.get(2).getName() %></td><td><%=list.get(2).getPrice() %></td><td><%=list.get(2).getCnt() %></td><td><%=list.get(2).getPrice() * list.get(2).getCnt() %></td></tr>
		<tr><td><%=list.get(3).getName() %></td><td><%=list.get(3).getPrice() %></td><td><%=list.get(3).getCnt() %></td><td><%=list.get(3).getPrice() * list.get(3).getCnt() %></td></tr>
	</table>
</body>
</html>