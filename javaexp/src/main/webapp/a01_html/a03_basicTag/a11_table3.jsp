<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{border-collapse:collapse;}
</style>
</head>
<body>
	<%--
	# jps의 반복문과 테이블 처리
	1. col단위 반복문 수행으로 테이블 출력 처리
		jsp
		<%
		for(초기값;반복조건;증감연산자){
		%>
		처리할 태그(반복출력할내용)
		<%
		}
		%>
	2. 배열값
		for(단위 데이터:배열) {
			단위데이터
		}
	 --%>
	 <table border>
	 	<tr>
	 		<%for(int cnt=1; cnt<=5; cnt++) {%>
	 		<td><%=cnt%> 번 열</td>
	 		<%} %>
	 	</tr>
	 </table>
	 
	 <table border>
		 <tr>	
			 <%
			 	String fruits[]={"사과", "바나나", "딸기"};
			 %>
				<%for(String fruit:fruits) {%>
			 	<td><%=fruit %></td>
			 	<%} %>
		</tr>
	</table>
	
	<table border>
		 	<%for(int i=5; i<=10; i++) { %>
		 <tr>
		 	<td><%=i %></td>
		 </tr>
		 	<%} %>
	</table>
	
	<table border>
		<tr>
			<%String prices[]={"1000","2000","3000"}; %>
			<%
			/*
			배열의 반복문 index 처리
			
			for(int idx=0; idx<prices.length; idx++) {
				idx : 0부터시작해서 .length보다 1작을 때까지 반복수행
				prices[idx] : 배열의 값을 가져올 수 있다.
			}	
			*/
			%>
			<%for(String price:prices) {%>
			<td><%=price %></td>
			<%} %>
		</tr>
	</table>
	
	<%
	String product[] = {"컴퓨터", "냉장고", "세탁기"};
	%>
	<table border>
		<tr><th>번호</th><th>전자제품</th></tr>
		<%
		for(int idx=0; idx<product.length; idx++) {
		%>
		<tr>
			<td><%=idx+1 %></td><td><%=product[idx] %></td>
		</tr>
		<%}%>
	</table>
	
	<%String book[] = {"아프니까","청춘","이다"};%>
	<table border>
		<tr><th>번호</th><th>도서명</th></tr>
		<%
		for(int i=0; i<book.length; i++) {
		%>
		<tr>
			<td><%=i+1 %></td><td><%=book[i] %></td>
		</tr>
		<%} %>
	</table>
	
	<%
	String[] pname = {"사과", "딸기", "바나나"};
	int[] price = {3000, 5000, 4000};
	int[] cnt = {4, 5, 2};
	%>
	<table align="center">
	<style>
		table, th, td{border-collapse:collapse;border:1px solid black; text-align:center}
		th{background:yellow;}
	</style>
		<tr><th>물건명</th><th>가격</th><th>갯수</th></tr>
		<%
		for(int i=0; i<pname.length; i++) {
		%>		
		<tr><td><%=pname[i] %></td><td><%=price[i] %></td><td><%=cnt[i] %></td></tr>
		<%
		}
		%>
	</table>
<%--
# 배열에서 객체 list로 변경
	1) 배열데이터
		String []names = {"오렌지", "수박", "키위"};
		int []prices = {3000, 12000, 4000};
		int []cnts = {5, 3, 2};
		index로 단위데이터를 가져온다.
			names[0], prices[0], cnts[0]
	2) 객체 list 데이터
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Product("오렌지", 3000, 5));
		plist.add(new Product("수박", 12000, 3));
		plist.addnew Product("키위", 4000, 2));
			plist.get(0) ==> Product("오렌지", 3000, 5);		
			plist.get(1) ==> Proudct("수박", 12000, 3);
			plist.get(2) ==> Product("키위", 4000, 2);
			
		<%for(Product p : plist) { %>
			<tr>
				<td><%=p.getName()%></td>
				<td><%=p.getPrice()%></td>
				<td><%=p.getCnt()%></td>
			</tr>
		<% } %>
					
		class Product {
			private String name;
			private int price;
			private int cnt;
			//생성자로 데이터 할당
			Product(String name, int price, int cnt) {
				this.name = name;
				this.price = price;
				this.cnt = cnt;
			}
			
			//기능 메서드 get/set을 통해 메서드를 통해서만 데이터 접근 가능
			public void setName(String name) {
				this.name = name;
			}
			public String getName() {
				ruturn name;
			}
 --%>	

<%
	/*
	# VO객체를 이용하여 ArrayList에 담고, 해당 내용을 반복문을 통해서 출력 처리하기
	1. VO객체 만들기 물건명, 가격, 갯수
	2. jsp : import하기 VO 및 ArrayList
	3. ArrayList<Product> 선언 및 객체 담기
		list.add(new Product("오렌지",3000,5))
	4. for(int idx=0; idx<list.size(); idx++) {
			Product prod = list.get(idx);
			prod.getName()
			prod.getPrice()
			prod.getCnt()
	}
	*/
%>
</body>
</html>