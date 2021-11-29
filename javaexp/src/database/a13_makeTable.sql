/*
# 테이블에 사용되는 데이터 타입
1. 개요
	1) 데이터베이스에 저장되는 데이터는 문자, 숫자, 날짜, 이미지 등과 같은 다양한 형식으로 표현된다.
		cf) 이미지는 binary 타입으로 저장하기보다 이미지 파일 서버를 활용해서 이미지 경로와 파일명을 활용해서 저장한 위치를 호출한다.
		varchar2로 저장한다. 설계시, *이미지명과 경로명까지 처리된다는 것을 설계에 포함
	2) 실무에서 컬럼에 대한 데이터 타입이나 길이의 결정은 데이터베이스 설계단계에서 신중하게 고려해야하는 것은 중요한 사항
	3) 데이터베이스 설계 단계에서 잘못 선정된 데이터타입은 응용프로그램 개발을 어렵게 하거나 성능을 저하시키는 요인이 된다.
	
2. 오라클에서 지원되는 데이터 타입의 종류
	1) char(size) : 고정 길이 문자 데이터 타입. 최대 2000바이트
		- ex) 코드성 데이터 : 학번, 사번, 주민번호 : 자리수가 정해진 데이터
			create table personnel(
				civilnum char(13);
			);
	2) varchar2(size) : 가변 길이 문자 데이터 타입. 최대 4000바이트
		- ex) 최대 크기를 설정하기에 그보다 작은 데이터 할당시 효율화
			create table personnel(
				name varchar2(15)
			);
	3) number(p, s) : 정밀도(p)와 스케일(s)로 표현되는 숫자 데이터 타입
		- ex) 전체크기 소숫점 이하 크기 지정
		number(자릿수, 소수점)
	4) date : 날짜/시간 형식을 저장하기 위한 데이터 타입
	5) nvarchar2(size) : 국가별 문자 집합에 따른 size크기의 문자/바이트
		문자 데이터 타입
	6) rowid : 테이블내 행의 고유 주소를 지정하는 64진수 문자 타입
		행단 6바이트 또는 10바이트
	7) blob : 대용량의 바이너리 데이터를 저장하기 위한 데이터 타입 최대 4GB
	8) clob : 대용량의 텍스트 데이터를 저장하기 위한 데이터 타입 최대 4GB
	9) bfile : 대용량의 바이너리 데이터를 파일 형태로 저장하기 위한 데이터 타입 최대 4GB
	10) timestamp(n) : date 데이터 타입의 확장된 형태. n은 millis second자리수로 최대 9자리까지 표현 가능
*/
SELECT * FROM emp;

/*
create table 테이블명(
	컬럼명 데이터유형(크기)
);
*/
CREATE TABLE personnel(
	civilnum char(13)
);
--insertinto 테이블명 values(데이터);
INSERT INTO personnel VALUES ('9112252145678');
INSERT INTO personnel VALUES ('1');

SELECT civilnum, length(civilnum)
FROM personnel;


CREATE TABLE school(
	hac char(9)
);

INSERT INTO school values('201741039');
INSERT INTO school values('202069714');
INSERT INTO school values('1234');

SELECT hac, length(hac)
FROM school;


CREATE TABLE member1(
	id varchar2(20), --가변형으로 두개의 컬럼을 만든다.
	pass varchar2(15)
);

INSERT INTO member1 VALUES ('himan', '7777');
--테이블내의 모든 컬럼에 데이터를 입력할 때는 컬럼을 지정하지 않고, 순서대로 데이터를 입력할 수 있다.

SELECT id, pass, LENGTH(id), LENGTH(pass)
FROM member1;


CREATE TABLE person(
	name1 varchar2(10),
	loc varchar2(30)
);


INSERT INTO person VALUES ('홍길동', '서울');

SELECT * 
FROM person;


CREATE TABLE records(
	num1 number(3),
	num2 number(4,1)
);

INSERT INTO records VALUES (343, 135.5);
INSERT INTO records VALUES (343, 13.5);

SELECT num1, num2, length(num1), length(num2)
FROM records;


CREATE TABLE studrecord (
	name varchar2(10),
	kor number(4,1)
);

INSERT INTO studrecord VALUES ('홍길동', 99);
INSERT INTO studrecord VALUES ('홍길동', 87.2);
INSERT INTO studrecord VALUES ('홍길동', 83.23);
INSERT INTO studrecord VALUES ('홍길동', 100);
INSERT INTO studrecord VALUES ('홍길동', 100.12);

SELECT * FROM studrecord;


CREATE TABLE member10(
	id varchar2(10),
	regdte date
);

INSERT INTO member10 values('himan', sysdate);
--date에 현재 시간을 입력

SELECT*FROM member10;