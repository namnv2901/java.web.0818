--1. D?a vào b?ng S_CUSTOMER th?c hi?n nh?ng công vi?c sau:
--a. T?o câu truy v?n th? hi?n tên, mã khách hàng. Tên các c?t là Tên khách hàng, Mã khách hàng.
select name as "Tên khách hàng", id as "Mã khách hàng"
from s_customer

--b. S?p x?p k?t qu? theo th? t? gi?m d?n c?a mã khách hàng.
select name as "Tên khách hàng", id as "Mã khách hàng"
from s_customer
order by id desc

--2. D?a vào b?ng S_EMP
--a. Hi?n th? tên truy c?p c?a nhân viên 23
select userid
from s_emp
where id = '23'

--b. Hi?n th? h?, tên và mã phòng c?a nhân viên trong phòng 10, 50 và s?p theo th? t? c?a tên. N?i 2 c?t h? tên và ??t tên c?t m?i là Employees.
--cách 1
select e.first_name || ' ' || e.last_name as "Employee", e.id
from s_emp e, s_dept d
where e.dept_id = d.id and (d.name = N'Phòng 10' or d.name = N'Phòng 50')
order by last_name
--cách 2
select e.first_name || ' ' || e.last_name as "Employee", e.id
from s_emp e, s_dept d
where e.dept_id = d.id and (d.name in ('Phòng 10', 'Phòng 50'))
order by last_name

--c. Hi?n th? t?t c? nh?ng nhân viên có tên ch?a ch? “S”.
select *
from s_emp
where last_name like '%S%'

--d. Hi?n th? tên truy nh?p và ngày b?t ??u làm vi?c c?a nhân viên trong kho?ng th?i gian t? 14/5/1990 ??n 26/5/1991.
select userid, start_date
from s_emp
where start_date between to_date('14/5/1990', 'dd/MM/yyyy') and to_date('26/5/1991', 'dd/MM/yyyy')

--3. Dùng b?ng S_EMP ?? th?c hi?n nh?ng công vi?c sau:
--a. Vi?t câu truy v?n hi?n th? tên và m?c l??ng c?a t?t c? các nhân viên nh?n l??ng t? 1000 ??n 2000/tháng.
select last_name, salary
from s_emp
where salary between 1000 and 2000

--b. L?p danh sách tên và m?c l??ng c?a nh?ng nhân viên ? phòng 31, 42, 50
--nh?n m?c l??ng trên 1350. ??t tên cho c?t tên là Emloyee Name và ??t
--tên cho c?t l??ng là Monthly Salary.
--cách 1
select last_name "Employee Name", salary "Monthly Salary"
from s_emp e, s_dept d
where e.dept_id = d.id and e.salary > 1350 and (d.name = N'Phòng 31' or d.name = N'Phòng 42' or d.name = N'Phòng 50')
--cách 2
select last_name "Employee Name", salary "Monthly Salary"
from s_emp e, s_dept d
where e.dept_id = d.id and e.salary > 1350 and (d.name in ('Phòng 31', 'Phòng 42', 'Phòng 50'))

--c. Hi?n th? tên và ngày b?t ??u làm vi?c c?a m?i nhân viên ???c thuê trong n?m 1991.
select last_name, start_date
from s_emp
where start_date between to_date('1/1/1991', 'dd/MM/yyyy') and to_date('31/12/1991', 'dd/MM/yyyy')

--d. Hi?n th? h? tên c?a t?t c? các nhân viên KHÔNG ph?i là ng??i qu?n lý.
select first_name, last_name
from s_emp
where id not in (select manager_id
                from s_emp)

--4. D?a vào b?ng S_PRODUCT th?c hi?n các công vi?c:
--a. Hi?n th? theo th? t? abc t?t c? nh?ng s?n ph?m có tên b?t ??u v?i t? Pro.
select *
from s_product
where name like 'Pro%'
order by name

--b. Hi?n th? tên s?n ph?m và mô t? ng?n g?n (SHORT_DESC) c?a s?n ph?m v?i nh?ng s?n ph?m có mô t? ng?n g?n ch?a t? “bicycle”
select name, short_desc
from s_product
where short_desc = 'bicycle'

--c. Hi?n th? t?t c? nh?ng mô t? ng?n g?n.
select short_desc
from s_product


