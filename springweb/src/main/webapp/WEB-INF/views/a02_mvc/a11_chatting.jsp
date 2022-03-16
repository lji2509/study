<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<style type="text/css">
	.input-group-text{width:100%;background-color:linen;color:black;font-weight:bolder;}
	.input-group-prepend{width:20%;}
	#chatArea{
		width:80%;height:200px;overflow-y:auto;text-align:left;
		border:1px solid green;
	}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	var wsocket;
	$(document).ready(function(){
		//1. 웹 소켓 클라이언트를 통해 웹서버 연결하기
		$("#enterBtn").click(function(){
			conn();
		});
		$("#id").keyup(function(){
			if(event.keyCode==13) {
				conn();
			}
		});
		<%-- 
		
		--%>	
	});
	function conn() {
		wsocket = new WebSocket("ws:/localhost:8000/${path}/chat-ws.do");
		wsocket.onopen=function(evt){
			//handler :afterConnectionEstablished(WebSocketSession session)와 연결
			console.log(evt);
			wsocket.send("msg : " + $("#id").val() + " : 연결 접속했습니다.")
		}
		//handler의 handleTextMessage()
		//연결되어있으면 메시지를 push형식으로 서버에서 받을 수 있다.
		wsocket.onmessage=function(evt){
			//받은데이터
			var msg = evt.data;
			$("#chatMessageArea").append(msg+"<br>");
		}
	}
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 data-toggle="modal">채팅처리</h2>

</div>
<div class="container">
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">아이디</span>
		</div>
		<input id="id" class="form-control" placeholder="접속할 아이디를 입력하세요"/>	
		<input type="button" id="enterBtn" class="btn btn-info" value="채팅입장"/>	
		<input type="button" id="exitBtn" class="btn btn-success" value="나가기"/>	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">내용</span>
		</div>
		<div id="chatArea" class="input-group-append">
			<div id="chatMessageArea"></div>
		</div>
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">메시지</span>
		</div>
		<input name="msg" class="form-control" placeholder="보낼 메시지를 입력하세요"/>	
		<input type="button" id="sendBtn" class="btn btn-info" value="전송"/>	
	</div>	
</div>
</body>
</html>