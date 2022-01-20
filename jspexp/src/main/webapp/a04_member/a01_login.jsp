<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a04_member.*"  %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="${path}/a00_com/a00_com.css">
<style>

</style>
<script type="text/javascript" 
  src="${path}/a00_com/jquery-3.6.0.js"></script>
<script type="text/javascript">
<%--
 
 
--%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pw");
	//id가 null 아닐 때, 초기화면이 아니고, 이이디를 입력해서 로그인한 화면일 때, DB 처리
	System.out.println("id : " + id);
	//DB를 통해 login이 있는 상황인지 여부를 확인하기 위해 boolean 선언
	String status = "init";
	if(id!=null) {
		status = "login";
		//DB처리를 할 수 있게 한다.
		Member_DAO dao = new Member_DAO();
		//해당하는 데이터가 있으면 Member 객체 할당
		Member_VO m = dao.MemberList(id,pass);
		if(m!=null) {
			status = "success";
			//세션을 로그인 성공시 활용할 수 있다.
			session.setAttribute("mem", m);
		} else {
			status = "fail";
		}
	}
%>
	$(document).ready(function(){
		//java의 변수를  js 처리하기
		var status = "<%=status%>";
		if(status=="success") {
			alert("로그인 성공");
			location.href="a02_main.jsp";
		}
		if(status=="fail") {
			alert("로그인 실패\n다시 로그인하세요");
			$("[name=id]").focus();
		}
		
		$("#loginBtn").click(function(){
			var id = $("[name=id]").val();
			var pw = $("[name=pw]").val();
			if(id != "" && pw != "") {
				$("form").submit(); //form에 요청값을 처리
			} else {
				alert("아이디나 패스워드를 입력하세요.");
			}
		})
	});
</script>
</head>
<body>
	<h3>로그인</h3>
	<form method="post">
		<table>
			<tr><th>아이디</th><td><input type="text" name="id"/></td></tr>
			<tr><th>패스워드</th><td><input type="text" name="pw"/></td></tr>
			<tr><td colspan="2"><input type="button" value="로그인" id="loginBtn"/></td></tr>
			<tr><td colspan="2">회원가입</td></tr>
		</table>
	</form>
</body>
</html>