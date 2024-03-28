# Write your MySQL query statement below
select e.name, b.bonus from Employee e
Left join Bonus b on e.empId = b.empId where b.bonus is NULL or b.bonus<1000;