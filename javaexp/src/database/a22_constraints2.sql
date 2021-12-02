--다른 데이터와 식별되게 입력하지 않으면 에러 발생
CREATE TABLE student8(
	son number(4) CONSTRAINTS student08_sno_uq UNIQUE
);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT8';
INSERT INTO student8 values(10);
INSERT INTO student8 values(null);
SELECT * FROM student8; --unique은 NULL 중복 허용

CREATE TABLE student9(
	hac varchar2(9) unique,
	name varchar2(20) NOT null,
	kor number(4,2)
);

INSERT INTO student9 values(1000000, '김길동', 72.1);
INSERT INTO student9 values(null, '홍길동', 70);
INSERT INTO student9 values(1000, null, 70);

SELECT * FROM STUDENT9;

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT9';

--PRIMARY KEY : 데이터를 입력시 중복도 허용하지 않고 NULL도 허용되지 않는 제약조건을 설정할 때 사용된다.
CREATE TABLE student10(
	sno number(3) CONSTRAINT student10_sno_pk PRIMARY key
);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT10';

INSERT INTO student10 VALUES(10);
INSERT INTO student10 VALUES(10); --중복데이터 입력도
INSERT INTO student10 VALUES(null); --null입력도 허용되지 않는다.

CREATE TABLE student11(
	hac varchar2(10) PRIMARY KEY,
	name varchar2(20) NOT NULL,
	kor number(4,1),
	eng number(4,1),
	math number(4,1)
);

INSERT INTO student11 values('1000', '홍길동', 95.3, 99.8, 91.28);
INSERT INTO student11 values('2000', '김길동', 100, 99.8, 91.28);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT11';

SELECT * FROM student11;

/*
# check
1. 특정한 데이터를 조건이나 범위를 지정해서, 해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
2. 형식
	컬럼명 데이터유형 constraint 제약명 check (조건문-where에 들어가는 sql문장)
	컬럼명 데이터유형 check (조건문-where에 들어가는 sql문장)
*/
CREATE TABLE student12(
	gender varchar2(1) CHECK(gender IN ('F','M'))
);
INSERT INTO student12 values('F');
INSERT INTO student12 values('M');
INSERT INTO student12 values('K');
INSERT INTO student12 values(null);

CREATE TABLE student13(
	kor number(3) CHECK(kor BETWEEN 0 AND 100)
);

INSERT INTO student13 values(99);
INSERT INTO student13 values(101);

CREATE TABLE student14(
	hac varchar2(10) PRIMARY KEY,
	grade number(1) check(grade IN (1,2,3,4)),
	name varchar2(10) NOT NULL,
	kor number(3) check(kor BETWEEN 0 AND 100),
	eng number(3) check(eng BETWEEN 0 AND 100),
	math number(3) check(math BETWEEN 0 AND 100)	
);

INSERT INTO student14 values(1000, 1, '홍길동', 95, 80, 100);
INSERT INTO student14 values(1000, 5, '홍길동', 95, 80, 100);
INSERT INTO student14 values(1000, 2, null, 95, 80, 100);
INSERT INTO student14 values(1000, 2, '마길동', 170, 80, 100);

SELECT * FROM student14;

SELECT * 
FROM sys.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT14';