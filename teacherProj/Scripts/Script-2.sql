create table playerinfo(               # 테이블 만들기 
   id varchar(50),  
   pw varchar(45),
   birth int,
   jelly int,
   dino int,
   hp int);    
   
insert into playerinfo(id, pw, birth, jelly, dino, hp)
values('bbb','123456',901102,50,1,50);

INSERT INTO davinci_db.playerinfo (id,pw,birth,jelly,dino,hp) VALUES
    ('aaa','1234',911212,50,1,50);
    
INSERT INTO davinci_db.playerinfo (id,pw,birth,jelly,dino,hp) values ('bbb','123456',911212,50,1,50);

create table playerinfo(
   name varchar(50) not null,  #기본키
   id varchar(50) not null,    
   pw varchar(45) not null,
   birth int not null,
   jelly int,
   dino int,
   hp int
);


create table playerinfo(
   name varchar(50) not null,  #기본키
   id varchar(50) not null,    
   pw varchar(45) not null,
   birth int not null,
   
   
   jelly int,
   dino int,
   hp int
);

insert into playerinfo (name,id,pw,birth,jelly,dino,hp) values
    ('현빈','aaa','1234',911212,50,1,50),
    ('원빈','bbb','123456',1987,60,2,0);

create table playerinfo(
   name varchar(50) not null,  
   id varchar(50) not null,    
   pw varchar(45) not null,
   birth varchar(45) not null,
   tel   varchar(45) not null,
   jelly int,
   dino int,
   hp int
);

insert into playerinfo (name, id, pw, birth, tel, jelly, dino, hp) values
    ('현빈','aaa','1234','911212', '01012341234',50,1,50),
    ('원빈','bbb','123456', '9811111', '01012341234',60,2,0);


alter table playerinfo add fstLogin varchar(1) default 1; 

select fstLogin from playerinfo where id = 'aaa'

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




