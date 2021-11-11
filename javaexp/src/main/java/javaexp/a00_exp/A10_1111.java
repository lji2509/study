package javaexp.a00_exp;

public class A10_1111 {

	//과제1
	/*
	1) 최상위 태그
		table : 일반표를 삽입하기 위한 태그이다.
			border : 굵기 지정
			align : 포함하고 있는 요소 객체 대비 정렬 위치 지정
			width : 넓이 지정	/ %, px|pt 단위 지정 / %는 전체 화면대비 크기를 %로 지정
			height : 높이 지정
	2) 차상위 태그
		thead : 표의 머리를 생성하는 부분이다.
		tbody : 표의 본문을 생성하는 부분이다.
		tfoot : 표의 꼬리를 생성하는 부분이다.
	3) 행단위 태그 
		tr : table row로 행단위로 row를 생성한다.
	4) 열단위 태그
		th : table header로 상단에 테이블의 head로 타이틀 컬럼을 처리할 때 사용된다.
		td : table data로 테이블의 실제 데이터를 처리할 때 사용된다.
	
	*/
	
	//과제2
	/*
	<body>
	<style> td{text-align:center;} </style>
	
	<h2 align="center">1X2(병합제외)</h2>
	<table align="center" border="1" width="20%" height="20%">
		<tr><td>1</td><td>2</td></tr>
	</table>
	
	<h2 align="center">2X3</h2>
	<table align="center" border="1" width="20%" height="20%">
		<tr><td>1</td><td colspan="2">2</td></tr>
		<tr><td>3</td><td>4</td><td>5</td></tr>
	</table>
	 	
	<h2 align="center">2X4</h2>
	<table align="center" border="1" width="20%" height="20%">
		<tr><td colspan="4">1</td></tr>
		<tr><td>2</td><td>3</td><td>4</td><<td>5</td></tr>
	</table>

	<h2 align="center">2X5</h2>
	<table align="center" border="1" width="20%" height="20%">
		<tr><td rowspan="2">1</td><td>2</td><td>3</td><<td>4</td><td rowspan="2">5</td></tr>
		<tr><td>6</td><td>7</td><<td>8</td></tr>
	</table>
		
	<h2 align="center">4X3</h2>
	<table align="center" border="1" width="20%" height="20%">
		<tr><td colspan="3">1</td></tr>
		<tr><td rowspan="3">2</td><td colspan="2">3</td></tr>
		<tr><td>4</td><td>5</td></tr>
		<tr><td>6</td><td>7</td></tr>
	</table>
	
	</body>
	*/
	
	//과제3
	/*
	jsp ==> @@@.java ==> @@@.class ==> 결과 html파일 만들기 ==> client에게 html파일 전달 ==> 브라우저를 통해서 html 받기(화면출력)
	*/
	
	//과제4
	/*
	<body>
	
	<%
	Season s1 = new Season("봄", "맑음", "4월");
	Season s2 = new Season("여름", "비", "7월");
	Season s3 = new Season("가을", "흐림", "9월");
	Season s4 = new Season("겨울", "눈", "12월");
	%>
	
	<table align="center" border="1" width="50%">
		<style>td{text-align:center;}</style>
		<col width="20%" hight="20%">
		<col width="20%" hight="20%">
		<col width="20%" hight="20%">
		<thead>
			<tr><th>계절</th><th>날씨</th><th>기간</th></tr>
		</thead>
		<tbody>
			<tr><td><%=s1.getSeason() %></td><td><%=s1.getWeather() %></td><td><%=s1.getDate() %></td></tr>
			<tr><td><%=s2.getSeason() %></td><td><%=s2.getWeather() %></td><td><%=s2.getDate() %></td></tr>
			<tr><td><%=s3.getSeason() %></td><td><%=s3.getWeather() %></td><td><%=s3.getDate() %></td></tr>
			<tr><td><%=s4.getSeason() %></td><td><%=s4.getWeather() %></td><td><%=s4.getDate() %></td></tr>
		</tbody>
	</table>
	</body>
	*/
	
