-- tao table s_region
create table s_region(
    id number(10),
    name nvarchar2(100),
    constraint region_pk primary key (id)
);
-- tao table s_warehouse
create table s_warehouse(
    id number(10) not null,
    region_id number(10) not null,
    address nvarchar2(200) not null,
    city nvarchar2(50) not null,
    state nvarchar2(50) not null,
    country nvarchar2(50) not null,
    zip_code number(10),
    phone varchar2(15) not null,
    manager_id number(10),
    constraint warehouse_pk primary key (id)
);
-- tao table s_title
create table s_title(
    title nvarchar2(50)
);
-- tao table s_dept
create table s_dept(
    id number(10) not null,
    name nvarchar2(100) not null,
    region_id number(10),
    constraint dept_pk primary key (id)
);
-- tao table s_emp
create table s_emp(
    id number(10) not null,
    last_name nvarchar2(50) not null,
    first_name nvarchar2(50) not null,
    userid varchar2(20) not null,
    start_date date not null,
    comments nvarchar2(100),
    manager_id number(10),
    title nvarchar2(50) not null,
    dept_id number(10) not null,
    salary number(10) not null,
    commission_pct number(10),
    constraint emp_pk primary key (id)
);
-- tao table s_customer
create table s_customer(
    id number(10) not null,
    name nvarchar2(50) not null,
    phone varchar2(15) not null,
    address nvarchar2(100) not null,
    city nvarchar2(50) not null,
    state nvarchar2(50),
    country nvarchar2(50),
    zip_code varchar2(10),
    credit_rating nvarchar2(50),
    sales_rep_id number(10),
    region_id number(10),
    comments nvarchar2(200),
    constraint customer_pk primary key (id)
);

-- create table s_image
create table s_image(
    id number(10),
    format varchar2(10),
    use_filename varchar2(100),
    filename varchar2(100),
    image blob,
    constraint image_pk primary key (id)
);

-- create table s_longtext
create table s_longtext(
    id number(10),
    use_filename varchar2(5),
    filename varchar2(100),
    text varchar2(1000),
    constraint longtext_pk primary key (id)
);

-- create table s_product
create table s_product(
    id number(10),
    name nvarchar2(100),
    short_desc nvarchar2(100),
    longtext_id number(10),
    image_id number(10),
    suggested_whlsl_price number(10),
    whlsl_units varchar2(100),
    constraint product_pk primary key (id)
);

-- create table s_ord
create table s_ord(
    id number(10) not null,
    customer_id number(10) not null,
    date_ordered date not null,
    date_shipped date,
    sales_rep_id number(10) not null,
    total number(10) not null,
    payment_type nvarchar2(50) not null,
    order_filled varchar2(5) not null,
    constraint ord_pk primary key (id)
);
-- create table s_item
create table s_item(
    ord_id number(10) not null,
    item_id number(10) not null,
    product_id number(10) not null,
    price number(10) not null,
    quantity number(10) not null,
    quantity_shipped number(10) not null
);
-- create table s_inventory
create table s_inventory(
    product_id number(10) not null,
    warehouse_id number(10) not null,
    amount_in_stock number(10) not null,
    reorder_point number(10) not null,
    max_in_stock number(10) not null,
    out_of_stock_explanation number(10),
    restock_date date
);

