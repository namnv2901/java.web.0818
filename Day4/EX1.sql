SELECT ID "MÃ KHÁCH HÀNG", NAME "TÊN KHÁCH HÀNG"   FROM S_CUSTOMER ORDER BY ID DESC;
SELECT USER_ID FROM S_EMP WHERE ID =23;
SELECT last_name||' '||first_name as Employees, emp.dept_id from S_EMP EMP  WHERE  emp.dept_id = 50 OR emp.dept_id = 10 ORDER BY emp.last_name;
SELECT * FROM S_EMP WHERE LAST_NAME LIKE '%s%' OR FIRST_NAME LIKE '%s%';
SELECT USER_ID , START_DATE FROM S_EMP WHERE start_date BETWEEN '14-May-1990' AND '26-May-1991';
SELECT last_name||' '||first_name as Employees, salary from S_EMP where salary BETWEEN 1000 and 2000;
SELECT last_name||' '||first_name as "Employee Name",salary as "Monthly Salary" from S_EMP 
    WHERE (dept_id = 31 or dept_id = 42 or dept_id= 50) and salary > 1350;
SELECT last_name||' '||first_name as "Employee Name", start_date from s_emp where start_date like '%-1991';
SELECT last_name||' '||first_name as "Employee Name" from s_emp where manager_id = 0;
SELECT * from s_product where name like 'Pro%' order by name;
SELECT name,short_desc from s_product where short_desc like '%bicycle%' ;
SELECT name,short_desc from s_product;


