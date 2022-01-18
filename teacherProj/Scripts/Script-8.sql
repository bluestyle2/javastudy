create table board(

	id int auto_increment primary key,
	title varchar(100),
	pname varchar(100),
	pw varchar(100),
	content varchar(1000),
	reg_date datetime,
	cnt int,
	upfile varchar(100)
);



select * from board;

insert into board (title, pname, pw, content, reg_date, cnt, lev, seq) values
('제목30','유진0','1111','내용0', sysdate(),0,0,0),
('제목31','유진1','1111','내용1', sysdate(),0,0,0),
('제목32','유진2','1111','내용2', sysdate(),0,0,0),
('제목33','유진3','1111','내용3', sysdate(),0,0,0),
('제목34','유진4','1111','내용4', sysdate(),0,0,0),
('제목35','유진5','1111','내용5', sysdate(),0,0,0),
('제목36','유진6','1111','내용6', sysdate(),0,0,0),
('제목37','유진7','1111','내용7', sysdate(),0,0,0),
('제목38','유진8','1111','내용8', sysdate(),0,0,0),
('제목39','유진9','1111','내용9', sysdate(),0,0,0);


update board set gid = id where id >=16;

CREATE TABLE muggle (
  `id` int auto_increment primary key,
  `title` varchar(100),
  `pname` varchar(100),
  `pw` varchar(100) ,
  `content` varchar(1000) ,
  `reg_date` datetime ,
  `cnt` int ,
  `upfile` varchar(100) ,
  `lev` int ,
  `seq` int ,
  `gid` int 

)

insert into voice (title, pname, pw, content, reg_date, cnt, lev, seq) values
('성우가 되고싶어요','준혁3','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('내꿈은 해적왕이 될거야','준혁1','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('안선생님...','준혁2','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('연기를.. 하고 싶어요..','준혁짱짱','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('커리큘럼에 대하여 질문있습니다','준혁몬이다','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('내 꿈은 성우왕','혁쓰','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('성우에 대하여 몇가지 질문이 있습니다','코딩조아','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('성우.. 저도 할수 있을까요?','코딩맨','1111','노력을 많이 해야하나요?', sysdate(),0,0,0);

insert into muggle (title, pname, pw, content, reg_date, cnt, lev, seq) values
('성우가 되고싶어요','준혁3','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('내꿈은 해적왕이 될거야','준혁1','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('안선생님...','준혁2','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('연기를.. 하고 싶어요..','준혁짱짱','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('커리큘럼에 대하여 질문있습니다','준혁몬이다','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('내 꿈은 성우왕','혁쓰','1111','노력을 많이 해야하나요?', sysdate(),0,0,0),
('성우에 대하여 몇가지 질문이 있습니다','코딩조아','1111','성우과정 개강 준비물이 어떻게 되나요?', sysdate(),0,0,0),
('성우.. 저도 할수 있을까요?','코딩맨','1111','노력을 많이 해야하나요?', sysdate(),0,0,0);