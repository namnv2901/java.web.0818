--B�I 1: Thi h�nh c�u l?nh SQL

--1. D?a v�o b?ng S_CUSTOMER th?c hi?n nh?ng c�ng vi?c sau:
--a. T?o c�u truy v?n th? hi?n t�n, m� kh�ch h�ng. T�n c�c c?t l� T�n khach h�ng, M� kh�ch h�ng.
SELECT NAME AS "T�n kh�ch h�ng", CUSTOMER_ID AS "M� kh�ch h�ng"
FROM S_CUSTOMER;


--b. S?p x?p k?t qu? theo th? t? gi?m d?n c?a m� kh�ch h�ng.
SELECT NAME AS "T�n kh�ch h�ng", CUSTOMER_ID AS "M� kh�ch h�ng"
FROM S_CUSTOMER
ORDER BY CUSTOMER_ID DESC;

/*==================================================================*/
--2. D?a v�o b?ng S_EMP
--a. Hi?n th? t�n truy c?p c?a nh�n vi�n 23
SELECT EMP_ID AS "M� nh�n vi�n", USER_ID AS "T�n truy c?p" 
FROM S_EMP
WHERE EMP_ID = 23;


--b. Hi?n th? h?, t�n v� m� ph�ng c?a nh�n vi�n trong ph�ng 10, 50 v� s?p
--theo th? t? c?a t�n. N?i 2 c?t h? t�n v� ??t t�n c?t m?i l� Employees.
--L?u �: khi ??t alias cho c?t (v� d? Employees) c� th? d�ng t? kh�a as
--nh?ng khi ??t t�n b?ng ko d�ng ???c t? kh�a as m� ch? ??n gi?n l� c�ch
--kho?ng tr?ng gi?a t�n b?ng v� alias c?a b?ng. N?i 2 c?t s? d?ng ph�p �||�

SELECT FIRST_NAME, LAST_NAME, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEES", DEPT_ID
FROM S_EMP
WHERE DEPT_ID = 10 OR DEPT_ID = 50
ORDER BY FIRST_NAME;


--c. Hi?n th? t?t c? nh?ng nh�n vi�n c� t�n ch?a ch? �S�.
SELECT * FROM S_EMP
WHERE FIRST_NAME LIKE 'S' OR LAST_NAME LIKE '%S%'


--d. Hi?n th? t�n truy nh?p v� ng�y b?t ??u l�m vi?c c?a nh�n vi�n trong
--kho?ng th?i gian t? 14/5/1990 ??n 26/5/1991.

SELECT USER_ID, START_DATE
FROM S_EMP
WHERE START_DATE BETWEEN TO_TIMESTAMP('14-MAY-90','DD-MON-RR HH.MI.SSXFF AM') AND TO_TIMESTAMP('26-MAY-91','DD-MON-RR HH.MI.SSXFF AM')
ORDER BY START_DATE;

/*=============================================================================*/
--3. D�ng b?ng S_EMP ?? th?c hi?n nh?ng c�ng vi?c sau:
--a. Vi?t c�u truy v?n hi?n th? t�n v� m?c l??ng c?a t?t c? c�c nh�n vi�n nh?n
--l??ng t? 1000 ??n 2000/th�ng.

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM S_EMP
WHERE SALARY BETWEEN 1000 AND 2000
ORDER BY SALARY ;


/*b. L?p danh s�ch t�n v� m?c l??ng c?a nh?ng nh�n vi�n ? ph�ng 31, 42, 50
nh?n m?c l??ng tr�n 1350. ??t t�n cho c?t t�n l� Emloyee Name v� ??t
T�n cho c?t l??ng l� Monthly Salary.*/

SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", SALARY AS "MONTHLY SALARY"
FROM S_EMP
WHERE (DEPT_ID IN(31,42,50) AND (SALARY > 1350))
ORDER BY SALARY;

/*c. Hi?n th? t�n v� ng�y b?t ??u l�m vi?c c?a m?i nh�n vi�n ???c thu� trong
n?m 1991.*/
SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", START_DATE
FROM S_EMP
WHERE TO_CHAR(START_DATE, 'YYYY') = 1991;

