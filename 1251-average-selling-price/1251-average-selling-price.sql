# Write your MySQL query statement below
select p.product_id, IFNULL(round(sum(p.price*u.units)/sum(units),2),0) as average_price
from Prices p
left join UnitsSold u
on 
p.product_id=u.product_id
and u.purchase_date >= p.start_date
and u.purchase_date <= p.end_date
group by p.product_id;