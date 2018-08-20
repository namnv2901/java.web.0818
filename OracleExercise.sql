--BÀI 1: Thi hành câu l?nh SQL

--1. D?a vào b?ng S_CUSTOMER th?c hi?n nh?ng công vi?c sau:
--a. T?o câu truy v?n th? hi?n tên, mã khách hàng. Tên các c?t là Tên khach hàng, Mã khách hàng.
SELECT NAME AS "Tên khách hàng", CUSTOMER_ID AS "Mã khách hàng"
FROM S_CUSTOMER;


--b. S?p x?p k?t qu? theo th? t? gi?m d?n c?a mã khách hàng.
SELECT NAME AS "Tên khách hàng", CUSTOMER_ID AS "Mã khách hàng"
FROM S_CUSTOMER
ORDER BY CUSTOMER_ID DESC;

/*==================================================================*/
--2. D?a vào b?ng S_EMP
--a. Hi?n th? tên truy c?p c?a nhân viên 23
SELECT EMP_ID AS "Mã nhân viên", USER_ID AS "Tên truy c?p" 
FROM S_EMP
WHERE EMP_ID = 23;


--b. Hi?n th? h?, tên và mã phòng c?a nhân viên trong phòng 10, 50 và s?p
--theo th? t? c?a tên. N?i 2 c?t h? tên và ??t tên c?t m?i là Employees.
--L?u ý: khi ??t alias cho c?t (ví d? Employees) có th? dùng t? khóa as
--nh?ng khi ??t tên b?ng ko dùng ???c t? khóa as mà ch? ??n gi?n là cách
--kho?ng tr?ng gi?a tên b?ng và alias c?a b?ng. N?i 2 c?t s? d?ng phép “||”

SELECT FIRST_NAME, LAST_NAME, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEES", DEPT_ID
FROM S_EMP
WHERE DEPT_ID = 10 OR DEPT_ID = 50
ORDER BY FIRST_NAME;


--c. Hi?n th? t?t c? nh?ng nhân viên có tên ch?a ch? “S”.
SELECT * FROM S_EMP
WHERE FIRST_NAME LIKE 'S' OR LAST_NAME LIKE '%S%'


--d. Hi?n th? tên truy nh?p và ngày b?t ??u làm vi?c c?a nhân viên trong
--kho?ng th?i gian t? 14/5/1990 ??n 26/5/1991.

SELECT USER_ID, START_DATE
FROM S_EMP
WHERE START_DATE BETWEEN TO_TIMESTAMP('14-MAY-90','DD-MON-RR HH.MI.SSXFF AM') AND TO_TIMESTAMP('26-MAY-91','DD-MON-RR HH.MI.SSXFF AM')
ORDER BY START_DATE;

/*=============================================================================*/
--3. Dùng b?ng S_EMP ?? th?c hi?n nh?ng công vi?c sau:
--a. Vi?t câu truy v?n hi?n th? tên và m?c l??ng c?a t?t c? các nhân viên nh?n
--l??ng t? 1000 ??n 2000/tháng.

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM S_EMP
WHERE SALARY BETWEEN 1000 AND 2000
ORDER BY SALARY ;


/*b. L?p danh sách tên và m?c l??ng c?a nh?ng nhân viên ? phòng 31, 42, 50
nh?n m?c l??ng trên 1350. ??t tên cho c?t tên là Emloyee Name và ??t
Tên cho c?t l??ng là Monthly Salary.*/

SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", SALARY AS "MONTHLY SALARY"
FROM S_EMP
WHERE (DEPT_ID IN(31,42,50) AND (SALARY > 1350))
ORDER BY SALARY;

/*c. Hi?n th? tên và ngày b?t ??u làm vi?c c?a m?i nhân viên ???c thuê trong
n?m 1991.*/
SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", START_DATE
FROM S_EMP
WHERE TO_CHAR(START_DATE, 'YYYY') = 1991;

