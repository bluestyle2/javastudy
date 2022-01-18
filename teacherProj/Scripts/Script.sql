
-- 테이블 생성
create table stud(
	sid varchar(100),
	no int,
	birth datetime,
	height double
);

# 테이블 컬럼 추가
alter table stud add email varchar(200);
/*
 구간 주석
*/

alter table stud modify email int;

alter table stud change email mail varchar(300);

alter table stud drop mail;

desc stud;

show tables;

drop table stud;

create table stud(
id varchar(50),
name varchar(100),
birth date,
tel varchar(30),
email varchar(50),
regdate datetime,
grade int
);





insert into stud (name, birth, id, grade) 
values ('한가인','1992-05-06','aaa',5);


insert into stud (name, birth, id, grade) values 
('두가인','1939-05-07','bbb',5),
('한가인','1995-06-06','ccc',4),
('삼가인','1999-07-12','ddd',1),
('두가인','2009-02-27','eee',4),
('사가인','1998-11-05','fff',5);

update stud set email = 'asdf@aaa.com';

update stud set email = 'zzz@aaa.com'
where id = 'bbb'; #where은 자바 if문과 비슷하다

delete from stud 
where 
birth < '1995-07-31'; #birth가 1995-07-31보다 작을경우 삭제

select id, tel, name from stud;

select id, tel, name from stud
where
birth < '2000-07-31';

select * from stud # * = 그리드로 전부 보기
where
birth < '2000-07-31';

select * from stud
order by birth desc; #desc = 반대로 정렬, desc는 내림차순 기본은 오름차순

select * from stud
order by grade; #grade기준으로 정렬

select * from stud
order by grade desc, birth desc; #grade기준과 birth기준으로 반대로 정렬

select * from stud
where grade = 4 
order by birth;

/*
select * from stud
order by birth
where grade = 4;
이거는 에러이다.
**/

create table exam(
title varchar(50),
sid varchar(100),
kor int,
eng int,
mat int
);

insert into exam(title, sid, kor, eng, mat) values
('semi','ddd',77,78,71),
('semi','eee',87,88,81),
('semi','fff',97,98,91),
('semi','mmm',67,68,61),
('final','ddd',56,65,71),
('final','fff',76,65,41),
('final','rrr',76,85,91),
('final','ttt',66,85,21);

insert into person(pid, pname, age, reg_date) values
('ccc','원빈',59,'2001-01-03');

select * from exam;

alter table exam add eid int auto_increment primary key;

select *, kor+eng+mat from exam;

select 100+200+50;

select *, kor+eng+mat as tot, (kor+eng+mat)/3 as avg from exam;

select "장동건"+"정우성";

select concat('장동건' , '정우성', '소지섭');

select sid from exam; #이름만보기 중복된것도 나온다

select distinct sid from exam; #중복된것 하나만 나온다


select distinct * from exam; #모든게 다 똑같야 하나만 나온다

select distinct title, sid from exam;

select distinct title, eng from exam;

select * from exam where kor > 60; #kor이 60이상만 출력
select * from exam where sid > 'ccc';
select * from person;
select * from person where reg_date > '2014-01-01';
select * from person where pid > '2014-01-01';
select * from person where pid = 'ddd'; # pid ddd를 찾는다

select * from person where pid != 'ddd'; # pid ddd가 아닌것1
select * from person where pid <> 'ddd'; # pid ddd가 아닌것2

-- select * from person where pname = null; 이건안됨
select * from person where pname is null;
-- select * from person where pname <> null; 안됨
select * from person where pname is not null;

select * from exam
where title = 'semi' && kor >= 70; #타이틀이 semi면서 국어가 70점이상인사람 

select * from exam
where title = 'semi' and kor >= 80; #&&대신 and를 쓸수있음

select * from exam;

select * from exam
where kor >= 90 || kor <=60; #타이틀이 semi면서 국어가 70점이상인사람 

select * from exam
where kor >= 90 or kor <=60; #||대신 or를 쓸수잇음

select * from exam
where kor <= 90 && kor >=60; #국어가 60보다 크거나 같으면서 90보다 작거나 같은거

select * from exam
where kor between 60 and 90; #위와 비슷하지만 부등호가없어서 애매모호

