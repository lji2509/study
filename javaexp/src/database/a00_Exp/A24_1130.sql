/*
--과제1
select 컬럼명
from 테이블1 별칭1, 테이블2 별칭2
where 별칭1.조인컬럼 = 별칭2.조인컬럼 and 검색조건; --검색조건은 필요시 사용

SELECT e.*, d.*
FROM emp e, dept d
WHERE e.DEPTNO=d.DEPTNO AND e.job='MANAGER';

select절에는 출력할 컬럼명을 적되, 연관관계가 있는 경우에는 컬럼명 앞에 테이블 별칭을 적어주어야 한다.
from절에는 조인할 테이블과 테이블의 별칭을 적어준다.
where절에는 두 테이블의 조인하기 위해 두 테이블의 동일한 컬럼을 '='으로 연결시켜 주고, 필요시 and를 사용해 검색조건을 적어준다.
  
--과제5
select 컬럼
from 테이블1, 테이블2(범위지정)
where 대상컬럼 between 범위1 and 범위2;
테이블2(범위지정) : 회원등급(포인트에 따른 등급), 사원직급테이블, 권한별테이블

--과제8
공통점 : 두개이상의 테이블간의 연관관계가 있는 컬럼을 깆준으로 join하는 것을 말한다.
equal join : 동일한 값(공통 컬럼)이 있을 때 조인을 한다.
outer join : 기준되는 테이블과 연결된 테이블에 데이터가 존재하지 않더라도 기준되는 테이블 컬럼의 데이터는 보이고자 할 때 사용된다.
	ex) 부서테이블의 부서정보가 사원 테이블에 없더라도 출력되게 할 때 사용한다.
*/
--과제2
--그룹이 0/1이나 짝/홀이나 같은 분류이기에 최초함수로 처리해도 무방하다.
SELECT decode(MOD(empno,2),'1','홀','0','짝','구분없음') "사원번호 짝/홀", min(hiredate) "최초 입사일자", max(hiredate) "최근 입사일자"
FROM emp
GROUP BY MOD(empno,2);

--과제3
SELECT round(avg(sal))
FROM emp;

SELECT dname, ename, sal, CASE WHEN sal>=2077 THEN '상급' ELSE '하급' END 연봉구분
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO AND e.DEPTNO IN (10,20);

--과제4
SELECT dname, decode(MOD(empno,2),'1','청','0','백','구분없음') 팀, ename
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO AND sal<3000;

--과제6
SELECT deptno, max(sal) 최고급여, max(grade) 등급
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal
GROUP BY deptno;

SELECT deptno, sal, grade
FROM emp, salgrade
WHERE (deptno, sal) IN (
	SELECT deptno, max(sal)
	FROM emp
	GROUP BY deptno)
AND sal BETWEEN losal AND hisal;

SELECT e.deptno, dname, sal, grade
FROM emp e, salgrade s, dept d
WHERE (e.deptno, sal) IN (
	SELECT deptno, max(sal)
	FROM emp
	GROUP BY deptno)
AND d.deptno = e.deptno
AND sal BETWEEN losal AND hisal;

--과제7
SELECT dname, ename, sal, grade
FROM emp e, dept d, salgrade s
WHERE e.deptno=d.deptno AND sal BETWEEN losal AND hisal AND grade=1;

--과제9
SELECT dname, count(e.DEPTNO) "부서별 인원수"
FROM dept d, emp e
WHERE d.DEPTNO = e.DEPTNO(+)
GROUP BY dname;

--과제10
SELECT dname , max(hiredate) 최근입사일
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO(+)
GROUP BY dname;
/*
1. join구문의 기본형식을 기본예제와 함께 기술하세요
2. 사원번호의 짝/홀 기준으로 최근/최초 입사일자를 출력하세요.
3. 전체 평균연봉을 확인하고, 평균이상은 상급, 이하는 하급으로 나누어, 부서명 사원명 연봉 연봉구분을 부서번호가 10, 20인 경우를 출력하세요.
4. 연봉이 3000미만일 때, 부서이름, 팀(청/백-사원번호기준 0/1), 사원명을 출력하세요.
5. non equi 기본 형식을 기술하세요.
6. 부서별 최고급여와 그 등급을 출력하세요.
7. emp, dept, salgrade 3개를 조인하여, 1등급에 해당하는 부서명, 사원명, 급여, 등급을 출력하세요.
8. equal join과 outer join의 차이점을 기술하세요
9. dept테이블 기준으로 부서별 인원수를 표시하되 부서에 할당된 인원이 없으면 0으로 표기(아웃조인 활용)
10. 부서명별 최근입사일(없을 때는 null으로 처리)을 출력하세요. (아웃조인, 그룹함수 처리)
*/