/*d. Hi?n th? h? t�n c?a t?t c? c�c nh�n vi�n kh�ng ph?i l� ng??i qu?n l�.*/
SELECT EMP_ID, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME"
FROM S_EMP
WHERE  EMP_ID NOT IN (SELECT DISTINCT MANAGER_ID FROM S_EMP);

/*================================================================*/
--4. D?a v�o b?ng S_PRODUCT th?c hi?n c�c c�ng vi?c:
--a. Hi?n th? theo th? t? abc t?t c? nh?ng s?n ph?m c� t�n b?t ??u v?i t? Pro.

SELECT * FROM S_PRODUCT
WHERE NAME LIKE 'Pro%';


--b. Hi?n th? t�n s?n ph?m v� m� t? ng?n g?n (SHORT_DESC) c?a s?n ph?m
--v?i nh?ng s?n ph?m c� m� t? ng?n g?n ch?a t? �bicycle�

SELECT NAME, SHORT_DESC
FROM S_PRODUCT
WHERE SHORT_DESC LIKE '%bicycle%';


--c. Hi?n th? t?t c? nh?ng m� t? ng?n g?n. So s�nh k?t qu? v?i b�i t?p 4b.
SELECT SHORT_DESC FROM S_PRODUCT

/*======================================================================*/
--B�I 2: C�c lo?i h�m trong SQL

--1. Hi?n th? m� nh�n vi�n, t�n v� m?c l??ng ???c t?ng th�m 15%.
SELECT EMP_ID, FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", SALARY AS "OLD SALARY", SALARY * 1.2 AS "NEW SALARY"
FROM S_EMP;


--2. Hi?n th? t�n nh�n vi�n v� ch?c v? trong ngo?c ??n �( )� c?a t?t c? c�c nh�n vi�n.
SELECT FIRST_NAME || ' ' || LAST_NAME  || ' (' || TITLE || ')' AS "EMPLOYEE NAME"
FROM S_EMP;

/*3. Hi?n th? t�n c?a m?i nh�n vi�n, ng�y tuy?n d?ng v� ng�y xem x�t t?ng l??ng.
Ng�y x�t t?ng l??ng theo qui ??nh l� v�o ng�y th? hai sau 6 th�ng l�m vi?c. ??nh
d?ng ng�y xem x�t theo ki?u �Eighth of May 1992�.*/

SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME", TO_CHAR(START_DATE,'DD-MM-YYYY') AS "RECRUITMENT DATE", 
        TO_CHAR((ADD_MONTHS(START_DATE,6)),'DD-MM-YYYY') AS "SALARY INCREMENT DATE"
FROM S_EMP;


--4. Hi?n th? t�n s?n ph?m c?a t?t c? c�c s?n ph?m c� ch? �ski�.

SELECT * FROM S_PRODUCT 
WHERE LOWER(NAME) LIKE '%ski%';

--5. V?i m?i nh�n vi�n, h�y t�nh s? th�ng th�m ni�n c?a nh�n vi�n. S?p x?p k?t qu?
--t?ng d?n theo th�ng th�m ni�n v� s? th�ng ???c l�m tr�n.


SELECT FIRST_NAME || ' ' || LAST_NAME AS "EMPLOYEE NAME",
        ROUND(MONTHS_BETWEEN(SYSTIMESTAMP,START_DATE)) AS "WORK MONTH"
FROM S_EMP
ORDER BY "WORK MONTH";

--B�I 3: Ph�p ket
--1. Hi?n th? t�n s?n ph?m, m� s?n ph?m v� s? l??ng t?ng m�n h�ng trong donn datt
--h�ng c� m� so 101. C?t s? l??ng ???c ??t t�n l� ORDERED.

SELECT S_PRODUCT.NAME, S_PRODUCT.PRODUCT_ID,S_ITEM.ITEM_ID, S_ITEM.QUANTITY AS "ORDERED"
FROM S_PRODUCT
LEFT JOIN S_ITEM ON S_PRODUCT.PRODUCT_ID = S_ITEM.PRODUCT_ID
WHERE S_ITEM.ITEM_ID = 101;

/*2. Hi?n th? m� kh�ch h�ng v� m� don dat h�ng cua c�c kh�ch h�ng. S?p x?p danh
s�ch theo m� kh�ch h�ng. Hien thi m� kh�ch h�ng v� m� don dat h�ng cua tat ca
kh�ch h�ng, ke ca nhung kh�ch h�ng chua dat h�ng.*/

