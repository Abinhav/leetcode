-- Last updated: 14/07/2026, 14:02:31
select email from Person group by email having count(email)>1;