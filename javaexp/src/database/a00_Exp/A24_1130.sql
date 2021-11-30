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
from 테이블1, 테이블2
where 대상컬럼 between 범위1 and 범위2;

--과제8
equi join은 두 컬럼의 값 중 어느 하나라도 null이 포함되면 '=' 비교결과 거짓이 되어 출력하지 않지만,
outer join은 null인 컬럼도 조인하여 결과값으로 출력한다.
*/
--과제2
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

--과제7
SELECT dname, ename, sal, grade
FROM emp e, dept d, salgrade s
WHERE e.deptno=d.deptno AND sal BETWEEN losal AND hisal AND grade=1;

--과제9
SELECT nvl(e.deptno,0) 부서명, count(e.DEPTNO) "부서별 인원수"
FROM dept d, emp e
WHERE d.DEPTNO = e.DEPTNO(+)
GROUP BY e.deptno
ORDER BY e.deptno;

--과제10
SELECT nvl(e.DEPTNO,0) 부서번호, max(hiredate) 최근입사일
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO(+)
GROUP BY e.DEPTNO
ORDER BY e.DEPTNO ;
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
10. 부서명별 최근입사일(없을 때는 0으로 처리)을 출력하세요. (아웃조인, 그룹함수 처리)
*/