<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//id=himan&pass=7777
	//요청값으로 client로부터 넘겨온 데이터를 페이지 호출과 함께 아래 형식으로 server에서 데이터를 받게된다.
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String result = "";
	if(id.equals("himan") && pass.equals("7777")) {
		result="인증 성공";
	} else {
		result="인증 실패";
	}
	//다시 client에 아래와 같이 받은 데이터와 html코드와 함께 전송한다.
	//브라우저 화면에서 입력한 내용을 볼 수 있다.
%>
	<h2>입력한 아이디 : <%=id%></h2>
	<h2>입력한 패스워드 : <%=pass%></h2>
	<h2>결과 : <%=result %></h2>
	

</body>
</html>