<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Product"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="" action="" name="">
	<fieldset style=width:25%>
		<legend><p>로그인</p></legend>    
		<table style="background-color:white; font-bold:; text-align: left; width: 300px; height: 60px;"border="0" cellpadding="0" cellspacing="0">
			<tbody>
				<tr>
 					<td style="vertical-align: top; font-size: 15px; font-weight : bold;" >아이디:</td>
					<td style="vertical-align: top;"><input name="id" type="text" placeholder="아이디를 입력해주세요" autofocus required></td>
				</tr>
				<tr>
					<td style="vertical-align: top;font-size: 15px; font-weight : bold;">비밀번호:</td>
					<td style="vertical-align: top;"><input name="password" type="password" placeholder="패스워드를 입력해주세요" required><br>
					</td>
				</tr>
			</tbody>
		</table>
		<input value="로그인" name="check" type="submit">
		<input value="취소" name="cancel" type="reset">
	</fieldset>    
</form>
</body>
</html>