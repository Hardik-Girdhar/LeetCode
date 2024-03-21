# Write your MySQL query statement below
select distinct author_id as id from Views
where author_id = viewer_id Order by author_id ASC;