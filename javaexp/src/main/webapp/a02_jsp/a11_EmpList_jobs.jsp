<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a08_db.A04_DatabaseDao"
	import="javaexp.a04_vo.Emp"
	import="java.util.ArrayList"
    %>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String reqjob = request.getParameter("job");
	if(reqjob==null) reqjob="";
	A04_DatabaseDao dao = new A04_DatabaseDao();
	ArrayList<Emp> elist = dao.getJobMaxSal(reqjob);
	ArrayList<String> jobs = dao.getJobs();
%>
<form>
	<table width="50%" align="center">
		<tr><th>직책</th>
		<td><!-- job을 선택했을 때, form의 첫번째가 submit 버튼을 클릭과 동일한 처리 기능 -->
			<select name="job" onchange="document.forms[0].submit();">
				<option value="">직책을 선택하세요</option>
				<%for(String job:jobs) {%>
				<%--요청값과 list된 job 중에 같으면 selected, 즉 선택되게 처리한다. --%>
				<option <%=reqjob.equals(job)?"selected":""%>><%=job %></option>
				<% }%>
			</select>
		</td>
	</table>
</form>
	<style>td{text-align:center;}</style>
	<table border width="80%" align="center">
		<tr><th>사원번호</th><th>사원명</th><th>직책명</th><th>급여</th><th>부서번호</th></tr>
		<%for(Emp emp:elist) { %>
		<tr><td><%=emp.getEmpno() %></td><td><%=emp.getEname() %></td>
			<td><%=emp.getJob() %></td><td><%=emp.getSal() %></td>
			<td><%=emp.getDeptno() %></td></tr>
		<%} %>
	</table>
</body>
</html>