-- tao du lieu----------------------------------------------------------------------------------------------------
-- src: https://www.oracle.com/technetwork/testcontent/forms-conversion-data-insert-sql-102620.html ----------
-- REM INSERTING into S_TITLE
Insert into S_TITLE (TITLE) values ('President');
Insert into S_TITLE (TITLE) values ('Sales Representative');
Insert into S_TITLE (TITLE) values ('Stock Clerk');
Insert into S_TITLE (TITLE) values ('VP, Administration');
Insert into S_TITLE (TITLE) values ('VP, Finance');
Insert into S_TITLE (TITLE) values ('VP, Operations');
Insert into S_TITLE (TITLE) values ('VP, Sales');
Insert into S_TITLE (TITLE) values ('Warehouse Manager');
-- REM INSERTING into S_REGION
Insert into S_REGION (ID,NAME) values (4,'Asia');
Insert into S_REGION (ID,NAME) values (5,'Europe');
Insert into S_REGION (ID,NAME) values (1,'North America');
Insert into S_REGION (ID,NAME) values (2,'South America');
Insert into S_REGION (ID,NAME) values (3,'Africa');
-- REM INSERTING into S_DEPT
Insert into S_DEPT (ID,NAME,REGION_ID) values (10,'Finance',1);
Insert into S_DEPT (ID,NAME,REGION_ID) values (41,'Operations',1);
Insert into S_DEPT (ID,NAME,REGION_ID) values (42,'Operations',2);
Insert into S_DEPT (ID,NAME,REGION_ID) values (43,'Operations',3);
Insert into S_DEPT (ID,NAME,REGION_ID) values (44,'Operations',4);
Insert into S_DEPT (ID,NAME,REGION_ID) values (45,'Operations',5);
Insert into S_DEPT (ID,NAME,REGION_ID) values (31,'Sales',1);
Insert into S_DEPT (ID,NAME,REGION_ID) values (32,'Sales',2);
Insert into S_DEPT (ID,NAME,REGION_ID) values (33,'Sales',3);
Insert into S_DEPT (ID,NAME,REGION_ID) values (34,'Sales',4);
Insert into S_DEPT (ID,NAME,REGION_ID) values (35,'Sales',5);
Insert into S_DEPT (ID,NAME,REGION_ID) values (50,'Administration',1);
-- REM INSERTING into S_EMP
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (1,'Velasquez','Carmen','cvelasqu',to_timestamp('05-SEP-85','DD-MON-RR HH.MI.SSXFF AM'),null,null,'President',50,2500,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (2,'Ngao','LaDoris','lngao',to_timestamp('08-MAR-90','DD-MON-RR HH.MI.SSXFF AM'),null,1,'VP, Operations',41,1450,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (3,'Nagayama','Midori','mnagayam',to_timestamp('17-JUN-91','DD-MON-RR HH.MI.SSXFF AM'),null,1,'VP, Sales',31,1400,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (4,'Quick-To-See','Mark','mquickto',to_timestamp('07-APR-90','DD-MON-RR HH.MI.SSXFF AM'),null,1,'VP, Finance',10,1450,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (5,'Ropeburn','Audry','aropebur',to_timestamp('04-MAR-90','DD-MON-RR HH.MI.SSXFF AM'),null,1,'VP, Administration',50,1550,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (6,'Urguhart','Molly','murguhar',to_timestamp('18-JAN-91','DD-MON-RR HH.MI.SSXFF AM'),null,2,'Warehouse Manager',41,1200,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (7,'Menchu','Roberta','rmenchu',to_timestamp('14-MAY-90','DD-MON-RR HH.MI.SSXFF AM'),null,2,'Warehouse Manager',42,1250,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (8,'Biri','Ben','bbiri',to_timestamp('07-APR-90','DD-MON-RR HH.MI.SSXFF AM'),null,2,'Warehouse Manager',43,1100,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (9,'Catchpole','Antoinette','acatchpo',to_timestamp('09-FEB-92','DD-MON-RR HH.MI.SSXFF AM'),null,2,'Warehouse Manager',44,1300,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (10,'Havel','Marta','mhavel',to_timestamp('27-FEB-91','DD-MON-RR HH.MI.SSXFF AM'),null,2,'Warehouse Manager',45,1307,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (11,'Magee','Colin','cmagee',to_timestamp('14-MAY-90','DD-MON-RR HH.MI.SSXFF AM'),null,3,'Sales Representative',31,1400,10);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (12,'Giljum','Henry','hgiljum',to_timestamp('18-JAN-92','DD-MON-RR HH.MI.SSXFF AM'),null,3,'Sales Representative',41,1490,12.5);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (13,'Sedeghi','Yasmin','ysedeghi',to_timestamp('18-FEB-91','DD-MON-RR HH.MI.SSXFF AM'),null,3,'Sales Representative',33,1515,10);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (14,'Nguyen','Mai','mnguyen',to_timestamp('22-JAN-92','DD-MON-RR HH.MI.SSXFF AM'),null,3,'Sales Representative',34,1525,15);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (15,'Dumas','Andre','adumas',to_timestamp('09-OCT-91','DD-MON-RR HH.MI.SSXFF AM'),null,3,'Sales Representative',35,1450,17.5);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (16,'Maduro','Elena','emaduro',to_timestamp('07-FEB-92','DD-MON-RR HH.MI.SSXFF AM'),null,6,'Stock Clerk',41,1400,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (17,'Smith','George','gsmith',to_timestamp('08-MAR-90','DD-MON-RR HH.MI.SSXFF AM'),null,6,'Stock Clerk',41,940,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (18,'Nozaki','Akira','anozaki',to_timestamp('09-FEB-91','DD-MON-RR HH.MI.SSXFF AM'),null,7,'Stock Clerk',42,1200,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (19,'Patel','Vikram','vpatel',to_timestamp('06-AUG-91','DD-MON-RR HH.MI.SSXFF AM'),null,7,'Stock Clerk',42,795,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (20,'Newman','Chad','cnewman',to_timestamp('21-JUL-91','DD-MON-RR HH.MI.SSXFF AM'),null,8,'Stock Clerk',43,750,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (21,'Markarian','Alexander','amarkari',to_timestamp('26-MAY-91','DD-MON-RR HH.MI.SSXFF AM'),null,8,'Stock Clerk',43,850,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (22,'Chang','Eddie','echang',to_timestamp('30-NOV-90','DD-MON-RR HH.MI.SSXFF AM'),null,9,'Stock Clerk',44,800,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (23,'Patel','Radha','rpatel',to_timestamp('17-OCT-90','DD-MON-RR HH.MI.SSXFF AM'),null,9,'Stock Clerk',34,795,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (24,'Dancs','Bela','bdancs',to_timestamp('17-MAR-91','DD-MON-RR HH.MI.SSXFF AM'),null,10,'Stock Clerk',45,860,null);
Insert into S_EMP (ID,LAST_NAME,FIRST_NAME,USERID,START_DATE,COMMENTS,MANAGER_ID,TITLE,DEPT_ID,SALARY,COMMISSION_PCT) values (25,'Schwartz','Sylvie','sschwart',to_timestamp('09-MAY-91','DD-MON-RR HH.MI.SSXFF AM'),null,10,'Stock Clerk',45,1100,null);
-- REM INSERTING into S_CUSTOMER
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (201,'Unisport','55-2066101','72 Via Bahia','Sao Paolo',null,'Brazil',null,'EXCELLENT',12,2,'Customer usually orders large amounts and has a high order total.  This is okay as long as the credit rating remains excellent.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (202,'Simms Atheletics','81-20101','6741 Takashi Blvd.','Osaka',null,'Japan',null,'POOR',15,4,'Customer should always pay by cash until his credit rating improves.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (203,'Delhi Sports','91-10351','11368 Chanakya','New Delhi',null,'India',null,'GOOD',14,4,'Customer specializes in baseball equipment and is the largest retailer in India.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (204,'Womansport','1-206-104-0103','281 King Street','Seattle','Washington','USA','98101','POOR',11,1,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (205,'Kam''s Sporting Goods','852-3692888','15 Henessey Road','Hong Kong',null,'China',null,'EXCELLENT',15,4,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (206,'Sportique','33-2257201','172 Rue de Rivoli','Cannes',null,'France',null,'EXCELLENT',15,5,'Customer specializes in Soccer.  Likes to order accessories in bright colors.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (207,'Sweet Rock Sports','234-6036201','6 Saint Antoine','Lagos',null,'Nigeria',null,'GOOD',null,3,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (208,'Muench Sports','49-527454','435 Gruenestrasse','Stuttgart',null,'Germany',null,'GOOD',15,5,'Customer usually pays small orders by cash and large orders on credit.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (209,'Beisbol Si!','809-352689','792 Playa Del Mar','San Pedro de Macon''s',null,'Dominican Republic',null,'POOR',11,1,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (210,'Futbol Sonora','52-404562','3 Via Saguaro','Nogales',null,'Mexico',null,'EXCELLENT',12,2,'Customer is difficult to reach by phone.  Try mail.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (211,'Kuhn''s Sports','42-111292','7 Modrany','Prague',null,'Czechoslovakia',null,'EXCELLENT',15,5,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (212,'Hamada Sport','20-1209211','57A Corniche','Alexandria',null,'Egypt',null,'EXCELLENT',13,3,'Customer orders sea and water equipment.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (213,'Big John''s Sports Emporium','1-415-555-6281','4783 18th Street','San Francisco','CA','USA','94117','POOR',11,1,'Customer has a dependable credit record.');
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (214,'Ojibway Retail','1-716-555-7171','415 Main Street','Buffalo','NY','USA','14202','POOR',11,1,null);
Insert into S_CUSTOMER (ID,NAME,PHONE,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,CREDIT_RATING,SALES_REP_ID,REGION_ID,COMMENTS) values (215,'Sporta Russia','7-3892456','6000 Yekatamina','Saint Petersburg',null,'Russia',null,'POOR',15,5,'This customer is very friendly, but has difficulty paying bills.  Insist upon cash.');
-- REM INSERTING into S_WAREHOUSE
Insert into S_WAREHOUSE (ID,REGION_ID,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,PHONE,MANAGER_ID) values (101,1,'283 King Street','Seattle','WA','USA',null,null,6);
Insert into S_WAREHOUSE (ID,REGION_ID,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,PHONE,MANAGER_ID) values (10501,5,'5 Modrany','Bratislava',null,'Czechozlovakia',null,null,10);
Insert into S_WAREHOUSE (ID,REGION_ID,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,PHONE,MANAGER_ID) values (201,2,'68 Via Centrale','Sao Paolo',null,'Brazil',null,null,7);
Insert into S_WAREHOUSE (ID,REGION_ID,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,PHONE,MANAGER_ID) values (301,3,'6921 King Way','Lagos',null,'Nigeria',null,null,8);
Insert into S_WAREHOUSE (ID,REGION_ID,ADDRESS,CITY,STATE,COUNTRY,ZIP_CODE,PHONE,MANAGER_ID) values (401,4,'86 Chu Street','Hong Kong',null,null,null,null,9);
-- REM INSERTING into S_ORD
INSERT INTO S_ORD VALUES (1, 201, '05-MAR-2008', '09-MAR-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (2, 201, '07-JUL-2008', '10-JUL-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (3, 201, '08-JUL-2008', '10-JUL-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (4, 201, '23-JUL-2008', '28-JUL-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (5, 201, '02-AUG-2008', '09-AUG-2008', 12, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (6, 201, '14-AUG-2008', '19-AUG-2008', 12, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (7, 201, '14-AUG-2008', '16-AUG-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (8, 201, '15-SEP-2008', NULL, 14, 0, 'CASH', 'N');
INSERT INTO S_ORD VALUES (9, 201, '19-SEP-2008', NULL, 15, 0, 'CHECK', 'N');

INSERT INTO S_ORD VALUES (21, 202, '15-NOV-2007', '19-NOV-2007', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (22, 202, '22-NOV-2007', '30-NOV-2007', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (23, 202, '04-FEB-2008', '09-FEB-2008', 13, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (24, 202, '02-APR-2008', '04-APR-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (25, 202, '02-APR-2008', '08-APR-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (26, 202, '25-APR-2008', '28-APR-2008', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (27, 202, '26-MAY-2008', '01-JUN-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (28, 202, '29-MAY-2008', '07-JUN-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (29, 202, '14-JUN-2008', '16-JUN-2008', 15, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (30, 202, '22-JUN-2008', '25-JUN-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (31, 202, '22-JUN-2008', '25-JUN-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (32, 202, '05-JUL-2008', '09-JUL-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (33, 202, '15-JUL-2008', '17-JUL-2008', 14, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (34, 202, '19-JUL-2008', '23-JUL-2008', 15, 0, 'CHECK', 'Y');

INSERT INTO S_ORD VALUES (41, 203, '17-JUL-2008', '19-JUL-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (42, 203, '22-JUL-2008', '26-JUL-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (43, 203, '02-AUG-2008', '09-AUG-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (44, 203, '02-AUG-2008', '04-AUG-2008', 12, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (45, 203, '30-AUG-2008', '04-SEP-2008', 12, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (46, 203, '19-SEP-2008', NULL, 13, 0, 'CREDIT', 'N');

INSERT INTO S_ORD VALUES (51, 204, '30-APR-2008', '03-MAY-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (52, 204, '29-MAY-2008', '31-MAY-2008', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (53, 204, '21-JUL-2008', '25-JUL-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (54, 204, '23-JUL-2008', '28-JUL-2008', 14, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (55, 204, '12-AUG-2008', '15-AUG-2008', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (56, 204, '20-AUG-2008', '29-AUG-2008', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (57, 204, '10-SEP-2008', '12-SEP-2008', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (58, 204, '12-SEP-2008', '17-SEP-2008', 14, 0, 'CHECK', 'Y');

INSERT INTO S_ORD VALUES (61, 205, '17-MAR-2008', '23-MAR-2008', 15, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (62, 205, '07-MAY-2008', '10-MAY-2008', 15, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (63, 205, '21-JUL-2008', NULL, 15, 0, 'CASH', 'N');
INSERT INTO S_ORD VALUES (64, 205, '23-JUL-2008', NULL, 15, 0, 'CREDIT', 'N');

INSERT INTO S_ORD VALUES (65, 206, '01-FEB-2008', '05-FEB-2008', 13, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (66, 206, '14-MAR-2008', '17-MAR-2008', 11, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (67, 206, '03-APR-2008', '06-APR-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (68, 206, '25-MAY-2008', '29-MAY-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (69, 206, '27-JUN-2008', '01-JUL-2008', 12, 0, 'CHECK', 'Y');

INSERT INTO S_ORD VALUES (71, 207, '10-DEC-2007', '13-DEC-2007', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (72, 207, '15-DEC-2007', '20-DEC-2007', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (73, 207, '28-JUN-2008', '03-JUL-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (74, 207, '01-JUL-2008', '03-JUL-2008', 14, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (75, 207, '14-JUL-2008', '18-JUL-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (76, 207, '25-JUL-2008', '28-JUL-2008', 14, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (77, 207, '19-AUG-2008', '22-AUG-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (78, 207, '20-AUG-2008', '24-AUG-2008', 11, 0, 'CREDIT', 'Y');

INSERT INTO S_ORD VALUES (81, 208, '23-DEC-2007', '01-JAN-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (82, 208, '06-MAR-2008', '09-MAR-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (83, 208, '15-MAR-2008', '18-MAR-2008', 13, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (84, 208, '20-MAY-2008', '23-MAY-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (85, 208, '27-MAY-2008', '01-JUN-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (86, 208, '02-JUL-2008', '10-JUL-2008', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (87, 208, '17-JUL-2008', '20-JUL-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (88, 208, '30-JUL-2008', '03-AUG-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (89, 208, '09-AUG-2008', '14-AUG-2008', 15, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (90, 208, '12-AUG-2008', '15-AUG-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (91, 208, '12-SEP-2008', '16-SEP-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (92, 208, '15-SEP-2008', NULL, 11, 0, 'CHECK', 'N');
INSERT INTO S_ORD VALUES (93, 208, '19-SEP-2008', NULL, 11, 0, 'CREDIT', 'N');
INSERT INTO S_ORD VALUES (94, 208, '21-SEP-2008', NULL, 15, 0, 'CHECK', 'N');

INSERT INTO S_ORD VALUES (95, 209, '15-JUL-2008', '19-JUL-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (96, 209, '24-JUL-2008', '27-JUL-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (97, 209, '22-AUG-2008', '26-AUG-2008', 12, 0, 'CASH', 'Y');

INSERT INTO S_ORD VALUES (100, 210, '19-FEB-2008', '22-FEB-2008', 11, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (101, 210, '26-FEB-2008', '29-FEB-2008', 11, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (102, 210, '02-MAR-2008', '06-MAR-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (103, 210, '09-MAR-2008', '12-MAR-2008', 11, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (104, 210, '15-MAR-2008', '19-MAR-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (105, 210, '22-JUN-2008', '25-JUN-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (106, 210, '24-JUN-2008', '28-JUN-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (107, 210, '30-JUN-2008', '03-AUG-2008', 13, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (108, 210, '06-AUG-2008', '08-AUG-2008', 12, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (109, 210, '22-AUG-2008', '26-AUG-2008', 11, 0, 'CHECK', 'Y');

INSERT INTO S_ORD VALUES (111, 211, '01-MAY-2008', '07-MAY-2008', 13, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (112, 211, '01-JUN-2008', '04-JUN-2008', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (113, 211, '01-JUL-2008', '04-JUL-2008', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (114, 211, '01-AUG-2008', '03-AUG-2008', 13, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (115, 211, '01-SEP-2008', '04-AUG-2008', 13, 0, 'CASH', 'Y');

INSERT INTO S_ORD VALUES (116, 212, '18-SEP-2007', NULL, 15, 0, 'CHECK', 'N');
INSERT INTO S_ORD VALUES (117, 212, '20-SEP-2008', NULL, 15, 0, 'CHECK', 'N');

INSERT INTO S_ORD VALUES (121, 213, '28-DEC-2007', '04-JAN-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (122, 213, '19-JAN-2008', '22-JAN-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (123, 213, '05-MAY-2008', '08-MAY-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (124, 213, '07-MAY-2008', '10-MAY-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (125, 213, '11-AUG-2008', '14-AUG-2008', 12, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (126, 213, '18-AUG-2007', '21-AUG-2008', 12, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (127, 213, '15-SEP-2008', '19-SEP-2008', 12, 0, 'CHECK', 'Y');

INSERT INTO S_ORD VALUES (131, 214, '18-NOV-2007', '23-NOV-2007', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (132, 214, '29-NOV-2007', '01-DEC-2007', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (133, 214, '06-JUL-2008', '09-JUL-2008', 15, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (134, 214, '31-AUG-2008', '02-AUG-2008', 15, 0, 'CASH', 'Y');

INSERT INTO S_ORD VALUES (135, 215, '13-FEB-2008', '17-SEP-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (136, 215, '24-APR-2008', '27-APR-2008', 14, 0, 'CHECK', 'Y');
INSERT INTO S_ORD VALUES (137, 215, '10-MAY-2008', '14-MAY-2008', 11, 0, 'CREDIT', 'Y');
INSERT INTO S_ORD VALUES (138, 215, '25-JUL-2008', '27-JUL-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (139, 215, '01-SEP-2008', '04-SEP-2008', 11, 0, 'CASH', 'Y');
INSERT INTO S_ORD VALUES (140, 215, '18-SEP-2007', NULL, 11, 0, 'CREDIT', 'N');
-- REM INSERTING into S_LONGTEXT
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1017,'N',null,'Protective knee pads for any number of physical activities including bicycling and skating (4-wheel, in-line, and ice).  Also provide support for stress activities such as weight-lifting.  Velcro belts allow easy adjustment for any size and snugness of fit.  Hardened plastic shell comes in a variety of colors, so you can buy a pair to match every outfit.  Can also be worn at the beach to cover particularly ugly knees.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1019,'N',null,'Protective elbow pads for any number of physical activities including bicycling and skating (4-wheel, in-line, and ice).  Also provide support for stress activities such as weight-lifting.  Velcro belts allow easy adjustment for any size and snugness of fit.  Hardened plastic shell comes in a variety of colors, so you can buy a pair to match every outfit.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1037,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1039,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1043,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1286,'N',null,'Don''t slack off--try the Slaker Water Bottle.  With its 1 quart capacity, this is the only water bottle you''ll need.  It''s lightweight, durable, and guaranteed for life to be leak proof.  It comes with a convenient velcro strap so it can be conveniently attached to your bike or other sports equipment.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (1368,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (517,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (518,'N',null,'Perfect for the beginner.  Rear entry (easy to put on with only one buckle), weight control adjustment on side of boot for easy access, comes in a wide variety of colors to match every outfit.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (519,'N',null,'If you have mastered the basic techniques you are ready for the Ace Ski Boot.  This intermediate boot comes as a package with self adjustable bindings that will adapt to your skill and speed. The boot is designed for extra grip on slopes and jumps.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (520,'N',null,'The Pro ski boot is an advanced boot that combines high tech and comfort.  It''s made of fibre that will mould to your foot with body heat.  If you''re after perfection, don''t look any further: this is it!');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (527,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (528,'N',null,'Lightweight aluminum pole, comes in a variety of sizes and neon colors.  Comfortable adjustable straps.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (529,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (530,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (557,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (587,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (607,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (613,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (615,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (676,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (708,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (780,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (828,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (833,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (924,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (925,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (926,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (927,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (928,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (929,null,null,null);
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (933,'N',null,'The widest, strongest, and knobbiest tires for mountain bike enthusiasts.  Guaranteed to withstand pummelling that will reduce most bicycles (except for the Himalayan) to scrap iron.  These tires can carry you to places where nobody would want to bicycle.  Sizes to fit all makes of mountain bike including wide and super wide rims.  Steel-banded radial models are also available by direct factory order.');
Insert into S_LONGTEXT (ID,USE_FILENAME,FILENAME,TEXT) values (940,null,null,null);
-- REM INSERTING into S_PRODUCT
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10011,'Bunny Boot','Beginner''s ski boot',518,1001,150,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10012,'Ace Ski Boot','Intermediate ski boot',519,1002,200,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10013,'Pro Ski Boot','Advanced ski boot',520,1003,410,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10021,'Bunny Ski Pole','Beginner''s ski pole',528,1011,16.25,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10022,'Ace Ski Pole','Intermediate ski pole',529,1012,21.95,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (10023,'Pro Ski Pole','Advanced ski pole',530,1013,40.95,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (20106,'Junior Soccer Ball','Junior soccer ball',613,null,11,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (20108,'World Cup Soccer Ball','World cup soccer ball',615,null,28,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (20201,'World Cup Net','World cup net',708,null,123,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (20510,'Black Hawk Knee Pads','Knee pads, pair',1017,null,9,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (20512,'Black Hawk Elbow Pads','Elbow pads, pair',1019,null,8,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (30321,'Grand Prix Bicycle','Road bicycle',828,1291,1669,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (30326,'Himalaya Bicycle','Mountain bicycle',833,1296,582,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (30421,'Grand Prix Bicycle Tires','Road bicycle tires',927,null,16,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (30426,'Himalaya Tires','Mountain bicycle tires',933,null,18.25,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (30433,'New Air Pump','Tire pump',940,null,20,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (32779,'Slaker Water Bottle','Water bottle',1286,null,7,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (32861,'Safe-T Helmet','Bicycle helmet',1368,1829,60,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (40421,'Alexeyer Pro Lifting Bar','Straight bar',928,1381,65,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (40422,'Pro Curling Bar','Curling bar',929,1382,50,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (41010,'Prostar 10 Pound Weight','Ten pound weight',517,null,8,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (41020,'Prostar 20 Pound Weight','Twenty pound weight',527,null,12,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (41050,'Prostar 50 Pound Weight','Fifty pound weight',557,null,25,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (41080,'Prostar 80 Pound Weight','Eighty pound weight',587,null,35,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (41100,'Prostar 100 Pound Weight','One hundred pound weight',607,null,45,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50169,'Major League Baseball','Baseball',676,1119,4.29,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50273,'Chapman Helmet','Batting helmet',780,1223,22.89,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50417,'Griffey Glove','Outfielder''s glove',924,1367,80,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50418,'Alomar Glove','Infielder''s glove',925,1368,75,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50419,'Steinbach Glove','Catcher''s glove',926,1369,80,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50530,'Cabrera Bat','Thirty inch bat',1037,1480,45,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50532,'Puckett Bat','Thirty-two inch bat',1039,1482,47,null);
Insert into S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,IMAGE_ID,SUGGESTED_WHLSL_PRICE,WHLSL_UNITS) values (50536,'Winfield Bat','Thirty-six inch bat',1043,1486,50,null);
-- REM INSERTING into S_INVENTORY
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10011,101,650,625,1100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10012,101,600,560,1000,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10013,101,400,400,700,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10021,101,500,425,740,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10022,101,300,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10023,101,400,300,525,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20106,101,993,625,1000,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20108,101,700,700,1225,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20201,101,802,800,1400,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20510,101,1389,850,1400,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20512,101,850,850,1450,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30321,101,2000,1500,2500,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30326,101,2100,2000,3500,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30421,101,1822,1800,3150,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30426,101,2250,2000,3500,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30433,101,650,600,1050,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32779,101,2120,1250,2200,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32861,101,505,500,875,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40421,101,578,350,600,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40422,101,0,350,600,'Phenomenal sales...',to_timestamp('08-FEB-93','DD-MON-RR HH.MI.SSXFF AM'));
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41010,101,250,250,437,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41020,101,471,450,750,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41050,101,501,450,750,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41080,101,400,400,700,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41100,101,350,350,600,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50169,101,2530,1500,2600,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50273,101,233,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50417,101,518,500,875,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50418,101,244,100,275,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50419,101,230,120,310,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50530,101,669,400,700,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50532,101,0,100,175,'Wait for Spring.',to_timestamp('12-APR-93','DD-MON-RR HH.MI.SSXFF AM'));
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50536,101,173,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20106,201,220,150,260,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20108,201,166,150,260,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20201,201,320,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20510,201,175,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20512,201,162,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30321,201,96,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30326,201,147,120,210,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30421,201,102,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30426,201,200,120,210,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30433,201,130,130,230,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32779,201,180,150,260,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32861,201,132,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50169,201,225,220,385,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50273,201,75,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50417,201,82,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50418,201,98,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50419,201,77,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50530,201,62,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50532,201,67,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50536,201,97,60,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20510,301,69,40,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20512,301,28,20,50,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30321,301,85,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30421,301,102,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30433,301,35,20,35,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32779,301,102,95,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32861,301,57,50,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40421,301,70,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40422,301,65,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41010,301,59,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41020,301,61,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41050,301,49,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41080,301,50,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41100,301,42,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20510,401,88,50,100,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20512,401,75,75,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30321,401,102,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30326,401,113,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30421,401,85,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30426,401,135,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30433,401,0,100,175,'A defective shipment was sent to Hong Kong and needed to be returned. The soonest ACME can turn this around is early February.',to_timestamp('07-SEP-92','DD-MON-RR HH.MI.SSXFF AM'));
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32779,401,135,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32861,401,250,150,250,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40421,401,47,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40422,401,50,40,70,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41010,401,80,70,220,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41020,401,91,70,220,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41050,401,169,70,220,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41080,401,100,70,220,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41100,401,75,70,220,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50169,401,240,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50273,401,224,150,280,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50417,401,130,120,210,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50418,401,156,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50419,401,151,150,280,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50530,401,119,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50532,401,233,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (50536,401,138,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10012,10501,300,300,525,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10013,10501,314,300,525,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10022,10501,502,300,525,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (10023,10501,500,300,525,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20106,10501,150,100,175,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20108,10501,222,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20201,10501,275,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20510,10501,57,50,87,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (20512,10501,62,50,87,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30321,10501,194,150,275,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30326,10501,277,250,440,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30421,10501,190,150,275,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30426,10501,423,250,450,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (30433,10501,273,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32779,10501,280,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (32861,10501,288,200,350,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40421,10501,97,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (40422,10501,90,80,140,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41010,10501,151,140,245,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41020,10501,224,140,245,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41050,10501,157,140,245,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41080,10501,159,140,245,null,null);
Insert into S_INVENTORY (PRODUCT_ID,WAREHOUSE_ID,AMOUNT_IN_STOCK,REORDER_POINT,MAX_IN_STOCK,OUT_OF_STOCK_EXPLANATION,RESTOCK_DATE) values (41100,10501,141,140,245,null,null);
-- REM INSERTING into S_ITEM
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (1,1,41100,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (1,2,41050,6.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (2,1,41020,3,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (3,1,30426,4.56,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (3,2,30421,4,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (3,3,10013,102.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (4,1,10012,50,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (5,1,10013,102.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (5,2,30433,5,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (5,3,50417,20,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (5,4,20108,7,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (6,1,50169,1.07,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (7,1,40422,12.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (7,2,30426,4.56,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (7,3,20510,2.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (8,1,30433,5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (9,1,50419,20,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (21,1,41100,11.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (21,2,41020,3,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (21,3,40421,16.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (22,1,32779,1.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (22,2,10013,102.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (22,3,20108,7,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (22,4,32861,15,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (23,1,50530,11.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (23,2,41010,2,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (23,3,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (23,4,41050,6.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (24,1,30433,5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (25,1,10022,5.49,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (26,1,10021,4.06,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (26,2,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (26,3,20512,2,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (26,4,30421,4,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (27,1,50419,20,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (27,2,50273,5.72,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (28,1,32779,1.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (29,1,30326,145.5,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (29,2,20108,7,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (29,3,32861,15,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (29,4,50273,5.72,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (30,1,50532,11.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (30,2,41050,6.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (30,3,50169,1.07,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (30,4,32779,1.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (31,1,32861,15,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (32,1,30421,4,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (32,2,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (32,3,30426,4.56,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (32,4,10021,4.06,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (33,1,32779,1.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (33,2,32861,15,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (33,3,41020,3,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (33,4,40422,12.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (34,1,41080,8.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (34,2,10011,37.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (34,3,20108,7,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (34,4,50530,11.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (41,1,30321,417.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (41,2,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (41,3,41020,3,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (42,1,40421,16.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (43,1,41010,2,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (43,2,41080,8.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (43,3,32779,1.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (43,4,41100,11.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (44,1,30421,4,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (44,2,30321,417.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (44,3,30426,4.56,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (44,4,41050,6.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (45,1,20512,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (45,2,20201,30.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (45,3,30326,145.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (46,1,41020,3,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (51,1,10023,10.24,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (51,2,50417,20,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (51,3,50419,20,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (52,1,20512,2,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (52,2,10011,37.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (53,1,41010,2,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (53,2,20510,2.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (53,3,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (54,1,20106,2.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (54,2,10011,37.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (54,3,30326,145.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (54,4,50417,20,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (55,1,50418,18.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (55,2,10011,37.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (55,3,40421,16.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (56,1,41050,6.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (56,2,50530,11.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (56,3,50169,1.07,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (57,1,30321,417.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (57,2,30433,5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (57,3,50273,5.72,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (57,4,41100,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (58,1,41010,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (61,1,10011,37.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (61,2,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (61,3,50273,5.72,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (61,4,30321,417.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (62,1,41020,3,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (62,2,30321,417.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (62,3,50169,1.07,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (62,4,10011,37.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (63,1,20106,2.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (63,2,10013,102.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (63,3,41010,2,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (63,4,41100,11.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (64,1,10021,4.06,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (64,2,20510,2.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (64,3,20106,2.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (65,1,30326,145.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (65,2,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (65,3,10021,4.06,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (66,1,20201,30.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (66,2,41010,2,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (66,3,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (67,1,10021,4.06,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (67,2,30321,417.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (68,1,50169,1.07,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (68,2,20512,2,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (68,3,30421,4,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (69,1,20512,2,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (69,2,50417,20,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (71,1,50273,5.72,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (71,2,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (71,3,40421,16.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (71,4,50419,20,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (72,1,20510,2.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (72,2,30326,145.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (73,1,50417,20,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (73,2,50419,20,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (74,1,10021,4.06,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (74,2,32861,15,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (74,3,50530,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (75,1,10012,50,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (75,2,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (75,3,41010,2,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (76,1,30326,145.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (76,2,20512,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (77,1,30421,4,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (77,2,41020,3,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (78,1,41050,6.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (81,1,30321,417.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (82,1,10011,37.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (82,2,41080,8.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (82,3,41100,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (83,1,50169,1.07,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (83,2,32861,15,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (83,3,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (83,4,30326,145.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (84,1,30326,145.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (84,2,32779,1.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (84,3,20510,2.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (85,1,50273,5.72,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (85,2,50169,1.07,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (85,3,41100,11.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (86,1,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (86,2,30433,5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (87,1,40421,16.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (87,2,10012,50,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (88,1,10011,37.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (89,1,50418,18.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (89,2,50273,5.72,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (90,1,41080,8.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (91,1,32779,1.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (92,1,32861,15,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (92,2,20106,2.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (92,3,10022,5.49,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (92,4,50417,20,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (93,1,10023,10.24,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (93,2,20512,2,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (94,1,50530,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (94,2,30326,145.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (95,1,41050,6.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (95,2,50530,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (95,3,10011,37.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (95,4,10012,50,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (96,1,20108,7,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (96,2,30426,4.56,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (96,3,20106,2.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (96,4,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (97,1,41080,8.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (97,2,10023,10.24,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (97,3,41050,6.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (97,4,20108,7,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (100,1,40421,16.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (101,1,50419,20,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (102,1,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (102,2,10023,10.24,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (103,1,30421,4,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (103,2,30326,145.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (103,3,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (104,1,32779,1.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (104,2,41050,6.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (105,1,20512,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (105,2,30426,4.56,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (105,3,41010,2,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (106,1,10023,10.24,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (106,2,41100,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (106,3,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (107,1,10021,4.06,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (107,2,40422,12.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (108,1,50530,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (108,2,10011,37.5,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (108,3,41050,6.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (108,4,32779,1.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (109,1,41010,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (109,2,30421,4,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (109,3,10022,5.49,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (109,4,41080,8.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (111,1,10022,5.49,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (111,2,10023,10.24,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (111,3,30321,417.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (111,4,20201,30.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (112,1,20510,2.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (112,2,50417,20,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (112,3,30433,5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (113,1,32779,1.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (113,2,41080,8.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (113,3,50417,20,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (114,1,50419,20,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (114,2,41050,6.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (115,1,50418,18.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (115,2,50273,5.72,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (115,3,10023,10.24,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (116,1,20201,30.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (116,2,20108,7,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (116,3,32861,15,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (117,1,20201,30.75,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (117,2,50417,20,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (121,1,10021,4.06,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (121,2,20201,30.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (122,1,10021,4.06,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (122,2,50418,18.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (122,3,41100,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (123,1,20108,7,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (123,2,10013,102.5,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (123,3,41050,6.25,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (124,1,10022,5.49,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (125,1,50418,18.75,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (125,2,10011,37.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (125,3,50169,1.07,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (126,1,41010,2,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (126,2,50530,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (126,3,20108,7,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (126,4,30326,145.5,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (127,1,50530,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (127,2,10012,50,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (127,3,32861,15,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (131,1,20108,7,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (131,2,30421,4,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (131,3,20510,2.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (131,4,30426,4.56,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (132,1,30426,4.56,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (133,1,30321,417.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (134,1,50419,20,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (134,2,41100,11.25,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (134,3,41080,8.75,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (136,1,41100,11.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (136,2,41010,2,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (136,3,10023,10.24,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (137,1,50532,11.75,4,4);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (138,1,50530,11.25,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (138,2,30421,4,1,1);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (139,1,30326,145.5,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (139,2,10022,5.49,2,2);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (140,1,50530,11.25,3,3);
Insert into S_ITEM (ORD_ID,ITEM_ID,PRODUCT_ID,PRICE,QUANTITY,QUANTITY_SHIPPED) values (140,2,10012,50,4,4);
-- REM INSERTING into S_IMAGE
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1001,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1002,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1003,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1004,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1005,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1011,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1012,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1013,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1017,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1018,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1019,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1291,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1296,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1286,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1828,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1829,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1381,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1382,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1119,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1223,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1367,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1368,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1369,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1480,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1482,'jpg','y','myava',null);
Insert into S_IMAGE (ID,FORMAT,USE_FILENAME,FILENAME,IMAGE) values (1486,'jpg','y','myava',null);

-- GIAI BAI TAP -----------------------------------
-- BAI 1: 
-- 1. tim ten, ma khach hang && sap xep
select id as "Ma khach hang", name as "Ten khach hang"
from s_customer;
select id as "Ma khach hang", name as "Ten khach hang"
from s_customer
order by id desc;
-- 2. S_EMP
-- hien thi ten truy cap cua nhan vien 23
select userid
from s_emp
where id = 23;
-- hien thi ho ten va ma phong cua nhan vien trong phong 10,50 va sap xep theo ten
select (first_name || ' ' || last_name) as Employees , dept_id
from s_emp
where dept_id in (10,50)
order by first_name;
-- hien thi tat ca nhan vien co ten chua chu 's'
select *
from s_emp
where first_name like '%s%';
-- hien thi ten truy cap va ngay bat dau lam viec cua nhan vien
select userid, start_date
from s_emp
where start_date between to_date('14/05/1990','dd/MM/yyyy') and to_date('26/05/1991','dd/MM/yyyy');
-- 3. s_emp
-- hien thi ten va muc luong cua nhan vien co luong >= 1000 va <= 2000
select first_name, salary
from s_emp
where salary >= 1000 and salary <= 2000;
-- lap danh sach ten va muc luong cua nhung nhan vien o phong 31,42,50 nhan muc luong > 1350
select first_name as "Employee Name", salary as "Monthly Salary"
from s_emp
where dept_id in (31,42,50) and salary > 1350;
-- hien thi ten va ngay bat dau lam viec cua moi nhan vien duoc thue trong nam 1991
select first_name, start_date
from s_emp
where extract(year from start_date) = '1991';
-- hien thi ho ten cua tat ca nhan vien khong phai la nguoi quan ly
select id, last_name, first_name
from s_emp
where id not in (select manager_id from s_emp where manager_id is not null);
-- 4. s_product
-- hien thi san pham bat dau bang chu 'pro'
select *
from s_product
where name like 'Pro%'
order by name;
-- hien thi ten san pham va mo ta cua san pham co mo ta '%bicycle%'
select name, short_desc
from s_product
where short_desc like '%bicycle%';
-- hien thi mo ta ngan gon cua tat ca sp
select short_desc
from s_product;
-- BAI 2 -------------------------------------------------------------------------
-- 1. hien thi ma nhan vien, ten va muc luong duoc tang 15%
select id, first_name, salary * 1.15
from s_emp;
-- 2. hien thi ten nhan vien va chuc vu trong '( )'
select first_name || '(' || title || ')'
from s_emp;
-- 3. hien thi ten nv, ngay tuyen dung, ngay xem xet tang luong
select first_name, start_date, to_char(next_day(add_months(start_date, 6),'Monday'),'ddspth" of "month yyyy')
from s_emp;
-- 4. hien thi ten san pham cua tat ca san pham co chu 'ski'
select name
from s_product
where name like '%Ski%';
-- 5. tinh so thang tham nien cua nhan vien
select last_name, round(months_between(sysdate, start_date), 0) as Month_worked
from s_emp;
-- BAI 3 ------------------------------------------------------------------------------
-- 1. hien thi ten sp, ma sp, so luong tung mon hang trong don dat hang 101
select p.id, p.name, i.quantity
from s_item i join s_product p on i.product_id = p.id
where i.ord_id = 101;
-- 2. hien thi ma khach hang va don dat hang cua khach hang
select c.id as "Customer", o.id as "Order"
from s_customer c left join s_ord o on c.id = o.customer_id
order by c.id;
-- 3. hien thi tat ca khach hang, ma san pham va so luong dat hang cua tat ca khach hang co don hang tren 100000
select c.name, i.product_id, count(o.id)
from s_customer c join s_ord o on c.id = o.customer_id
join s_item i on o.id = i.ord_id
where o.total > 100000
group by c.name, i.product_id;
-- BAI 4 ---------------------------------------------------------------------------------
-- 1. hien thi muc cao nhat va muc thap nhat cua don hang trong bang s_ord
select max(total) as Hightest, min(total) as Lowest
from s_ord;
-- 2. xac dinh so nguoi quan ly ma khong can lap danh sach
select count(distinct manager_id) as "Count"
from s_emp
where manager_id is not null;
-- 3. hien thi ten khach hang va so don dat hang
select c.name, count(*)
from s_customer c join s_ord o on c.id = o.customer_id
group by c.name;
-- BAI 5 ----------------------------------------------------------------------------------
-- 1. hien thi ho ten ngay tuyen dung cua tat ca nhan vien cung phong Magee
select last_name, first_name, start_date
from s_emp e
where e.dept_id = (select dept_id from s_emp where last_name = 'Magee');
-- 2. hien thi ma, ho, ten, ma truy cap cua tat ca nhan vien co muc luong tren trung binh
select id, last_name, first_name, userid
from s_emp
where salary > (select avg(salary) from s_emp);
-- 3. hien thi ma, ho, ten, ma truy cap cua tat ca nhan vien co muc luong tren trung binh va ten co chua 'L'
select id, last_name, first_name, userid
from s_emp
where salary > (select avg(salary) from s_emp)
and first_name like '%L%';