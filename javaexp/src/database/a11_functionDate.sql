/*
# 날짜 함수
1. 날짜형 데이터 타입에 사용하는 함수
 	1970/1/1
 	1/1000초 ==> 1초 ==> (60)1분 ==> (60)1시간
 	==> (24)1일(*) ==> calendar규칙에 의해.. 28/30/31
 	1(월) ==> (12)1년
 2. 기본 연산
 	기본 +1은 1일을 기준으로 처리된다.
 	1) 날짜 +/- 숫자 : 해당 일자의 일수를 가산(감산)하여 처리
 	2) 날짜 +/- 1/24 : 시간단위 연산 처리
 	1일이 24시간이기 때문에 5시간 이후인 경우, 날짜 5/24를 처리한다.
 cf) sysdate는 현재날짜시간을 나타낸다.
*/
SELECT sysdate "현재날짜/시간",
	sysdate +1 "내일 24시간이후",
	sysdate -1 "전날 24이전날짜",
	sysdate +(8/24) "현재로부터 8시간 이후",
	sysdate +(30/60/24) "현재로부터 30분 이후"
FROM dual;
--sysdate + (1/24) + (30/60/24) "1시간30분 이후" 
--sysdate + (90/60/24) "1시간30분 이후"

SELECT sysdate+3 "3일후", sysdate+100 "100일후", sysdate-(5/24) "5시간전", sysdate-(3/24) "3시간전", sysdate+(50/60/24) "50분후"
FROM dual;

SELECT ename, hiredate, hiredate+1 "1일 이후", hiredate-100 "입사 100일전"
FROM emp;

SELECT ename, hiredate, hiredate+120 "인턴기간", hiredate-(8/24) "입사 8시간전", floor(sysdate-hiredate) "근무기간"
FROM emp;

/*
# 날짜함수
1. sysdate : 오라클에서 서버시스템의 현재 날짜와 시간
2. months_betwwen(날짜1, 날짜2) :
	날짜 사이의 개월을 월단위로 계산
	기준 단위가 1 ==> 1월
	1개월 => 1, 15일 => 0.5	1월을 기준, 일/시/분/초 단위 드응로 소숫점으로 계산이 된다.
3. 소숫점이하에 대한 처리는 trunc, floor를 이용해서 절삭처리를 해준다.
	1.5개월을 개월차로 ceil, 개월수는 trunc, floor
4. add_months(날짜형데이터, 추가할개월수) :
	해당 날짜에 개월을 더한 날짜 계산
*/

SELECT ename, hiredate, sysdate, months_between(sysdate, hiredate) "근무개월수1", floor(months_between(sysdate, hiredate)) "근무개월수2", 
	floor(months_between(sysdate, hiredate)/12) "근무연한"
FROM emp;

SELECT floor(MONTHS_BETWEEN(SYSDATE+100, SYSDATE)) "개월수"
FROM dual;

SELECT floor(MONTHS_BETWEEN(sysdate+1000,sysdate)/12)||'년 '||MOD(floor(MONTHS_BETWEEN(sysdate+1000,sysdate)),12)||'개월' "1000일 후"
FROM dual;

SELECT sysdate, ADD_MONTHS(SYSDATE,4) "오늘로부터 4개월 후", ADD_MONTHS(sysdate, -3) "오늘로부터 3개월 전" 
FROM dual;

SELECT ename, hiredate, ADD_MONTHS(HIREDATE, 12) "1년 후", ADD_MONTHS(HIREDATE, 6) "6개월 후"
--						ADD_MONTHS(hiredate, 12*1) "1년 후" 
FROM emp;

SELECT ename, deptno, deptno/10||'개월' "인턴기간", HIREDATE, ADD_MONTHS(HIREDATE, deptno/10) "인턴만료일"
FROM emp
ORDER BY deptno;

/*
5. next_day(날짜, '요일') : 대상날짜로부터 다가오는 첫번째 요일에 해당하는 날짜
6. last_day(날짜) : 대상날짜의 월의 마지막 날짜
*/
SELECT sysdate, next_day(sysdate,'금'),
	next_day(next_day(sysdate,'금'),'금'),
	last_day(sysdate),
	last_day(sysdate)+1
FROM dual;