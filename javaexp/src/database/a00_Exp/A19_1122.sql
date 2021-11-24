/*
--과제1
SQL(Structured Query Language)로 데이터를 정의, 조작, 제어하는 언어
1. SELECT를 통해서 데이터를 가져오는 처리를 한다.
	SELECT * |컬럼1, 컬럼2...
	FROM 테이블명
	WHERE 조건(비교연산자|논리연산자)
	GROUP BY 그룹명
	HAVING 그룹함수의 조건(통계치-평균, 합산 등의 범위를 지정) - 비교|논리연산자 활용
	ORDER BY 정렬할컬럼 ASC|DESC(오름차순|내림차순)
	ex)
		select empno, ename
		from emp;
		
		select *
		from emp
		where deptno = 10;
		
		select deptno, max(sal) //부서별 최고 급여자
		from emp
		group by deptno;
		
		select deptno, avg(sal)
		from emp
		group by deptno
		having avg(sal) >= 2000; //부서별 평균 급여가 2000이상인 경우
		
		select *
		from emp
		order by deptno, empno desc;
		//부서번호를 기준으로 오름차순하고, 부서번호가 같다면 사원번호를 기준으로 내림차순한다.
		//오름차순(asc)는 default
*/
--과제2
SELECT empno, ename, sal*(1/12) "연봉의 1/12"
FROM emp;

--과제3
SELECT deptno "부서 번호", dname "사원 이름", loc "부서 위치"
FROM dept;

--과제4
SELECT ename || '님의 사원번호는 ' || empno || '이고, 올해 연말보너스는 연봉의 20%인 ' || sal*0.2 || '만원 입니다.' show1,
ename || '님의 이번달 보너스는 연봉의(deptno번호의 %) 기준으로' || round(sal*(deptno/100)) || '만원 지급합니다.' show2,
ename || '님의 입사일은 ' || hiredate || '이고, 현재 연봉의 1/13인 월급여 ' || round(sal*(1/13)) || '만원' show3
FROM emp;

--과제5
SELECT empno, job, sal
FROM emp
WHERE sal >= 2000 AND sal <= 4000;

--과제6
SELECT ename, job, deptno
FROM emp
WHERE job = 'SALESMAN';
-- database에서는 =가 비교연산자로 사용된다. 동일한 값일 때 사용한다.
-- SQL명령문, 테이블명이나 컬럼명은 대소문자 구분없이 사용할 수 있으나, 데이터는 반드시 구분하여 사용하여야 하낟.

--과제7
SELECT ename, sal*0.8 "급여의 80%"
FROM emp
WHERE deptno=10;
-- 데이터 유형이 숫자인 경우는 그대로 사용하고, 문자열인 경우에는 ''를 이용한다.

/*
사원정보 명칭 : empno(사원번호), ename(사원명), job(직책), mgr(관리자번호), hiredate(입사일), sal(급여), comm(보너스), deptno(부서번호)

1. 기본적인 sql의 질의어 구조를 예제를 통해 기술하세요.
2. 사원번호와 이름을 함께 출력하고, 연봉의 1/12를 출력하세요.
3. 부서테이블 dept이용하여 alias에 공백을 넣어 출력하세요.
4. 아래의 내용을 하나의 컬럼으로 출력하세요.
	1) @@님의 사원번호는 @@이고, 올해 연말보너스는 연봉의 20%인 @@원 입니다.
	2) @@님의 이번달 보너스는 연봉의 (deptno번호의 %) 기준으로 @@@원 지급합니다.
	3) @@님의 입사일은 @@이고, 현재 연봉의 1/13인 월급여 @@만원
5. 급여가 2000이상 4000이하인 사원번호, 직책명, 급여를 출력하세요.
6. 직책이 'SALESMAN'인 사원의 사원명, 직책명, 부서번호를 출력하세요.
7. 부서번호가 10인 사원의 이름과 급여의 80%를 출력하세요.
*/