select left('그린 컴퓨터 ACAdemy abcde zxas', 5); #띄어쓰기를 따짐
select right('그린 컴퓨터 ACAdemy abcde zxas', 8); #뒤에서부터 띄어쓰기를 따짐


select mid('그린 컴퓨터 ACAdemy abcde zxas', 2,4);
select mid('그린 컴퓨터 ACAdemy abcde zxas', 2); #2부터 끝까지
--			1 234 5

select substring('그린 컴퓨터 ACAdemy abcde zxas', 2,4);

select mid(name,2) from stud; #2번째부터 끝까지

select length('그린 컴퓨터 ACAdemy abcde zxas'); 
#35개이지만 byte길이로 따짐(한글은 3byte 나머지는 1byte %한글 eucd는 2바이트 utf8은 3바이트)
select char_length('그린 컴퓨터 ACAdemy abcde zxas'); #25개

select instr('그린 컴퓨터 ACAdemy abcde zxas','a'); #a가 몇번째에 있는가(대문자도 포함)
select instr('그린 컴퓨터 ACAdemy abcde zxas','A'); #a가 몇번째에 있는가
select instr('그린 컴퓨터 ACAdemy abcde zxas','Ab'); #ab가 몇번째에 있는가(대문자도 포함)

select position('A' in '그린 컴퓨터 ACAdemy abcde zxas'); #instr하고 비슷함
select position('a' in '그린 컴퓨터 ACAdemy abcde zxas');

select ascii('a');


select upper('aBCd EfG'),lower('aBCd EfG');

select *, replace(grade,2, 'B반') from exam; #2대신에 B반이 들어간다

select repeat('abc', 5); #abc가 5번나옴

select insert('그린 컴퓨터 ACAdemy abcde zxas',5,19,'qwe'); 
#5번째부터 19번째글자대신에 qwe가 들어감

select str_to_date('2021-09-22','%Y-%m-%d');

select ltrim('     그린 it     '),rtrim('     그린 it     '),trim('     그린 it     ');

select lpad('abc',10,'*'),rpad('abc',10,'*'),lpad('0123456789123456',10,'*');

select reverse('asdf ghj'); #글자가 뒤집어짐

--- 학년이 2이상인 학생의 이름을 학생1 --> 졸업준비생1 형태로 변경하세요

select *, replace('졸업준비생1', sid, '*') from exam
where grade >= 2; 

select *, concat('졸업준비생',sid) from exam
where grade >= 2;










