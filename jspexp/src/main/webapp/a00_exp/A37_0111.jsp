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
  src="${path}/a00_com/jquery-3.5.1.js"></script>
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
	1. jsp의 request, response 객체의 역할을 브라우저에서 서버에 호출하는 기준으로 설명하세요.
		1-1. Request 객체
			웹 브라우저를 통해 서버에 어떤 정보를 요청하는 것
			클라이언트에서 넘어오는 데이터를 서버 측에서 받아오는 객체
			getParameter(String name): name에 해당하는 파라미터 값을 구함
			Values(String name): name에 해당하는 파라미터 값들을 구함
			생성 : 클라이언트 요청 시
			소멸 : 요청에 대한 처리 완료 시
			사용 범위 : 요청을 처리하기 위한 하나의 스레드
			서블릿의 request 객체와 같은 클라이언트가 요청한 정보에 대한 객체입니다. 컨테이너는 요청된 데이터를 바탕으로 HttpServletRequest 객체를 만들어서 전달해줍니다.
	
		2-2. response 객체
			웹 브라우저의 요청에 응답하는 것을 말함
			응답의 정보를 가지고 있는 객체를 response객체라고 말함
			서버측에서 클라이언트측으로 데이터를 전달하기 위한 객체
		
	2. 요청값과 form 속성, form하위 요소객체의 관계를 url 요청 처리(페이지명?key=value)기준으로 설명하세요
		브라우저(폼 데이터 전송)-> 웹 서버(폼 데이터 전송)-> 웹 프로그램
		action: 폼을 전송할 서버 쪽 스크립트 파일을 저장
		name: 폼을 식별하기 위한 이름을 지정합니다.
		accept-charset: 폼 전송에 사용할 문자 인코딩을 지정합니다.
		target: action에서 지정한 스크립트 파일을 현재 창이 아닌 다른 위치에 열도록 지정합니다.
		mehtod: 폼을 서버에 전송할 http 메소드를 정합니다.(GET 또는 POST)
		jsp 페이지==> key값과 value값이 쌍이되고, 여러쌍의 데이터를 보낼 수 있다.
		ex) <form type="post" action="address">
		  		<input type="hidden" name="key" value="전송값">
		    </form>
		    
	3. script의 3가지 요소객체를 기술하고, 각각의 기본 코드를 기술하세요.
		declare<%! : 자바의 함수 선언
		scriptlet<% : JSP에서 자바코드 실행할때 사용
		expression<%= : html에 결과값에 포함될때 사용
		
	4. salgrade 테이블을 리스트하려고 한다. dao에 기능 메서드를 추가하고, VO, 기능메서드 처리, 화면 출력 처리를 하되, 전체 검색 및 등급별 검색이 되게 하세요.
	--%>
	<%
	Salgrade_dao dao = new Salgrade_dao();
	%>
	<table>
		<tr><th>등급</th><th>최저급여</th><th>최고급여</th></tr>
		<%for(Salgrade s:dao.SalgradeList(1)) { %>
		<tr>
			<td><%=s.getGrade() %></td>
			<td><%=s.getLosal() %></td>
			<td><%=s.getHisal() %></td>
		</tr>
		<%} %>
	</table>
	
	<%--
	5. session의 4가지 범위와 내용에 대하여 기술하세요.
	   4가지 scope
		   1) page : 페이지 내에서 지역변수처럼 사용
		   2) request :  http요청을 WAS가 받아서 웹 브라우저에게 
		            응답할 때까지 변수가 유지되는 경우 사용
		   3) session : 웹 브라우저 별로 변수가 관리되는 경우 사용
		   4) application : 웹 어플리케이션이 시작되고 종료될 때까지 변수가 유지되는 경우 사용
			
	6. 외부 페이지를 포함하는 형식 3가지를 기술하세요.
	  1) iframe(js/html)
      css, html, js단위 데이터 넘겨주거나 설정할 수 있음.
      DOM객체(js) 범위로 화면을 처리할 수 있다. 
      
	   2) include 액션태그 설정(jsp)
	      - 서버측 include가 아닌 클라이언트측의 include
	      - include 되는 페이지와 변수를 같이 사용할 수 없다
	
	   3) directive로 페이지 포함..
	      - 포함된 페이지를 포함해서 전체적을 컴파일 되기에 
	         같은 페이지에서 선언하는 것과 동일하게 변수나 객체를 공유하여 사용할 수 있다.
	      - jsp 파일, html 파일 또는 텍스트 파일 일 수 있는 모든 자원의 내용을 포함하는 데 사용
	         include 지시문은 페이지 변환시 포함 된 자원의 원래 컨텐츠를 포함
	         
	7. 기본적인 에러 처리 방식을 기술하세요.
		1. error가 발생했을때, 처리할 페이지를 만든다. isErrorPage="true"
		2. page 지시자에서 error 페이지를 지정한다. 
	 --%>
</body>
</html>