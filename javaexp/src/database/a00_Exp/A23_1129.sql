/*
--과제1
	1)
		case 컬럼명
			when 데이터1 then 리턴할데이터
			when 데이터2 then 리턴할데이터
			else 데이터1, 데이터2도 아닐 때 리턴할 데이터
		end
		as 지정한 컬럼명
		case deptno
			when 10 then '총무'
			when 20 then '인사'
			when 30 then '아이티사업'
			else '기타'
		as "부서명"
	2)
		case
			when 조건1(논리|비교연산) then 조건1일때 리턴할데이터
			when 조건2(논리|비교연산) then 조건2일때 리턴할데이터
			when 조건3(논리|비교연산) then 조건3일때 리턴할데이터
			else 위에 나열된 조건이 아닐 때 리턴할 데이터
		as 지정한 컬럼명
		case
			when sal>=3000 then '상급'
			else '하급'
		end
		as "급여등급"

--과제2
decode문은 '='연산자만 사용할 수 있지만,
case문은 논리, 산술, 관계 연산자를 포함한 다양한 연산자를 사용하여 데이터를 처리할 수 있다.

--과제5
select 컬럼명, 그룹함수1, 그룹함수2, ...
from 테이블명
where 조건(필요시 사용)
group by 그룹할 컬럼
having 그룹함수 조건
order by 정렬컬럼 정렬조건; (필요시 사용)

--과제6
conut(컬럼) : 행의 갯수
max(컬럼) : null을 제외한 모든 행의 최대값
min(컬럼) : null을 제외한 모든 행의 최소값
sum(컬럼) : null을 제외한 모든 행의 합
avg(컬럼) : null을 제외한 모든 행의 평균
stddev(컬럼) : null을 제외한 모든 행의 표준편차
variance(컬럼) : null을 제외한 모든 행의 분산

--과제11
char(크기) : 해당 크기에 고정적으로 문자열데이터를 저장할 수 있게 처리하는 것을 말한다.
	작은 데이터를 넣더라도 해당 크기를 가지고 있다.
varchar2(크기) : 해당 크기에 가변적으로 문자열데이터를 저장한다.
	최대 크기가 설정이되면 입력되는 크기에 따라 가변적으로 문자열 데이터를 저장할 수 있다.                                                                                                                                                               
*/
--과제3
SELECT ename, to_char(hiredate,'mm') 월, 
	decode(to_char(hiredate,'mm'), '02', '29일',
									'04', '30일',						
									'06', '30일',						
									'09', '30일',						
									'11', '30일',
									'31일') "마지막 날짜"
FROM emp
ORDER BY to_char(hiredate,'mm');

--과제4
SELECT ename, sal,
	CASE WHEN sal>=5000 THEN '상'
		WHEN sal>=2000 THEN '중'
		WHEN sal>=0 THEN '하'
		ELSE '분류안됨'
	END 등급
FROM emp;

--과제7
SELECT job, round(avg(sal)) 평균급여
FROM emp
GROUP BY job;

--과제8
SELECT to_char(hiredate, 'mm') 월, max(sal) 최대급여, min(sal) 최소급여
FROM emp
GROUP BY to_char(hiredate, 'mm')
ORDER BY to_char(hiredate, 'mm');

--과제9
SELECT decode(MOD(empno,2), 1, '홀수', '짝수') 사원번호, count(*) 사원수, max(sal) 최고연봉
FROM emp
GROUP BY decode(MOD(empno,2), 1, '홀수', '짝수');

--과제10
SELECT to_char(hiredate, 'mm') 입사월, max(sal) 최대급여
FROM emp
GROUP BY to_char(hiredate,'mm')
HAVING max(sal) >= 1000
ORDER BY to_char(hiredate, 'mm');

SELECT job, count(*) 인원
FROM emp
GROUP BY job
HAVING count(*) >= 3;

--과제12
CREATE TABLE team (
	tname varchar2(10),
	win number(10),
	loss number(10),
	draw number(10), 
	rate number(5, 5),
	days date
);

INSERT INTO team VALUES ('KT', 76, 59, 9, 0.875, '2021-10-28');
INSERT INTO team VALUES ('두산', 71, 65, 8, 0.743, '2021/11/03');
INSERT INTO team VALUES ('삼성', 76, 59, 9, 0.644, '20211119');
INSERT INTO team VALUES ('키움', 51, 25, 27, 0.572, to_date('2021/11/23','YYYY/MM/DD'));

SELECT*FROM team;

/*
1. case문의 기본형식 2가지를 예제를 통해 기술하세요.
2. decode문과 case문의 차이를 기술하세요.
3. 입사월별 마지막날짜를 출력하세요. 
	2월은 29일, 30일 나오는 월, 그 외는 다 31일(decode활용)
4. sal 5000이상(상), 2000~5000미만(중), 2000미만(하)
	이름, 연봉, 등급 case when 구문으로 처리해서  출력
5. 그룹함수의 기본형식을 기술하세요.
6. 그룹함수의 종류를 기술하세요.
7. 직책별(job), 평균급여를 출력하세요.
8. 월별 최대급여와 최저급여를 출력하세요.
9. 사원번호의 홀/짝수별 사원의 수와 최고연봉을 출력하세요.
10. 입사월별 최고연봉자가 1000이상인 경우만 출력하세요.
	직책별 인원이 3명이상인 직책과 인원을 출력하세요.
11. char, varchar2의 근본적인 차이점을 예제를 통해 기술하세요.
12. 프로야구의 팀 순위를 저장하는 테이블(팀명, 승, 무, 패, 승률, 등록일)을 만들고 데이터를 입력하세요.
*/