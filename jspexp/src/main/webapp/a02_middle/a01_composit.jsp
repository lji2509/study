<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%--<%@ include file="" %> 포함해서 함께 컴파일시킬 jsp/html 페이지 --%> 
<%--
#directive의 종류
1. <% page : 페이지 directive
	contentType="text/html; charset=UTF-8"
	현재 jsp의 실행결과를 나타낸다. 이것을 이용해서 excel/pdf, 파일다운로드 처리
	import : 사용하게될 객체
	session : 세션설정 defalut true
	isErrorPage : 에러페이지인지 여부
	errorPage : 에러페이지 지정
2. <%@ taglib : 태그라이브러리 directive
3. <%@ include : 인클루드 directive
 --%>
 
<%--
# jsp페이지의 구성요소
1. 디렉티브(directive)
2. 스크립트 : scriptlet, expression, declaration
				<% %>		<%= %>		<%! %>
3. 표현언어(expression language) ${변수명}
4. 기본객체(implicit object)
	protected void service(HttpServletRequest request, HttpServletResponse response)
	jsp의 경우 변환될 서블릿 자바에서 위 내용을 감싸기에 가능하다.
	request, response, out
5. 정적 데이터 : 변수, 객체 등 스크립트에서 사용되는 데이터
6. 표준 액션 태그(action tag) : <jsp:include>, <jsp:useBean>
7. 커스텀 태그 : <c:set <c:if <c:forEach
--%>
</head>
<body>
	<%!
	int num1;
	public int prodTot(int price, int cnt) {
		int tot = price * cnt;
		return tot;
	}
	class Person{
		String name;
		Person(String name) {
			this.name = name;
		}
		String getName() {
			return name+"님!";
		}
	}
	%>
	<%
		num1 = 30; //declare부분 호출
		Person p1 = new Person("홍길동");
	%>
	<h3>제목</h3>
	<table>
		<tr><th>함수호출</th><td><%=prodTot(3000,4) %></td></tr>
		<tr><th>변수호출</th><td><%= num1%></td></tr>
		<tr><th>객체함수호출</th><td><%=p1.getName() %></td></tr>
	</table>
</body>
</html>