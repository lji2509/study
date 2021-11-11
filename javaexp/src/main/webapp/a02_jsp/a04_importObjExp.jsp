<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Player"
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
	Player p1 = new Player("이정후", "타자", "키움", 0.360);
	Player p2 = new Player("박정현", "투수", "삼성", 2.63);
	%>
	
	<h2 align="center">KBO 선수 성적</h2>
	<table align="center" border="1" width="50%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<thead>
			<tr><th>이름</th><th>분야</th><th>소속팀</th><th>성적</th></tr>
		</thead>
		<tbody>
			<tr>
				<td><%=p1.getName() %></td>
				<td><%=p1.getPart() %></td>
				<td><%=p1.getTeam() %></td>
				<td><%=p1.getRecord() %></td>
			</tr>
			<tr>
				<td><%=p2.getName() %></td>
				<td><%=p2.getPart() %></td>
				<td><%=p2.getTeam() %></td>
				<td><%=p2.getRecord() %></td>
			</tr>
		</tbody>	
	</table>
</body>
</html>