package javaexp.a00_exp;

import java.util.ArrayList;

public class A07_1108 {
	//과제1
	/*
	읽기와 쓰기가 분리된 메서드를 통해 필드값을 변경하며 데이터를 접근제어를 통해 효과적인 처리를 하기 위하여 필드값을 private로 설정하여 사용한다.
	encapsulation라는 객체에 구성요소에 접근제한을 두어 외부의 호출에 대하여 접근을 제한하는 oop(객체지향프로그래밍)의 핵심 개념을 사용한 것이다.
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
	클라이언트(사용자) : 컴퓨터에 자원을 요청한다.
	서버(제공자) : 클라이언트의 요청에 응답한다.
	*/
	
	//과제6
	/*
	1. HTML5
		- 큰 의미로는 웹 표준 기술을 총칭하고, 작은 의미로는 웹 문서의 문법을 의미
		- 별도 프로그램을 깔지 않아도 인터넷 브라우저상에서 화려한 그래픽 효과를 구현하며, 음악ㆍ동영상을 자유롭게 감상할 수 있는 마크업 언어
		- 멀티미디어 기능 : HTML5는 플러그인 도움 없이도 스스로 음악과 동영상을 재생할 수 있음
		- 그래픽 기능 : 2차원, 3차원 그래픽 구현 가능
		- 통신 : 서버와 실시간으로 쌍방향 통신 가능, 웹에서 실시간 채팅이나 실시간 온라인게임을 할 수 있음
		- 시맨틱 : 검색 엔진 같은 프로그램이 정보를 분석, 자료를 검색 및 처리해서 제공하는 지능형 웹
		- 하이브리드 응용프로그램 : 스마트폰의 기본 프로그래밍 언어와 HTML5를 함께 사용해 응용 프로그램을 만드는 방법
	2. CSS
		- CSS(Cascading Style Sheets) : HTML 문서를 표현하는 방법을 기술하는 언어
		- 스타일시트는 현대 웹 페이지에서 매우 중요한 역할
		- 웹 페이지의 스타일을 미리 저장해 두면 웹 페이지의 한 가지 요소만 변경해도 관련되는 전체 페이지의 내용이 한꺼번에 변경되므로, 문서 전체의 일관성을 유지할 수 있고 작업 시간도 단축할 수 있음
		- 세세한 스타일 지정의 필요를 줄어들게 함
		- 웹 개발자들은 보다 풍부한 디자인으로 웹을 설계할 수 있고, 글자의 크기, 글자체, 줄간격, 배경 색상, 배열위치 등을 자유롭게 선택하거나 변경할 수 있으며 유지·보수도 간편하게 할 수 있음
	3. 자바스크립트
		- 표준 명칭 : ECMAScript5
		- 웹 페이지에서 사용자로부터 특정 이벤트나 입력 값을 받아 동적인 처리를 목적으로 고안된 객체 기반의 스크립트 프로그래밍 언어로, 사용자 반응 등을 처리
		- 현대에는 서버는 물론 로봇 개발에도 사용 
		- 컴파일 과정이 없기 때문에 다른 언어와 비교했을 때 빠른 시간 안에 스크립트 코드를 작성할 수 있게 해줌
		ex) 마우스를 HTML 문서의 특정 이미지나 텍스트 위로 가져갔을 때 이미지 크기가 커지거나 텍스트의 색이 바뀌는 기능
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
		
		list.set(4, "집안일");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("일정" + i + " : " + list.get(i));
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
					if(n==0) {
						break;
					} else if(num[q] != r) {
						continue;
					} else {
						r = (int)(Math.random()*52);
						q = 0;
						continue;
					}
						
				}
				
				num[n++] = r;
				card[r].show();
				
				if(j == 7) {
					System.out.println();
				} else {
					System.out.print(" ");
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