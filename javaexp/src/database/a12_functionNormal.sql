/*
# 일반 기능 함수
1. nvl() : null일 때를 대비해서 처리하는 함수
2. nvl2(데이터|컬럼명, null이 아닐 때 처리할 데이터, null일 때 처리할 데이터)
	comm이 null일 때는 100으로 null이 아닐 때 10% 더 추가해서 결과값을 처리
*/
SELECT ename, sal, comm, nvl2(comm, comm*1.1, 100) 보너스
FROM emp;

SELECT ename, sal, comm, nvl2(comm, comm+(sal*0.05), sal*0.15) 보너스
FROM emp;

/*
3. nullif(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 반환하고, 동일하지 않으면 첫번째 데이터1을 반환처리하는 함수를 말한다.
*/
SELECT nullif('a','a') show1,
		nullif('a','b') show2,
		nvl(NULLIF('a','a'),'동일') show3,
		nvl(NULLIF('a','b'),'동일') show4
FROM dual;

SELECT NULLIF(1000, 1000) show1,
		NULLIF(1000, 2000) show2,
		nvl(NULLIF(1000, 1000), 1) show3, --nvl은 첫번째 데이터유형에 맞게 데이터를 처리하여야한다.
		nvl(NULLIF(1000, 2000), 1) show4
FROM dual;

/*
# decode 함수
 1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로 처리할 수 있게 해준다.
 2. 기본형식
 	decode(데이터, case1, case1에 해당할 때 처리, 그 외 처리);
 	decode(데이터, case1, case1일때 처리할 데이터,
 				case2, case2일때 처리할 데이터,
 				case3, case3일때 처리할 데이터,
 			위 내용에 해당하지 않을 때 처리하라 데이터)

*/
SELECT ename, deptno,
	decode(deptno,10,'인사과',
				20, '총무',
				30, '회계',
				'부서정하지않음') 부서명
FROM emp;

SELECT empno, decode(MOD(empno,2), NULLIF(MOD(empno,2),0), '청팀',
								NULLIF(MOD(empno,2),1), '백팀',
								'팀없음') 팀
FROM emp;

-- #중첩함수 : 함수에서 그 결과를 가지고, 다시 포함하는 함수의 매개변수로 전달해서 데이터를 처리
-- 1. 함수적용1 : 짝수 0, 홀수 1 - 이러한 0, 1 결과값을 가지고,
-- 2. 함수적용2 : decode라는 함수를 통해서 0일때는 백팀이 처리되게 하고,
--				그 외는 모두 청팀으로 처리된다.
SELECT empno, decode(MOD(empno,2),0,'백팀','청팀') 팀
FROM emp;

SELECT ename, hiredate, to_char(hiredate, 'q') "분기"
FROM emp;

SELECT ename, hiredate, to_char(hiredate, 'q') 분기, decode(to_char(hiredate,'q'),1, '부산',
																				2, '광주',
																				3, '제주',
																				'출장없음')
FROM emp;

/*
# 일반 함수 case
1. decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해 조건의 일치하는 경우에만 다른 값으로 대치하지만,
	case함수에서는 산술연산, 관계연산, 논리연산과 같은 다양한 비교가 가능하다.
2. 기본형식
	1) 조건문 형태 활용
	case when 논리|산술|관계 then 처리할데이터
		when 논리|산술|관계 then 처리할데이터
		else 기타처리할데이터
	end
	## 주의
	case when은 앞에서 선언 조건식을 제외한 조건을 처리한다.
	
	2) switch case문 형태
	case [컬럼명]
		when 데이터1 then 처리할데이터
		when 데이터2 then 처리할데이터
		else 그외데이터
	end	
*/
--부서번호에 따라 처리하는 데이터를 다르게 할 때
SELECT ename, deptno,
	CASE WHEN deptno=10 THEN sal*0.2
		--여러가지 비교와 논리연산자를 활용하여 결과값을 리턴할 수 있다.
		WHEN deptno=20 THEN sal*0.5
		--이전에 선언한 내용(deptno=10)을 제외하고 포함하고 있다.
		WHEN deptno=30 THEN sal*0.7
		ELSE sal*1.2
	END show
FROM emp;

SELECT ename, sal, CASE WHEN sal >= 5000 THEN 'A'
						WHEN sal >= 4000 THEN 'B'
						WHEN sal >= 3000 THEN 'C'
						WHEN sal >= 2000 THEN 'D'
						WHEN sal >= 1000 THEN 'E'
						WHEN sal >= 0 THEN 'F'
						ELSE '등급분류불가'
					END 등급
FROM emp;

SELECT ename, deptno,
	CASE deptno --특정한 컬럼 지정
		WHEN 10 THEN sal*0.2 --해당 deptno가 어떤 값을 나타냄(부서별로 보녀스 지정)
		WHEN 20 THEN sal*0.5
		WHEN 30 THEN sal*0.7
		ELSE sal*1.2
	END 보너스
FROM emp;

SELECT ename, sal, 
	CASE to_char(hiredate, 'q')
		WHEN '1' THEN sal*0.3
		WHEN '2' THEN sal*0.2
		WHEN '3' THEN sal*0.1
		ELSE sal*0.05
	END 보너스
FROM emp;

