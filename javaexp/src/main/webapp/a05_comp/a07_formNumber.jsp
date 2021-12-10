<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>구구단</h2>
<form>
	<input type="text" name="num1" size="2"> X <input type="text" name="num2" size="2"> <br>
	<input type="submit" value="결과확인">
</form>
<%
	//1. 요청값을 받는 처리
	String num1S = request.getParameter("num1");
	String num2S = request.getParameter("num2");
	//2. 요청값이 초기화면이 아닐 때, 화면 출력하게 처리
	if(num1S!=null && num2S!=null) {
		int num1 = Integer.parseInt(num1S);
		int num2 = Integer.parseInt(num2S);
%>
	<h3><%=num1 %> X <%=num2 %> = <%=(num1*num2) %></h3>
<%
}
%>

<h2>구구단 학습</h2>
<% 
	//1. 구구단의 숫자 임의로 설정
	int grade = (int)(Math.random()*8+2); //2~9까지 임의의 수 발생
	int cnt = (int)(Math.random()*9+1); //1~9까지 임의의 수 발생
%>
<form>
	<input type="text" name="num1" size="2" value=<%=grade %>> X <input type="text" name="num2" size="2" value=<%=cnt %>> 
	= <input type="text" name="result" size="2"/><br> <%--입력할 정답 --%>
	<input type="submit" value="결과확인">1
</form>
<%
	String num1SS = request.getParameter("num1");
	String num2SS = request.getParameter("num2");
	String resultS = request.getParameter("result");
	
	if(num1S!=null && num2S!=null) {
		int num1 = Integer.parseInt(num1SS);
		int num2 = Integer.parseInt(num2SS);
		int result = Integer.parseInt(resultS);
%>
	<h3>해답: <%=num1 %> X <%=num2 %> = <%=(num1*num2) %></h3>
	<h3>입력한 결과 : <%=result %></h3>
	<h3>정답여부 : <%=(num1*num2)==result?"정답":"" %></h3>
<%
	}
%>
</body>
</html>