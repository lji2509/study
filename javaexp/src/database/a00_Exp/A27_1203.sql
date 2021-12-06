/*
1. 테이블 구조변경의 기본형식을 기술하세요.
	1. 공통 : alter table 테이블명
	2. 추가 옵션
		1) add 컬럼명 데이터유형 [default 디폴트데이터, 제약조건]
		2) modify 컬럼명 데이터유형 [default 디폴트데이터, 제약조건]
		3) drop column 컬럼명 데이터유형 [default 디폴트데이터, 제약조건]
		4) rename column 변경전 to 변경후
		5) rename 변경전 to 변경후
	3. 테이블 삭제 : drop table 테이블명
*/
/*
2. emp21복사테이블을 만들고 부서정보(부서명, 부서이름, 부서위치)를 컬럼을 추가하세요.
*/
CREATE TABLE emp21 AS SELECT * FROM emp;
ALTER TABLE emp21 ADD dname varchar(20) DEFAULT '부서없음';
ALTER TABLE emp21 ADD loc varchar(50) DEFAULT '등록안함';
/*
3. 테이블 컬럼의 속성변경의 규칙을 기술하세요.
# 기본 컬럼에 데이터가 없는 경우
	- 컬럼 타입이나 크기 변경이 자유롭다.
# 기존 데이터가 있는 경우
	-타입 변경은 char와 varchar2만 허용된다.
	- 변경한 컬럼의 크기가 저정된 데이터의 크기보다 같거나 클 경우 변경 가능하다.
	- 작은데이터유형에서 큰데이터유형 변경 시 가능하다.
*/
/*
4 데이터가 없는 emp22복사테이블을 만들고, 문자열형 숫자, 숫자형은 문자열형, 날짜는 숫자형으로 변경처리하세요
*/
CREATE TABLE emp22 AS SELECT*FROM emp WHERE 1=0;
ALTER TABLE emp22 MODIFY empno varchar2(10);
ALTER TABLE emp22 MODIFY ename NUMBER;
ALTER TABLE emp22 MODIFY hiredate NUMBER;
/*
5. 부서정보가 있는 복사테이블을 emp23을 만들고, 문자열 데이터의 최소크기로 데이터를 변경처리하세요.
*/
CREATE TABLE emp23 AS SELECT*FROM dept;
SELECT max(LENGTH(dname)) FROM emp23;
SELECT max(LENGTH(loc)) FROM emp23;
ALTER TABLE emp23 MODIFY dname varchar2(10);
ALTER TABLE emp23 MODIFY loc varchar2(8);
/*
6. 회원테이블(회원아이디, 이름)과 구매테이블(물건명, 회원아이디) 두개 테이블을 회원아이디로 foreign key를 설정하여 데이터의 입력을 처리하여 연관관계를 설정하세요.
*/
CREATE TABLE member2(
	id varchar2(10) CONSTRAINT member_id_pk PRIMARY KEY,
	name varchar2(10)
);
CREATE TABLE product2(
	pname varchar(50),
	id varchar2(10) CONSTRAINT product_id_fk REFERENCES member2(id)
);
INSERT INTO member2 values('a123','홍길동');
INSERT INTO member2 values('b123','홍길동');
INSERT INTO member2 values('c123','홍길동');

INSERT INTO product2 values('사과','a123');
INSERT INTO product2 values('수박','b123');
INSERT INTO product2 values('딸기','c123');
/*
7. 위테이블을 회원/구매 조인관계를 이용하여, 회원과 구매정보를 출력하세요
*/
SELECT *
FROM member2 m, product2 p
WHERE m.id = p.id;
/*
8. emp23의 테이블명을 변경하고, hiredate컬럼명을 변경하고, 컬럼명의 삭제/테이블 삭제를 처리하세요.
*/
RENAME emp23 TO emp23_new;
ALTER TABLE emp23_new RENAME COLUMN dname TO dname1;
ALTER TABLE emp23_new DROP COLUMN dname1;
DROP TABLE emp23_new;
/*
9. 제약조건의 추가 삭제의 기본형식을 기술하세요.
# 추가
	ALTER TABLE 테이블명 ADD 제약조건 (컬럼명)
	ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건 (컬럼명)
	foreign key
		ALTER TABLE 테이블명 ADD FOREIGN KEY (컬럼명) REFERENCE 참조테이블(컬럼명) on delete|on update 옵션내용
# 삭제
	ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명
	primary key
		ALTER TABLE 테이블명 DROP PRIMARY KEY
*/
/*
10. emp24, dept24 복사테이블을 만들고 foreign key 제약조건을 추가하세요.
*/
CREATE TABLE emp24 AS SELECT * FROM emp;
CREATE TABLE dept24 AS SELECT * FROM dept;

ALTER TABLE emp24 ADD CONSTRAINT emp24_empno_pk PRIMARY KEY (empno);
ALTER TABLE dept24 ADD CONSTRAINT dept24_deptno_pk PRIMARY KEY (deptno);
ALTER TABLE emp24 ADD CONSTRAINT emp24_deptno_fk FOREIGN KEY (deptno) REFERENCES dept24(deptno);
/*
11. user01/8888계정을 생성하여, 접속하여 테이블을 만들 수 있게 권한을 설정하세요.
*/
sqlplus
SYSTEM/1111
CREATE USER user01 identified BY 8888;
GRANT CREATE SESSION, CREATE TABLE, resource TO user01;
-- resource : DB안에 들어갈 구성요소에 대한 권한을 설정
conn user01/8888;
show USER;