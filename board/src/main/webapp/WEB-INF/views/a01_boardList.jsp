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
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
	/*
		var msg = "${msg}";
		if(msg != "") {
			alert(msg);
			if(msg == "로그인 실패") {
				$("#exampleModalCenter").modal("show");
			}
		}
		//로그인 후 session이 있을 때
		var hasSession = "${member.name}";
		console.log("세션 이름 : " + hasSession);
		if(hasSession=="") { //session값이 없을 때
			alert("로그인이 필요합니다.");
			$("#loginBtn").click();
		} else {
			$("#loginBtn").show();
			$("#loginBtn").text("로그아웃");
		}
		// session이 없는데, 다이얼로그를 닫는 경우, 처리..
		$("#exampleModalCenter").on('hide.bs.modal', function(){
			if(hasSession==""){ // session값이 없을 때..
				alert("로그인이 필요합니다!");
				$("#loginBtn").click();
			}
		});	
	*/
		<%-- 
		
		--%>
		$("#regBtn").click(function() {
			if(confirm("등록하시겠습니까?")) {
				location.href="${path}/board.do?method=insertFrm";
			}
		});
	});
	function getDetail(no) {
		location.href="${path}/board.do?method=detail&no="+no;
	}
	
	function goPage(no) {
		$("[name=curPage]").val(no);
		$("#frm01").submit();
	}
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 >게시판 리스트</h2>
  <p align="right">
  	<c:if test="${not empty member.id}">
  		${member.id} 로그인중<br>
  	</c:if>
  </p>		
  <p align="right">
  	<button class="btn btn-info" id="loginBtn" type="button" data-toggle="modal" data-target="#exampleModalCenter">로그인</button>
  </p>
</div>
<div class="container">
	<form id="frm01" class="form-inline"  method="post">
	 <input type="hidden" name="curPage" value="1"/>
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" name="title" value="${boardSch.title}" placeholder="제목" />
	    <input class="form-control mr-sm-2" name="writer" value="${boardSch.writer}" placeholder="작성자" />
	    <button class="btn btn-info" type="submit">조회</button>
	    <button class="btn btn-success" type="button" id="regBtn">등록</button>
 	</nav>
 	<div class="input-group mb-3">
 		<div class="input-group-prepend">
 			<span class="input-group-text">총 ${boardSch.count}건</span>
 		</div>
 		<input class="form-control"/>
 		<div class="input-group-append">
 			<span class="input-group-text">페이지 크기</span>
 			<select name="pageSize" class="form-control">
 				<option>3</option>
 				<option>5</option>
 				<option>10</option>
 				<option>20</option>
 				<option>50</option>
 			</select>
 		</div>
 	</div>
	</form>
	<script type="text/javascript">
		var pageSize="${boardSch.pageSize}"
		$("[name=pageSize]").val(pageSize);
		$("[name=pageSize]").change(function() {
			$("#frm01").submit();
		});
	</script>
   <table class="table table-hover table-striped">
   	<col width="10%">
   	<col width="50%">
   	<col width="15%">
   	<col width="15%">
   	<col width="10%">
    <thead>
    
      <tr class="table-success text-center">
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회</th>
      </tr>
    </thead>	
    <tbody>
    	<c:forEach var="board" items="${boardList}">
    		<tr ondblclick="getDetail('${board.no}')">
    			<td>${board.cnt}</td>
    			<td style="text-align:left">
	    			<%--
	    			레벨에 따른 공백 처리 후, 답글 이미지 넣기
	    			level : 계층 레벨에 따라, 공백 및 마지막에 답글 이미지 표현
	    			 --%>
	    			 <c:forEach varStatus="sts" begin="1" end="${board.level}">
	    			 	&nbsp;&nbsp;
	    			 	<c:if test="${board.level>1 and sts.last}">
	    			 		<img width="25" height="15" src="${path}/a02_img/reply2.png"/>
	    			 	</c:if>
	    			 </c:forEach>
    				${board.title}
    			</td>
    			<td>${board.writer}</td>
    			<td><fmt:formatDate value="${board.regdte}"/></td>
    			<td>${board.readcnt}</td></tr>
    	</c:forEach>
    </tbody>
	</table>    
    <ul class="pagination">
	  <li class="page-item"><a class="page-link" href="javascript:goPage(${boardSch.startBlock!=1?boardSch.startBlock-1:1})">Previous</a></li>
	  <c:forEach var="cnt" begin="${boardSch.startBlock}" end="${boardSch.endBlock}">
	  	<li class="page-item ${cnt==boardSch.curPage?'active':''}"> <!-- 클릭한 현재 페이지 번호 -->
	  		<a class="page-link" href="javascript:goPage(${cnt})">${cnt}</a></li>
	  </c:forEach>
	  <li class="page-item"><a class="page-link" href="javascript:goPage(${boardSch.endBlock!=boardSch.pageCount?boardSch.endBlock+1:boardSch.endBlock})">Next</a></li>
	  <!-- 다음 block의 리스트는 현재 블럭의 마지막 번호 +1
	  		마지막 블럭이 총페이지일 때는 다음 블럭이 없기 때문에 그대로 두고 다음 블럭이 있을 때만 카운트되게
	   -->
	</ul>
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
	<form id="frm02" class="form"  method="post" action="${path}/board.do?method=login">
      <div class="modal-body">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="아이디 입력" name="id">
	      </div>
	      <div class="col">
	        <input type="password" class="form-control" placeholder="패스워드 입력" name="pass">
	      </div>
	     </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">로그인</button>
      </div>
	 </form> 
    </div>
  </div>
</div>
</body>
</html>