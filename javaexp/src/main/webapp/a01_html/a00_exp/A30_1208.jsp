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
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="text" name="pw"><br>
<input type="submit" value="로그인">
</form>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals("himan") && pw.equals("7777")) {
		
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
7. MVC패턴으로 controller/view을 만들어서 호출하되 모델 데이터로 국어,영어,수학점수 설정하고, view단에서 해당 점수와 합산/평균을 처리하세요
 -->
</body>
</html>