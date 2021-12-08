<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	# 요청값이 숫자형일 때 처리
	1. 기본적으로 모든 요청값은 문자열형이다.
	2. 그래서 숫자형 데이터를 요청값으로 받아서 처리해야 할 경우에는 형변환이 필요하다.
	3. 숫자형 문자열을 숫자로 변환할 때 필요한 기능 메서드
		Integer.parseInt("숫자형문자열") ==> 숫자
		ex) int num5 = Integer.parseInt("25");
		num5에 25라는 정수가 할당될 수 있다.
	4. 요청값을 받아서 숫자형태로 변환
		?age=25
		String ageS = request.getParameter("age");
		if(ageS!=null) { //요청값을 입력했을 때만 처리
			int age = Integer.parseInt(ageS);
		}
	 --%>
	<form>
		구매할 물건 : <input type="text" name="pname"><br>
		가격 : <input type="text" name="price"/><br>
		갯수 : <input type="text" name="cnt"/><br>
		<input type="submit" value="구매">
	</form>
	<%
		String id = request.getParameter("pname");
		String priceS = request.getParameter("price");
		String cntS = request.getParameter("cnt");
		int price = 0;
		int cnt = 0;
		if(priceS!=null) { //요청값이 있을 때 처리
			price = Integer.parseInt(priceS);
		}
		if(cntS!=null) {
			cnt = Integer.parseInt(cntS);
		}
		//초기화면에 요청값이 없을 때, 즉 pname이 null일때를 제외하고 화면을 출력하려면 조건문으로 처리할 수 있다.
		if(id!=null) { //요청값이 있을 때만 처리
	%>
			<h3>물건명 : <%=id %></h3>
			<h3>가격 : <%=price %></h3>
			<h3>갯수 : <%=cnt %></h3>
			<h3>총계 : <%=(price*cnt) %></h3>
	<%
		}
	%>
</body>
</html>