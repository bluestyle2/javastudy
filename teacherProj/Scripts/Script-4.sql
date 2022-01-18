select abs(123.456),abs(-123.456);
#음수없앰
select ceiling(123.456), ceiling(-123.456),ceiling(987.654),ceiling(-987.654)
#올림
select floor(123.456),floor(-123.456),floor(987.654),floor(-987.654);
#반올림
select truncate(123.456,2),truncate(-123.456,2),truncate(987.654,2),truncate(-987.654,2);
#입력한 값만큼 뒤에서 짜름
select round(123.456,2),round(-123.456,2),round(987.654,2),round(-987.654,2);
#반올림
select pow(2,4);
#2의 4승

select greatest(45,2,67,99,8,76,86), least(45,2,67,99,8,76,86);
#값 중에 제일큰수, 작은수
select interval(78,0,50,60,70,80,90);
#처음이 값 - 78 78이나오면 78보다 큰애를 찾음 78보다 큰숫자 80의 뒤 자리수 (70)의 자리수를 나타냄

select mid('가양미우수',3,1);

select mid('가양미우수',interval(48,0,60,70,80,90),1);

select *, kor+eng+mat, ifnull(kor,0) from exam;
#null이면 값을 0으로 출력

select if(false,'참','거짓부렁');

select *, avg(kor+eng+mat)/3 from exam;

select *, ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0),
(ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3,
mid('가양미우수', interval((ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3,0,60,70,80,90),1) as res,
if(grade=1,'유치원',if(grade=2,'초등',if(grade=3,'고등','노인대학'))) as school
from exam;

select
case '영어'
when '개구리' then '양서류'
when '뱀' then '파충류'
else '몰라유'
end


select
case
when 57>80 then '우수'
when 57>60 then '정상'
else '미달'
end
from exam;

select
case 
when kor>80 then '우수'
when kor>60 then '정상'
else '미달'
end
from exam;

select *, ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0) as tot,
(ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3 as avg,

case
when (ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3 >= 90 then '수'
when (ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3 >= 80 then '우'
when (ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3 >= 70 then '미'
when (ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3 >= 60 then '양'
else '가'
end
as res,
case grade
when 1 then '유치원'
when 2 then '초등'
when 3 then '고등'
else '노인대학'
end
as school
from exam;

select * from person, exam
where pid = sid; #equal join비스무리한 구문 equal join이 아님!

select * from person
join exam
on pid = sid; #equal join이라고함 똑같지만 이게 더 좋음

select * from person
left outer join exam
on pid = sid;   # 왼쪽 외부 조인
				# 왼쪽 테이블의 모든 행을 가지고 오른쪽 테이블 행과 비교
				#조건에 맞는 값이 오른쪽에 없으면 NULL값이 셀에 출력된다.

select * from person
right outer join exam
on pid = sid; #
				#오른쪽 외부 조인

select * from person
where pid = friend;

select * from person 
join person 
on friend = pid;
#person이 같은게 있어서, 컬럼명이 같으니까 오류


select me.*, you.pname as fname from person me
left outer join person you
on me.friend = you.pid; #self join


---- 서브쿼리
-- 테이블

select *, tot/3 as avg from
(select *, kor+eng+mat as tot from
(select title, sid, ifnull(kor,0) as kor, ifnull(eng,0) as eng, ifnull(mat,0) as mat from exam) t1) t2;


-- 조건절
select * from exam
where kor >= (select avg(kor) from exam);

select avg(kor) from exam;


select adddate(max(reg_date), interval 5 day) from person;
#reg_date의 가장 큰값에 5일더한것

-- 값 (변경하고자 하는 테이블이 같을 경우 테이블 이름을 별칭 처리하여 순환 구조를 회피 한다.)
insert into person (pid, pname, age, reg_date, friend)
values 
('vvv','삼효리',37,(select adddate(max(reg_date), interval 5 day) from person pp), 'ccc');

select * from exam 
left outer join person
on exam.sid = person.pid
where grade = 2;


select * from person
where pid in
(select sid from exam where grade = 2);

#1학년중에 국어점수가 높은애들을 출력하세요
select kor from exam
where grade = 1;

select * from exam 
where kor > any (select kor from exam
where grade = 1);

--- 가입일이 2010년 이후 학생 중 국어점수가 70점 이하인 학생의 영어점수를 5점 추가하세요
update exam set eng = eng+5
where sid in (
select pid from person where reg_date >= '2010-01-01') &&
kor <= 70;

# 외래키 다른키에다가 




