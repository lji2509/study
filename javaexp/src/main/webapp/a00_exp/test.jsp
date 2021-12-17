<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int firstNum = (int) (Math.random() * 9 + 1); 
	int secondNum = (int) (Math.random() * 9 + 1); 
	String[] op = new String[4];
	op[0] = "+";
	op[1] = "-";
	op[2] = "X";
	op[3] = "/";
	int ranop = (int)(Math.random() * 4);
	
	%>
	<form>

		1 <input type="text" name="fnum" size="2" value="<%=firstNum%>"> <%=op[ranop] %>
		<input type="text" name="snum" size="2" value="<%=secondNum%>"> = 
		<input type="text" name="result" size="2"><br>
		<input type="submit" value="계산">
	</form>
	<%

	String fnumS = request.getParameter("fnum");
	String snumS = request.getParameter("snum");
	String results = request.getParameter("result");
	int fnum = 0;
	int snum = 0;
	int result = 0;
	int score = 0;

	if (fnumS != null && snumS != null) {
		fnum = Integer.parseInt(fnumS);
		snum = Integer.parseInt(snumS);
		result = Integer.parseInt(results);
		if(op[ranop]=="+"){
			if ((fnum+snum) == result){
				score += 10;
			}
		}else if (op[ranop]=="-"){
			if ((fnum-snum) == result){
				score += 10;
			}
		}else if (op[ranop]=="X"){
			if ((fnum*snum) == result){
				score += 10;
			}
		}else if (op[ranop]=="/"){
			if ((fnum/snum) == result){
				score += 10;
			}
		}
	}
	
	
	%>
	<h3>최종점수 : <%=score %></h3>
</body>
</html>