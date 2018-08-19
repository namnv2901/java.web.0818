--1. D?a v�o b?ng S_CUSTOMER th?c hi?n nh?ng c�ng vi?c sau:
--a. T?o c�u truy v?n th? hi?n t�n, m� kh�ch h�ng. T�n c�c c?t l� T�n kh�ch h�ng, M� kh�ch h�ng.
select name as "T�n kh�ch h�ng", id as "M� kh�ch h�ng"
from s_customer

--b. S?p x?p k?t qu? theo th? t? gi?m d?n c?a m� kh�ch h�ng.
select name as "T�n kh�ch h�ng", id as "M� kh�ch h�ng"
from s_customer
order by id desc

--2. D?a v�o b?ng S_EMP
--a. Hi?n th? t�n truy c?p c?a nh�n vi�n 23
select userid
from s_emp
where id = '23'

--b. Hi?n th? h?, t�n v� m� ph�ng c?a nh�n vi�n trong ph�ng 10, 50 v� s?p theo th? t? c?a t�n. N?i 2 c?t h? t�n v� ??t t�n c?t m?i l� Employees.
--c�ch 1
select e.first_name || ' ' || e.last_name as "Employee", e.id
from s_emp e, s_dept d
where e.dept_id = d.id and (d.name = N'Ph�ng 10' or d.name = N'Ph�ng 50')
order by last_name
--c�ch 2
select e.first_name || ' ' || e.last_name as "Employee", e.id
from s_emp e, s_dept d
where e.dept_id = d.id and (d.name in ('Ph�ng 10', 'Ph�ng 50'))
order by last_name

--c. Hi?n th? t?t c? nh?ng nh�n vi�n c� t�n ch?a ch? �S�.
select *
from s_emp
where last_name like '%S%'

--d. Hi?n th? t�n truy nh?p v� ng�y b?t ??u l�m vi?c c?a nh�n vi�n trong kho?ng th?i gian t? 14/5/1990 ??n 26/5/1991.
select userid, start_date
from s_emp
where start_date between to_date('14/5/1990', 'dd/MM/yyyy') and to_date('26/5/1991', 'dd/MM/yyyy')

--3. D�ng b?ng S_EMP ?? th?c hi?n nh?ng c�ng vi?c sau:
--a. Vi?t c�u truy v?n hi?n th? t�n v� m?c l??ng c?a t?t c? c�c nh�n vi�n nh?n l??ng t? 1000 ??n 2000/th�ng.
select last_name, salary
from s_emp
where salary between 1000 and 2000

--b. L?p danh s�ch t�n v� m?c l??ng c?a nh?ng nh�n vi�n ? ph�ng 31, 42, 50
--nh?n m?c l??ng tr�n 1350. ??t t�n cho c?t t�n l� Emloyee Name v� ??t
--t�n cho c?t l??ng l� Monthly Salary.
--c�ch 1
select last_name "Employee Name", salary "Monthly Salary"
from s_emp e, s_dept d
where e.dept_id = d.id and e.salary > 1350 and (d.name = N'Ph�ng 31' or d.name = N'Ph�ng 42' or d.name = N'Ph�ng 50')
--c�ch 2
select last_name "Employee Name", salary "Monthly Salary"
from s_emp e, s_dept d
where e.dept_id = d.id and e.salary > 1350 and (d.name in ('Ph�ng 31', 'Ph�ng 42', 'Ph�ng 50'))

--c. Hi?n th? t�n v� ng�y b?t ??u l�m vi?c c?a m?i nh�n vi�n ???c thu� trong n?m 1991.
select last_name, start_date
from s_emp
where start_date between to_date('1/1/1991', 'dd/MM/yyyy') and to_date('31/12/1991', 'dd/MM/yyyy')

--d. Hi?n th? h? t�n c?a t?t c? c�c nh�n vi�n KH�NG ph?i l� ng??i qu?n l�.
select first_name, last_name
from s_emp
where id not in (select manager_id
                from s_emp)

--4. D?a v�o b?ng S_PRODUCT th?c hi?n c�c c�ng vi?c:
--a. Hi?n th? theo th? t? abc t?t c? nh?ng s?n ph?m c� t�n b?t ??u v?i t? Pro.
select *
from s_product
where name like 'Pro%'
order by name

--b. Hi?n th? t�n s?n ph?m v� m� t? ng?n g?n (SHORT_DESC) c?a s?n ph?m v?i nh?ng s?n ph?m c� m� t? ng?n g?n ch?a t? �bicycle�
select name, short_desc
from s_product
where short_desc = 'bicycle'

--c. Hi?n th? t?t c? nh?ng m� t? ng?n g?n.
select short_desc
from s_product


--B�I 2: C�c lo?i h�m trong SQL
--1. Hi?n th? m� nh�n vi�n, t�n v� m?c l??ng ???c t?ng th�m 15%.
--c�ch 1
select id, last_name, salary * 1.15
from s_emp
--c�ch 2
CREATE OR REPLACE FUNCTION TANGLUONG 
(
  SALARY IN NUMBER DEFAULT 0 
) RETURN NUMBER AS 
BEGIN
  RETURN SALARY + SALARY * 0.15 ;
