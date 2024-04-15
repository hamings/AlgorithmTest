select p.category, p.max_price, f.product_name
from food_product f
join (select category, max(price) as max_price from food_product 
where category in ('과자','국','김치','식용유')
group by category) p
on f.price = p.max_price and f.category = p.category
order by 2 desc