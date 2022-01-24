<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a04_member.*"  %>
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
//
	$(document).ready(function(){
		$("#regBtn").click(function(){
			if($("[name=id]").val()=="") {
				alert("아이디 입력이 필요합니다.");
				$("[name=id]").focus();
				return;
			}
			if($("[name=pw]").val()=="") {
				alert("패스워드 입력이 필요합니다.");
				$("[name=pw]").focus();
				return;
			}
			if($("[name=pwCfm]").val()=="") {
				alert("패스워드확인 입력이 필요합니다.");
				$("[name=pwCfm]").focus();
				return;
			}
			if($("[name=pw]").val() != $("[name=pwCfm]").val()) {
				alert("패스워드와 패스워드확인이 동일하지 않습니다.");
				return;
			}
			if($("[name=name]").val()=="") {
				alert("이름 입력 입력이 필요합니다.");
				$("[name=name]").focus();
				return;
			}
			if($("[name=point]").val()=="" || isNaN($("[name=point]").val())) {
				alert("포인트는 숫자형으로 입력하여야 합니다.");
				$("[name=point]").val("");
				$("[name=point]").focus();
				return;
			}
			if(confirm("등록하시겠습니까?")) {
				$("form").submit();
			}
		});
		//1. 이벤트 결정
		$("#ckIdBtn").click(function(){
			//ajax 처리통해서 check해서 지금 등록된 id가 아닐 때
			//2. 페이지와 요청값 설정
			$.ajax({
				url:"${path}/checkId.do",
				data:"id="+$("[name=id]").val(),
				success:function(data) {
					//데이터(등록된 id)가 없을때만 "Y" 처리
					//$("#ckId").val("Y");
					alert("받은값 : " + data);
					$("#ckId").val(data);
					//if 유효성 check 후,
					//$("[name=id]").attr("readonly",true|false) 속성 추가
				}
			});
		});
	});
</script>
</head>
<body>
	<h3>회원가입</h3>
	<form method="post">
		<input type="hidden" id="ckId"/>
		<table>
			<tr><th>아이디</th><%--현재 id의 등록여부를 확인 --%>
				<td><input type="text" name="id"/>
					<input type="button" id="ckIdBtn" value="등록여부"/>
				</td></tr>
			<tr><th>패스워드</th><td><input type="password" name="pw"/></td></tr>
			<tr><th>패스워드확인</th><td><input type="password" name="pwCfm"/></td></tr>
			<tr><th>이름</th><td><input type="text" name="name"/></td></tr>
			<tr><th>권한</th><td>
							<select name="auth">
								<option>관리자</option>
								<option>일반사용자</option>
								<option>방문자</option>
							</select>		
						</td></tr>
			<tr><th>포인트</th><td><input type="text" name="point"/></td></tr>
			<tr><td colspan="2"><input type="button" value="등록" id="regBtn"/></td></tr>
		</table>
	</form>
</body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String auth = request.getParameter("auth");
	String pointS = request.getParameter("point");
	if(id!=null) {
		Member_VO ins = new Member_VO(id, pw, name, auth, Integer.parseInt(pointS));
		Member_DAO dao = new Member_DAO();
		dao.MemberIns(ins);
%>
	<script type="text/javascript">
		alert("등록 성공\n로그인페이지 이동");
		location.href="a01_login.jsp"
	</script>
<%
	}
%>
</html>