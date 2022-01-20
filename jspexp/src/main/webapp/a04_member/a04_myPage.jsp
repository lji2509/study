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
<%
	Member_VO m = (Member_VO)session.getAttribute("mem");
	if(m==null) { //로그인된 session이 없으면 로그인페이지로 이동하게 처리한다.
%>
	<script>alert("로그인이 필요합니다."); location.href="a01_login.jsp";</script>
<%
	}
	String proc = request.getParameter("proc"); 
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw"); 
	String name = request.getParameter("name"); 
	String auth = request.getParameter("auth"); 
	String pointS = request.getParameter("point");
	if(proc!=null){
		Member_DAO dao = new Member_DAO();
		if(proc.equals("upt")) {
			Member_VO upt = new Member_VO(id, pw, name, auth, Integer.parseInt(pointS) );
			dao.MemberUpt(upt);
			//수정 후, 변경된 정보를 session 다시 넣어서 사용할 수 있게 처리
			Member_VO one = dao.getMember(id);
			session.setAttribute("mem", dao.getMember(id));
		}
		if(proc.equals("del")) {
			dao.MemberDel(id);
			//전체 session 삭제는 session.invalidate();
			//특정 session 삭제 session.removeAttribute("mem");
		}	
	}
%>
<script type="text/javascript">
	var proc = "<%=proc%>";
	if(proc=="upt") {
		alert("수정이 완료되었습니다.");
	}
	if(proc=="del") {
		alert("삭제가 완료되었습니다.\n로그인화면으로 이동합니다.");
		location.href="a01_login.jsp";
	}
	$(document).ready(function(){
		$("#uptBtn").click(function(){
			$("[name=proc]").val("upt");
			
			if($("[name=id]").val()==""){
				alert("아이디 입력이 필요합니다.!");
				$("[name=id]").focus();
				return;
			}
			if($("[name=pw]").val()==""){
				alert("패스워드 입력이 필요합니다.!");
				$("[name=pw]").focus();
				return;
			}			
			if($("[name=pwCfm]").val()==""){
				alert("패스워드  확인 입력이 필요합니다.!");
				$("[name=pwCfm]").focus();
				return;
			}			
			if($("[name=pw]").val() != $("[name=pwCfm]").val()){
				alert("패스워드와 패스워드 확인이 동일하지 않습니다.")
				return;
			}
			if($("[name=name]").val()==""){
				alert("이름 입력이 필요합니다.!");
				$("[name=name]").focus();
				return;
			}
			if($("[name=point]").val()==""||isNaN($("[name=point]").val())){
				alert("포인트는 숫자형으로 입력하여야 합니다.");
				$("[name=point]").val("");
				$("[name=point]").focus();
				return;
			}
			if(confirm("수정하시겠습니까?")){
				$("[name=proc]").val("upt");
				$("form").submit();
			}
		});
		$("#delBtn").click(function(){
			if(confirm("삭제하시겠습니까?")){
				$("[name=proc]").val("del");
				$("form").submit();
			}
		});
	});
</script>
</head>
<body>
	<h3>회원정보</h3>
	<form method="post">
		<input type="hidden" name="proc"/>
		<%--
		# 기능 버튼이 수정/삭제버튼이 있고, 이것을 클릭시, 각각 dao에 수정 기능메서드와 삭제 기능메서드를 호출하여야 한다.
		이 때, 이것을 구분하기 위해서 hidden으로 요청값을 구분하여 전달한다.
		 --%>
		<table>
			<tr><th>아이디</th><td><input type="text" name="id" value="${mem.id}"/></td></tr>
			<tr><th>패스워드</th><td><input type="password" name="pw" value="${mem.pw}"/></td></tr>
			<tr><th>패스워드확인</th><td><input type="password" name="pwCfm"/></td></tr>
			<tr><th>이름</th><td><input type="text" name="name" value="${mem.name}"/></td></tr>
			<tr><th>권한</th><td>
							<select name="auth">
								<option>관리자</option>
								<option>일반사용자</option>
								<option>방문자</option>
							</select>		
							<script>$("[name=auth]").val("${mem.auth}")</script>
						</td></tr>
			<tr><th>포인트</th><td><input type="text" name="point" value="${mem.point}"/></td></tr>
			<tr><td colspan="2"><input type="button" value="수정" id="uptBtn"/>
			<input type="button" value="삭제" id="delBtn"/></td></tr>
		</table>
	</form>
</body>
</html>