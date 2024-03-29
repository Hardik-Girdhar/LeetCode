# Write your MySQL query statement below
select contest_id , ROUND((COUNT(distinct user_id))*100/(select count(user_id) from Users),2) as percentage
from Register
group by contest_id
order by percentage desc,contest_id;