# Write your MySQL query statement below

select s.user_id , IFNULL(ROUND(sum(action = 'confirmed')/count(*),2),0.00) as confirmation_rate
from Signups s
left join Confirmations c
on s.user_id = c.user_id 
Group by s.user_id;