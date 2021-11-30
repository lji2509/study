/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여 그룹별로 결과를 출력하는 함수
2. 그룹함수는 통계적인 결과를 출력하는데 자주 사용된다.
3. 기본형식
	select 컬럼명, 그룹함수1, 그룹함수2...
	from 테이블명
	where 조건
	group by 그룹할커럼
	having 그룹함수의조건;
	특정 컬럼의 데이터를 그룹별로 함수에 의해 처리하는 것을 말한다.
	부서별로 사원의 최대 급여, deptno(부서), 최대급여 max(sal)
	그룹할 컬럼은 부서이고, 부서별로 급여를 확인하여 치대급여를 뽑아내는 것을 말한다.
	ex) select deptno, max(sal)
		from emp
		group by deptno;
	cf) 그룹을 2개 컬럼이상을 할 때는 group by 컬럼1, 컬럼2하고, select 컬럼1, 컬럼2, 그룹함수@@@로 데이터그룹을 두개 이상을 컬럼으로 지정할 때 사용된다.
	예를 들어 학년별로 평균을 내다가, 학년과 반별로 평균을 낼 때, 추가할 컬럼으로 처리하면 된다.
4. 그룹함수의 종류
	count() : 행의 갯수 cf) count(*) : 전체 열을 대상으로 행의 갯수처리
						count(컬럼명) : 특정한 컬럼을 대상으로 행의 갯수를 처리하되 null값은 제외한다.
	max() : null을 제외한 모든 행의 최대값
	min() : null을 제외한 모든 행의 최소값
	sum() : null을 제외한 모든 행의 합
	avg() : null을 제외한 모든 행의 평균값
	stddev() : null을 제외한 모든 행의 표준편차
	variance() : null을 제외한 모든 행의 분산
	1) 테이블 단위로 해당 컬럼의 전체 데이터를 그룹처리할 때는 group by없이 그룹함수를 사용한다.
	ex) 사원 테이블의 최대연봉, 사원데이터의 건수
	select count(*), max(sal)
	from emp;
*/
SELECT count(*), max(sal), min(sal), sum(sal), avg(sal)
FROM emp;
--전체 데이터에 대한 함수 처리

SELECT deptno, sal
FROM emp
ORDER BY deptno;

SELECT deptno, count(*), max(sal), min(sal), sum(sal), avg(sal)
FROM emp
GROUP BY deptno;
--부서번호별로 통계치를 처리해주는 것을 볼 수 있다.
--GROUP BY deptno에 선언된 기준 컬럼을 지정해서 select deptno, 통계함수를 지정해준다.

SELECT count(mgr) "전체 관리자 수" --null값 제외
FROM emp;

SELECT mgr, count(*) "관리자별 사원 수"
FROM emp
GROUP BY mgr;

--그룹할 내용을 함수에 의해 만들어 처리된 경우
--입사분기별로 인원수 처리
SELECT to_char(hiredate, 'q')
FROM emp;

SELECT to_char(hiredate, 'q') 분기, count(*) 인원수
FROM emp
GROUP BY to_char(hiredate, 'q')
ORDER BY to_char(hiredate, 'q');

SELECT to_char(hiredate, 'mm') 입사월, count(*) 인원수
FROM emp
GROUP BY to_char(hiredate, 'mm')
ORDER BY to_char(hiredate, 'mm');

SELECT to_char(hiredate, 'q') "분기", max(sal) 최대급여
FROM emp
GROUP BY to_char(hiredate, 'q')
ORDER BY to_char(hiredate, 'q');

/*
# 그룹함수 처리순서
1. 처리할 데이터를 select로 선언
	select to_char(hiredate, 'q'), sal
2. group할 기준데이터의 컬럼을 지정
	입사분기별로 그룹데이터 처리 - group by to_char(hiredate, 'q')
3. 적용할 group함수 선택
	최소, 최대, 평균, 건수...
	최대급여 max(sal)
4. 정렬이 필요하면 order by 정렬기준컬럼
5. sql 정리
	select to_char(hiredate, 'q'), max(sal)
	from emp
	group by to_char(hiredate, 'q')
	order by to_char(hiredate, 'q');
*/

SELECT mod(empno,2) 사원번호, max(sal) 최대급여
FROM emp
GROUP BY mod(empno,2) ;

SELECT decode(mod(empno,2),1,'홀수','짝수') 사원번호, max(sal) 최대급여
FROM emp
GROUP BY mod(empno,2) ;

SELECT job, max(sal)
FROM emp
GROUP BY job;

SELECT decode(mod(nvl(mgr,0),2),1, '홀수', '짝수') 관리자번호, round(avg(sal)) 평균급여
FROM emp
GROUP BY mod(nvl(mgr,0),2);
--nvl(mgr,0) : null일때는 0으로 처리
--mod(nvl(mgr,0),2) : 0,1로 처리

/*
# having
그룹함수의 결과값을 기준으로 조건을 처리할 때 활용된다.
*/
SELECT deptno, max(sal)
FROM emp
GROUP BY deptno
HAVING max(sal)>=3000;
--부서별 최대급여를 출력하는데, 최대급여가 3000이상인 경우에 출력할때는 where절이 아닌 having을 활용하여 조건 처리

SELECT job, min(sal) 최저급여
FROM emp
GROUP BY job
HAVING min(sal) < 2000;