select * from exam
where kor between 90 and 60; #안나옴 순서를 맞춰야됨

select * from exam where sid = 'ddd' || sid = 'rrr';

select * from exam where sid in ('ddd', 'rrr'); #복수개념 ddd와 rrr 중요함 많이씀

select * from exam where (title,sid) in (('semi','ddd'),('final','rrr')); #semi일때 dd인것 final일때 rrr인것
#semi와 ddd가 묶여지고 final과 rrr이 묶여지면서 and로 됨

select * from person where age = '26';
select * from person where age = '2'; #2가들어간걸 이렇게는 못찾음

select * from person where age like '26';
select * from person where age like '2%'; #앞에 2가들어간 값이 나옴
select * from person where age = '2%'; #이건안됨
select * from person where age like '%2%'; #2가들어간걸 찾는 모범

-- 평균이 70 이상인 학생들을 학기 오름차순, sid 내림차순으로 정렬하세요

select * from exam order by title desc, 
sid,(kor+eng+mat)/3 as avg from exam;

select *, (kor+eng+mat) as tot, (kor+eng+mat)/3 as avg from exam
where (kor+eng+mat)/3 >= 70
order by title, sid desc;

#desc는 내림차순 기본은 오름차순

#-------------------------------- 연산자 -----------------------------

select * from exam;

select count(kor), count(eng), count(mat), sum(kor),sum(eng), sum(mat) from exam; #값에 null이 있으면 count되지 않음

select avg(kor), max(kor), min(kor) from exam; #순서대로 평균, 최대치, 최소치

select * from person;

select group_concat(pid),group_concat(pname),group_concat(age) from person;
# null이 아닌 값을 묶어서 보여줌

select count(*) from exam; #전체를 다셈 (값이 하나라도 있으면)

select title, count(*) from exam; 
#오라클에서는 에러가남 title이 나온 이유 맨처음에 있는 값이 나오게됨


select count(*) from exam
group by title;
#중요 2개가나온이유는 exam이 타이틀이 두개이기때문 semi가 5개 final이 4개란 뜻

select title, count(*) from exam
group by title;

select title, count(*), max(kor) from exam
group by title; #semi에 가장높은점수는 87점 final에 가장높은점수는 76

select title, count(*), max(kor), max(kor+eng+mat) from exam
group by title;
#max(kor+eng+mat) 국어 영어 수학을 합친값중에 큰게 무엇이냐


alter table exam add grade int;

select * from exam
where title = 'semi'; #semi만 보겠다

select max(kor), max(eng), max(mat) from exam
where title = 'semi'; #semi중에 각 최고점수를 보여줌

select grade, max(kor), max(eng), max(mat) from exam
where title = 'semi'
group by(grade); #semi에서 등급별로(null) 각 과목들의 최고점수 보여줌
/* 
 *  * 1. 타이틀 = semi 인 것만 필터링한다 (그룹핑 X)
 * 2. 학년별로 나눈다.
 * 3. 결과를 출력한다.
 * */

select * from exam;

select grade, count(*) from exam
group by grade; #학년별로 인원수를 나눔

select grade, count(*), sum(kor) from exam
group by grade; #학년별로 국어점수의 합계를 보겠다

select grade, count(*), sum(kor) from exam
group by grade
having sum(kor)>=100; #학년별로 나눈것중에서 국어점수 100점이상인 것들만 보겠다
/*
 * 1. 학년별로 나눈다
 * 2. 나눈 그룹의 국어합계 >=100 인 그룹만 필터링한다.
 * 3. 결과를 출력한다.
 * */

select grade,count(*), sum(mat), avg(mat), min(mat), max(mat) from exam
where mat >= 70
group by grade;

select grade, sum(mat), avg(mat), min(mat), max(mat) from exam
group by grade;

select grade,count(*), sum(mat), avg(mat), min(mat), max(mat) from exam
group by grade
having avg(mat) >= 70;


select * from exam order by grade;

select title, max(kor),max(eng),sum(mat),avg(kor+eng+mat)/3 from exam
group by kor
having avg(kor+eng+mat)/3 >= 70
order by kor desc;

select * from exam;

select title, max(kor), max(eng), max(mat) from exam
where (kor+eng+mat)/3 >= 70
group by title 
order by title 
;