/*d. Hi?n th? h? tên c?a t?t c? các nhân viên không ph?i là ng??i qu?n lý.*/
SELECT EMP_ID, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME"
FROM S_EMP
WHERE  EMP_ID NOT IN (SELECT DISTINCT MANAGER_ID FROM S_EMP);

/*================================================================*/
--4. D?a vào b?ng S_PRODUCT th?c hi?n các công vi?c:
--a. Hi?n th? theo th? t? abc t?t c? nh?ng s?n ph?m có tên b?t ??u v?i t? Pro.

SELECT * FROM S_PRODUCT
WHERE NAME LIKE 'Pro%';


--b. Hi?n th? tên s?n ph?m và mô t? ng?n g?n (SHORT_DESC) c?a s?n ph?m
--v?i nh?ng s?n ph?m có mô t? ng?n g?n ch?a t? “bicycle”

SELECT NAME, SHORT_DESC
FROM S_PRODUCT
WHERE SHORT_DESC LIKE '%bicycle%';


--c. Hi?n th? t?t c? nh?ng mô t? ng?n g?n. So sánh k?t qu? v?i bài t?p 4b.
SELECT SHORT_DESC FROM S_PRODUCT

/*======================================================================*/
--BÀI 2: Các lo?i hàm trong SQL

--1. Hi?n th? mã nhân viên, tên và m?c l??ng ???c t?ng thêm 15%.
SELECT EMP_ID, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", SALARY AS "OLD SALARY", SALARY * 1.2 AS "NEW SALARY"
FROM S_EMP;


--2. Hi?n th? tên nhân viên và ch?c v? trong ngo?c ??n “( )” c?a t?t c? các nhân viên.
SELECT FIRST_NAME || ' ' || LAST_NAME  || ' (' || TITLE || ')' AS "EMPLOYEE NAME"
FROM S_EMP;

/*3. Hi?n th? tên c?a m?i nhân viên, ngày tuy?n d?ng và ngày xem xét t?ng l??ng.
Ngày xét t?ng l??ng theo qui ??nh là vào ngày th? hai sau 6 tháng làm vi?c. ??nh
d?ng ngày xem xét theo ki?u “Eighth of May 1992”.*/

SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", TO_CHAR(START_DATE,'DD-MM-YYYY') AS "RECRUITMENT DATE", 
        TO_CHAR((ADD_MONTHS(START_DATE,6)),'DD-MM-YYYY') AS "SALARY INCREMENT DATE"
FROM S_EMP;


--4. Hi?n th? tên s?n ph?m c?a t?t c? các s?n ph?m có ch? “ski”.

SELECT * FROM S_PRODUCT 
WHERE LOWER(NAME) LIKE '%ski%';

--5. V?i m?i nhân viên, hãy tính s? tháng thâm niên c?a nhân viên. S?p x?p k?t qu?
--t?ng d?n theo tháng thâm niên và s? tháng ???c làm tròn.


SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME",
        ROUND(MONTHS_BETWEEN(SYSTIMESTAMP,START_DATE)) AS "WORK MONTH"
FROM S_EMP
ORDER BY "WORK MONTH";

--BÀI 3: Phép ket
--1. Hi?n th? tên s?n ph?m, mã s?n ph?m và s? l??ng t?ng món hàng trong donn datt
--hàng có mã so 101. C?t s? l??ng ???c ??t tên là ORDERED.

SELECT S_PRODUCT.NAME, S_PRODUCT.PRODUCT_ID,S_ITEM.ITEM_ID, S_ITEM.QUANTITY AS "ORDERED"
FROM S_PRODUCT
LEFT JOIN S_ITEM ON S_PRODUCT.PRODUCT_ID = S_ITEM.PRODUCT_ID
WHERE S_ITEM.ITEM_ID = 101;

