<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
1. 페이지호출과 요청값에 대한 처리 방식을 서버와 클라이언트 관점에서 구분하여 설명하세요.
2. url 호출 요청값 처리와 form요소 하위객체의 요청값 처리를 비교하여 기술하세요.
3. 로그인화면을 구성하고, form id/pass가 himan/7777일때, 인증 그외는 미인증으로 처리하세요. 
-->
<form>
아이디 : <input type="text" name="id" value=""><br>
비밀번호 : <input type="password" name="pw" value=""><br>
<input type="submit" value="로그인">
</form>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String result = "";
	
	if(id!=null && pw!=null) {
		if(id.equals("himan") && pw.equals("7777")) {	
%>
	<h2>인증!</h2>
<%
		}	
	} else {
%>
	<h2>미인증!</h2>
<%
	}
%>

<!--
4. 아래와 같은 여러 개의 물품 구매를 처리하여 총계를 처리하는 결과를 요청값에 의해 나타내세요.
            물건명   가격   갯수
            사과    [  ] [  ]
            바나나   [  ] [  ]
            딸기    [  ] [  ]
                  [총계]
5. 임의의 수학문제 10개(연산자도 임의 숫자도 임의)를 내고 총점을 계산하여 100점만점 기준으로 출력처리하세요
            번호    문제       정답
            1   [ ][X][  ] [  ]
            2   [ ][+][  ] [  ]
            3   [ ][-][  ] [  ]
            4   [ ][X][  ] [  ]
            ..
                  [점수확인]
6. jsp의 MVC 개발 패턴에 대하여 기술하세요
	Model, View, Controller의 약자로 프로그램의 개발패턴 가운데 하나로, 각 영역별로 역할이 주어져서 해당 역할에 따라 소스를 처리한다.
	1) Controller : 중재자 역할
		- 요청값을 받아서, 모델데이터 처리에 필요한 정보를 넘겨주고, 최종 화면을 처리할 view를 호출
	2) Model : 처리할 핵심 데이터
		- 보통 DB에서 가져온 데이터와 로직에 의해 최종으로 view단에 전달할 데이터를 말한다.
	3) View : controller/model을 통해서 최종적으로 화면에 나타날 코드 
		- 주로 jsp나 html을 지칭한다. 
		- controller에 의해 호출이 되고, 전달해온 model 데이터를 형식에 맞게 웹 화면에 출력한다.

7. MVC패턴으로 controller/view을 만들어서 호출하되 모델 데이터로 국어,영어,수학점수 설정하고, view단에서 해당 점수와 합산/평균을 처리하세요
-->
</body>
</html>