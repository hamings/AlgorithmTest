-- 코드를 입력하세요
select animal_id, name 
from animal_outs
where animal_id not in (SELECT o.animal_id
from animal_outs o
join animal_ins i
on i.animal_id = o.animal_id)
order by 1;
