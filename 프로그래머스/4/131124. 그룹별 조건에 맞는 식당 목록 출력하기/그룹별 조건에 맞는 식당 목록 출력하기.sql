-- 코드를 입력하세요
select m.member_name, r.review_text, DATE_FORMAT(r.review_date, '%Y-%m-%d') as review_date
from rest_review r join member_profile m on m.member_id = r.member_id
where r.member_id = (SELECT member_id from rest_review group by member_id order by count(*) desc limit 1)
order by 3 asc,2 asc;


