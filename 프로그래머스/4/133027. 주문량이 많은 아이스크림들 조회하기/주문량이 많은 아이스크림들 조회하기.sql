-- 코드를 입력하세요
SELECT f.flavor
from first_half f
inner join july j
on f.flavor=j.flavor
group by flavor
order by sum(f.total_order+j.total_order) desc
limit 3