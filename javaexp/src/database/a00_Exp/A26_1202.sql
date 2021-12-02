/*
1. 제약조건을 하는 이유에 대하여 기술하세요.
데이터의 정확성과 일관성을 보장하고, 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려한다.
*/
/*
2. oracle의 제약조건의 종류와 기본 형식에 대하여 기술하세요.
#제약조건 이름 설정 할 때 : 컬럼명 데이터유형 constraint 제약조건명 제약조건
	name varchar2(30) CONSTRAINTS student1_name_nn NOT NULL
#제약조건 이름 설정하지 않을 때 : 컬럼명 데이터유형 제약조건
	name varchar2(30) NOT NULL
	
	1) not null : 열이 null을 포함할 수 없다.
	2) unique key : 증복된 값을 가질 수 없다.
	3) primary key : null값을 가질 수 없고, 중복된 값을 가질 수 없다.
	4) foreign key : 한 열과 참조된 테이블의 열 간에 외래키 관계를 설정한다.
	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정한다.
*/
/*
3. 제약조건의 이름을 지정하는 규칙과 이를 확인하는 oracle DB 시스템상 테이블을 이용해서 조회하는 sql을 작성하세요.
#제약조건 이름 지정
	컬럼명 데이터유형 constraint 제약조건명 제약조건
	name varchar2(30) CONSTRAINTS student1_name_nn NOT NULL
#제약조건 확인
	select *
	from sys.ALL_CONSTRAINTS
	where table name = '테이블명(대문자)'; -- like 활용 가능
		SELECT *
		FROM sys.ALL_CONSTRAINTS
		WHERE TABLE_name LIKE 'STUDENT%';

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
	point number(5) CHECK (point BETWEEN 0 AND 10000),
	registration date
);
INSERT INTO MEMBER VALUES('a123', '1234', '홍길동', 5600, sysdate);
INSERT INTO MEMBER VALUES('a123', '1234', '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES(null, '1234', '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('a123', null, '홍길동', 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('a123', '1234', null, 5600, sysdate); --오류
INSERT INTO MEMBER VALUES('a123', '1234', '홍길동', 100000, sysdate); --오류

SELECT*FROM MEMBER;
/*
9. 프로야구의 팀과 선수를 확인하고, 해당 리스트에 필요한 제약조건을 설정하여, 처리하세요. 
*/
CREATE TABLE baseball(
	rank number(2) check(RANK BETWEEN 1 AND 16) NOT NULL,
	name varchar(10) NOT NULL,
	team varchar(10) NOT NULL,
	avg number(4,3) check(avg>=0 AND avg<1) NOT NULL
);
INSERT INTO baseball VALUES (1, '강백호', 'KT', 0.500);
INSERT INTO baseball VALUES (null, '강백호', 'KT', 0.500); --오류
INSERT INTO baseball VALUES (2, null, 'KT', 0.500); --오류
INSERT INTO baseball VALUES (2, '강백호', null, 0.500); --오류
INSERT INTO baseball VALUES (2, '강백호', 'KT', null); --오류
INSERT INTO baseball VALUES (2, '강백호', 'KT', 1.500); --오류
INSERT INTO baseball VALUES (5, '황재균', 'KT', 0.286);

SELECT*FROM baseball;