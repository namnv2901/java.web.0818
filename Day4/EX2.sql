SELECT id, last_name, first_name, salary*1.15 from s_emp;
SELECT last_name||' '|| first_name ||'('|| manager_id||')' as "thông tin" FROM s_emp;
SELECT name from s_product where name like '%ski%';