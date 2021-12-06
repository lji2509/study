/*
1. 계층형 sql이란 무엇인가?
*/


/*
2. 계층형 sql의 데이터 구조를 emp의 empno와 mgr을 기준으로 기술하세요
*/


/*
3. 계층형 sql의 핵심 keyword의 의미를 기술하세요.
	1) select level, 컬럼..
		level : 각 컬럼에 해당하는 데이터의 계층 레벨을 표기
	2) start width 컬럼 = 조건 : 최상위 root 레벨을 지정하는 조건
	3) connect by prior 컬럼1 = 컬럼2 : 계층으로 나누어지는 컬럼의 관계를 설정하는 것이다.
						하위컬럼 = 상위컬럼 : 순방향
						상위컬럼 = 하위컬럼 : 역방향
	select level
	from 테이블명
	start with mgr = null : 최상위 root 계층 조건을 설정
	connect by prior = empno : 상/하위 계층을 연결하는 조건을 처리
*/

/*
4. 답변형게시판 테이블(글번호, 상위글번호, 제목, 작성자, 등록일, 조회수)을 계층구조로 데이터를 입력한 후에 계층형 sql을 이용해서 조회하세요
*/


/*
5. sequence를 사용하는 이유를 기술하세요.
*/


/*
6. sequence의 주요속성값을 기술하세요
	1) 생성
		create sequence 시퀀스명
			increment by 증가단위
			start with 시작번호
			maxvalue 최대값 | nomaxvalue
			minvalue 최소값 | nominvalue
			cycle | nocycle 반복여부 설정
			cache n | nocache 속도 개선을 위한 메모리 캐시 갯수 설정
	2) 활용
		시퀀스명.nextval : 현재 시퀀스번호를 출력하면서 다음 시퀀스가 넘버링된다.
		시퀀스명.currval : 현재 시퀀스번호를 출력
	3) 삭제
		drop sequence 시퀀스명;
*/
/*
7. 상품목록의 상품번호를 Q21121000부터 시작해서 Q년도월1000~ 까지 입력할려고 한다, squence를 만들고, 해당테이블에 key를 입력하세요..
*/
CREATE SEQUENCE squ_product
	INCREMENT BY 1
	START WITH 1000
	MAXVALUE 9999
	MINVALUE 1000
	CYCLE;
SELECT 'Q'||to_char(sysdate,'yyyy')||'년도'||to_char(sysdate,'mm')||'월'||squ_product.nextval bunho1,
	'Q'||to_char(sysdate,'yyyy')||to_char(sysdate,'mm')||squ_product.nextval bunho2
FROM dual;
/*
8. exerd의 환경 설정을 처리하세요(ppt)
*/