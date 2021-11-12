<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.Season"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>td{text-align:center;}</style>
</head>
<body>
<%
	//동적배열 중에 객체가 들어가 동적배열 처리
	//ArrayList<객체유형>
	ArrayList<Season> slist = new ArrayList<Season>();
	//slist.add(new 객체());
	//Season(String sname, String weather, String priod)
	slist.add(new Season("봄","꽃샘추위/따뜻함","3월~5월"));
	slist.add(new Season("여름","무더위","6월~8월"));
	slist.add(new Season("가을","서늘함","9월~10월"));
	slist.add(new Season("겨울","눈/추위","11월~2월"));
%>
	<h2 align="center">계절과 날씨</h2>
	<table align="center" style="border-collapse:collapse" width="50%">
	<style>th,td{border:2px solid pink}</style>
		<col width="20%">
		<col width="50">
		<col width="30%">
		<tr><th>계절</th><th>날씨</th><th>기간</th></tr>
		<tr><td><%=slist.get(0).getSname() %></td>
			<td><%=slist.get(0).getWeather() %></td>
			<td><%=slist.get(0).getPriod() %></td></tr>
			<tr><td><%=slist.get(1).getSname() %></td>
			<td><%=slist.get(1).getWeather() %></td>
			<td><%=slist.get(1).getPriod() %></td></tr>
			<tr><td><%=slist.get(2).getSname() %></td>
			<td><%=slist.get(2).getWeather() %></td>
			<td><%=slist.get(2).getPriod() %></td></tr>
	</table>
</body>
</html>