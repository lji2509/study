<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.Product"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>번호</th><th>문제</th><th>정답</th>
	</tr>
<%
	int num1 = 0;
	int num2 = 0;
	String[] gu = {"X", "+", "-", "/"};
	int bun = 0;
	for(int i=0; i<10; i++) {
		num1 = (int)(Math.random()*9+1);
		num2 = (int)(Math.random()*9+1);
		bun = (int)(Math.random()*4);
		
	
%>
<form>
	<tr>
		<td align="center">
		<%=i+1%>
		</td>
		<td align="center">
		<input type="text" name="num1" size="2" value=<%=num1%>>
		<input type="text" name="gu" size="2" value=<%=gu[bun]%>>
		<input type="text" name="num2" size="2" value=<%=num2%>>
		</td>
		<td align="center">
		<input type="text" name="result" size="2">
		</td>
	</tr>
<%
	}
%>
	<tr>
		<td colspan="3" align="center"><input type="submit" value="점수확인"></td>
	</tr>
</form>
</table>
	
<%
	int cnt = 0;
	String[] num1S = request.getParameterValues("num1");
	String[] num2S = request.getParameterValues("num2");
	String[] resultS = request.getParameterValues("result");
	String[] gu1 = request.getParameterValues("gu");
	if(num1S!=null && num2S!=null && resultS!=null && gu1!=null) {
		for(int i=0; i<10; i++) {
			int num11 = Integer.parseInt(num1S[i]);
			int num21 = Integer.parseInt(num2S[i]);
			int result1 = Integer.parseInt(resultS[i]);
			String gu2 = gu1[i];
			if(gu2.equals("X")) {
				if((num11*num21)==result1) {
					cnt+=10;
				}
			}else if(gu2.equals("+")) {
				if((num11+num21)==result1) {
					cnt+=10;
				}
			}else if(gu2.equals("-")) {
				if((num11-num21)==result1) {
					cnt+=10;
				}
			}else if(gu2.equals("/")) {
				if((num11/num21)==result1) {
					cnt+=10;
				}
			}
		}
%>
	<h3>점수확인 : <%=cnt %></h3>
<%
	}
%>
</body>
</html>