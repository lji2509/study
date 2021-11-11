<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.Season"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] object = new String[3];
	int[] price = new int[3];
	int[] cnt = new int[3];
	int[] sum = new int[3];
	
	object[0] = "화장품";
	object[1] = "책";
	object[2] = "옷";
	
	price[0] = 30000;
	price[1] = 8000;
	price[2] = 16000;
	
	cnt[0] = 2;
	cnt[1] = 4;
	cnt[2] = 1;
	
	sum[0] = price[0]*cnt[0];
	sum[1] = price[1]*cnt[1];
	sum[2] = price[2]*cnt[2];
%>

<table align="center" border="1" width="50%">
	<h2 align="center">구매한 물건정보</h2>
	<style>td{text-align:center;}</style>
		<tr><th>이름</th><td><%=object[0] %></td><td><%=object[1] %></td><td><%=object[2] %></td></tr>
		<tr><th>가격</th><td><%=price[0] %></td><td><%=price[1] %></td><td><%=price[2] %></td></tr>
		<tr><th>갯수</th><td><%=cnt[0] %></td><td><%=cnt[1] %></td><td><%=cnt[2] %></td></tr>
		<tr><th>합계</th><td><%=sum[0] %></td><td><%=sum[1] %></td><td><%=sum[2] %></td></tr>
		<tr><th>총계</th><td colspan="3"><%=sum[0] + sum[1] + sum[2] %></td></tr>
	
</table>
</body>
</html>