	create table juice(
	id varchar(100),
	name varchar(200),
	product varchar(100),	
	price varchar(100)
);
create table person(
	pid varchar(100),
	pname varchar(200),
	age int,	
	reg_date Date,
	friend varchar(100)
);
insert into juice (id,name,product,price) values
	('1', '아메리카노', '커피', '3000'),
	('2', '까페라떼', '커피', '3300'),
 	('3', '카라멜마끼아또', '커피', '3500'),
 	('4', '카페모카', '커피', '3500'),
	('5', '딸기', '스무디', '2700'),
	('6', '바나나', '스무디', '2800'),
	('7', '홍차', '차', '3000'),
	('8', '녹차', '차', '2500');
	
	INSERT INTO green_db.person (pid,pname,age,reg_date,friend) VALUES
	 ('ddd','속빈',26,'2013-11-08','qqq'),
	 ('qqq',NULL,42,'2019-07-18','eee'),
	 ('ccc','원빈',59,'2001-01-03','bbb'),
	 ('eee','김태희',39,'2002-06-02','bbb'),
	 ('fff','원투쓰리',55,NULL,NULL),
	 ('rrr','장희빈',17,'2020-08-09','qqq'),
	 ('bbb','장발장',24,'2000-08-09','bbb'),
	 ('ttt','이효리',42,'2020-08-14','ccc'),
	 ('vvv','삼효리',37,'2020-08-19','ccc'),
	 ('ggg','두가인',36,'2021-09-30','bbb')
INSERT INTO green_db.person (pid,pname,age,reg_date,friend) VALUES
	 ('hhh','정우성',52,NULL,NULL),
	 ('iii','정좌성',42,NULL,NULL),
	 ('jjj','정남성',32,NULL,NULL);
	
update green_db.person set reg_date = '2013-11-12 17:34:56' where pid = 'ddd';
	
	
	
	