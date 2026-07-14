-- Last updated: 14/07/2026, 14:01:10
select customer_number from Orders group by customer_number order by count(*) DESC LIMIT 1;