SELECT S_CUSTOMER.CUSTOMER_ID, S_ITEM.ITEM_ID
FROM S_CUSTOMER
LEFT JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID 
LEFT JOIN S_ITEM ON S_ORD.ORD_ID = S_ITEM.ORD_ID
ORDER BY S_CUSTOMER.CUSTOMER_ID;



--3. Hi?n th? t?t c? c�c kh�ch h�ng, m� s?n ph?m v� s? l??ng ??t h�ng c?a t?t c? c�c
--kh�ch h�ng c� donn h�ng tr�n 100.000.

SELECT S_CUSTOMER.CUSTOMER_ID, S_CUSTOMER.NAME, S_ITEM.PRODUCT_ID, S_ITEM.QUANTITY, S_ITEM.PRICE * S_ITEM.QUANTITY AS TOTAL
FROM S_CUSTOMER
INNER JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID
INNER JOIN S_ITEM ON S_ORD.ORD_ID = S_ITEM.ORD_ID
WHERE S_ITEM.PRICE * S_ITEM.QUANTITY > 100.000
ORDER BY S_CUSTOMER.CUSTOMER_ID;

--=============================================================================
--B�I 4: C�c h�m gom nh�m
--1. Hien thi muc cao nhat v� muc thap nhat cua don h�ng trong bang S_ORD. Dat
--t�n c�c cot tuong ung l� Hightest v� Lowest.
SELECT MAX(COUNT(*)) AS "HIGHTEST", MIN(COUNT(*)) AS "LOWEST"
FROM S_ORD
GROUP BY CUSTOMER_ID;

--2. X�c dinnh so nguoi quan l� m� kh�ng can lap danh s�ch.
SELECT COUNT(COUNT(*)) AS "NUMBER OF MANAGERS"
FROM S_EMP
GROUP BY MANAGER_ID; 


--3. Hien thi t�n kh�ch h�ng v� so luong don dat h�ng cua moi kh�ch h�ng

SELECT S_ORD.CUSTOMER_ID,S_CUSTOMER.NAME, COUNT(*) AS "NUMBER OF ORDS"
FROM S_CUSTOMER
LEFT JOIN S_ORD ON S_CUSTOMER.CUSTOMER_ID = S_ORD.CUSTOMER_ID
GROUP BY S_CUSTOMER.NAME, S_ORD.CUSTOMER_ID
ORDER BY S_ORD.CUSTOMER_ID;


--========================================================================
--B�I 5: Truy vAn con
--H�y su dung c�c bang S_EMP, S_DEPT, S_ORD, S_ITEM v� S_PRODUCT.
--1. Hien thi ho, t�n v� ng�y tuyen dung cua tat ca c�c nh�n vi�n c�ng ph�ng voi Magee
SELECT FIRST_NAME ||' '|| LAST_NAME AS "EMPLOYEE NAME", TO_CHAR(START_DATE,'DD-MM-YYYY') AS "RECRUI DATE"
FROM S_EMP
WHERE DEPT_ID = (SELECT DEPT_ID FROM S_EMP WHERE LAST_NAME = 'Magee' OR FIRST_NAME = 'Magee');

--2. Hien thi m� nh�n vi�n, ho, t�n v� m� truy cap cua tat ca c�c nh�n vi�n c� muc luong tr�n muc luong trung b�nh.

SELECT EMP_ID, FIRST_NAME, LAST_NAME, USER_ID, SALARY
FROM S_EMP
WHERE SALARY > (SELECT AVG(SALARY) FROM S_EMP)
ORDER BY SALARY;

--3. Hien thi m� nh�n vi�n, ho v� t�n cua tat ca c�c nh�n vi�n c� muc luong tr�n muc trung b�nh v� c� t�n chua k� tu �L�.

SELECT EMP_ID, FIRST_NAME, LAST_NAME, USER_ID, SALARY
FROM S_EMP
WHERE SALARY > (SELECT AVG(SALARY) FROM S_EMP) AND (FIRST_NAME LIKE '%L%' OR LAST_NAME LIKE '%L%')
ORDER BY SALARY;








