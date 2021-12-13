/*
# 데이터베이스 모델링
1. exerd 모델링 툴 설치
	http://exerd.com/update
	
2. ERD
	Entity Relation Diagram
	Entity(객체) : 설계에서 물리적 모델링에서 테이블로 만들어질 객체를 말한다.
	Relation : 엔티티와 엔티티의 연관관계를 설정하는 것을 말한다.

# 데이터베이스 생명주기
1. 요구사항 수집 및 분석
	- 사용자들의 요구사항을 듣고 분석하여 데이터베이스 구축의 범위를 정하는 단계
2. 설계
 	- 분석된 요구사항을 기초로 주요 개념과 업무 프로세스 등을 식별하고(개념적 설계), 
 	사용하는 DBMS의 종류에 맞게 변환(논리적 설계)한 후, 데이터베이스 스키마를 도출(물리적 설계)함
3. 구현
 	- 설계 단계에서 생성한 스키마를 실제 DBMS에 적용하여 테이블 및 관련 객체(뷰, 인덱스 등)를 만듬
4. 운영
 	- 구현된 데이터베이스를 기반으로 소프트웨어를 구축하여 서비스를 제공함
5. 감시 및 개선
 	- 데이터베이스 운영에 따른시스템의 문제를 관찰하고 데이터베이스 자체의 문제점을 파악하여 개선함

#데이터 모델링 과정
1. 요구사항 수집 및 분석
	현실 세계의 대상 및 사용자의 요구 등을 정리 및 분석
 		- 사용자 식별
 		- 데이터베이스 용도 식별
 		- 사용자 요구사항 수집 및 명세
2. 설계 
 	1) 개념적 모델링
 		중요 개념을 구분
	 		- 핵심 Entity(독립개ㅊ) 도출
	 		- ERD 작성
 	2) 논리적 모델링 
 		각 개념을 구체화
	  		- ERD-RDB모델사상
	  		- 상세 속성 정의
	  		- 정규화 등
 	3) 물리적 모델링
	  	데이터베이스 생성 계획에 따라 개체, 인덱스 등을 생성
	  		- DB개체 정의
	  		- 테이블 및 인덱스 등 설계
3. 데이터베이스 구현

# 요구사항 수집 방법
1. 실제 문서를 수집하고 분석함
2. 담당자와의 인터뷰나 설문조사를 통해 요구사항을 직접 수렴함
3. 비슷한 업무를 처리하는 기존의 데이터베이스를 분석함
4. 각 업무와 연관된 모든 부분을 살펴봄

# 개념적 모델링(conceptual modeling)
	- 요구사항을 수집하고 분석한 결과를 토대로 업무의 핵심적인 개념을 구분하고 전체적인 뼈대를 만드는 과정
	- 개체(entity)를 추출하고 각 개체들 간의 관계를 정의하여 ER 다이어그램(ERD, Entity Relationship Diagram)을 만드는 과정까지를 말함
	
# 논리적 모델링(logical modeling)
	- 개념적 모델링에서 만든 ER 다이어그램을 사용하려는 DBMS에 맞게 사상(매핑, mapping)하여 실제 데이터베이스로 구현하기 위한 모델을 만드는 과정
	- 논리적 모델링 과정
		개념적 모델링에서 추출하지 않았던 상세 속성들을 모두 추출함
		정규화 수행
		데이터 표준화 수행
		
# 물리적 모델링(physical modeling)
	- 작성된 논리적 모델을 실제 컴퓨터의 저장 장치에 저장하기 위한 물리적 구조를 정의하고 구현하는 과정
	- DBMS의 특성에 맞게 저장 구조를 정의해야 데이터베이스가 최적의 성능을 낼 수 있음

# 물리적 모델링 시 트랜잭션, 저장 공간 설계 측면에서 고려할 사항
	- 응답시간을 최소화해야한다.
	- 얼마나 많은 트랜잭션을 동시에 발생시킬 수 있는지 검토해야한다.
	- 데이터가 저장될 공간을 효율적으로 배치해야한다.
	
# ER(Entity Relationship) 모델
	- 세상의 사물을 개체(entity)와 개체 간의 관계(relationship)로 표현함
	- 개체
		독립적인 의미를 지니고 있는 유무형의 사람 또는 사물. 개체의 특성을 나타내는 속성(attribute)에 의해 식별
		개체끼리 서로 관계를 가짐

# ER다이어그램
	- ER 모델은 개체와 개체 간의 관계를 표준화된 그림으로 나타냄

# 개체(entity)
	- 사람, 사물, 장소, 개념, 사건과 같이 유무형의 정보를 가지고 있는 독립적인 실체
	- 데이터베이스에서 주로 다루는 개체 - (낱개로 구성된 것, 낱개가 각각 데이터 값을 가지는 것, 데이터 값이 변하는 것)
	- 비슷한 속성의 개체 타입(entity type)을 구성하며, 개체 집합(entity set)으로 묶임
	
#개체 타입의 ER 다이어그램 표현
	- ER 다이어그램상에서 개체 타입은 직사각형으로 나타냄
	- 개체 타입의 유형
		강한 개체(strong entity) : 다른 개체의 도움 없이 독자적으로 존재할 수 있는 개체
		약한 개체(weak entity) : 독자적으로는 존재할 수 없고 반드시 상위 개체 타입을 가짐
		
# 속성
	- 속성(attribute) : 개체가 가진 성질
	- 속성의 ER 다이어그램 표현
		속성은 기본적으로 타원으로 표현. 개체 타입을 나타내는 직사각형과 실선으로 연결됨
		속성의 이름은 타원의 중앙에 표기함
		속성이 개체를 유일하게 식별할 수 있는 키일 경우 속성 이름에 밑줄을 그음
		
# 관계와 관계 타입
	- 관계 : 개체 사이의 연관성을 나타내는 개념
	- 관계 타입
		개체 타입과 개체 타입 간의 연결 가능한 관계를 정의한 것
		관계 집합(relationship set)은 관계로 연결된 집합을 의미함
		
# 차수에 따른 관계 타입의 유형
	1) 일대일(1:1)관계
		- 좌측 개체 타입에 포함된 개체가 우측 개체 타입에 포함된 개체와 일대일로 대응하는 관계
*/
CREATE TABLE Book(
	bookid number PRIMARY KEY,
	bookname varchar2(40),
	publisher varchar2(40),
	price number
);

