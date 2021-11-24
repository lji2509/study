/*
--과제1
	select *
	from 테이블
	where
	group by
	having
	order by 정렬할컬럼; default는 오름차순
	order by 정렬할컬럼 asc; 오름차순처리
	order by 정렬할컬럼 desc; 내림차순처리
	order by 컬럼1, 컬럼2 desc, ...; 여러컬럼을 우선순위를 지정해서 내림차순, 오름차순을 처리할 수 있다.
	asc : 오름차순처리, desc : 내림차순처리
	
--과제2
	1) 기본적인 비교/논리연산자
		=, !=, >=, <=, >, <
		비교연산식 and 비교연산식, 비교연산식 or 비교연산식
	2) 키워드를 활용한 비교 연산자
		not(비교|논리 연산식)
		컬럼명 in(데이터1, 데이터2, ..)
		컬럼명 is null : null값일 때 검색
		컬럼명 is not null : null값이 아닐 때 검색
		컬럼명 like '%검색할키워드%'

--과제5
	null : database에서는 특정 테이블에 row단위로 데이터를 할당할 때, 특정 컬럼에 데이터를 할당하지 않은 상태를 이야기한다.
		데이터의 유형에 상관없이 비어있는 상태를 말한다.
	null데이터를 검색할 때는 where 조건문에서 컬럼명 is null; 명령어를 활용한다.
	
--과제6
	1. null row의 column은 비교연산식 = null 형태로 검색을 할 수 없고, 컬럼 is null형태를 사용한다.
	2. null인 컬럼은 산술연산이 되지 않는다. 특히, 데이터가 있는 다른 컬럼과 연산을 할 때, 결과는 null로 처리가 된다.
		select sal + comm 인경우 sal값은 있지만 comm이 null인 경우는 null이 처리된다.
		1) nvl 함수 활용
			nvl(컬럼명, null일때 데이터) : 해당 컬럼에 데이터가 null일 때, null 대신에 나타날 데이터를 지정하여 처리하는 함수로, 컬럼에 해당하는 데이터유형으로 null에 대체할 데이터를 선정하여야한다.
			숫자형 nvl(comm, 0) : comm이 숫자 유형이기에 0으로 null값을 대체할 수 있게 하였다.
			문자열형 nvl(job, '') : job이 문자유형이기에 ''으로 null값을 대체할 수 있게 하였다.
		select ename, sal, comm, sal+nvl(comm, 0) 총합
		from emp;
*/
--과제3
SELECT *
FROM emp
WHERE DEPTNO!=10 and job='SALESMAN';

--과제4
SELECT *
FROM emp
WHERE DEPTNO=10 and SAL BETWEEN 1000 AND 4000;

--과제7
SELECT *
FROM emp
WHERE ename in('ALLEN', 'CLARK', 'FORD');

--과제8
--부서번호가 30인 사원번호(관리자번호)를 가지고 있는 사원정보
SELECT *
FROM emp
WHERE mgr in(
	SELECT empno
	FROM emp
	WHERE deptno=30);

--부서번호가 30인 사원이 가지고 있는 관리자번호를 가지고 있는 사원정보
SELECT *
FROM emp
WHERE mgr in(
	SELECT mgr
	FROM emp
	WHERE deptno=30);
--8번문제는 위와 같이 두개로 해석이 되어서 혹시 몰라 두가지 다 썼습니다.

--과제9
SELECT *
FROM emp
WHERE ename LIKE '%ER' OR job LIKE '%MAN';

/*
1. 정렬처리의 기본형식을 기술하세요.
2. 데이터베이스에서 조건문에서 사용되는 비교연산자 종류를 기술하세요.
3. 부서번호가 10이 아니고, 직책이 SALESMAN인 정보를 기술하세요.
4. 부서정보가 10이고 급여가 1000에서 4000사이인 사원정보를 출력하세요.
5. null값이 무엇인지 database에서 사용되는 개념을 기술하고, 조건문이나 데이터 처리에서 활용되는 키워드를 기술하세요.
6. null값이 있는 데이터를 연산식을 처리할 때, 함수를 이용한다. null인 데이터의 연산식에서 문제와 효과적으로 처리할 수 있는 함수를 예제를 통해 기술하세요.
7. in구문을 이용해서 사원명이 ALLEN, CLARK, FORD인 경우를 검색하세요.
8. SUBQUERY IN 구문을 활용하여 부서번호가 30인 관리자번호에 해당하는 사원 정보를 출력하세요.
9. 사원명이 ER로 끝나거나 직책이 MAN으로 끝나는 사원정보를 출력하세요.
*/