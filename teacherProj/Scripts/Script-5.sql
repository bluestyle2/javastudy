--- 테이블 정의시 제약조건 정의
create table member(
	mid varchar(100) primary key,  -- 기본키
	mname varchar(50) not null, -- 중복 허용
	tel varchar(20) unique,
	hobby varchar(100)
);


select * from information_schema.TABLE_CONSTRAINTS;

--- 테이블을 정의한다음에 제약조건 정의
create table mmm(
	mid varchar(100),  -- 기본키
	mname varchar(50), -- 중복 허용
	tel varchar(20),
	hobby varchar(100)
);

-- 제약조건 추가
alter table mmm modify mname varchar(50) not null;

alter table mmm add constraint unique(tel);

alter table mmm add constraint primary key(mid);

-- 제약조건 제거
alter table mmm modify mname varchar(50) null;

alter table mmm drop constraint tel;

alter table mmm drop primary key;

alter table mmm modify mid varchar(100) null;

-- 외래키 테이블 생성
create table test(
	eid int auto_increment primary key,
	mf varchar(100),	
	kor int,
	eng int,
	mat int,
	constraint mf_fk foreign key(mf) references member(mid)
);				#foeign key이름설정

-- foreign key 생성
alter table test drop foreign key test_ibfk_1; # 구문 실행후 foerign keys에 가서 새로고침해야함 

-- foreign key 제거
alter table test drop foreign key mf_fk;

alter table test add constraint qwert foreign key(mf) references member(mid);

alter table test drop foreign key qwert;

alter table test add constraint qwert foreign key(mf) references member(mid)
on update cascade 
on delete cascade;

select @@autocommit; -- 1 : 자동저장 설정상태 , 0 : 해제상태

set @@autocommit = 0; -- 해제하기
set @@autocommit = 1; -- 설정하기

insert into person (pid, pname, age, reg_date,friend)
values
('ggg','두가인',36,sysdate(),'bbb');

select * from person;

commit;



insert into person (pid, pname, age) values ('hhh','정우성',52);
insert into person (pid, pname, age) values ('iii','정좌성',42);

savepoint A;

insert into person (pid, pname, age) values ('jjj','정남성',32);

commit;

insert into person (pid, pname, age) values ('kkk','정북성',22);

savepoint B;

insert into person (pid, pname, age) values ('lll','정중성',12);
insert into person (pid, pname, age) values ('ooo','정오성',26);
insert into person (pid, pname, age) values ('ppp','정왼성',27);


rollback;

rollback to savepoint B;
rollback to savepoint A;

