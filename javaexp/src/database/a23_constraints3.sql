/*
# foreign key 설정
1. 연관관계에 있는 두 테이블에 대하여, 한쪽 테이블에 있는 데이터 기준으로 다른쪽 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.
	기준이 되는 테이블에 데이터가 없으면, 연관관계있는 테이블에 다른 데이터를 입력할 때 에러가 발생한다.
	ex) emp테이블의 deptno입력은 반드시 dept테이블에 deptno가 입력되어있을 때, 가능하다.
2. 기본 형식
	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
*/
-- 교수테이블 생성
CREATE TABLE teacher1(
	tno NUMBER PRIMARY key
);
INSERT INTO teacher1 values(10);
INSERT INTO teacher1 values(11);
INSERT INTO teacher1 values(12);

SELECT*FROM teacher1;

CREATE TABLE student20(
	name varchar2(50),
	tno NUMBER CONSTRAINT student20_tno_fk REFERENCES teacher1(tno)
);

INSERT INTO student20 values('홍길동', 10);
INSERT INTO student20 values('신길동', 11);
INSERT INTO student20 values('마길동', 13); --오류

CREATE TABLE product1(
	pno NUMBER PRIMARY KEY,
	pname VARCHAR2(30),
	price NUMBER,
	pcnt NUMBER --재고량과 구매수량을 컬럼명을 구분해서 설정을 할 수 있도록 한다.
);
INSERT INTO product1 values(1, '사과', 2000, 3);
INSERT INTO product1 values(2, '수박', 8000, 2);
INSERT INTO product1 values(3, '바나나', 3000, 7);

CREATE TABLE pbuy(
	bno NUMBER,
	bcnt NUMBER,
	pno NUMBER CONSTRAINT pbuy_pno_fk REFERENCES product1(pno)
);
INSERT INTO pbuy values(10,2,1);
INSERT INTO pbuy values(20,4,2);
INSERT INTO pbuy values(30,1,4); --에러
--pbuy테이블의 pno는 product1테이블에 pno가 있을 때 입력이 가능하지만, 
--현재 pno는 1~3까지만 등록이 되어 있고 4번은 등록이되어 있지 않기에 에러가 발생한다.

--구매한 물건정보
SELECT pname, price 판매가격, bcnt 구매갯수, price*bcnt 총계, pcnt-bcnt 현재고량
FROM product1 p, pbuy b
WHERE p.pno=b.pno;
/*
연산관계로 기본테이블의 컬럼으로 지정되는 데이터는 따로 컬럼을 만들어 저장하지 않는다.
*/