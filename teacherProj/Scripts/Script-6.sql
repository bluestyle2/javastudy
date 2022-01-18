create table testKeyboard(
	company varchar(100),
	keyboardtype varchar(50),
	pdname varchar(45),
	price int
);
insert into testkeyboard (company, keyboardtype, pdname, price) values 
('로지텍','기계식','LLMM_1',85000),
('로지텍','기계식','LLMM_2',79000),
('로지텍','멤브레인','aaa',91000),
('로지텍','팬터그래프','BBB',84000),
('삼성','기계식','CCC',62000),
('삼성','무접점','DDD',45000),
('삼성','멤브레인','EEE',17000),
('삼성','팬터그래프','GGG',35000),
('삼성','무접점','asdf',65000),
('한성','기계식','qwer',74000),
('한성','기계식','zxcv',88000),
('한성','멤브레인','tyui',52000),
('한성','팬터그래프','rrtt',32000),
('한성','무접점','yyuu',91000),
('엘지','기계식','qaz',64000),
('엘지','멤브레인','wsx',25000),
('엘지','기계식','edc',14000),
('엘지','팬터그래프','rtv',32000);

select keyboardtype, max(price) from testkeyboard
group by(keyboardtype); 

select company,count(*) from testkeyboard
where price <= 60000
group by company;

select company,count(*) from testkeyboard
where price <= 60000
group by company;

select pdname ,sum(price) from testkeyboard where pdname like '%a%';

select (select avg(price) from testkeyboard where keyboardtype in ('기계식','멤브레인') and company = '로지텍') as 로지텍,
 	   (select avg(price) from testkeyboard where keyboardtype in ('기계식','멤브레인') and company = '삼성') as 삼성,
       round((select avg(price) from testkeyboard where keyboardtype in ('기계식','멤브레인') and company = '한성'),0) as 한성,
       round((select avg(price) from testkeyboard where keyboardtype in ('기계식','멤브레인') and company = '엘지'),0) as 엘지
       from testkeyboard limit 0 ,1;


       
update playerinfo set fstLogin = '1' where fstLogin = '2'

-- 3. 종류별 가장 높은 가격의 항목을 출력하세요 [10점]
-- 
-- 4. 가격이 60000 이하인 제품들의 개수를 회사별로 출력하세요[20점]
-- 
-- 5. 제품명에 ‘a’가 들어간 제품들의 가격 합계를 출력하세요[20점]
-- 
-- 6. 종류가 기계식, 멤브레인 인 제품들의 가격 평균을 회사별로 출력하세요[10점]
-- 
-- 7. 최종결과물은 수행한 결과 소스코드 및 PPT(스크린 샷을 캡쳐)하여 압축파일로 제출