--BÀI 2: Các lo?i hàm trong SQL
--1. Hi?n th? mã nhân viên, tên và m?c l??ng ???c t?ng thêm 15%.
--cách 1
select id, last_name, salary * 1.15
from s_emp
--cách 2
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

--2. Hi?n th? tên nhân viên và ch?c v? trong ngo?c ??n “( )” c?a t?t c? các nhân viên.
select last_name || '(' || title || ')' as "Tên và ch?c v?"
from s_emp

--3. Hi?n th? tên c?a m?i nhân viên, ngày tuy?n d?ng và ngày xem xét t?ng l??ng. Ngày xét t?ng l??ng theo qui ??nh là vào ngày th? hai sau 6 tháng làm vi?c.
select last_name "Tên", start_date "Ngày vào làm", next_day(add_months(start_date, 6), 'monday') "Ngày xét t?ng l??ng"
from s_emp

--4. Hi?n th? tên s?n ph?m c?a t?t c? các s?n ph?m có ch? “ski”.
select name
from s_product
where name like '%ski%'

--5. V?i m?i nhân viên, hãy tính s? tháng thâm niên c?a nhân viên. S?p x?p k?t qu? t?ng d?n theo tháng thâm niên và s? tháng ???c làm tròn.
select round(months_between(sysdate, start_date)) "Tháng thâm niên"
from s_emp

--BÀI 3: Phép k?t
--1. Hi?n th? tên s?n ph?m, mã s?n ph?m và s? l??ng t?ng món hàng trong ??n ??t hàng có mã s? 1. C?t s? l??ng ???c ??t tên là ORDERED.
select p.name "Tên s?n ph?m", p.id "Mã s?n ph?m", i.quantity "ordered"
from s_product p join s_item i on p.id = i.product_id
where i.ord_id = '1'

--2. Hi?n th? mã khách hàng và mã ??n ??t hàng c?a các khách hàng. S?p x?p danh
--sách theo mã khách hàng. Hi?n th? mã khách hàng và mã ??n ??t hàng c?a t?t c?
--khách hàng, k? c? nh?ng khách hàng ch?a ??t hàng.
select c.id "Mã khách hàng", o.id "Mã don hàng"
from s_customer c left join s_ord o on c.id = o.customer_id
order by c.id

--3. Hi?n th? t?t c? các khách hàng, mã s?n ph?m và s? l??ng ??t hàng c?a t?t c? các khách hàng có ??n hàng trên 100.000.
select c.name, i.product_id, count(i.ord_id)
from s_customer c join s_ord o on c.id = o.customer_id
    join s_item i on o.id = i.ord_id
where o.total > 100000
group by c.name, i.product_id

--BÀI 4: Các hàm gom nhóm
--1. Hi?n th? m?c cao nh?t và m?c th?p nh?t c?a ??n hàng trong b?ng S_ORD. ??t tên các c?t t??ng ?ng là Hightest và Lowest.
select max(total) Highttest, min(total) Lowest
from s_ord

--2. Xác ??nh s? ng??i qu?n lý mà không c?n l?p danh sách.
select count(DISTINCT manager_id)
from s_emp

--3. Hi?n th? tên khách hàng và s? l??ng ??n ??t hàng c?a m?i khách hàng
select c.name, count(o.id) as "S? l??ng ??n hàng"
from s_customer c join s_ord o on c.id = o.customer_id
group by c.name

--BÀI 5: Truy v?n con
--Hãy s? d?ng các b?ng S_EMP, S_EDEPT, S_ORD, S_ITEM và S_PRODUCT.
--1. Hi?n th? h?, tên và ngày tuy?n d?ng c?a t?t c? các nhân viên cùng phòng v?i Thu
select first_name, last_name, start_date
from s_emp join s_dept on s_emp.dept_id = s_dept.id
where s_dept.name in (select d.name
              from s_dept d join s_emp e on d.id = e.dept_id
              where e.last_name = 'Thu')

--2. Hi?n th? mã nhân viên, h?, tên và mã truy c?p c?a t?t c? các nhân viên có m?c l??ng trên m?c l??ng trung bình.
select id, first_name, last_name, userid
from s_emp
where salary > (select avg(salary)
                  from s_emp)

--3. Hi?n th? mã nhân viên, h? và tên c?a t?t c? các nhân viên có m?c l??ng trên m?c trung bình và có tên ch?a ký t? “L”.
select id, first_name, last_name, userid
from s_emp
where last_name like '%L%' and salary > (select avg(salary)
                                        from s_emp)