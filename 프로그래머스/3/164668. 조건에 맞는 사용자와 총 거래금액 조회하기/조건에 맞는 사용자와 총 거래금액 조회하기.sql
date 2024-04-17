select b.writer_id as user_id ,u.nickname,sum(price) as total_sales from used_goods_board b
join used_goods_user u
on b.writer_id = u.user_id
where status='DONE' 
group by b.writer_id,nickname
having sum(price) >=700000
order by 3 asc;
