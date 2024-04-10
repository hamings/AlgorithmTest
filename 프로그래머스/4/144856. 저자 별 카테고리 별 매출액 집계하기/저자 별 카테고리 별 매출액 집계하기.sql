SELECT a.author_id, a.author_name, b.category, sum(b.price*s.sum) as total_sales
from book b
join author a
on b.author_id = a.author_id
join (select book_id,sum(sales) as sum from book_sales where to_char(sales_date,'YYYYmm') = '202201' group by book_id) s
on s.book_id = b.book_id
group by a.author_id,a.author_name,b.category
order by author_id asc,category desc;