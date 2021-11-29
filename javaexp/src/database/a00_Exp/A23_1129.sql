/*
--과제1
1) 	case when 논리|산술|관계 then 처리할데이터
		when 논리|산술|관계 then 처리할데이터
		else 기타처리할데이터
	end 새로운 컬럼명
2) 	case 컬럼명
		when 데이터1 then 처리할데이터
		when 데이터2 then 처리할데이터
		else 그외데이터
	end	새로운 컬럼명
위와 같은 형식으로, 1번 같은 경우엔 when에 컬럼명과 논리|산술|관계 연산자 등을 사용하여 데이터를 처리하고
2번은 case에 컬럼명, when에 데이터를 넣어 '='연산자로 데이터를 처리한다. (decode와 같은 기능)

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
char은 고정형 데이터 타입이고, varchar2는 가변형 데이터 타입이다.
예를 들어, name char(3)으로 지정하고 데이터를 '홍길동', '길동' 으로 데이터를 입력하면 '길동'데이터가 실제로는 크기가 2이지만 name의 크기는 3으로 고정되어있기 때문에 3으로 설정된다.
name varchar(3)으로 지정하고 '홍길동', '길동'을 입력하면 name의 크기는 고정되어있지 않고 최대 3까지 데이터 입력이 가능하기 때문에 '홍길동'은 3, '길동'은 2로 크기가 설정된다.
*/
--과제3
SELECT ename, hiredate, 
	decode(to_char(hiredate,'mm'), '02', '29일',
									'04', '30일',						
									'06', '30일',						
									'09', '30일',						
									'11', '30일',
									'31일') "마지막 날짜"
FROM emp;

--과제4
SELECT ename, sal,
	CASE WHEN sal>=5000 THEN '상'
		WHEN sal>=2000 THEN '중'
		ELSE '하'
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