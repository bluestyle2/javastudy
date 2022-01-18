create table stud(
	id varchar(20) primary key,
	name varchar(50) not null
	);

create table exam(
	id int,
	pid varchar(20),
	title varchar(50),
	regdate datetime,
	kor int,
	eng int,
	constraint foreign key(pid) references stud(id)
	);

insert into stud (id,name) values
('aaa','현빈'),
('bbb','원빈'),
('ccc','투빈'),
('ddd','젤리빈'),
('eee','장희빈');

insert into exam (id,pid,title,kor,eng) values
(1,'aaa','중간',67,78),
(2,'bbb','중간',57,58),
(3,'ccc','중간',97,98),
(4,'ddd','중간',77,71),
(5,'aaa','중간',87,82),
(6,'aaa','기말',57,52),
(7,'bbb','기말',97,92),
(8,'ccc','기말',87,82),
(9,'eee','기말',67,62);

create view vm_exam as
select id,pid, title, regdate, kor, eng, (kor+eng) as tot, (kor+eng)/2 as avg
from exam
order by id desc;

-- ------------------------------------
4. 이름이 2글자인 시험 정보 서브쿼리 이용하여 검색하세요[20점]

사용 object : 생성한 vm_exam, stud

출력내용

학생ID, 제목, 시험일 , 국어, 영어, 총점, 평균
-- ------------------------------------

select id, title, regdate , kor, eng, tot, avg from vm_exam
where name in (select name from stud where name like '__');

select a.*,b.name from vm_exam A 
left join stud B ON A.id =B.id;

select a.*,(select name from stud) 
AS name vm_exam A , stud B where B.name like '__';

select a.*,(select B.name from stud) 
AS name vm_exam A , stud B where B.name like '__';

select a.*,(select name from stud where B.name like '__' limit 1) 
AS name  from vm_exam A , stud B;

SELECT A.id,A.pid,A.regdate,A.kor,A.eng,A.tot,A.avg,B.name FROM vm_exam A 
LEFT JOIN (SELECT * FROM  stud ST LEFT JOIN
vm_exam VM ON ST.id = VM.id WHERE name LIKE '__') B ON A.id = B.id

SELECT * FROM  STUD ST LEFT JOIN
VM_EXAM VM ON ST.ID = VM.ID WHERE NAME LIKE '__'

SELECT C.* from
(SELECT A.*,B.name FROM exam A JOIN stud B ON A.PID = B.ID)
C WHERE C.NAME LIKE '__';


