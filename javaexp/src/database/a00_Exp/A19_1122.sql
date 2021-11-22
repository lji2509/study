/*
--과제1
기본적인 sql 질의어 구조
	select 출력할 컬럼명 : 열단위
	from 테이블 : 대상 테이블
	where 컬럼 : 행단위 filtering 처리(비교, 논리연산자)
	gorup by 그룹할 컬럼 : 특정 컬럼단위 그룹함수(합산, 갯수, 최소/최대값) 통계치 처리
		having 컬럼 : 그룹함수의 조건을 지정할 때 사용
	order by 정렬할 컬럼1, 컬럼2 : 정렬할 컬럼을 지정
*/
--예제
SELECT deptno 부서번호, avg(sal) 평균급여 --부서번호, 급여평균을 출력한다
FROM emp --emp테이블에서 데이터를 가져온다
WHERE sal > 1000 --급여가 1000초과인 데이터만 가져온다
GROUP BY deptno --부서번호를 기준으로 그룹을 만든다
HAVING sum(sal) >= 3000 --그룹별 급여합계가 3000이상인 데이터만 가져온다
ORDER BY avg(sal) DESC; --급여평균을 기준으로 내림차순한다

--과제2
SELECT empno, ename, sal*(1/12) "연봉의 1/12"
FROM emp;

--과제3
SELECT deptno "부서 번호", dname "사원 이름", loc "사는 지역"
FROM dept;

--과제4
SELECT ename || '님의 사원번호는 ' || empno || '이고, 올해 연말보너스는 연봉의 20%인 ' || sal*0.2 || '만원 입니다.' show1,
ename || '님의 이번달 보너스는 연봉의(deptno번호의 %) 기준으로' || round(sal*(1/deptno)) || '만원 지급합니다.' show2,
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

--과제7
SELECT ename, sal*0.8 "급여의 80%"
FROM emp
WHERE deptno='10';

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