CREATE TABLE Customer(
	custid number PRIMARY KEY,
	name varchar2(40),
	address varchar2(40),
	phone varchar2(30)
);

CREATE TABLE Orders(
	orderid number PRIMARY KEY,
	custid number REFERENCES Customer(custid),
	bookid number REFERENCES Book(bookid),
	orderdate date,
	saleprice number
);

/*
# 관계설정
1. 1:1 관계
	테이블간의 관계가 1:1로 설정되는 경우
	ex) 결혼을한다. 학생과 소속학과에 학생의 입장에서는 1:1
2. 1:다 관계
	테이블간의 관계가 1:여러개로 설정되어 있는 경우
	ex) 회원이 여러 개의 물건을 사다. 하나의 물건을 여러 회원이 구입하다.
3. 필수관계(mandatory)
	해당 테이블 관계가 반드시 있어야 하는 경우
	ex) 사원의 사원번호, 학생의 소속학과
4. 선택관계(optional)
	관계에 있어서 있을 수도 있고 없을 수도 있는 경우를 말한다.
	ex) 회원의 구매물품
5. 복합키 설정
	학생	수강	강좌
	이와같이 학생 강좌 수강이라는 테이블에서 수강은 학생번호와 강좌번호 두개 모두를 기준으로 복합된 primary key로 설정할 수 있다.
	두개 모두 다를 때, 다른 데이터를 입력이 가능하게 키를 설정하는 것을 말한다.
	학생		강좌			수강
	홍길동	컴퓨터공학개론	1	1
	홍길동	컴퓨터공학개론	1	1	동일시 primary key로 에러 발생
	홍길동	데이터베이스	1	2	홍길동은 같지만 강좌가 다르기 때문에 입력 가능
6. 식별과 비식별관계 설정
	식별관계 : 참조하는 컬럼이 해당 테이블에 위 수강테이블과 같이 key로 사용할 때를 말한다.
		학생테이블의 학생번호가 수강테이블에 강좌테이블의 강좌번호와 함께 key로 사용되는데, 이럴 때는 식별관계라고 한다.
		한 라인의 선으로 표현된다.
		장점) 간단한 테이블간의 연관관계를 설정하고, 또 다시 해당 테이블과 연관관계가 일어나지 않는다면, 키를 위한 컬럼이 갯수를 줄이고 데이터를 간편하게 처리할 수 있다.
	비식별관계 : 참조하는 컬럼이 해당 테이블에 key가 아닌 컬럼으로 사용되는 것을 말한다.
		비식별 관계는 점선으로 표현한다.
		장점) 새로운 키를 만들었기 때문에, 컬럼이 늘어난다는 단점은 있지만, 또 다른 테이블과 연관관계를 복잡하게 만들어야 할 때, 간편하게 하나의 컬럼으로 연관관계를 설정할 수 있다.
		
# 차수에 따른 유형
	- 관계 집합에 참가하는 개체 타입의 수를 관계 타입의 차수(degree)라고 함
	1) 1진 관계 : 한 개의 개체가 자기 자신과 관계를 맺음
	2) 2진 관계 : 두 개의 개체가 관계를 맺음
	3) 3진 관계 : 세 개의 개체가 관계를 맺음
	
# 관계 대응수(cardinality) : 두 개체 타입의 관계에 실제로 참여하는 개별 개체 수
	1) 일대일 관계 : 하나의 개체가 하나의 개체에 대응
	2) 일대다 관계 : 하나의 개체가 여러 개체에 대응
	3) 다대일 관계 : 여러 개체가 하나의 개체에 대응
	4) 다대다 관계 : 여러 개체가 여러 개체에 대응
	
# IE표기법-관계와 관계 대응 수
	1) 점섬 : 비식별자 관계(강한 개체 타입)
		부모 개체의 키가 일반 속성으로 포함되는 개체
	2) 실선 : 식별자 관계(약한 개체 타입)
		부모 개체의 키가 주 식별자로 포함되는 관계
	3) 삼선 : 일대다(1:N)의 관계 - N쪽에 새발을 표시
	4) 원 : 0(선택참여), 최소참여가 0일 경우
	4) ㅣ : 1(필수참여), 최소참여가 1일 경우
	
# 이상현상의 개념
	- 잘못 설계된 데이터베이스가 어떤 이상현상(anomaly)을 일으키는지 알아보기
	1) 삭제이상(deletion anomly)
		- 튜플 삭제 시 같이 저장된 다른 정보까지 연쇄적으로 삭제되는 현상
		- 연쇄삭제(triggered deletion) 문제 발생
	2) 삽입이상(insertion anomly)
		- 튜플 삽입 시 특정 속성에 해당하는 값이 없어 NULL 값을 입력해야 하는 현상 -> NULL값 문제 발생
	3) 수정이상(update anomly)
		- 튜플 수정 시 중복된 데이터의 일부만 수정되어 데이터의 불일치 문제가 일어나는 현상
		- 불일치(inconsistency) 문제 발생
		
# 수강 테이블의 정규화 과정
*/
CREATE TABLE summer(
	sid number,
	class varchar2(30),
	price number
);
--데이터 입력
INSERT INTO summer VALUES(100, 'fortran', 20000);
INSERT INTO summer VALUES(150, 'pascal', 15000);
INSERT INTO summer VALUES(200, 'C', 10000);
INSERT INTO summer VALUES(250, 'fortran', 20000);

SELECT*FROM summer;

SELECT price
FROM summer
WHERE class='C';

SELECT count(*) "학생 수", avg(price) "평균 수강료"
FROM summer;

SELECT *
FROM summer
WHERE price = (SELECT min(price) FROM summer);

--# 삽입이상 : 특정한 정보를 넣는데, 필요 없는 컬럼은 null로 할당되어 사용이 필요 없는 컬럼의 정보까지 넣어야 되는 현상
--ex) 계절학기에 javascript를 30000에 할당
INSERT INTO summer(class, price) values('javascript', 30000);
SELECT *
FROM summer;
--수강인원의 문제 발생
SELECT count(*), count(sid)
FROM summer;