/*
1. 제약조건을 하는 이유에 대하여 기술하세요.
	데이터의 무결성(일관성유지 : 다른 테이블과의 관계에서 데이터) 확보를 위하여 제약조건을 사전에 설정(테이블 생성)한다.
	특정한 경우 공백데이터 입력불가, 중복데이터 입력불가, 지정된 데이터만 입력처리, 기준이 되는 테이블의 데이터만 입력가능하게 처리할 수 있게 하는 것을 말한다.
*/
/*
2. oracle의 제약조건의 종류와 기본 형식에 대하여 기술하세요.
	컬렴명 데이터유형 constraint 제약조건명 제약조건
	컬럼명 데이터유형 제약조건
		ex) empno number(4) constraint emp_empno_pk primary key

	1) not null : 반드시 데이터를 입력해야 하는 경우
	2) unique key : 데이터가 행단위 다르게 저장되어야 한다. 중복 데이터 불가(예외 null은 중복 가능)
	3) primary key : not null, unique가 설정되는 경우로 테이블에 식별할 수 있는 key 설정할 때 사용된다.
	4) foreign key : 다른 외부 테이블에 저장된 데이터만 입력가능하도록 한다.
	5) check : 해당 컬럼에 지정된 데이터의 범위만 등록이 가능하도록 하는 것을 말한다.
*/
/*
3. 제약조건의 이름을 지정하는 규칙과 이를 확인하는 oracle DB 시스템상 테이블을 이용해서 조회하는 sql을 작성하세요.
	컬럼명 데이터유형 constraint 제약조건명 제약조건
	제약조건명 : 일반적으로 가독성이 좋게 하기 위하여 테이블명_컬럼명_제약조건약어
		지정하지 않으면 오라클 서버 시스템에서 자동으로 namming을 설정해준다.
	select *
	from sys.ALL_CONSTRAINTS
	where table_name = '테이블명(대문자)';
*/
/*
4. person 테이블에 이름을 not null로 지정하여 만들고 데이터를 입력 확인하세요.
*/
CREATE TABLE person(
	name varchar(20) NOT NULL
);
INSERT INTO person VALUES('홍길동');
INSERT INTO person VALUES(NULL); --오류

SELECT*FROM person;
/*
5. person2 테이블에 no를 unique로 지정하여 만들고 데이터를 입력하여 확인하세요.
*/
CREATE TABLE person2(
	no number(5) unique
);
INSERT INTO person2 values(1);
INSERT INTO person2 values(1); --오류

SELECT*FROM person2;
/*
6. person3 테이블에 civilno를 primary key로 지정하여 만들고 데이터를 입력 확인하세요.
*/
CREATE TABLE person3(
	civilno number(10) PRIMARY key
);
INSERT INTO person3 values(3);
INSERT INTO person3 values(3); --오류
INSERT INTO person3 values(null); --오류

SELECT*FROM person3;
/*
7. person4 테이블에 age를 check로 0~100로 지정하여 만들고 데이터를 입력 확인하세요.
*/
CREATE TABLE person4(
	age number(3) CHECK(age BETWEEN 0 AND 100)
);
INSERT INTO person4 values(42);
INSERT INTO person4 values(0);
INSERT INTO person4 values(-1); --오류
INSERT INTO person4 values(101); --오류

SELECT*from person4;
/*
8. 회원테이블을 만들고, id, pass, 이름, 포인트, 등록일을 설정해서 만들되, 각각 제약조건을 지정해서 만들고 데이터를 입력 처리하세요.
*/
CREATE TABLE member(
	id varchar2(10) PRIMARY KEY,
	pass varchar2(20) NOT NULL,
	name varchar2(10) NOT NULL,
	point number CHECK (point >= 0),
	registration DATE check(to_char(registration, 'yyyy')='2021')
);
INSERT INTO MEMBER VALUES('a123', '1234', '홍길동', 5600, sysdate);
INSERT INTO MEMBER VALUES('a123', '1234', '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES(null, '1234', '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('a123', null, '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('a123', '1234', null, 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('b123', '5678', '김길동', 7800, sysdate);

ALTER TABLE MEMBER MODIFY point NOT NULL;

SELECT*FROM MEMBER;
/*
9. 프로야구의 팀과 선수를 확인하고, 해당 리스트에 필요한 제약조건을 설정하여, 처리하세요. 
*/
CREATE TABLE baseball(
	rank number(2) check(RANK BETWEEN 1 AND 16) NOT NULL,
	name varchar(10) NOT NULL,
	team varchar(10) NOT NULL,
	avg number(4,3) check(avg>=0 AND avg<1) NOT NULL
	--승률은 승/무/패를 통해서 계산되어 나오는 데이터이기에 일반적으로 DB관리르 하지 않는다.
);
INSERT INTO baseball VALUES (1, '강백호', 'KT', 0.500);
INSERT INTO baseball VALUES (null, '강백호', 'KT', 0.500); --오류
INSERT INTO baseball VALUES (2, null, 'KT', 0.500); --오류
INSERT INTO baseball VALUES (2, '강백호', null, 0.500); --오류
INSERT INTO baseball VALUES (2, '강백호', 'KT', null); --오류
INSERT INTO baseball VALUES (2, '강백호', 'KT', 1.500); --오류
INSERT INTO baseball VALUES (5, '황재균', 'KT', 0.286);

SELECT*FROM baseball;