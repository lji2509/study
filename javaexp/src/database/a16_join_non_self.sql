/*
# non equi join
1. 조인하는 두개의 테이블의 값이 동일하지 않고, 범위로 조인하는 경우를 말한다.
2. select 컬럼1, 대상컬럼, 등급
	from 테이블1, 테이블2
	where 대상컬럼 between 범위1 and 범위2
*/

SELECT ename, sal
FROM emp
ORDER BY sal;

SELECT *
FROM salgrade;

SELECT ename, sal, grade
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal;

SELECT e.*
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal AND grade=4;

SELECT sal, grade
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal AND job='SALESMAN';

/*
# outer join
1. EQUI JOIN의 조인 조건에서 양측 컬럼 값 중, 어느 하나라도 NULL이면 '=' 비교 결과가 거짓이 되어 NULL 값을 가진 행은 조인 결과로 출력 불가
	NULL에 대해서 어떠한 연산을 적용하더라도 연산 결과는 NULL
	일반적인 EQUI JOIN의 예 : 
	학생 테이블의 학과번호 칼람과 부서 테이블의 부서번호 칼럼에 대한 EQUI JOIN(student.deptno = department.deptno) 한 경우
	학생 테이블의 deptno 칼럼이 NULL인 경우 해당 학생은 결과로 출력되지 못함
2. EQUI JOIN에서 양측 컬럼 값중의 하나가 NULL이지만 조인 결과로 출력할 필요가 있는 경우 OUTER JOIN 사용
	OUTER JOIN의 예 : 
	학생 테이블과 교수 테이블을 EQUI JOIN하여 학생의 지도 교수 이름 출력
	조건 : 지도 학생을 한 명도 배정받지 못한 교수 이름도 반드시 함께 출력
3. (+) 기호를 사용한 OUTER JOIN
	WHERE절의 조인 조건에서 OUTER JOIN 연산자인 '(+)' 기호 사용
	조인 조건문에서 **NULL이 출력되는 테이블의 칼럼에 (+) 기호 추가
4. 기본구문
	SELECT	table.column, table2.column
	FROM	table1, table2
	WHERE	table1.column(+) = table2.column
	또는,		table1.column = table2.column(+)
*/
SELECT DISTINCT deptno
FROM emp;

SELECT *
FROM dept;

SELECT e.ename, e.deptno, d.deptno, dname
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno;

SELECT dname, nvl(ename,'할당인원없음') 사원명, nvl(sal,0) 급여
FROM emp e, dept d
WHERE e.DEPTNO(+) = d.DEPTNO;

SELECT nvl(ename,'없음') 사원명, loc
FROM emp e, dept d
WHERE e.DEPTNO(+) = d.DEPTNO;