create table playerinfo(
	name varchar(50), 
	id varchar(50) primary key,  
	pw varchar(45), 
	birth varchar(45), 
	tel   varchar(45), 
	jelly int,
	dino int,
	hp int,
	fstLogin varchar(1) default 1,
	ipnum varchar(50) default 1
);

insert into playerinfo (name, id, pw, birth, tel, jelly, dino, hp, fstLogin) values
	 ('현빈','aaa','1234','911212', '01012341234',50,1,50,'1'),
	 ('원빈','bbb','123456', '9811111', '01012341234',60,2,0,'1'),
	 ('전성윤','SungYun','davinci','9111111','01011119999',0,2,50,'2'),
	 ('훌륭하다다빈치코드','Davinci','123456','211003','01032113211',0,3,50,'2');





	