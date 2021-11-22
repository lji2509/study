SELECT * FROM emp;
/*
# 데이터 조회하기
데이터는 select 구문을 이용하여 저장된 데이터를 호출(query) 할 수 있다.
1. 기본형식
	select *||컬럼명, 컬럼명2
	from 테이블명
	where 조건
*/
SELECT * FROM emp;
SELECT empno, ename, job
FROM emp;

SELECT deptno, dname
FROM dept;

/*
2. 컬럼명 별칭 처리하기
select 컬럼명 as 별칭명, 컬럼명 벌칭명
from 테이블
해당 테이블 구조 안에 있는 컬럼명이 as나 한칸 띄움으로 별칭으로 호출할 수 있다.
*/
SELECT empno AS NO, ename AS name, deptno dno
FROM emp;

-- 별칭을 한글로 나타낼 수도 있는데, 추가하여 공백을 타이틀로 보이거나, 특수문자를 타이틀로 하고싶으면 " " 사이에 입력하면 된다.
SELECT empno 번호, ename "이름", job "직 책", hiredate "hire@"
FROM EMP;

SELECT * -- 테이블이라는 기본 구성요소 하위에 있는 컬럼들을 모두 호출
FROM emp;

SELECT empno -- 특정 컬럼만 호출
FROM emp;

SELECT EMPNO "사원 번호", ENAME "이 름", JOB "직 책", MGR "관리자 번호", HIREDATE "입 사 일", SAL "급 여", COMM "보 너 스", DEPTNO "부서 번호"
FROM emp;

/*
# 데이터의 산술 연산 처리와 concatnate(문자열 | 컬럼의 연결)
1. 숫자형 컬럼을 사칙 연산 처리가 가능하다. + - * /
2. 문자열과 컬럼 간의 연결 처리는 '문자열' || 컬럼명
*/
SELECT ename, mgr, mgr+10 "10 더하기", mgr-5 "10 빼기", mgr*10 "10 곱하기",
	'직책은 ' ||  job "show"
FROM emp;

SELECT ename || '님' "ENAME", sal+10 "급여+10", sal+sal*0.1 "급여+10%"
FROM emp;

/*
# 컬럼간의 연결
select 컬럼1 || 컬럼2 || '문자열' || 컬럼3 "출력타이틀"
from 테이블명
*/
SELECT *
FROM emp;
SELECT '부서번호' || deptno ||'의 ' || ename || ' 사원의 직책은 ' || job || '이고, 급여는 ' || sal || '입니다.' show
FROM emp;

SELECT '급여가 ' || sal || '만원인 사원 ' || ename || '는 직책이 ' || job || '입니다.' show
FROM emp;

SELECT ename || '님의 보너스는 급여의 300% ' || sal*3 || '만원이어서 이번달 총 급여는 ' || (sal + (sal*3)) || '만원이다' show
FROM emp;