END TANGLUONG;
--
select id, last_name, TANGLUONG(salary)
from s_emp

--2. Hi?n th? t�n nh�n vi�n v� ch?c v? trong ngo?c ??n �( )� c?a t?t c? c�c nh�n vi�n.
select last_name || '(' || title || ')' as "T�n v� ch?c v?"
from s_emp

--3. Hi?n th? t�n c?a m?i nh�n vi�n, ng�y tuy?n d?ng v� ng�y xem x�t t?ng l??ng. Ng�y x�t t?ng l??ng theo qui ??nh l� v�o ng�y th? hai sau 6 th�ng l�m vi?c.
select last_name "T�n", start_date "Ng�y v�o l�m", next_day(add_months(start_date, 6), 'monday') "Ng�y x�t t?ng l??ng"
from s_emp

--4. Hi?n th? t�n s?n ph?m c?a t?t c? c�c s?n ph?m c� ch? �ski�.
select name
from s_product
where name like '%ski%'

--5. V?i m?i nh�n vi�n, h�y t�nh s? th�ng th�m ni�n c?a nh�n vi�n. S?p x?p k?t qu? t?ng d?n theo th�ng th�m ni�n v� s? th�ng ???c l�m tr�n.
select round(months_between(sysdate, start_date)) "Th�ng th�m ni�n"
from s_emp

--B�I 3: Ph�p k?t
--1. Hi?n th? t�n s?n ph?m, m� s?n ph?m v� s? l??ng t?ng m�n h�ng trong ??n ??t h�ng c� m� s? 1. C?t s? l??ng ???c ??t t�n l� ORDERED.
select p.name "T�n s?n ph?m", p.id "M� s?n ph?m", i.quantity "ordered"
from s_product p join s_item i on p.id = i.product_id
where i.ord_id = '1'

--2. Hi?n th? m� kh�ch h�ng v� m� ??n ??t h�ng c?a c�c kh�ch h�ng. S?p x?p danh
--s�ch theo m� kh�ch h�ng. Hi?n th? m� kh�ch h�ng v� m� ??n ??t h�ng c?a t?t c?
--kh�ch h�ng, k? c? nh?ng kh�ch h�ng ch?a ??t h�ng.
select c.id "M� kh�ch h�ng", o.id "M� don h�ng"
from s_customer c left join s_ord o on c.id = o.customer_id
order by c.id

--3. Hi?n th? t?t c? c�c kh�ch h�ng, m� s?n ph?m v� s? l??ng ??t h�ng c?a t?t c? c�c kh�ch h�ng c� ??n h�ng tr�n 100.000.
select c.name, i.product_id, count(i.ord_id)
from s_customer c join s_ord o on c.id = o.customer_id
    join s_item i on o.id = i.ord_id
where o.total > 100000
group by c.name, i.product_id

--B�I 4: C�c h�m gom nh�m
--1. Hi?n th? m?c cao nh?t v� m?c th?p nh?t c?a ??n h�ng trong b?ng S_ORD. ??t t�n c�c c?t t??ng ?ng l� Hightest v� Lowest.
select max(total) Highttest, min(total) Lowest
from s_ord

--2. X�c ??nh s? ng??i qu?n l� m� kh�ng c?n l?p danh s�ch.
select count(DISTINCT manager_id)
from s_emp

--3. Hi?n th? t�n kh�ch h�ng v� s? l??ng ??n ??t h�ng c?a m?i kh�ch h�ng
select c.name, count(o.id) as "S? l??ng ??n h�ng"
from s_customer c join s_ord o on c.id = o.customer_id
group by c.name

--B�I 5: Truy v?n con
--H�y s? d?ng c�c b?ng S_EMP, S_EDEPT, S_ORD, S_ITEM v� S_PRODUCT.
--1. Hi?n th? h?, t�n v� ng�y tuy?n d?ng c?a t?t c? c�c nh�n vi�n c�ng ph�ng v?i Thu
select first_name, last_name, start_date
from s_emp join s_dept on s_emp.dept_id = s_dept.id
where s_dept.name in (select d.name
              from s_dept d join s_emp e on d.id = e.dept_id
              where e.last_name = 'Thu')

--2. Hi?n th? m� nh�n vi�n, h?, t�n v� m� truy c?p c?a t?t c? c�c nh�n vi�n c� m?c l??ng tr�n m?c l??ng trung b�nh.
select id, first_name, last_name, userid
from s_emp
where salary > (select avg(salary)
                  from s_emp)

--3. Hi?n th? m� nh�n vi�n, h? v� t�n c?a t?t c? c�c nh�n vi�n c� m?c l??ng tr�n m?c trung b�nh v� c� t�n ch?a k� t? �L�.
select id, first_name, last_name, userid
from s_emp
where last_name like '%L%' and salary > (select avg(salary)
                                        from s_emp)