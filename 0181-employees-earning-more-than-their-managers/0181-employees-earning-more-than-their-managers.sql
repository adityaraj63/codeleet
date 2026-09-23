# Write your MySQL query statement below
select e.name as Employee
from Employee e
join employee m
ON e.managerId = m.id
where e.salary > m.salary;