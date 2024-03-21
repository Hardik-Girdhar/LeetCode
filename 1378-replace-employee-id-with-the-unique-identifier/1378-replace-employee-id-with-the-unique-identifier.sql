# Write your MySQL query statement below

# select unique_id , name from Employees as empa
# left join EmployeeUNI as empb
# on empa.id=empb.id;

select eu.unique_id,e.name from Employees e
left join EmployeeUNI eu
on e.id = eu.id;