/*2. Hi?n th? mã khách hàng và mã don dat hàng cua các khách hàng. S?p x?p danh
sách theo mã khách hàng. Hien thi mã khách hàng và mã don dat hàng cua tat ca
khách hàng, ke ca nhung khách hàng chua dat hàng.*/

SELECT S_CUSTOMER.CUSTOMER_ID, S_ITEM.ITEM_ID
FROM S_CUSTOMER
LEFT JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID 
LEFT JOIN S_ITEM ON S_ORD.ORD_ID = S_ITEM.ORD_ID
ORDER BY S_CUSTOMER.CUSTOMER_ID;



--3. Hi?n th? t?t c? các khách hàng, mã s?n ph?m và s? l??ng ??t hàng c?a t?t c? các
--khách hàng có donn hàng trên 100.000.

SELECT S_CUSTOMER.CUSTOMER_ID, S_CUSTOMER.NAME, S_ITEM.PRODUCT_ID, S_ITEM.QUANTITY, S_ITEM.PRICE * S_ITEM.QUANTITY AS TOTAL
FROM S_CUSTOMER
INNER JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID
INNER JOIN S_ITEM ON S_ORD.ORD_ID = S_ITEM.ORD_ID
WHERE S_ITEM.PRICE * S_ITEM.QUANTITY > 100.000
ORDER BY S_CUSTOMER.CUSTOMER_ID;

--=============================================================================
--BÀI 4: Các hàm gom nhóm
--1. Hien thi muc cao nhat và muc thap nhat cua don hàng trong bang S_ORD. Dat
--tên các cot tuong ung là Hightest và Lowest.
SELECT MAX(COUNT(*)) AS "HIGHTEST", MIN(COUNT(*)) AS "LOWEST"
FROM S_ORD
GROUP BY CUSTOMER_ID;

--2. Xác dinnh so nguoi quan lý mà không can lap danh sách.
SELECT COUNT(COUNT(*)) AS "NUMBER OF MANAGERS"
FROM S_EMP
GROUP BY MANAGER_ID; 


--3. Hien thi tên khách hàng và so luong don dat hàng cua moi khách hàng

SELECT S_ORD.CUSTOMER_ID,S_CUSTOMER.NAME, COUNT(*) AS "NUMBER OF ORDS"
FROM S_CUSTOMER
LEFT JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID
GROUP BY S_CUSTOMER.NAME, S_ORD.CUSTOMER_ID
ORDER BY S_ORD.CUSTOMER_ID;


--========================================================================
--BÀI 5: Truy vAn con
--Hãy su dung các bang S_EMP, S_DEPT, S_ORD, S_ITEM và S_PRODUCT.
--1. Hien thi ho, tên và ngày tuyen dung cua tat ca các nhân viên cùng phòng voi Magee
SELECT FIRST_NAME ||' '|| LAST_NAME AS "EMPLOYEE NAME", TO_CHAR(START_DATE,'DD-MM-YYYY') AS "RECRUI DATE"
FROM S_EMP
WHERE DEPT_ID = (SELECT DEPT_ID FROM S_EMP WHERE LAST_NAME = 'Magee' OR FIRST_NAME = 'Magee');

--2. Hien thi mã nhân viên, ho, tên và mã truy cap cua tat ca các nhân viên có muc luong trên muc luong trung bình.

SELECT EMP_ID, FIRST_NAME, LAST_NAME, USER_ID, SALARY
FROM S_EMP
WHERE SALARY > (SELECT AVG(SALARY) FROM S_EMP)
ORDER BY SALARY;

--3. Hien thi mã nhân viên, ho và tên cua tat ca các nhân viên có muc luong trên muc trung bình và có tên chua ký tu “L”.

SELECT EMP_ID, FIRST_NAME, LAST_NAME, USER_ID, SALARY
FROM S_EMP
WHERE SALARY > (SELECT AVG(SALARY) FROM S_EMP) AND (FIRST_NAME LIKE '%L%' OR LAST_NAME LIKE '%L%')
ORDER BY SALARY;








