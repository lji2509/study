package javaexp.a00_exp;

import java.util.ArrayList;

public class A07_1108 {
	//과제1
	/*
	필드값에 직접적인 접근을 하는 것을 방지함으로 데이터의 효과적인 보안 처리와 객체지향 프로그램의 encapsulation 개념에 합쳐 처리하기 위한 것이다.
	encapsulation란, 특정 데이터를 접근하기 위한 방법을 마련하여 해당 방법으로만 해당 데이터를 처리하기 위한 개념으로,
	vo객체같은 경우 읽기를 하는 메서드 getXXX()와 쓰기를 하는 메서드 setXXX()로만 데이터를 처리하게 한 것을 말한다.
	*/
	
	//과제2
	/*
	필드는 private로 설정하여 직접적인 외부 호출을 방지한다.
	생성자와 메서드는 public으로 설정하고, 생성자를 통해서 필드값을 초기화 처리
		getXXX() : 호출하는 메서드를 통해서 필드값을 호출
		setXXX() : 저장하는 메서드를 통해서 필드값을 저장
	*/
	
	//과제5
	/*
	웹에서 서버란 클라이언트에서 특정한 웹화면과 웹화면을 통해서 정보나 화면을 지원해주는 데몬을 말한다.
	웹서버라고 하는데, apache, IIS 등이 있다. 이 웹서버에 DB나 java와 같은 프로그램을 컴파일시켜서 처리해주는 것을 웹애플리케이션서버(WAS)라고 한다.
	tomcat, jeus, weblogic 등이 대표적인 was라고 할 수 있다.
	웹에서 클라이언트란 웹서버에 요청을 하여 특정한 화면이나 정보를 전달받는 프로그램을 말한다.
	html형식으로 전달받아, 랜더링하여 tag에 지정된 형태로 확면을 출력처리하는 브라우저를 말한다.
	브라우저의 종류로는 인터넷익스플로러, 사파리, 오페라, 크롬 등이 있다.
	두개의 웹서버와 클라이언트는 네트웍이라는 환경하에 상호간의 요청과 반응을 하면서 사용자가 필요로하는 정보나 화면, 서비스를 전달받는 처리를 한다.
	*/
	
	//과제6
	/*
	html은 기본적으로 웹화면을 구성하는 태그 언어를 말한다.
		테이블형식 리스트처리, 타이틀, 메뉴 목록 처리, 화면 구성 처리, 등을 지원하는 태그들로 구성하고 있다.
	css는 html에 지원한 기본 태그에서 확장된 모양과 색상 크기를 지원하는 언어이다.
		효과적으로 웹화면을 구성할 수 있도록 지원한다.
	javascript는 html과 css에 동적인 기능 처리를 할 수 있게 프로그램적으로 지원하는 것을 말한다.
		html과 css에서 지원한 태그나 코드들을 DOM(document object model)이라는 개념으로 객체화하여 객체지향적으로 프로그래밍화하여 지원하는 것을 말한다.
	# javascript ==> jquery ==> ajax ==> node ==> vue
	*/
	
	public static void main(String[] args) {
		//과제3
		Computer1 c1 = new Computer1("삼성", "라이젠5600x", 8, 512);
		
		System.out.println("제조사 : " + c1.getMake());
		System.out.println("CPU : " + c1.getCpu());
		System.out.println("RAM : " + c1.getRam());
		System.out.println("HDD : " + c1.getHdd());
		
		System.out.println();
		
		//과제4
		/*
		배열은 정적데이터여서 구조자체가 초기에 크기가 정해지면 변경하지 못한다.
		자바에서는 Collection 하위에 선형구조로 List 인터페이스를 상속받은 ArrayList객체를 통해 동적배열을 지원하여, 자유로운 추가가 가능하다.
		*/
		ArrayList list = new ArrayList();
		
		list.add("자바예습 및 복습");
		list.add("넷플릭스 보기");
		list.add("게임");
		list.add("핸드폰 통신사변경");
		list.add("강아지 산책");
		list.add(0,"산책");
		list.remove(3);
		list.set(4, "집안일");
		
		System.out.println("ArrayList의 크기 : " + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println("일정" + (i+1) + " : " + list.get(i));
		}
		
		System.out.println();
		
		//과제8
		String form[] = {"◆", "♠", "♣", "♥"};
		String bunho[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		Card1[] card = new Card1[52];
		int cdx = 0;
		
		for(int idx=0; idx<form.length; idx++) {
		
			for(int jdx=0; jdx<bunho.length; jdx++) {
//				System.out.print(form[idx] + bunho[jdx] + " "); 
				card[cdx] = new Card1(form[idx], bunho[jdx]);
				cdx++;	
			}
//		System.out.println();
		}
		
		String friend[] = {"친구1", "친구2", "친구3", "친구4"};
		int num[] = new int[friend.length*7];
		int n = 0;
		
		for(int i=0; i<friend.length; i++) {
			System.out.print(friend[i] + " : ");
			for(int j=1; j<=7; j++) {
				int r = (int)(Math.random()*52);
				
				//중복제거해서 카드뽑기
				for(int q=0; q<n; q++) {
					if(num[q] == r) {
						r = (int)(Math.random()*52);
						q = -1;
					}		
				}
				num[n++] = r;
				card[r].show();
				
				if(j == 7) {
					System.out.println();
				} else {
					System.out.print("\t");
				}
				
			}
		}
	}
	
}

class Card1 {
	String form;
	String bunho;
	
	Card1(String form, String bunho) {
		this.form = form;
		this.bunho = bunho;
	}
	
	void show() {
		System.out.print(form+bunho);
	}
	
}

/*
1. java에서 필드값을 private로 설정하는 이유를 encapsulation 개념을 찾아보시고 기술하세요.
2. VO객체의 구성에 있어서 접근제어자 형태를 기술하세요.
3. Computer라는 VO객체를 만들고, 필드(제조사, cpu, ram, hdd)를 설정하고, main()를 통해서 객체 생성 호출 처리하는 프로그램을 만드세요.
4. 동적배열 ArrayList와 배열의 차이점을 기술하고, 지난 주말의 가장 중요한 일정을 순서별로 5가지 추가/변경/호출하세요.
5. 웹에서 서버와 클라이언트란 무엇인가?
6. html와 css, javascript의 차이를 기술하세요. (오늘 정리한 내용 + 인터넷 확인)
7. 오늘 설치한 vscode 및 ppt로 자료를 만들어, 과제 내용과 함께 제출하세요.
8. 오늘 만든 52개 카드 배열을 활용하여, 친구 4명에게 돌린 임의 7장 카드를 출력하세요.

*/