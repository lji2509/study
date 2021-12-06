/*
# 데이터 무결성 제약조건의 개념
1. 데이터의 정확성과 일관성을 보장
2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함
	1) student테이블에서 학년 데이터는 1,2,3,4 중의 하나만 입력
	2) 모든 학번은 유일하게 처리
	3) student테이블의 지도교수 번호는 professor 테이블의 교수번호 중의 하나와 반드시 일치
3. 데이터 무결성 제약조건의 장점
	1) 테이블 생성 시 무결성 제약조건을 정의 가능
		- 생성 후 제약조건 설정도 가능
	2) 테이블에 대해 정의, 데이터 딕셔너리에 저장되므로 응용프로그램에서 입력된 모든 데이터에 대해 동일하게 적용
	3) 제약조건을 활성화, 비활성화 할 수 있는 융통성이 있다.
4. 무결성 제약조건의 종류
	1) not null : 열이 null을 포함할 수 없음
	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열조합을 지정해야 한다.
		ex) 학번, 주민번호, 사원번호를 중복되지 않아야 한다.
	3) primary key : 해당 컬럼 값은 반드시 존재해야 하며 유일해야 한다.
		not null과 unique가 결합된 형태
		주로 테이블에서 식별해야할 컬럼 즉 key를 설정할 때 사용된다.
		ex) emp테이블의 empno, dept테이블의 deptno
	4) foreign key : 한 열과 참조된 테이블의 열 간에 외래키 관계를 설정하고 시행
		ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호이어야 한다.
	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리
		ex) student테이블의 학년을 1,2,3,4만 데이터로 넣을 수 있다.
		
*/
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_name LIKE 'EMP%';
--sys.ALL_CONSTRAINTS : sys. : 오라클 DB 시스템을 의미
--	ALL_CONSTRAINTS : 전체 제약조건을 테이블과 제약조건명, 타입으로 설정하여 확인할 수 있다.
--내장된 테이블로 현재 오라클 서버에 있는 모든 제약 조건을 볼 수 있다.
--not null
--컬럼명 데이터유형 constraint 테이블명_컬럼명_nn not null
CREATE TABLE student1(
	name varchar2(30) CONSTRAINTS student1_name_nn NOT NULL
);

CREATE TABLE student2(
	name varchar2(30) NOT NULL --자동으로 규칙에 의해서 constraint이름 지정
);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_name LIKE 'STUDENT%';

INSERT INTO student1(name) VALUES ('himan');
SELECT*FROM student1;
INSERT INTO student1(name) VALUES(null);

CREATE TABLE student5(
	name varchar2(20) CONSTRAINT nn NOT NULL,
	kor number(4,2)
);

CREATE TABLE student6(
	name varchar2(20) NOT NULL,
	kor number(4,2)
);

INSERT INTO student5 VALUES ('홍길동',91.2);
INSERT INTO student6 VALUES ('홍길동',91.2);
INSERT INTO student6 VALUES ('김길동',84.3);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT%';

INSERT INTO student5 VALUES (NULL, 54.2);
INSERT INTO student5(kor) VALUES (73.8);
INSERT INTO student5(name) VALUES ('홍길동');

SELECT * FROM student5;