

select b.category,sum(sales) as total_sales from book_sales s
join book b on b.book_id = s.book_id
where to_char(s.sales_date,'YYYYmm')='202201'
group by b.category
order by 1 asc