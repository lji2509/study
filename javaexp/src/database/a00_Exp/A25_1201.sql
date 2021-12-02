/*
1. subquery란 무엇인가 기본 형식을 기술하세요
sql에서 main query 안 포함된 query를 말한다.
크게,
1. where조건문에서 사용되는 경우
	where (컬럼1, 컬럼2) in (subquery)
2. inline view로 테이블을 지정할 때, 사용되는 경우
	from (sql1) a, (sql2) b
	where a.컬럼 = b.컬럼
	and ...
3. select (select max(@@) from @@ sss), ...
4. insert, update, delect문 여러가지 형태로 subquery를 사용한다.
	update 테이블명
	set (컬럼1, 컬럼2) in (subquery)
*/
/*
2. inline view란 무엇인가? 기본 예제를 통해 기술하세요.
subquery형태의 하나로, 임시테이블 개념인 view를 하나의 테이블로 선언하여 사용하는 것을 말한다.
	select 출력할 컬럼
	from (임시 테이블에 해당하는 sql 작성) a, 실제테이블 b
	where a.연관관계컬럼1 = b.연관관계컬럼1
	...
*/
/*
3. 아래와 같은 문제를 해결하기 위하여 subquery를 이용해서  처리해보자
	최저 급여자의 사원정보 조회
	1) 최저 급여 처리
	2) 최저 급여에 해당하는 사원정보 처리
*/
SELECT *
FROM emp
WHERE sal = (
	SELECT min(sal)
	FROM emp
);
/*
4. 연봉이 2000~4000인 사원의 부서번호, 사원명, 사원번호, 이름의 subquery 테이블(inline view)과 부서테이블과 join하여 출력하세요
*/
SELECT e.deptno, e.ename, e.empno, e.sal 
FROM (
	SELECT *
	FROM emp
	WHERE sal BETWEEN 2000 AND 4000
) a, emp e
WHERE a.sal = e.sal;
/*
5. 부서별 최저 연봉의 사원 정보와 부서정보를 join하여 출력하세요.
*/
SELECT e.*, d.* 
FROM emp e, dept d
WHERE (e.deptno, sal) IN (
	SELECT deptno, min(sal)
	FROM emp
	GROUP BY deptno
) AND e.DEPTNO = d.DEPTNO ; 

SELECT *
FROM (
	SELECT deptno, min(sal) sal
	FROM emp
	GROUP BY deptno
) a, emp e
WHERE a.deptno=e.deptno AND a.sal=e.sal;
/*
6. 복사테이블을 만드는  형식 2가지를 기술하세요.
#테이블 구조 + 데이터
	CREATE TABLE 복사할 테이블명
	AS SELECT 원본에서 복사할 컬럼명 FROM 원본 테이블명;
	
#테이블 구조
	CREAETE TABLE 복사할 테이블명
	AS SELECT 원본에서 복사할 컬럼명 FROM 원본테이블명
	WHERE 1=0; --이 조건문으로 FALSE를 만들어서 데이터를 가져오지 않음
*/
/*
7. emp99(데이터+구조), emp98(구조)만 복사 테이블을 만드세요.
*/
CREATE TABLE emp99
AS SELECT * FROM emp;

CREATE TABLE emp98
AS SELECT * FROM emp
WHERE 1=0;
/*
8. 데이터 입력 기본형식을 기술하고, emp99에 전체데이터를 입력하고, 일부 컬럼을 입력하여 처리하세요.
#일부 컬럼만 데이터 입력 시
	INSERT INTO 테이블명(컬럼명) VALUES(값1, 값2 ...);

#전체 데이터 입력시
	INSERT INTO 테이블명 VALUES(값1, 값2 ...);
*/
INSERT INTO emp99(empno, ename) VALUES(7329, '홍길동');
INSERT INTO emp99 values(7247, '김길동', '사원', 7329, '2021/12/01', 2400, 100, 10); 
/*
9. 테이블의 수정/삭제 기본형식을 기술하세요.
#수정	
	UPDATE 테이블명
	SET 컬럼1=변경할데이터,
		컬럼2=변경할데이터 ..
	WHERE 조건문;
	
#삭제
	DELETE FROM 테이블명
	WHERE 조건문;

WHERE절을 사용하지 않을 시 모든 데이터가 수정/삭제된다.
*/
/*
10. 복사데이터가 있는 emp99을 기준으로 1/4분기에 입사한 사람의 보너스(comm)는 급여의 30% 수정하세요.
*/
UPDATE emp99
SET comm=sal*0.3
WHERE to_char(hiredate,'q')='1';
/*
11. 날짜데이터의 처리형식을 기술하고, emp99에 특정한 날짜로 등록/수정처리하세요.
to_date('문자열', 형식) 을 이용하여 날짜데이터를 처리하는데, 입력한 문자열과 지정한 형식이 똑같아야한다.
*/
UPDATE emp99
SET hiredate = to_date('2021/11/30', 'yyyy/mm/dd')
WHERE ename = '김길동';

INSERT INTO emp99(ename, hiredate) values('이길동', to_date('2021-12-01 17:30:30', 'yyyy-mm-dd hh24:mi:ss'));