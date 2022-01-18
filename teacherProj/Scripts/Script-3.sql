select sysdate(),now(),curdate(),curtime();

select last_day(sysdate()), last_day('2021-02-13'); #이번달의 마지막날, 2월달의 마지막날

select datediff(sysdate(), '2021-03-20'); #이날부터 얼마나 지났니

select adddate(sysdate(), interval 2 month); #오늘부터 +2달

select date_add(sysdate(), interval 2 month); #오늘부터 +2달 똑같음

select adddate(sysdate(), interval 5 day); #5일뒤

select adddate(sysdate(), interval 5 year); #5년뒤

select adddate(sysdate(), interval 5 week); #5주뒤

select sysdate(), adddate(sysdate(), '05-00-00'), adddate(sysdate(), '00-05-00'),adddate(sysdate(), '00-00-05');
#잘못된 사용

select addtime(sysdate(), '00:05:00'); #5분뒤
-- select addtime(sysdate(), interval 5 minute); #안댐
select addtime(sysdate(), '05:00:00'); #5시간뒤
-- select addtime(sysdate(), interval 5 hour); #안댐
select addtime(sysdate(), '00:05:00'); #5분뒤

select adddate(sysdate(), interval 2 year 5 month));

-- 2년 5개월 4일 5시간 10분 23초 뒤의 시간을 출력하세요

select sysdate(), addtime(adddate(adddate(adddate(sysdate(), interval 2 year), interval 5 month), interval 4 day),'05:10:23');

select subdate('2021-10-05', interval 2 month); #adddate는 추가면 subdate는 빼기개념
select date_sub('2021-10-05', interval 2 month);
select subtime(sysdate(), '05:00:00');

select date_format(sysdate(),'%Y'), date_format(sysdate(), '%y'),
date_format(sysdate(), '%M'),date_format(sysdate(), '%m'),date_format(sysdate(), '%c');

select date_format(sysdate(),'%D'), date_format(sysdate(), '%d'),
date_format(sysdate(), '%w'),date_format(sysdate(), '%a');

select date_format(sysdate(),'%p'), date_format(sysdate(), '%H'),
date_format(sysdate(), '%h'),date_format(sysdate(), '%k')
,date_format(sysdate(), '%I'),date_format(sysdate(), '%l');

select date_format(sysdate(),'%i'), date_format(sysdate(), '%s');

select date_format(sysdate(),'%i'), date_format(sysdate(), '%s');

select date_format(sysdate(),'%j'), date_format(sysdate(), '%U');

select sysdate(), sysdate()+20; #20초를 수로

select unix_timestamp('1970-01-01 00:00:00'), unix_timestamp('1970-01-02 01:00:00');
#한국시간이 +9 15시간뒤로 따짐 60x60x15 = 54000

--- 생년월일을 이용하여 만 나이를 출력하세요
select str_to_date('1974-03-20','%Y-%m-%d'), 
date_format(sysdate(),'%Y')-date_format(str_to_date('1974-10-20','%Y-%m-%d'),'%Y');
#생일이 지나도 나이가 안바뀜

select sysdate(), str_to_date('1974-09-20','%Y-%m-%d'),
date_format(sysdate(), '%Y')-date_format(str_to_date('1974-09-20','%Y-%m-%d'), '%Y')-
(sysdate()<str_to_date(concat(date_format(sysdate(),'%Y'),'-','09-20'),'%Y-%m-%d'));
#     참이면1 거짓이면 0








