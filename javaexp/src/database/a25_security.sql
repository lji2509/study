/*
#데이터베이스 보안을 위한 권한 설정
1. 데이터베이스 관리자(DBA)는 사용자가 데이터베이스객체(테이블, view, sequence...)에 대한 특정 권한을 가질 수 있게하여,
	다수의 사용자가 데이터베이스에 저장된 정보를 공유하면서도 정보에 대한 보안이 이루어지도록 한다.
2. DB 서버에 접근시 필요한 사용자 계정/암호를 통해 로그인 인증을 받는다.
3. 권한의 역할과 종류
	1) create user : 사용자를 새롭게 생성하는 권한
	2) drop user : 사용자를 삭제하는 권한
	3) drop any table : 테이블을 삭제하는 권한
	4) query rewrite : 함수 기반 인덱스 생성 권한
	5) backup any table : 테이블 백업 권한
	6) create session : 데이터베이스에 접속할 수 있는 권한
		==> dba 권한으로 위의 내용을 포함하는 권한으로 설정하여 처리할 수 있다.
	7) create table/view/sequence/procedure
		데이터베이스의 객체들을 생성하는 권한
		==> 데이터베이스 내에 여러가지 객체들을 사용할 수 있는 권한 : resource
*/
/*
#사용자 생성하기
사전에 scott계정에 DBA 권한 부여
관리자 계정으로 접근
conn system/1111;
grant dba to scott;
conn scott/tiger;

1. create user 사용자명 indentified by 비밀번호
	ex) create user orauser1 identified by user1;
2. 접속 권한을 할당 처리
	grant 권한명 to 계정명;
	CREATE SESSION : 접속권한
ex) grant CREATE SESSION to orauser01;
CREATE USER orauser1 IDENTIFIED BY user01;
GRANT CREATE SESSION TO orauser01;
conn orauser01/user01;
show USER;
*/
/*
#사용자계정별로 자원에 대한 접근 권한 설정
1. 테이블 생성 권한 부여
	grant create table to 계정명;
	ex) grant create table to orauser01;
2. 전체 자원에 대한 권한 부여
	grant resource to 계정명;

*/
GRANT CREATE TABLE TO orauser01;
SELECT *
FROM DBA_USERS
WHERE username='ORAUSER01';

/*
# 사용자 암호변경
1. 기본형식
alter user 사용자명 identified by 패스워드;
*/
SELECT *
FROM dba_users;

ALTER USER user01 IDENTIFIED BY 5555;
--cmd창에서 sqlplus로 접근확인

/*
# 계정이 lock 걸린 경우
1. 계정 정책에 의해 @@회 이상 암호를 잘못 입력한 경우
2. 계정 정책에 의해 계정만료기간 도래시
3. 처리할 sql
	alter user 사용자계정 identified by 패스워드 account unlock;
*/
CREATE USER himan IDENTIFIED BY 1111;
ALTER USER himan IDENTIFIED BY 7777 account unlock;