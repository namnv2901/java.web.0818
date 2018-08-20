SELECT e.last_name, e.first_name,e.start_date FROM s_emp e 
    where e.dept_id in( SELECT dept_id FROM s_emp where last_name  = 'Magee' );
SELECT id, last_name, first_name,user_id from s_emp WHERE salary in
    (SELECT e.salary FROM s_emp e WHERE e.salary>(Select AVG(e1.salary) from s_emp e1) );
SELECT id, last_name, first_name,user_id from s_emp WHERE salary in
    (SELECT e.salary FROM s_emp e WHERE e.salary>(Select AVG(e1.salary) from s_emp e1) )
    and last_name like '%l%';