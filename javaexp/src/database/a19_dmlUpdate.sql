/*
# 데이터 수정
1. update 명령문은 테이블에 저장된 데이터 수정을 위한 조작어이다.
2. 기본형식
	update 테이블명
	set 컬럼1 = 변경할데이터,
		컬럼2 = 변경할데이터,
		컬럼3 = 변경할데이터
	where 조건문
3. 주의사항
	1) where 절을 생략하면 테이블의 모든 행이 수정된다.
	2) 조건문과 변경할 데이터부분을 subquery를 이용하여 처리할 수 있다.
*/
UPDATE emp100 SET ename = '홍길동' WHERE empno=7369;

UPDATE emp100 SET ename = '김철수' WHERE empno=7499;

UPDATE EMP100 
SET ename = '김철수', 
	job = '대리',
	hiredate = SYSDATE
WHERE empno = 74499;

UPDATE emp100 
SET sal = sal*1.3, --기존에 저장된 데이터에서 30% 인상처리
	deptno = deptno+10 --기존에 저장된 데이터에 +10으로 처리
WHERE job = 'MANAGER';

UPDATE EMP100
SET sal = sal*1.5, comm = 100
WHERE deptno = 10;

/*
# 데이터 삭제
1. 데이터는 조건에 의해서 행단위로 삭제된다.
	cf) 열단위로 null을 처리하려면 update를 처리한다.
2. 형식
	delete	--행단위로 삭제되기 때문에 컬럼을 지정하지 않는다
	from 테이블
	where 비교 조건
*/
DELETE FROM emp100
WHERE ename = '홍길동';

DELETE FROM emp100
WHERE deptno=10 AND sal BETWEEN 0 AND 1000;

SELECT*FROM emp100;