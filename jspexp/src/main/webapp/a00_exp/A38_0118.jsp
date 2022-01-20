<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
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
		
	});
</script>
</head>
<body>
<%--
1. request객체와 response객체의 역할을 기술하세요.
	request:HTML 폼 요소의 선택 값 등 사용자 입력 정보를 읽으려고 사용한다.
	response: 사용자 요청에 대한 응답을 처리하려고 사용한다.
	
2. 회원가입정보를 queryString으로 만들어, 요청값을 받아 화면에 출력하세요.
--%>
	<form>
		<table>
	    	<tr><th>아이디</th><td><input type="text" name="id"></td></tr>
	        <tr><th>비밀번호</th><td><input type="text" name="pass"></td></tr>
	        <tr><th>이름</th><td><input type="text" name="name"></td></tr>
	        <tr><th>나이</th><td><input type="text" name="age"></td></tr>
	        <tr><td colspan="2"><input type="submit" value="등록"></td></tr>
	    </table>
	</form>
	<%
	    String id=request.getParameter("id"); 
	    String pass=request.getParameter("pass"); 
	    String name=request.getParameter("name"); 
	    String age =request.getParameter("age"); 
	%>
	<table>
		<tr><th>아이디</th><td><%=id %></td></tr>
	    <tr><th>비밀번호</th><td><%=pass %></td></tr>
	    <tr><th>이름</th><td><%=name %></td></tr>
	    <tr><th>나이</th><td<%=age %>></td></tr>
	</table>

<%--
3. request객체에서 서버 url 정보를 확인할려고 한다. url 정보 내용별 기능별 메서드를 기술해 주세요.
	URL : 특정 서버의 특정 리소스에 대해 구체적인 위치를 서술함을 목적으로 하며 URI의 하위 항목이다.
		ex) getServerName() -> 서버의 도메인명을 문자열로 리턴, getServerPort() -> 서버의 포트번호를 int형으로 리턴
	getRequestURL() -> 요청 URL을 StringBuffer로 리턴

4. request.getParameter()와 null 처리, Integer.parseInt() 처리의 필요사항을 기술하세요
	request.getParameter() : HTTP 요청의 매개변수 값 변환, 해당 매개변수가 없을 경우 null 반환
		ex) String id = request.getParameter("id");
			if(id==null){
			    id="test";
			}
	Integer.parseInt() : 문자열을 정수형(int)로 변경해준다.
		ex) int num = Integer.parseInt(request.getParameter("num"));
			정수형값 : <%=num %> <br> 

5. 숫자값 두개를 input객체에 선언하고, 계산했을 때, 합산을 처리하여 출력하세요. 
--%>
	<form>
		숫자1<input type="text" name="num01"/><br>
		숫자2<input type="text" name="num02"/><br>
		<input type="submit" value="합산"/>
	</form>
	<%
		int num01=0, num02=0;
		String num01S = request.getParameter("num01"); if(num01S!=null) num01=Integer.parseInt(num01S);
		String num02S = request.getParameter("num02"); if(num02S!=null) num02=Integer.parseInt(num02S);
		int tot = num01+num02;
	%>
	<h4>총계:<%=tot %></h4>

<%--
6. directive 지시자의 종류를 기술하고 이중 page 지시자의 속성을 기술하세요.
	1) directive 지시자의 종류
		page : jsp페이지에 대한 정보를 지정
			문서의 타입, 출력 버퍼의 크기, 에러 페이지 등 정보 지정
	    taglib : 사용할 태그 라이브러리를 지정
	    include : 다른 문서를 포함
    2) page 지시자의 속성
		info 속성
			info 속성은 페이지를 설명해 주는 문자열
        language 속성
            스크립트 요소에서 사용할 언어를 지정
        contentType 속성
            JSP 페이지의 내용이 어떤 형태로 출력을 할 것인지 MIME 형식으로 브라우저에 알려주는 역할을 하는 속성
        import 속성
            JSP페이지 내에서 package 이름을 지정하지 않고 다른 클래스를 가져와서 사용하는 경우 import 속성을 지정할 때
        pageEncoding 속성
            JSP 1.2 규약에 새로 추가된 속성으로 JSP 페이지에서 사용하는 character의 인코딩을 지정할 때 사용

7. 등록할 학생의 이름과 국어성적  5개를 리스트하여 등록시, 다른 페이지에 등록할 이름과 성적 총점을 출력되게 하세요
 --%>
 	<h3>예제 7번</h3>    
    <form action="0118_ex7-1.jsp">
	    <table>
	        <tr><th>이름</th><th>국어성적</th></tr>
	        <tr><td><input type="text" name="name"/></td><td><input type="text" name="kor"/></td></tr>
	        <tr><td><input type="text" name="name"/></td><td><input type="text" name="kor"/></td></tr>
	        <tr><td><input type="text" name="name"/></td><td><input type="text" name="kor"/></td></tr>
	        <tr><td><input type="text" name="name"/></td><td><input type="text" name="kor"/></td></tr>
	        <tr><td><input type="text" name="name"/></td><td><input type="text" name="kor"/></td></tr>
	        <tr><td colspan="2"><input type="submit" value="등록"/></td></tr>
	    </table>
    </form>
<%--
# 0118_ex7-1.jsp 페이지 #
	<%
	    String names[]= request.getParameterValues("name");
	    String kors[] = request.getParameterValues("kor");
	    int tot = 0;
	    if(names!=null){
	        for(int idx=0;idx<names.length;idx++){
	        	tot += Integer.parseInt(kors[idx]);
	%>
	<h4>학생이름: <%=names[idx]%></h4>
	<h4>국어점수: <%=kors[idx]%></h4>
	<%   	
			}
		}
	%>
	<h3>총점 : <%=tot %></h3>
--%>
</body>
</html>