	//과제5
	/*
	<body>
	<%
		String[] object = new String[3];
		int[] price = new int[3];
		int[] cnt = new int[3];
		int[] sum = new int[3];
		
		object[0] = "화장품";
		object[1] = "책";
		object[2] = "옷";
		
		price[0] = 30000;
		price[1] = 8000;
		price[2] = 16000;
		
		cnt[0] = 2;
		cnt[1] = 4;
		cnt[2] = 1;
		
		sum[0] = price[0]*cnt[0];
		sum[1] = price[1]*cnt[1];
		sum[2] = price[2]*cnt[2];
	%>
	
	<table align="center" border="1" width="50%">
		<h2 align="center">구매한 물건정보</h2>
		<style>td{text-align:center;}</style>
			<tr><th>이름</th><td><%=object[0] %></td><td><%=object[1] %></td><td><%=object[2] %></td></tr>
			<tr><th>가격</th><td><%=price[0] %></td><td><%=price[1] %></td><td><%=price[2] %></td></tr>
			<tr><th>갯수</th><td><%=cnt[0] %></td><td><%=cnt[1] %></td><td><%=cnt[2] %></td></tr>
			<tr><th>합계</th><td><%=sum[0] %></td><td><%=sum[1] %></td><td><%=sum[2] %></td></tr>
			<tr><th>총계</th><td colspan="3"><%=sum[0] + sum[1] + sum[2] %></td></tr>
	</table>
	</body>
	*/
	
	//과제6
	/*
	1) src : 이미지가 있는 경로를 절대경로, 상대경로로 지정하여 해당 이미지를 불러올 수 있다.
	2) alt : src에 해당 이미지가 없을 때, 대체되어 나오는 문자열을 지정할 수 있다.
	3) width : 이미지의 너비를 지정
	4) height : 이미지의 높이를 지정
	
	ex) 
		 <img src="하니.jpg" width="100px" height="100px"/> : 같은 폴더에 있는 이미지파일
	 	 <img src="../../a01_img/쮸.jpg" width="100px" height="100px"/> : 상위폴더의 상위폴더의 a01_img폴더에 있는 이미지 파일
	*/
	
	//과제7
	/*
		<body>
	<style> td{text-align:center;} </style>
	<table align="center" border="1" width="50%" >
		<col width="20%">
		<col width="40%">
		<col width="20%">
	<thead>
		<tr><th>이름</th><th>사진</th><th>가격</th></tr>
	</thead>
	<tbody>
		<tr>
			<th>가방</th>
			<th><img src="/javaexp/a01_img/가방.jpg" width="100px" height="100px"/></th>
			<th>35000</th>
		</tr>
		<tr>
			<th>원피스</th>
			<th><img src="/javaexp/a01_img/원피스.jpg" width="100px" height="100px"/></th>
			<th>54000</th>
		</tr>
		<tr>
			<th>립스틱</th>
			<th><img src="/javaexp/a01_img/립스틱.jpg" width="100px" height="100px"/></th>
			<th>27000</th>
		</tr>
	</tbody>
	</table>
	</body>
	*/
	public static void main(String[] args) {
		//과제8
		int[] num = new int[3];
		
		System.out.print("처음 값 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100+1);
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		for(int i=0;i<num.length-1; i++) {
			for(int j=1; j<num.length; j++) {
				if(num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		System.out.print("정렬된 값 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
	}

}

/*
1. 테이블의 기본속성과 하위 요소객체들의 특성을 기술하세요.
2. 다음과 같은 테이블의 구조를 만들되, row병합, col병합을 포함하여 만드세요. (1X2-병합제외, 2X3, 2X4, 2X5, 4x3)
3. jsp가 처리되는 최종 화면을 출력되는 과정을 기술하세요.
4. [jsp]Season이라는 클래스에 계절명, 날씨, 기간 속성을 넣고 테이블 화면에 출력하세요.(4계절처리 - 객체 4개 생성)
5. [jsp]java와 테이블 태그를 이용해서 구매한 물건정보 3개를 출력하고, 최하단에 총계 정보를 처리하여 출력하세요.
6. img태그의 기본태그의 속성과 속성값을 기술하고, 상대적 경로로 이미지를 호출하여 출력하세요.
7. table과 이미지 태그를 조합하여, 온라인 쇼핑몰과 같이 이미지, 물건정보, 가격을 표시하여 리스트 출력하세요.
8. [jsp]3개의 난수를 발생하여, 정수형 배열 3개를 선언하고, 낮은 데이터부터 높은 데이터 순으로 할당하여 출력하세요.

*/