/*
# keyword검색을 처리하는 like
1. 저장된 데이터가 비슷한 키워드를 포함할 때, 검색되게 하는 것을 keyword검색 이라고 한다.
2. 기본형식
	where 컬럼명 like '%검색할문자열%';
	- 해당 컬럼안에 있는 데이터가 검색할 문자열을 포함하고 있으면 검색되게 처리하는 것을 말한다.
3. KEYWORD 검색 옵션
	1) 문자열의 위치에 상관없이 검색 : 컬럼명 LIKE '%문자열%'
	2) 문자열이 시작위치에 있을 때 검색 : 컬럼명 LIKE '문자열%'
		ex)
		select empno, ename
		from emp
		where ename LIKE 'A%'; -- A로 시작하는 문자열이 있을 때 검색
	3) 문자열이 마지막위치에 있을 때 검색 : 컬럼명 LIKE '%문자열';
		ex)
		select empno, ename
		from emp
		where ename LIKE '%N'; -- N으로 끝나는 문자열이 있을 때 검색
*/
SELECT empno, ename
FROM emp
WHERE ename LIKE '%A%'; --문자 'A'가 포함되어 있으면 검색되게 처리

SELECT empno, ename, job
FROM emp
WHERE job LIKE '%MAN%';

SELECT ename, job
FROM emp
WHERE job LIKE '%ER';

SELECT ename, deptno
FROM emp
WHERE ename LIKE 'S%';